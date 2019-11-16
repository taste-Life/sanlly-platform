package com.sanlly.purchase.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.activiti.TaskOutPut;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.dao.*;
import com.sanlly.purchase.entity.*;
import com.sanlly.purchase.enums.*;
import com.sanlly.purchase.models.input.dailydemand.AddDailyTemporaryPurchaseInput;
import com.sanlly.purchase.models.input.dailydemand.SearchDailyPurchaseInput;
import com.sanlly.purchase.models.input.feign.SearchModelInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderDetailInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderInput;
import com.sanlly.purchase.models.input.supplier.SearchPurcSupplierInput;
import com.sanlly.purchase.models.output.dailydemand.DailyDemandOutput;
import com.sanlly.purchase.models.output.dailydemand.DailyPurchaseOutput;
import com.sanlly.purchase.models.output.dailydemand.DailyPurchaseProductOutput;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.service.DailyOrderService;
import com.sanlly.purchase.service.DailyTemporaryPurchaseService;
import com.sanlly.purchase.service.SupplierService;
import com.sanlly.purchase.service.feign.ProductionFeignClient;
import com.sanlly.purchase.service.feign.WareFeignClient;
import com.sanlly.purchase.service.feign.WorkFlowFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Description: 直接采购接口实现类
 * @ClassName: DailyTemporaryPurchaseServiceImpl
 * @Version 1.0
 * @Author mqz
 */
@Service
public class DailyTemporaryPurchaseServiceImpl extends BaseServiceImpl implements DailyTemporaryPurchaseService {
    @Autowired
    private MatterTemporaryPurchaseMapper matterTemporaryPurchaseDao;
    @Autowired
    private MatterTenderProductMapper matterTenderProductDao;
    @Autowired
    private MatterDemandMapper MatterDemandDao;
    @Autowired
    private WareFeignClient wareFeignClient;
    @Autowired
    private WorkFlowFeignClient workflowFeignClient;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private DailyOrderService purchaseOrderService;
    @Autowired
    private MatterDemandMapper matterDemandDao;
    @Autowired
    private ProductionFeignClient productionFeignClient;
    @Autowired
    private SupplierMapper supplierMapper;
    @Autowired
    private SpecialSupplierMapper specialSupplierMapper;
    @Autowired
    private BankInformationMapper bankInformationMapper;

    @Override
    public Result addDailyPurchase(AddDailyTemporaryPurchaseInput input) throws Exception {

        if (StringUtils.isNotBlank(input.getSupplierName()) || "一次性供应商".contains(input.getSupplier())) {
            SpecialSupplierExample specialSupplierExample = new SpecialSupplierExample();
            specialSupplierExample.createCriteria().andNameEqualTo(input.getSupplierName());
            List<SpecialSupplier> specialSuppliers = specialSupplierMapper.selectByExample(specialSupplierExample);
            if (!specialSuppliers.isEmpty()) {
                return Result.Error(ResultCodeEnum.ERROR.getCode(),"一次性供应商为黑名单");
            }
            // 生成供应商的Key
            Result result = productionFeignClient.getKey("purc_supplier");
            if (result.getData() != null) {
                String supplierKey = (String) result.getData();
                input.setSupplier(supplierKey);
                Supplier supplier = new Supplier();
                supplier.setKey(supplierKey);
                supplier.setName(input.getSupplierName());
                supplier.setSettlementCycle(input.getSettlementCycle());
                supplier.setCurrency(input.getCurrency());
                supplier.setIsOneTime(CommonEnum.YES.getCode());
                supplier.setIsDel(PlatformConstants.ISDEL_NO);
                supplier.setIsSpecial(CommonEnum.NO.getCode());
                supplier.setIsBlack(CommonEnum.NO.getCode());
                BankInformation bankInformation = new BankInformation();
                bankInformation.setCurrency(input.getCurrency());
                bankInformation.setSupplier(supplierKey);
                bankInformationMapper.insertSelective(bankInformation);
                supplierMapper.insertSelective(supplier);

            }
        }
        // 0.发起审核流程
        JSONObject obj = new JSONObject();
        obj.put("key", "PurcAudit");

        JSONObject vars = new JSONObject();
        //发起人ID
        vars.put("userId", getCurrentUserAccount());
        //公司key
        vars.put("companyKey", getCurrentCompanyKey());


        obj.put("vars", vars);

        // 发起审核流程
        String processInstanceId = workflowFeignClient.startByKeyWithVars(obj);
        if (processInstanceId == null) {
            throw new RuntimeException("workflowError");
        }
        // 1.插入采购单表
        MatterTemporaryPurchase record = new MatterTemporaryPurchase();
        // 默认未审核
        record.setTenderType(input.getTenderType());
        record.setProcessInstanceId(processInstanceId);
        record.setInvoice(input.getInvoiceType());
        record.setSupplier(input.getSupplier());
        record.setIsDayPruchase(CommonEnum.YES.getCode());
        record.setPurchaseCompany(input.getMatterDemandList().get(0).getPurchaseCompany());
        record.setAuditStatus(AuditStatusEnum.AUDIT.getCode());
        record.setIsDel(CommonEnum.NO.getCode());
        record.setCreateTime(new Date());
        record.setCreateUser(getCurrentUserId());
        record.setComments(input.getComments());
        // 调用供应商接口取得
        SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
        spsInput.setKey(input.getSupplier());
        PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);

        if (supplierOutput!=null) {
            record.setCurrency(supplierOutput.getCurrency());
            //
            if (SettlementCycleEnum.PREPAID.getCode().equals(supplierOutput.getSettlementCycle())) {
                record.setPayMethod(PayMethodEnum.BEFORE.getCode());
            } else {
                record.setPayMethod(PayMethodEnum.AFTER.getCode());
            }
        }
        record.setWarehouseAddress(input.getMatterDemandList().get(0).getAddress());
        matterTemporaryPurchaseDao.insert(record);
        for (DailyDemandOutput mdOutput : input.getMatterDemandList()) {
            MatterTenderProduct mtp = new MatterTenderProduct();
            BeanUtils.copyProperties(mdOutput, mtp);
            mtp.setTenderPurchaseId(record.getPurcMatterTemporaryPurchaseId());
            mtp.setPurchaseType(input.getTenderType());
            mtp.setDeliveryTime(mdOutput.getRequireArriveTime());
            mtp.setCreateTime(new Date());
            mtp.setCreateUser(getCurrentUserId());
            mtp.setWarehouseAddress(mdOutput.getAddress());
            matterTenderProductDao.insertSelective(mtp);
            MatterDemand md = new MatterDemand();
            md.setPurcMatterDemandId(mdOutput.getPurcMatterDemandId());
            md.setIsCreateOrder(PurchaseStatusEnum.CREATED.getCode());
            md.setTenderType(input.getTenderType());
            md.setUpdateTime(new Date());
            md.setUpdateUser(getCurrentUserId());
            md.setProductCount(mdOutput.getProductCount());
            MatterDemandDao.updateByPrimaryKeySelective(md);
        }
        return Result.Success();
    }

    @Override
    public PagedList<DailyPurchaseOutput> getDailyPurchasePagedList(SearchDailyPurchaseInput input) {
        MatterTemporaryPurchaseExample example = new MatterTemporaryPurchaseExample();
        MatterTemporaryPurchaseExample.Criteria criteria = example.createCriteria();

        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 查询条件
        // 审核状态
        if (StringUtils.isNotEmpty(input.getAuditStatus())) {
            criteria.andAuditStatusEqualTo(input.getAuditStatus());
        }
        // 采购单位
        if (StringUtils.isNotEmpty(input.getPurchaseCompany())) {
            criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
        }
        // 供应商
        if (StringUtils.isNotEmpty(input.getSupplier())) {
            criteria.andSupplierEqualTo(input.getSupplier());
        }
        // 采购模式
        if (StringUtils.isNotEmpty(input.getPurchasingPattern())) {
            criteria.andTenderTypeEqualTo(input.getPurchasingPattern());
        }

        criteria.andIsDayPruchaseEqualTo(CommonEnum.YES.getCode());
        criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
        example.setOrderByClause("create_time desc");
        // 总条数
        Integer totalItemCount = (int) matterTemporaryPurchaseDao.countByExample(example);
        // 分页查询
        PagedList<DailyPurchaseOutput> pagedList = new PagedList<DailyPurchaseOutput>(input.getPageIndex(),
                input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<MatterTemporaryPurchase> purchaseList = matterTemporaryPurchaseDao.selectByExample(example);
        System.out.println(purchaseList.size());
        List<DailyPurchaseOutput> purchaseOutputList = new ArrayList<DailyPurchaseOutput>();
        for (MatterTemporaryPurchase wpr : purchaseList) {
            mtpexample.clear();
            mtpcriteria = mtpexample.createCriteria();
            mtpcriteria.andTenderPurchaseIdEqualTo(wpr.getPurcMatterTemporaryPurchaseId());
            if (StringUtils.isNotEmpty(input.getDemandNo())) {
                mtpcriteria.andDemandNoLike("%" + input.getDemandNo() + "%");
            }
            if (StringUtils.isNotEmpty(input.getProductName())) {
                mtpcriteria.andProductNumLike("%" + input.getProductName() + "%");
            }
            List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
            System.out.println(mtpList.size() + "mtplist");
            List<DailyPurchaseProductOutput> productList = new ArrayList<DailyPurchaseProductOutput>();
            for (MatterTenderProduct mtp : mtpList) {
                DailyPurchaseProductOutput mppo = new DailyPurchaseProductOutput();

                BeanUtils.copyProperties(mtp, mppo);
                productList.add(mppo);
            }
            if (productList.size() == 0) {
                continue;
            }
            DailyPurchaseOutput mpo = new DailyPurchaseOutput();
            mpo.setAuditStatusLangLang(wpr.getAuditStatus());
            mpo.setInvoiceLangLang(wpr.getInvoice());
            mpo.setPayMethodLangLang(wpr.getPayMethod());
            mpo.setCurrencyLangLang(wpr.getCurrency());
            mpo.setProductList(productList);
            BeanUtils.copyProperties(wpr, mpo);
            mpo.setSupplier(wpr.getSupplier());
            mpo.setSupplierLangLang(wpr.getSupplier());
            mpo.setPurchaseCompanyLangLang(wpr.getPurchaseCompany());
            mpo.setPurchasingPatternLangLang(wpr.getTenderType());
            purchaseOutputList.add(mpo);


        }

        pagedList.getDataList().addAll(purchaseOutputList);

        return pagedList;
    }

    @Override
    public PagedList<DailyPurchaseOutput> getAuditPurchasePagedList(SearchDailyPurchaseInput input) {
        MatterTemporaryPurchaseExample example = new MatterTemporaryPurchaseExample();
        MatterTemporaryPurchaseExample.Criteria criteria = example.createCriteria();

        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 取得已审核数据 TODO
        List<String> processInstanceIdList = new ArrayList<String>();
        Map<String, TaskOutPut> processMap = new HashMap<String, TaskOutPut>();
        if (HasAuditEnum.AUDITED.getCode().equals(input.getAuditStatus())) {
            // 取得符合审核条件的数据
            SearchModelInput smInput = new SearchModelInput(input.getPageIndex(), input.getPageSize());
            smInput.setCategory("采购审核");
            smInput.setName("采购审核");
            smInput.setLoginAccount(getCurrentUserAccount());
            Result result = workflowFeignClient.queryTaskHistoryAll(smInput);

            if (result != null) {
                ArrayList arrayList = (ArrayList) result.getData();
                for (int i = 0; i < arrayList.size(); i++) {

                    LinkedHashMap jsonObject1 = (LinkedHashMap) arrayList.get(i);
                    String processInstanceId = (String) jsonObject1.get("processInstanceId");
                    processInstanceIdList.add(processInstanceId);

                }
            }
        } else {
            // 符合审核条件的数据 TODO
            SearchModelInput smInput = new SearchModelInput();
            smInput.setCategory("采购审核");
            smInput.setName("采购审核");
            smInput.setLoginAccount(getCurrentUserAccount());
            List<TaskOutPut> taskOutPutList = workflowFeignClient.getMyAgencyTask(smInput);


            if (taskOutPutList == null || taskOutPutList.size() == 0) {
                PagedList<DailyPurchaseOutput> purchaseOutputPagedList = new PagedList<>(1, 0, 0);
                return purchaseOutputPagedList;
            }
            for (TaskOutPut item : taskOutPutList) {
                processInstanceIdList.add(item.getProcessInstanceId());
                processMap.put(item.getProcessInstanceId(), item);
            }
        }


// 查询条件
// 审核状态
       /* if (StringUtils.isNotEmpty(input.getAuditStatus())) {
            criteria.andAuditStatusEqualTo(input.getAuditStatus());
        }*/
        // 采购单位
        if (StringUtils.isNotEmpty(input.getPurchaseCompany())) {
            criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
        }
        // 供应商
        if (StringUtils.isNotEmpty(input.getSupplier())) {
            criteria.andSupplierEqualTo(input.getSupplier());
        }
        // 采购模式
        if (StringUtils.isNotEmpty(input.getPurchasingPattern())) {
            criteria.andTenderTypeEqualTo(input.getPurchasingPattern());
        }
        criteria.andIsDayPruchaseEqualTo(CommonEnum.YES.getCode());
        criteria.andIsDelEqualTo(CommonEnum.NO.getCode());


        criteria.andProcessInstanceIdIn(processInstanceIdList);

        // 总条数
        Integer totalItemCount = (int) matterTemporaryPurchaseDao.countByExample(example);
        // 分页查询
        PagedList<DailyPurchaseOutput> pagedList = new PagedList<DailyPurchaseOutput>(input.getPageIndex(),
                input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<MatterTemporaryPurchase> purchaseList = matterTemporaryPurchaseDao.selectByExample(example);
        List<DailyPurchaseOutput> purchaseOutputList = new ArrayList<DailyPurchaseOutput>();

        for (MatterTemporaryPurchase wpr : purchaseList) {
            mtpexample.clear();
            mtpcriteria = mtpexample.createCriteria();
            mtpcriteria.andTenderPurchaseIdEqualTo(wpr.getPurcMatterTemporaryPurchaseId());
            if (StringUtils.isNotEmpty(input.getDemandNo())) {
                mtpcriteria.andDemandNoLike("%" + input.getDemandNo() + "%");
            }
            if (StringUtils.isNotEmpty(input.getProductName())) {
                mtpcriteria.andProductNumLike("%" + input.getProductName() + "%");
            }
            List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
            System.out.println(mtpList.size() + "mtplist");
            List<DailyPurchaseProductOutput> productList = new ArrayList<DailyPurchaseProductOutput>();
            for (MatterTenderProduct mtp : mtpList) {
                DailyPurchaseProductOutput mppo = new DailyPurchaseProductOutput();

                BeanUtils.copyProperties(mtp, mppo);
                productList.add(mppo);
            }
            if (productList.size() == 0) {
                continue;
            }
            // 采购订单组装
            DailyPurchaseOutput mpo = new DailyPurchaseOutput();
            BeanUtils.copyProperties(wpr, mpo);
            mpo.setAuditStatusLangLang(wpr.getAuditStatus());
            mpo.setInvoiceLangLang(wpr.getInvoice());
            mpo.setSupplier(wpr.getSupplier());
            mpo.setSupplierLangLang(wpr.getSupplier());
            mpo.setPurchasingPatternLangLang(wpr.getTenderType());
            mpo.setPayMethodLangLang(wpr.getPayMethod());
            mpo.setCurrencyLangLang(wpr.getCurrency());
            mpo.setPurchaseCompanyLangLang(wpr.getPurchaseCompany());
            // 审核任务id
            if (!processMap.isEmpty()) {
                mpo.setTaskId(processMap.get(wpr.getProcessInstanceId()).getTaskId());

            }
            mpo.setProcessInstanceId(wpr.getProcessInstanceId());

            mpo.setProductList(productList);
            mpo.setPurcMatterTemporaryPurchaseId(wpr.getPurcMatterTemporaryPurchaseId());

            purchaseOutputList.add(mpo);
        }
        pagedList.getDataList().addAll(purchaseOutputList);

        return pagedList;
    }

    /**
     * 采购单审核操作
     *
     * @param purcDailyPurchaseId
     * @param processInstanceIds
     * @param taskIds
     */
    @Override
    public void auditMatterPurchase(Integer[] purcMatterTemporaryPurchaseIds, String[] processInstanceIds, String[] taskIds) {
        MatterTemporaryPurchaseExample example = new MatterTemporaryPurchaseExample();
        //criteria.andPurcMatterTemporaryPurchaseIdIn(Arrays.asList(purcMatterTemporaryPurchaseId));

        //List<MatterTemporaryPurchase> purchaseList = matterTemporaryPurchaseDao.selectByExample(example);

        for (int i = 0; i < taskIds.length; i++) {
            JSONObject obj = new JSONObject();
            obj.put("taskId", taskIds[i]);

            JSONObject vars = new JSONObject();
            //发起人ID
            vars.put("userId", getCurrentUserAccount()); //
            //公司key
            vars.put("companyKey", getCurrentCompanyKey());

            // 用户
            vars.put("userName", getCurrentUserAccount());
            // 时间
            vars.put("auditTime", new Date());

            obj.put("vars", vars);
            // 审核通过
            workflowFeignClient.complete(obj);

            // 如果审核流程结束，创建订单
            if (workflowFeignClient.isEndProcess(processInstanceIds[i])) {
                example.clear();
                MatterTemporaryPurchaseExample.Criteria criteria = example.createCriteria();
                // 更新审核状态
                MatterTemporaryPurchase record = new MatterTemporaryPurchase();
                record.setPurcMatterTemporaryPurchaseId(purcMatterTemporaryPurchaseIds[i]);
                record.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
                matterTemporaryPurchaseDao.updateByPrimaryKeySelective(record);
                // 生成采购单
                createOrder(purcMatterTemporaryPurchaseIds[i]);
            }
        }
    }

    @Override
    public void rejectMatterPurchase(Integer[] purcMatterTemporaryPurchaseIds, String[] processInstanceIds, String[] taskIds) {
        // MatterTemporaryPurchaseExample example = new MatterTemporaryPurchaseExample();
        MatterTenderProductExample example = new MatterTenderProductExample();
        MatterDemandExample mdexample = new MatterDemandExample();
        for (int i = 0; i < taskIds.length; i++) {
            workflowFeignClient.rejectTask(taskIds[i], false);

            //example.clear();
            // MatterTemporaryPurchaseExample.Criteria criteria = example.createCriteria();
            // 更新审核状态
            MatterTemporaryPurchase record = new MatterTemporaryPurchase();
            record.setPurcMatterTemporaryPurchaseId(purcMatterTemporaryPurchaseIds[i]);
            record.setAuditStatus(AuditStatusEnum.AUDITREJECT.getCode());
            matterTemporaryPurchaseDao.updateByPrimaryKeySelective(record);

            // 更新需求的采购状态
       /*     example.clear();
            MatterTenderProductExample.Criteria criteria = example.createCriteria();
            criteria.andTenderPurchaseIdEqualTo(purcMatterTemporaryPurchaseIds[i]);
            List<MatterTenderProduct> productList = matterTenderProductDao.selectByExample(example);
            for(MatterTenderProduct product:productList) {
                mdexample.clear();
                MatterDemandExample.Criteria mdCriteria = mdexample.createCriteria();
                mdCriteria.andDemandNoEqualTo(product.getDemandNo());
                MatterDemand md = new MatterDemand();
                // 将采购需求状态改回未采购
                md.setIsCreateOrder(PurchaseStatusEnum.UNCREATED.getCode());
                matterDemandDao.updateByExampleSelective(md, mdexample);
            }*/
        }

    }


    /**
     * 采购单审核通过生成订单
     *
     * @param purcMatterTemporaryPurchaseId
     * @return
     */
    private void createOrder(Integer purcMatterTemporaryPurchaseId) {
        // 调用订单接口向订单表插入数据
        MatterTenderProductExample example = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria criteria = example.createCriteria();
        criteria.andTenderPurchaseIdEqualTo(purcMatterTemporaryPurchaseId);
        List<MatterTenderProduct> products = matterTenderProductDao.selectByExample(example);
        MatterTemporaryPurchase purchase = matterTemporaryPurchaseDao.selectByPrimaryKey(purcMatterTemporaryPurchaseId);
        // 组装采购订单
        AddPurchaseOrderInput input = new AddPurchaseOrderInput();
        input.setPurchaseCompany(purchase.getPurchaseCompany());
        input.setReciverAddress(purchase.getWarehouseAddress());
        input.setPurchaseType(purchase.getTenderType());
        input.setPurchaseUserId(purchase.getCreateUser());
        input.setSupplier(purchase.getSupplier());
        input.setPurchaseTime(purchase.getCreateTime());
        input.setInvoice(purchase.getInvoice());
        // 组装采购商品详情数据
        List<AddPurchaseOrderDetailInput> details = new ArrayList<>();
        for (MatterTenderProduct product : products) {
            AddPurchaseOrderDetailInput detail = new AddPurchaseOrderDetailInput();
            detail.setDemandNo(product.getDemandNo());
//			detail.setPurcPurchaseOrder(purchase.get);
//			detail.setDemandTime(product.get);
            detail.setProduct(product.getProductNum());
            detail.setBrand(product.getProductBrand());
            detail.setProduct(product.getProductNum());
//			detail.setSparePartsNo(prod);
            detail.setOrderNum(product.getProductCount());
            detail.setUnitPrice(product.getPrice());
            detail.setSpecification(product.getProductSpecial());
            detail.setModel(product.getProductModel());
            detail.setComments(product.getComments());
            detail.setRequiredDeliveryDate(product.getDeliveryTime());
            detail.setSparePartsUnit(product.getSparePartsUnit());
            details.add(detail);

        }
        input.setDetails(details);
        purchaseOrderService.addPurchaseOrder(input);

    }


    @Override
    public DailyPurchaseOutput getMatterTemporaryPurchaseInfo(Integer purcMatterTemporaryPurchaseId) {
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 查询条件

        MatterTemporaryPurchase wpr = matterTemporaryPurchaseDao.selectByPrimaryKey(purcMatterTemporaryPurchaseId);
        DailyPurchaseOutput mpo = new DailyPurchaseOutput();

        // 数据组装
        mtpcriteria.andTenderPurchaseIdEqualTo(wpr.getPurcMatterTemporaryPurchaseId());
        List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
        List<DailyPurchaseProductOutput> productList = new ArrayList<DailyPurchaseProductOutput>();

        // 采购备件数据组装
        for (MatterTenderProduct mtp : mtpList) {
            DailyPurchaseProductOutput mppo = new DailyPurchaseProductOutput();
            //
            BeanUtils.copyProperties(mtp, mppo);

            productList.add(mppo);
        }
        if (productList.size() == 0) {
            return mpo;
        }
        // 采购订单组装
        mpo.setAuditStatus(wpr.getAuditStatus());
        mpo.setAuditStatusLangLang(wpr.getAuditStatus());
        mpo.setInvoice(wpr.getInvoice());
        mpo.setInvoiceLangLang(wpr.getInvoice());

        mpo.setSupplier(wpr.getSupplier());
        mpo.setSupplierLangLang(wpr.getSupplier());

        mpo.setPurchaseCompany(wpr.getPurchaseCompany());
        mpo.setPurchaseCompanyLangLang(wpr.getPurchaseCompany());

        mpo.setPurchasingPattern(wpr.getTenderType());
        mpo.setPurchasingPatternLangLang(wpr.getTenderType());


        mpo.setProcessInstanceId(wpr.getProcessInstanceId());
        mpo.setProductList(productList);
        mpo.setPurcMatterTemporaryPurchaseId(wpr.getPurcMatterTemporaryPurchaseId());

        return mpo;
    }

    @Transactional
    @Override
    public void editDailyPurchase(DailyPurchaseOutput input) {
        // 1.插入采购单表
        MatterTemporaryPurchase record = new MatterTemporaryPurchase();

        // 默认未审核
        record.setAuditStatus(AuditStatusEnum.AUDIT.getCode());
        record.setTenderType(input.getPurchasingPattern());
        record.setInvoice(input.getInvoice());
        record.setSupplier(input.getSupplier());
        record.setPurcMatterTemporaryPurchaseId(input.getPurcMatterTemporaryPurchaseId());
        record.setUpdateTime(new Date());
        record.setUpdateUser(getCurrentUserId());
        matterTemporaryPurchaseDao.updateByPrimaryKeySelective(record);

        for (DailyPurchaseProductOutput mdOutput : input.getProductList()) {
            // 2.插入采购单关联备件
            MatterTenderProduct mtp = new MatterTenderProduct();
            BeanUtils.copyProperties(mdOutput, mtp);
            mtp.setPurchaseType(input.getPurchasingPattern());
            mtp.setTotalPrice(mdOutput.getPrice().multiply(new BigDecimal(mdOutput.getProductCount())));

            mtp.setUpdateTime(new Date());
            mtp.setUpdateUser(getCurrentUserId());
            matterTenderProductDao.updateByPrimaryKeySelective(mtp);

        }
    }
}

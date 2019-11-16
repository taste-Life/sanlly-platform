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
import com.sanlly.purchase.models.input.demand.AddMatterTemporaryPurchaseInput;
import com.sanlly.purchase.models.input.demand.SearchMatterTemporaryPurchaseInput;
import com.sanlly.purchase.models.input.feign.SearchModelInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderDetailInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderInput;
import com.sanlly.purchase.models.input.supplier.SearchPurcSupplierInput;
import com.sanlly.purchase.models.output.MatterDemand.MatterDemandOutput;
import com.sanlly.purchase.models.output.feign.SparePartsOutput;
import com.sanlly.purchase.models.output.feign.WareWarehouse;
import com.sanlly.purchase.models.output.matterpurchase.MatterPurchaseOutput;
import com.sanlly.purchase.models.output.matterpurchase.MatterPurchaseProductOutput;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.service.MatterOrderService;
import com.sanlly.purchase.service.MatterTemporaryPurchaseService;
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
 * Description: 物料直接采购单接口
 *
 * @author jlx
 * @ClassName: MatterTemporaryPurchaseServiceImpl
 * @date 2019年8月2日
 */
@Service
public class MatterTemporaryPurchaseServiceImpl extends BaseServiceImpl implements MatterTemporaryPurchaseService {

    @Autowired
    private MatterTemporaryPurchaseMapper matterTemporaryPurchaseDao;
    @Autowired
    private MatterTenderProductMapper matterTenderProductDao;
    @Autowired
    private MatterDemandMapper matterDemandDao;
    @Autowired
    private WareFeignClient wareFeignClient;
    @Autowired
    private WorkFlowFeignClient workflowFeignClient;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private MatterOrderService purchaseOrderService;
    @Autowired
    private ProductionFeignClient productionFeignClient;
    @Autowired
    private SupplierMapper supplierMapper;
    @Autowired
    private SpecialSupplierMapper specialSupplierMapper;
    @Autowired
    private BankInformationMapper bankInformationMapper;

    /**
     * 添加采购单
     *
     * @throws Exception
     */
    @Transactional
    @Override
    public Result addMatterTemporaryPurchase(AddMatterTemporaryPurchaseInput input) {

        if (StringUtils.isNotBlank(input.getSupplierName()) || "一次性供应商".contains(input.getSupplier())) {
            SpecialSupplierExample specialSupplierExample = new SpecialSupplierExample();
            specialSupplierExample.createCriteria().andNameEqualTo(input.getSupplierName());
            List<SpecialSupplier> specialSuppliers = specialSupplierMapper.selectByExample(specialSupplierExample);
            if (!specialSuppliers.isEmpty()) {
                return Result.Error(ResultCodeEnum.ERROR.getCode(), "一次性供应商为黑名单");
            }
            // 生成供应商的Key
            Result result = productionFeignClient.getKey("purc_supplier");
            if (result.getData() != null) {
                String supplierKey = (String) result.getData();
                input.setSupplier(supplierKey);
                Supplier supplier = new Supplier();
                supplier.setKey(supplierKey);
                supplier.setName(input.getSupplierName());
                supplier.setIsOneTime(CommonEnum.YES.getCode());
                supplier.setSettlementCycle(input.getSettlementCycle());
                supplier.setCurrency(input.getCurrency());
                supplier.setIsDel(PlatformConstants.ISDEL_NO);
                supplier.setIsSpecial(CommonEnum.NO.getCode());
                supplier.setIsBlack(CommonEnum.NO.getCode());
                ;
                BankInformation bankInformation = new BankInformation();
                bankInformation.setCurrency(input.getCurrency());
                bankInformation.setSupplier(supplierKey);
                bankInformationMapper.insertSelective(bankInformation);
                supplierMapper.insertSelective(supplier);

            }
        }
        String processInstanceId = null;
        // 1.插入采购单表
        MatterTemporaryPurchase record = new MatterTemporaryPurchase();

        if (!"LEPurchasingPattern3".equals(input.getTenderType())) {
            // 0.发起审核流程
            JSONObject obj = new JSONObject();
            obj.put("key", "PurcAudit");

            JSONObject vars = new JSONObject();
            //发起人ID
            vars.put("userId", "admin");
            //公司key
            vars.put("companyKey", "sanlly");


            obj.put("vars", vars);

            try {
                // 发起审核流程
                processInstanceId = workflowFeignClient.startByKeyWithVars(obj);
                if (processInstanceId == null) {
                    throw new RuntimeException("workflowError");
                }
            } catch (Exception e) {
                throw new RuntimeException("workflowError");
            }

        }
        record.setAuditStatus(AuditStatusEnum.AUDIT.getCode());
        // 默认未审核
        record.setComments(input.getRemark());
        record.setTenderType(input.getTenderType());
        record.setProcessInstanceId(processInstanceId);
        record.setInvoice(input.getInvoiceType());
        record.setSupplier(input.getSupplier());
        record.setIsDayPruchase(CommonEnum.NO.getCode());
        record.setPurchaseCompany(input.getMatterDemandList().get(0).getPurchaseCompany());
        record.setWarehouse(input.getMatterDemandList().get(0).getWarehouse());
        record.setIsDel(CommonEnum.NO.getCode());
        record.setCreateTime(new Date());
        record.setCreateUser(getCurrentUserId());
        // 调用供应商接口取得
        SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
        spsInput.setKey(input.getSupplier());
        PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);

        if (supplierOutput != null) {
            record.setCurrency(supplierOutput.getCurrency());
            //
            if (SettlementCycleEnum.PREPAID.getCode().equals(supplierOutput.getSettlementCycle())) {
                record.setPayMethod(PayMethodEnum.BEFORE.getCode());
            } else {
                record.setPayMethod(PayMethodEnum.AFTER.getCode());
            }
        }
        matterTemporaryPurchaseDao.insertSelective(record);

        for (MatterDemandOutput mdOutput : input.getMatterDemandList()) {
            // 2.插入采购单关联备件
            MatterTenderProduct mtp = new MatterTenderProduct();
            BeanUtils.copyProperties(mdOutput, mtp);
            mtp.setTenderPurchaseId(record.getPurcMatterTemporaryPurchaseId());
            mtp.setDemandUserId(mdOutput.getApplicantUserId());
            mtp.setPurchaseType(input.getTenderType());
            mtp.setTotalPrice(mdOutput.getPrice().multiply(new BigDecimal(mdOutput.getProductCount())));
            mtp.setDeliveryTime(mdOutput.getRequireArriveTime());
            // 上次采购价格
            SparePartsOutput rs = wareFeignClient.getSparePart(mdOutput.getProduct()).getData();
            if (rs != null) {
                mtp.setLastPrice(wareFeignClient.getLastEntryPrice(mdOutput.getProduct(), mdOutput.getWarehouse()).getData());
            }

            mtp.setCreateTime(new Date());
            mtp.setCreateUser(getCurrentUserId());
            matterTenderProductDao.insertSelective(mtp);

            // 3.更新需求表相关信息
            MatterDemand md = new MatterDemand();
            md.setPurcMatterDemandId(mdOutput.getPurcMatterDemandId());
            md.setIsCreateOrder(PurchaseStatusEnum.CREATED.getCode());
            md.setTenderType(input.getTenderType());
            md.setUpdateTime(new Date());
            md.setUpdateUser(getCurrentUserId());
            matterDemandDao.updateByPrimaryKeySelective(md);
        }
        return Result.Success();

    }

    /**
     * 采购单列表
     */
    @Override
    public PagedList<MatterPurchaseOutput> getMatterTemporaryPurchasePagedList(
            SearchMatterTemporaryPurchaseInput input) {
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
        } else {
            List<String> tenderTypes = new ArrayList<>();
            tenderTypes.add(PurchasingPatternEnum.AGREEMENT.getCode());
            tenderTypes.add(PurchasingPatternEnum.ONLY.getCode());
            tenderTypes.add(PurchasingPatternEnum.TEMPORARY.getCode());
            criteria.andTenderTypeIn(tenderTypes);
        }
        criteria.andIsDayPruchaseEqualTo(CommonEnum.NO.getCode());
        criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
        example.setOrderByClause("create_time desc");
        // 总条数
        Integer totalItemCount = (int) matterTemporaryPurchaseDao.countByExample(example);
        // 分页查询
        PagedList<MatterPurchaseOutput> pagedList = new PagedList<MatterPurchaseOutput>(input.getPageIndex(),
                input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<MatterTemporaryPurchase> purchaseList = matterTemporaryPurchaseDao.selectByExample(example);
        List<MatterPurchaseOutput> purchaseOutputList = new ArrayList<MatterPurchaseOutput>();

        // 数据组装
        for (MatterTemporaryPurchase wpr : purchaseList) {
            mtpexample.clear();
            mtpcriteria = mtpexample.createCriteria();
            mtpcriteria.andTenderPurchaseIdEqualTo(wpr.getPurcMatterTemporaryPurchaseId());
            // 需求编号
            if (StringUtils.isNotEmpty(input.getDemandNo())) {
                mtpcriteria.andDemandNoLike("%" + input.getDemandNo() + "%");
            }
            // 备件key
            if (StringUtils.isNotEmpty(input.getSparePartsNo())) {
                mtpcriteria.andProductNumLike("%" + input.getSparePartsNo() + "%");
            }
            List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
            List<MatterPurchaseProductOutput> productList = new ArrayList<MatterPurchaseProductOutput>();


            // 采购备件数据组装
            for (MatterTenderProduct mtp : mtpList) {
                MatterPurchaseProductOutput mppo = new MatterPurchaseProductOutput();
//				
                BeanUtils.copyProperties(mtp, mppo);

                SparePartsOutput rsSparePart = wareFeignClient.getSparePart(mtp.getProduct()).getData();
                if (rsSparePart != null) {
                    mppo.setProductNum(rsSparePart.getSparePartsNo());
                    mppo.setSparePartsCategoriesLangLang(rsSparePart.getSparePartsCategories());
                    mppo.setSparePartsCategoriesDetailsLangLang(rsSparePart.getSparePartsCategoriesDetails());
                    mppo.setProductLangLang(rsSparePart.getKey());
                    mppo.setProductSpecial(rsSparePart.getSparePartsSpec());
                    mppo.setProductModel(rsSparePart.getModel());
                    mppo.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
                    mppo.setLastPrice(wareFeignClient.getLastEntryPrice(mtp.getProduct(), mtp.getWarehouse()).getData());
                    mppo.setTotalMoney(mtp.getPrice().multiply(new BigDecimal(mtp.getProductCount())));
                }
                productList.add(mppo);
            }
            if (productList.size() == 0) {
                continue;
            }
            // 审核流程组装 TODO
//			SearchModelInput smInput = new SearchModelInput();
//			smInput.setProcessInstanceId(wpr.getProcessInstanceId());
//			Result workflowRs = workflowFeignClient.findHistoryProcessVariables(smInput);

//			List<AuditPurchaseTaskOutput> auditList = new ArrayList<AuditPurchaseTaskOutput>();
            // 采购订单组装
            MatterPurchaseOutput mpo = new MatterPurchaseOutput();
            mpo.setAuditStatus(wpr.getAuditStatus());
            mpo.setAuditStatusLangLang(wpr.getAuditStatus());
            if (!"LEPurchasingPattern3".equals(wpr.getTenderType())&&AuditStatusEnum.AUDIT.getCode().equals(wpr.getAuditStatus())) {
                JSONObject obj = new JSONObject();
                obj.put("processInstanceId", wpr.getProcessInstanceId());
                List<Map<String, Object>> lists = workflowFeignClient.getByProcessInstanceId(obj);
                if (lists.size() > 0) {
                    mpo.setAuditStatusDis("待" + lists.get(0).get("taskName").toString());
                }
            }
            mpo.setInvoice(wpr.getInvoice());
            mpo.setInvoiceLangLang(wpr.getInvoice());
            mpo.setRemark(wpr.getComments());
            // 调用供应商接口取得
            SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
            spsInput.setKey(wpr.getSupplier());
            PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
            if (supplierOutput != null) {
                mpo.setCurrencyLangLang(supplierOutput.getCurrency());
                //
                if (SettlementCycleEnum.PREPAID.getCode().equals(supplierOutput.getSettlementCycle())) {
                    mpo.setPayMethodLangLang(PayMethodEnum.BEFORE.getCode());
                } else {
                    mpo.setPayMethodLangLang(PayMethodEnum.AFTER.getCode());
                }
            }
            mpo.setSupplier(wpr.getSupplier());
            mpo.setSupplierLangLang(wpr.getSupplier());
            mpo.setPurchasingPattern(wpr.getTenderType());
            mpo.setPurchasingPatternLangLang(wpr.getTenderType());

            // 仓库地址取得
//			Result rs = wareFeignClient.getWarehouses(wpr.getWarehouse());
//			if(rs!=null) {
//				Map<String, Object> map = (Map<String, Object>) rs.getData();
//				mpo.setWarehouseAddress(map.get("warehouseAddr").toString());
//			}
            WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(wpr.getWarehouse()).getData();

            if (warehouse != null) {
                mpo.setWarehouseAddress(warehouse.getWarehouseAddr());
            }
            mpo.setProcessInstanceId(wpr.getProcessInstanceId());
            mpo.setProductList(productList);
            mpo.setPurcMatterTemporaryPurchaseId(wpr.getPurcMatterTemporaryPurchaseId());
            mpo.setPurchaseCompanyLangLang(wpr.getPurchaseCompany());

            purchaseOutputList.add(mpo);

        }
        // 将分页数据放入结果中
        pagedList.getDataList().addAll(purchaseOutputList);
        return pagedList;
    }

    /**
     * 采购单审核列表
     */
    @Override
    public PagedList<MatterPurchaseOutput> getAuditPurchasePagedList(
            SearchMatterTemporaryPurchaseInput input) {


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
            // 取得符合审核条件的数据
            SearchModelInput smInput = new SearchModelInput();
            smInput.setCategory("采购审核");
            smInput.setName("采购审核");
            smInput.setLoginAccount(getCurrentUserAccount());
            List<TaskOutPut> taskOutPutList = workflowFeignClient.getMyAgencyTask(smInput);


            for (TaskOutPut item : taskOutPutList) {
                processInstanceIdList.add(item.getProcessInstanceId());
                processMap.put(item.getProcessInstanceId(), item);
            }
        }
        // 查询条件
        // 审核状态
      /*  if (StringUtils.isNotEmpty(input.getAuditStatus())) {
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
        criteria.andIsDayPruchaseEqualTo(CommonEnum.NO.getCode());
        criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
        example.setOrderByClause("create_time desc");


        criteria.andProcessInstanceIdIn(processInstanceIdList);

        // 总条数
        Integer totalItemCount = (int) matterTemporaryPurchaseDao.countByExample(example);
        // 分页查询
        PagedList<MatterPurchaseOutput> pagedList = new PagedList<MatterPurchaseOutput>(input.getPageIndex(),
                input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<MatterTemporaryPurchase> purchaseList = matterTemporaryPurchaseDao.selectByExample(example);
        List<MatterPurchaseOutput> purchaseOutputList = new ArrayList<MatterPurchaseOutput>();

        BigDecimal totoalMoney;
        // 数据组装
        for (MatterTemporaryPurchase wpr : purchaseList) {

            JSONObject obj = new JSONObject();
            obj.put("processInstanceId", wpr.getProcessInstanceId());
            List<Map<String, Object>> lists = workflowFeignClient.getByProcessInstanceId(obj);
            mtpexample.clear();
            mtpcriteria = mtpexample.createCriteria();
            totoalMoney = new BigDecimal("0");
            mtpcriteria.andTenderPurchaseIdEqualTo(wpr.getPurcMatterTemporaryPurchaseId());
            // 需求编号
            if (StringUtils.isNotEmpty(input.getDemandNo())) {
                mtpcriteria.andDemandNoLike("%" + input.getDemandNo() + "%");
            }
            // 备件key
            if (StringUtils.isNotEmpty(input.getSparePartsNo())) {
                mtpcriteria.andProductNumLike("%" + input.getSparePartsNo() + "%");
            }
            List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
            List<MatterPurchaseProductOutput> productList = new ArrayList<MatterPurchaseProductOutput>();

            // 采购备件数据组装
            for (MatterTenderProduct mtp : mtpList) {
                MatterPurchaseProductOutput mppo = new MatterPurchaseProductOutput();
//				
                BeanUtils.copyProperties(mtp, mppo);

                SparePartsOutput rsSparePart = wareFeignClient.getSparePart(mtp.getProduct()).getData();
                if (rsSparePart != null) {
                    mppo.setProductNum(rsSparePart.getSparePartsNo());
                    mppo.setSparePartsCategoriesLangLang(rsSparePart.getSparePartsCategories());
                    mppo.setSparePartsCategoriesDetailsLangLang(rsSparePart.getSparePartsCategoriesDetails());
                    mppo.setProductLangLang(rsSparePart.getKey());
                    mppo.setProductSpecial(rsSparePart.getSparePartsSpec());
                    mppo.setProductModel(rsSparePart.getModel());
                    mppo.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
                    mppo.setLastPrice(wareFeignClient.getLastEntryPrice(mtp.getProduct(), mtp.getWarehouse()).getData());
                    mppo.setTotalMoney(mtp.getPrice().multiply(new BigDecimal(mtp.getProductCount())));
                }
                productList.add(mppo);
            }
            if (productList.size() == 0) {
                continue;
            }
            // 采购订单组装
            MatterPurchaseOutput mpo = new MatterPurchaseOutput();
            mpo.setAuditStatus(wpr.getAuditStatus());
            mpo.setAuditStatusLangLang(wpr.getAuditStatus());
            if (lists.size() > 0) {
                mpo.setAuditStatusDis("待" + lists.get(0).get("taskName").toString());
            }
            mpo.setInvoiceLangLang(wpr.getInvoice());
            mpo.setSupplier(wpr.getSupplier());
            mpo.setSupplierLangLang(wpr.getSupplier());
            mpo.setPurchasingPatternLangLang(wpr.getTenderType());
            mpo.setPurchasingPattern(wpr.getTenderType());
            mpo.setRemark(wpr.getComments());

            // 调用供应商接口取得
            SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
            spsInput.setKey(wpr.getSupplier());
            PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);

            if (supplierOutput != null) {
                mpo.setCurrencyLangLang(supplierOutput.getCurrency());
                //
                if (SettlementCycleEnum.PREPAID.getCode().equals(supplierOutput.getSettlementCycle())) {
                    mpo.setPayMethodLangLang(PayMethodEnum.BEFORE.getCode());
                } else {
                    mpo.setPayMethodLangLang(PayMethodEnum.AFTER.getCode());
                }
            }

            // 审核任务id
            if (!processMap.isEmpty()) {
                mpo.setTaskId(processMap.get(wpr.getProcessInstanceId()).getTaskId());

            }
            mpo.setProcessInstanceId(wpr.getProcessInstanceId());

            // 仓库地址去掉
//			Result rs = wareFeignClient.getWarehouses(wpr.getWarehouse());
//			if(rs!=null) {
//				Map<String, Object> map = (Map<String, Object>) rs.getData();
//				mpo.setWarehouseAddress(map.get("warehouseAddr").toString());
//			}
            WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(wpr.getWarehouse()).getData();

            if (warehouse != null) {
                mpo.setWarehouseAddress(warehouse.getWarehouseAddr());
            }

            mpo.setProductList(productList);
            mpo.setPurcMatterTemporaryPurchaseId(wpr.getPurcMatterTemporaryPurchaseId());

            purchaseOutputList.add(mpo);

        }    // 将分页数据放入结果中
        pagedList.getDataList().addAll(purchaseOutputList);
        return pagedList;
    }

    /**
     * 采购单审核操作
     */
    @Override
    @Transactional
    public void auditMatterPurchase(Integer[] purcMatterTemporaryPurchaseIds) {
          for (Integer purcMatterTemporaryPurchaseId:purcMatterTemporaryPurchaseIds){
              MatterTemporaryPurchase matterTemporaryPurchase=matterTemporaryPurchaseDao.selectByPrimaryKey(purcMatterTemporaryPurchaseId);
              matterTemporaryPurchase.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
              matterTemporaryPurchaseDao.updateByPrimaryKeySelective(matterTemporaryPurchase);
              createOrder(purcMatterTemporaryPurchaseId);
          }
    }

    @Override
    @Transactional
    public void rejectMatterPurchase(Integer[] purcMatterTemporaryPurchaseIds){
        for (Integer purcMatterTemporaryPurchaseId:purcMatterTemporaryPurchaseIds){
            MatterTemporaryPurchase matterTemporaryPurchase=matterTemporaryPurchaseDao.selectByPrimaryKey(purcMatterTemporaryPurchaseId);
            matterTemporaryPurchase.setAuditStatus(AuditStatusEnum.AUDITREJECT.getCode());
            matterTemporaryPurchaseDao.updateByPrimaryKeySelective(matterTemporaryPurchase);

        }

    }


    /**
     * 采购单审核操作
     */
    @Override
    @Transactional
    public void auditMatterPurchase(Integer[] purcMatterTemporaryPurchaseIds, String[] processInstanceIds, String[]
            taskIds) {

        MatterTemporaryPurchaseExample example = new MatterTemporaryPurchaseExample();
//		criteria.andPurcMatterTemporaryPurchaseIdIn(Arrays.asList(purcMatterTemporaryPurchaseId));
//		
//		List<MatterTemporaryPurchase> purchaseList = matterTemporaryPurchaseDao.selectByExample(example);

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
                // 更新审核状态
                MatterTemporaryPurchase record = new MatterTemporaryPurchase();
                record.setPurcMatterTemporaryPurchaseId(purcMatterTemporaryPurchaseIds[i]);
                record.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
                MatterTemporaryPurchase matterTemporaryPurchase = matterTemporaryPurchaseDao.selectByPrimaryKey(purcMatterTemporaryPurchaseIds[i]);
                if (matterTemporaryPurchase.getCreateUser() == null) {
                    record.setCreateUser(getCurrentUserId());
                }
                matterTemporaryPurchaseDao.updateByPrimaryKeySelective(record);
                // 生成采购单
                createOrder(purcMatterTemporaryPurchaseIds[i]);
            } else {
                example.clear();
                // 更新审核状态
                MatterTemporaryPurchase record = new MatterTemporaryPurchase();
                record.setPurcMatterTemporaryPurchaseId(purcMatterTemporaryPurchaseIds[i]);
                record.setAuditStatus(AuditStatusEnum.AUDIT.getCode());
                MatterTemporaryPurchase matterTemporaryPurchase = matterTemporaryPurchaseDao.selectByPrimaryKey(purcMatterTemporaryPurchaseIds[i]);
                if (matterTemporaryPurchase.getCreateUser() == null) {
                    record.setCreateUser(getCurrentUserId());
                }
                matterTemporaryPurchaseDao.updateByPrimaryKeySelective(record);

            }
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
        input.setPurchaseWare(purchase.getWarehouse());
        input.setPurchaseType(purchase.getTenderType());
        input.setPurchaseUserId(purchase.getCreateUser());
        input.setSupplier(purchase.getSupplier());
        input.setPurchaseTime(purchase.getCreateTime());
        input.setInvoice(purchase.getInvoice());
        input.setComments(purchase.getComments());
        // 组装采购商品详情数据
        List<AddPurchaseOrderDetailInput> details = new ArrayList<>();
        for (MatterTenderProduct product : products) {
            AddPurchaseOrderDetailInput detail = new AddPurchaseOrderDetailInput();
            detail.setDemandNo(product.getDemandNo());
//			detail.setPurcPurchaseOrder(purchase.get);
//			detail.setDemandTime(product.get);
            detail.setProduct(product.getProduct());
//			detail.setSparePartsNo(prod);
            detail.setOrderNum(product.getProductCount());
            detail.setUnitPrice(product.getPrice());
            detail.setComments(product.getComments());
            detail.setRequiredDeliveryDate(product.getDeliveryTime());
            details.add(detail);

        }
        input.setDetails(details);
        purchaseOrderService.addPurchaseOrder(input);
    }

    /**
     * 驳回处理
     */
    @Override
    public void rejectMatterPurchase(Integer[] purcMatterTemporaryPurchaseIds, String[] processInstanceIds,
                                     String[] taskIds) {

//		MatterTemporaryPurchaseExample example = new MatterTemporaryPurchaseExample();
        MatterTenderProductExample example = new MatterTenderProductExample();
        MatterDemandExample mdexample = new MatterDemandExample();
        for (int i = 0; i < taskIds.length; i++) {
            workflowFeignClient.rejectTask(taskIds[i], false);
//
//			example.clear();
//			MatterTemporaryPurchaseExample.Criteria criteria = example.createCriteria();
            // 更新审核状态
            MatterTemporaryPurchase record = new MatterTemporaryPurchase();
            record.setPurcMatterTemporaryPurchaseId(purcMatterTemporaryPurchaseIds[i]);
            record.setAuditStatus(AuditStatusEnum.AUDITREJECT.getCode());
            matterTemporaryPurchaseDao.updateByPrimaryKeySelective(record);
            // 更新需求的采购状态
//			example.clear();
//			MatterTenderProductExample.Criteria criteria = example.createCriteria();
//			criteria.andTenderPurchaseIdEqualTo(purcMatterTemporaryPurchaseIds[i]);
//			List<MatterTenderProduct> productList = matterTenderProductDao.selectByExample(example);

//			for(MatterTenderProduct product:productList) {
//				mdexample.clear();
//				MatterDemandExample.Criteria mdCriteria = mdexample.createCriteria();
//				mdCriteria.andDemandNoEqualTo(product.getDemandNo());
//				MatterDemand md = new MatterDemand();
//				// 将采购需求状态改回未采购
//				md.setIsCreateOrder(PurchaseStatusEnum.UNCREATED.getCode());
//				matterDemandDao.updateByExampleSelective(md, mdexample);
//			}
        }

    }

    /**
     * 取得采购单编辑信息
     */
    @Override
    public MatterPurchaseOutput getMatterTemporaryPurchaseInfo(Integer purcMatterTemporaryPurchaseId) {


        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 查询条件

        MatterTemporaryPurchase wpr = matterTemporaryPurchaseDao.selectByPrimaryKey(purcMatterTemporaryPurchaseId);
        MatterPurchaseOutput mpo = new MatterPurchaseOutput();

        // 数据组装
        mtpcriteria.andTenderPurchaseIdEqualTo(wpr.getPurcMatterTemporaryPurchaseId());
        List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
        List<MatterPurchaseProductOutput> productList = new ArrayList<MatterPurchaseProductOutput>();

        // 采购备件数据组装
        for (MatterTenderProduct mtp : mtpList) {
            MatterPurchaseProductOutput mppo = new MatterPurchaseProductOutput();
            //
            BeanUtils.copyProperties(mtp, mppo);

            SparePartsOutput rsSparePart = wareFeignClient.getSparePart(mtp.getProduct()).getData();
            if (rsSparePart != null) {
                mppo.setProductNum(rsSparePart.getSparePartsNo());
                mppo.setSparePartsCategoriesLangLang(rsSparePart.getSparePartsCategories());
                mppo.setSparePartsCategoriesDetailsLangLang(rsSparePart.getSparePartsCategoriesDetails());
                mppo.setProductLangLang(rsSparePart.getKey());
                mppo.setProductSpecial(rsSparePart.getSparePartsSpec());
                mppo.setProductModel(rsSparePart.getModel());
                mppo.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
                mppo.setLastPrice(wareFeignClient.getLastEntryPrice(mtp.getProduct(), mtp.getWarehouse()).getData());
            }
            mppo.setTotalMoney(mtp.getPrice().multiply(new BigDecimal(mtp.getProductCount())));

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
        // 调用供应商接口取得
        SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
        spsInput.setKey(wpr.getSupplier());
        PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
        if (supplierOutput != null) {
            mpo.setCurrencyLangLang(supplierOutput.getCurrency());
            //
            if (SettlementCycleEnum.PREPAID.getCode().equals(supplierOutput.getSettlementCycle())) {
                mpo.setPayMethodLangLang(PayMethodEnum.BEFORE.getCode());
            } else {
                mpo.setPayMethodLangLang(PayMethodEnum.AFTER.getCode());
            }
        }
        mpo.setSupplier(wpr.getSupplier());
        mpo.setSupplierLangLang(wpr.getSupplier());

        mpo.setPurchaseCompany(wpr.getPurchaseCompany());
        mpo.setPurchaseCompanyLangLang(wpr.getPurchaseCompany());

        mpo.setPurchasingPattern(wpr.getTenderType());
        mpo.setPurchasingPatternLangLang(wpr.getTenderType());

        WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(wpr.getWarehouse()).getData();

        if (warehouse != null) {
            mpo.setWarehouseAddress(warehouse.getWarehouseAddr());
        }
        mpo.setProcessInstanceId(wpr.getProcessInstanceId());
        mpo.setProductList(productList);
        mpo.setPurcMatterTemporaryPurchaseId(wpr.getPurcMatterTemporaryPurchaseId());

        return mpo;
    }


    /**
     * 采购单编辑
     */
    @Override
    @Transactional
    public void editMatterTemporaryPurchase(MatterPurchaseOutput input) {

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

        for (MatterPurchaseProductOutput mdOutput : input.getProductList()) {
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

    @Transactional
    @Override
    public void delMatterTemporaryPurchase(Integer[] purchaseIds) {
        MatterTenderProductExample productExample = new MatterTenderProductExample();
        MatterDemandExample mdexample = new MatterDemandExample();

        MatterTemporaryPurchaseExample example = new MatterTemporaryPurchaseExample();
        MatterTemporaryPurchaseExample.Criteria criteria = example.createCriteria();
        criteria.andPurcMatterTemporaryPurchaseIdIn(Arrays.asList(purchaseIds));
        criteria.andAuditStatusEqualTo(AuditStatusEnum.AUDITOK.getCode());

        // 条数
        Integer totalItemCount = (int) matterTemporaryPurchaseDao.countByExample(example);
        if (totalItemCount > 0) {
            throw new RuntimeException("purchaseAuditOK");
        } else {
            for (Integer purchaseId : purchaseIds) {

                MatterTemporaryPurchase record = new MatterTemporaryPurchase();
                record.setIsDel(CommonEnum.YES.getCode());
                record.setPurcMatterTemporaryPurchaseId(purchaseId);
                matterTemporaryPurchaseDao.updateByPrimaryKeySelective(record);


                // 更新需求的采购状态
                productExample.clear();
                MatterTenderProductExample.Criteria productCriteria = productExample.createCriteria();
                productCriteria.andTenderPurchaseIdEqualTo(purchaseId);
                List<MatterTenderProduct> productList = matterTenderProductDao.selectByExample(productExample);

                for (MatterTenderProduct product : productList) {
                    mdexample.clear();
                    MatterDemandExample.Criteria mdCriteria = mdexample.createCriteria();
                    mdCriteria.andDemandNoEqualTo(product.getDemandNo());
                    MatterDemand md = new MatterDemand();
                    // 将采购需求状态改回未采购
                    md.setIsCreateOrder(PurchaseStatusEnum.UNCREATED.getCode());
                    matterDemandDao.updateByExampleSelective(md, mdexample);
                }
            }
        }
    }

}

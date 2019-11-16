package com.sanlly.purchase.service.impl;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.purchase.dao.*;
import com.sanlly.purchase.entity.*;
import com.sanlly.purchase.enums.*;
import com.sanlly.purchase.models.input.dailytender.AddDailyTenderInput;
import com.sanlly.purchase.models.input.dailytender.AddDailyTenderResultInput;
import com.sanlly.purchase.models.input.dailytender.SearchDailyTenderInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderDetailInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderInput;
import com.sanlly.purchase.models.input.supplier.SearchPurcSupplierInput;
import com.sanlly.purchase.models.output.dailydemand.DailyDemandOutput;
import com.sanlly.purchase.models.output.dailytender.DailyTenderOutput;
import com.sanlly.purchase.models.output.dailytender.DailyTenderProductOutput;
import com.sanlly.purchase.models.output.dailytender.DailyTenderSupplierOutput;
import com.sanlly.purchase.models.output.mattertender.TenderNoticeOutput;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.service.AuthFigenClient;
import com.sanlly.purchase.service.DailyOrderService;
import com.sanlly.purchase.service.DailyTenderService;
import com.sanlly.purchase.service.SupplierService;
import com.sanlly.purchase.service.feign.WareFeignClient;
import com.sanlly.purchase.utils.MailUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description: TODO
 * @ClassName: DailyTenderServiceImpl
 * @Version 1.0
 * @Author mqz
 */
@Service
public class DailyTenderServiceImpl extends  BaseServiceImpl implements DailyTenderService {
    // 招标采购
    @Autowired
    private MatterTenderPurchaseMapper matterTenderPurchaseDao;
    // 招标备件
    @Autowired
    private MatterTenderProductMapper matterTenderProductDao;
    // 招标仓库
    @Autowired
    private MatterTenderWarehouseMapper matterTenderWarehouseDao;
    // 邀请供应商
    @Autowired
    private MatterTenderSuppierMapper matterTenderSuppierDao;
    // 招标公告
    @Autowired
    private TenderNoticeMapper tenderNoticeDao;
    @Autowired
    private SupplierTenderMapper supplierTenderDao;
    @Autowired
    private MatterDemandMapper matterDemandDao;
    @Autowired
    private WareFeignClient wareFeignClient;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private AuthFigenClient authFigenClient;
@Autowired
private DailyOrderService purchaseOrderService;
    @Override
    public PagedList<DailyTenderOutput> getMatterTenderPagedList(SearchDailyTenderInput input) {

        // 招标采购
        MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
        MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();

        // 招标备件
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 招标供应商
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
        // 招标仓库
        MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
        MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();

        // 招标截止时间
        if (input.getTenderCreateTimeStart() != null && input.getTenderCreateTimeEnd() != null) {
            criteria.andCreateTimeBetween(input.getTenderCreateTimeStart(), input.getTenderCreateTimeEnd());
        }
        // 采购单位
        if (StringUtils.isNotEmpty(input.getPurchaseCompany())) {
            criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
        }
        // 招标状态
        if (StringUtils.isNotEmpty(input.getTenderStatus())) {
            criteria.andTenderStatusEqualTo(input.getTenderStatus());
        }
        // 招标方式
        if (StringUtils.isNotEmpty(input.getTenderMethod())) {
            criteria.andTenderMethodEqualTo(input.getTenderMethod());
            System.out.println( "招标方式："+input.getTenderMethod());
        }
        // 招标项目名称
        if (StringUtils.isNotEmpty(input.getTenderName())) {
            criteria.andTenderNameLike("%" + input.getTenderName() + "%");
        }


        // 是否日常采购
        criteria.andIsDayPruchaseEqualTo(CommonEnum.YES.getCode());
        // 招标
        criteria.andTenderTypeEqualTo(PurchasingPatternEnum.TENDER.getCode());
        criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
         example.setOrderByClause("create_time desc");
        // 总条数
        Integer totalItemCount = (int) matterTenderPurchaseDao.countByExample(example);
        // 分页查询
        PagedList<DailyTenderOutput> pagedList = new PagedList<DailyTenderOutput>(input.getPageIndex(),
                input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());

        List<MatterTenderPurchase> matterTenderList = matterTenderPurchaseDao.selectByExample(example);
        List<DailyTenderOutput> mtOutputList = new ArrayList<DailyTenderOutput>();
        for (MatterTenderPurchase mtp : matterTenderList) {
            DailyTenderOutput mtOutput = new DailyTenderOutput();
            BeanUtils.copyProperties(mtp, mtOutput);
            mtOutput.setInvoiceLangLang(mtp.getInvoice());
            mtOutput.setPurchaseCompanyLangLang(mtp.getPurchaseCompany());
            mtOutput.setSelectSupplierLangLang(mtp.getSelectSupplier());
            mtOutput.setTenderMethodLangLang(mtp.getTenderMethod());
            mtOutput.setTenderStatusLangLang(mtp.getTenderStatus());
            mtOutput.setTenderTypeLangLang(mtp.getTenderType());

            // 需求申请人
            Result<UserInfoOutput> authRs = authFigenClient.userDetail(mtp.getBuyerId());
            if (authRs != null) {
                mtOutput.setStrBuyer(authRs.getData().getUserName());
            }

            // 应邀供应商
            mtsexample.clear();
            mtscriteria = mtsexample.createCriteria();
            mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
            mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.INVITE.getCode());

            List<MatterTenderSuppier> mtsInviteList = matterTenderSuppierDao.selectByExample(mtsexample);
            List<DailyTenderSupplierOutput> inviteSupplierList = new ArrayList<DailyTenderSupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsInviteList) {
                DailyTenderSupplierOutput mtso = new DailyTenderSupplierOutput();
                mtso.setSupplier(mtSuppier.getSupplier());
                mtso.setSupplierLangLang(mtSuppier.getSupplier());

                // 调用供应商接口取得
                SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
                spsInput.setKey(mtSuppier.getSupplier());
                PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
                mtso.setGrade(supplierOutput.getGrade());
                mtso.setGradeLangLang(supplierOutput.getGrade());
                mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
                mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
                inviteSupplierList.add(mtso);
            }
            mtOutput.setTenderInviteSupplierOutputList(inviteSupplierList);
            // 初审供应商
            mtsexample.clear();
            mtscriteria = mtsexample.createCriteria();
            mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
            mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.FIRSTTRIAL.getCode());

            List<MatterTenderSuppier> mtsFirstList = matterTenderSuppierDao.selectByExample(mtsexample);
            List<DailyTenderSupplierOutput> firstSupplierList = new ArrayList<DailyTenderSupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsFirstList) {
                DailyTenderSupplierOutput mtso = new DailyTenderSupplierOutput();
                mtso.setSupplier(mtSuppier.getSupplier());
                mtso.setSupplierLangLang(mtSuppier.getSupplier());

                // 调用供应商接口取得
                SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
                spsInput.setKey(mtSuppier.getSupplier());
                PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
                mtso.setGrade(supplierOutput.getGrade());
                mtso.setGradeLangLang(supplierOutput.getGrade());
                mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
                mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
                firstSupplierList.add(mtso);
            }
            mtOutput.setTenderFirstSupplierOutputList(firstSupplierList);
            // 签到供应商
            mtsexample.clear();
            mtscriteria = mtsexample.createCriteria();
            mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
            mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.SIGN.getCode());

            List<MatterTenderSuppier> mtsSignList = matterTenderSuppierDao.selectByExample(mtsexample);
            List<DailyTenderSupplierOutput> signSupplierList = new ArrayList<DailyTenderSupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsSignList) {
                DailyTenderSupplierOutput mtso = new DailyTenderSupplierOutput();
                mtso.setSupplier(mtSuppier.getSupplier());
                mtso.setSupplierLangLang(mtSuppier.getSupplier());

                // 调用供应商接口取得
                SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
                spsInput.setKey(mtSuppier.getSupplier());
                PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
                mtso.setGrade(supplierOutput.getGrade());
                mtso.setGradeLangLang(supplierOutput.getGrade());
                mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
                mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
                signSupplierList.add(mtso);
            }
            mtOutput.setTenderSignSupplierOutputList(signSupplierList);

            // 招标备件
            mtpexample.clear();
            mtpcriteria = mtpexample.createCriteria();
            mtpcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

            List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
            List<DailyTenderProductOutput> productList = new ArrayList<DailyTenderProductOutput>();
            // 采购备件数据组装
            for (MatterTenderProduct mtProduct : mtpList) {
                DailyTenderProductOutput mtpo = new DailyTenderProductOutput();
                BeanUtils.copyProperties(mtProduct, mtpo);
                productList.add(mtpo);
            }
            mtOutput.setTenderProductOutputList(productList);


            mtOutputList.add(mtOutput);
        }

        // 将分页数据放入结果中
        pagedList.getDataList().addAll(mtOutputList);
        return pagedList;
    }

    @Override
    public void addMatterTender(AddDailyTenderInput input) {
        List<String> supplierKeys = new ArrayList<>();
// 0.判断备件是否已生成招采
        // 采购需求备件
        List<Integer> demandIdList = new ArrayList<Integer>();
        for (DailyDemandOutput demand : input.getMatterDemandList()) {
            demandIdList.add(demand.getPurcMatterDemandId());
        }
        MatterDemandExample mdExample = new MatterDemandExample();
        MatterDemandExample.Criteria mdCriteria = mdExample.createCriteria();
        mdCriteria.andPurcMatterDemandIdIn(demandIdList);
        mdCriteria.andIsCreateOrderEqualTo(PurchaseStatusEnum.CREATED.getCode());
        int count = (int)matterDemandDao.countByExample(mdExample);
        if(count>0) {
            throw new RuntimeException("TenderExist");
        }

        // 1.插入招标采购表
        MatterTenderPurchase record = new MatterTenderPurchase();
        BeanUtils.copyProperties(input, record);
        record.setIsDayPruchase(CommonEnum.YES.getCode());
        record.setTenderType(PurchasingPatternEnum.TENDER.getCode());
        record.setBuyerId(getCurrentUserId());
        record.setIsDel(CommonEnum.NO.getCode());
        record.setCreateTime(new Date());
        record.setCreateUser(getCurrentUserId());
        if (input.getFirstInstanceTime()==null) {
            record.setIsFirstTrial(CommonEnum.NO.getCode());
        }else {
            record.setIsFirstTrial(CommonEnum.YES.getCode());
        }
        record.setTenderStatus(TenderStatusEnum.ING.getCode());
        matterTenderPurchaseDao.insertSelective(record);

        // 3.插入招标备件表
        BigDecimal sum = new BigDecimal("0");
//		List<MatterTenderProduct> productList = new ArrayList<MatterTenderProduct>();
        for (DailyDemandOutput demand : input.getMatterDemandList()) {

            MatterTenderProduct pRecord = new MatterTenderProduct();
            BeanUtils.copyProperties(demand, pRecord);
            pRecord.setWeight(demand.getWeight());
            pRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
            pRecord.setDeliveryTime(demand.getRequireArriveTime());
            pRecord.setCreateTime(new Date());
            pRecord.setCreateUser(getCurrentUserId());
            pRecord.setWarehouseAddress(demand.getAddress());
            pRecord.setProduct(demand.getProductNum());
//			productList.add(pRecord);
            matterTenderProductDao.insertSelective(pRecord);
        }
//		for (MatterTenderProduct product : productList) {
//			// 权重计算
//			if(sum.equals(new BigDecimal("0"))) {
//				product.setWeight(1d);
//			}else {
//				product.setWeight(product.getPurchasingReferencePrice().divide(sum,4).doubleValue());
//			}
//			matterTenderProductDao.insertSelective(product);
//		}

        // 4.插入邀请供应商表
        if (TenderMethodEnum.INVITE.getCode().equals(input.getTenderMethod())) {
            for (String supplier : input.getPurcSupplierIds()) {
                if (StringUtils.isBlank(supplier)){
                    continue;
                }
                MatterTenderSuppier sRecord = new MatterTenderSuppier();
                sRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
                sRecord.setSupplier(supplier);
                sRecord.setType(PurchaseSupplierTypeEnum.INVITE.getCode());
                sRecord.setCreateTime(new Date());
                sRecord.setCreateUser(getCurrentUserId());
                matterTenderSuppierDao.insertSelective(sRecord);
                supplierKeys.add(supplier);
            }
        }
        // 5.插入招标公告表
        TenderNotice tenderNotice = new TenderNotice();
        tenderNotice.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
        tenderNotice.setNoticeType(NoticeTypeEnum.PUBLISH.getCode());
        tenderNotice.setCreateTime(new Date());
        tenderNotice.setCreateUser(getCurrentUserId());
        tenderNoticeDao.insert(tenderNotice);

        // 6.更新需求表
        for (DailyDemandOutput mdOutput : input.getMatterDemandList()) {
            MatterDemand md = new MatterDemand();
            md.setPurcMatterDemandId(mdOutput.getPurcMatterDemandId());
            md.setIsCreateOrder(PurchaseStatusEnum.CREATED.getCode());
            md.setTenderType(PurchasingPatternEnum.TENDER.getCode());
            md.setProductCount(mdOutput.getProductCount());
            md.setUpdateTime(new Date());
            md.setUpdateUser(getCurrentUserId());
            matterDemandDao.updateByPrimaryKeySelective(md);
        }
      /*  try {
            sendMail(
                            supplierKeys.toArray(new String[supplierKeys.size()]),
                            input.getTenderContent(),
                            input.getTenderName()
            );
        }catch (Exception e){
            e.printStackTrace();
        }*/

    }

    @Override
    public void addFirstTrial(Integer purcMatterTenderPurchaseId, String[] supplierInputs) {
// 初审时间check
        // 招标采购
        MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
        MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();
        criteria.andPurcMatterTenderPurchaseIdEqualTo(purcMatterTenderPurchaseId);
        MatterTenderPurchase purchase = matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseId);
        if(purchase.getFirstInstanceTime().compareTo(new Date())>0) {
            throw new RuntimeException("FirstTrialTimeGreaterThanNow");
        }

        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();

        // 初审供应商
        mtsexample.clear();
        mtscriteria = mtsexample.createCriteria();
        mtscriteria.andTenderPurchaseIdEqualTo(purcMatterTenderPurchaseId);
        mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.FIRSTTRIAL.getCode());

        List<MatterTenderSuppier> mtsFirstList = matterTenderSuppierDao.selectByExample(mtsexample);
        if(mtsFirstList.size()>0) {
            throw new RuntimeException("FirstTrialExist");
        }
        for (String supplier : supplierInputs) {
            MatterTenderSuppier sRecord = new MatterTenderSuppier();
            sRecord.setTenderPurchaseId(purcMatterTenderPurchaseId);
            sRecord.setSupplier(supplier);
            sRecord.setType(PurchaseSupplierTypeEnum.FIRSTTRIAL.getCode());
            sRecord.setCreateTime(new Date());
            sRecord.setCreateUser(getCurrentUserId());
            matterTenderSuppierDao.insertSelective(sRecord);
        }

        // 插入招标公告表
        TenderNotice tenderNotice = new TenderNotice();
        tenderNotice.setTenderPurchaseId(purcMatterTenderPurchaseId);
        tenderNotice.setNoticeType(NoticeTypeEnum.FIRSTTRIAL.getCode());
        tenderNotice.setCreateTime(new Date());
        tenderNotice.setCreateUser(getCurrentUserId());
        tenderNoticeDao.insert(tenderNotice);
    }

    @Override
    public void addTenderResult(AddDailyTenderResultInput input) {

        // 招标备件

        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 招标仓库
        MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
        MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();

        MatterTenderPurchase matterTenderPurchase = matterTenderPurchaseDao
                .selectByPrimaryKey(input.getPurcMatterTenderPurchaseId());
        // 判断招标截止时间是否大于当前时间
        if(matterTenderPurchase.getTenderEndTime().compareTo(new Date())>=0){
            throw new RuntimeException("TenderEndTimeGreaterNow");
        }
        // 判断招标结果是否已经录入
        if(!TenderStatusEnum.ING.getCode().equals(matterTenderPurchase.getTenderStatus())) {
            throw new RuntimeException("TenderResultExist");
        }

        // 1.更新招标采购表
        MatterTenderPurchase record = new MatterTenderPurchase();

        if(TenderStatusEnum.SUCCESS.getCode().equals(input.getTenderStatus())) {
            record.setInvoice(input.getInvoiceType());
            record.setPurcMatterTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
            record.setSelectSupplier(input.getSupplier());
            record.setTenderStatus(input.getTenderStatus());
            record.setReason(input.getReason());
            matterTenderPurchaseDao.updateByPrimaryKeySelective(record);
            // 更新招标备件价格
            for (DailyTenderProductOutput product : input.getTenderProductOutputList()) {
                MatterTenderProduct productRecord = new MatterTenderProduct();
                productRecord.setPurcMatterTenderProductId(product.getPurcMatterTenderProductId());
                productRecord.setPrice(product.getPrice());
                matterTenderProductDao.updateByPrimaryKeySelective(productRecord);
            }
            createOrder(matterTenderPurchase);
        }else {
            // 更新采购表
            record.setPurcMatterTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
            record.setTenderStatus(input.getTenderStatus());
            record.setReason(input.getReason());
            matterTenderPurchaseDao.updateByPrimaryKeySelective(record);

        }
        // 插入招标公告表
        TenderNotice tenderNotice = new TenderNotice();
        tenderNotice.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
        tenderNotice.setNoticeType(NoticeTypeEnum.RESULT.getCode());
        tenderNotice.setCreateTime(new Date());
        tenderNotice.setCreateUser(getCurrentUserId());
        tenderNoticeDao.insert(tenderNotice);

    }
    /**
     * 采购单审核通过生成订单
     * @param purcMatterTemporaryPurchaseId
     * @return
     */
    private void createOrder(MatterTenderPurchase matterTenderPurchase1) {
        MatterTenderPurchase matterTenderPurchase = matterTenderPurchaseDao
                .selectByPrimaryKey(matterTenderPurchase1.getPurcMatterTenderPurchaseId());
        // 调用订单接口向订单表插入数据
        MatterTenderProductExample example = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria criteria = example.createCriteria();
        criteria.andTenderPurchaseIdEqualTo(matterTenderPurchase.getPurcMatterTenderPurchaseId());
        List<MatterTenderProduct> products = matterTenderProductDao.selectByExample(example);
        List<MatterTenderProduct> wareHouses = products.stream().collect(
                Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(MatterTenderProduct::getWarehouseAddress))), ArrayList::new));
        for(MatterTenderProduct wareHouse:wareHouses) {
            // 组装采购订单
            AddPurchaseOrderInput input = new AddPurchaseOrderInput();
            input.setPurchaseCompany(matterTenderPurchase.getPurchaseCompany());
            input.setPurchaseType(matterTenderPurchase.getTenderType());
            input.setPurchaseUserId(matterTenderPurchase.getCreateUser());
            input.setSupplier(matterTenderPurchase.getSelectSupplier());
            System.out.println("matterTenderPurchase.getSelectSupplier()"+matterTenderPurchase.getSelectSupplier());
            input.setPurchaseTime(matterTenderPurchase.getCreateTime());
            input.setInvoice(matterTenderPurchase.getInvoice());
            input.setReciverAddress(wareHouse.getWarehouseAddress());
            // 组装采购商品详情数据
            List<AddPurchaseOrderDetailInput> details = new ArrayList<>();
            for(MatterTenderProduct product:products) {
                if(wareHouse.getWarehouseAddress().equals(product.getWarehouseAddress())) {
                    AddPurchaseOrderDetailInput  detail = new AddPurchaseOrderDetailInput();
                    detail.setDemandNo(product.getDemandNo());
                    detail.setProduct(product.getProduct());
                    detail.setOrderNum(product.getProductCount());
                    detail.setBrand(product.getProductBrand());
                    detail.setUnitPrice(product.getPrice());
                    detail.setComments(product.getComments());
                    detail.setRequiredDeliveryDate(product.getDeliveryTime());
                    detail.setSpecification(product.getProductSpecial());
                    detail.setModel(product.getProductModel());
                    detail.setBrand(product.getProductBrand());
                    detail.setSparePartsUnit(product.getSparePartsUnit());
                    details.add(detail);
                }

            }
            input.setDetails(details);
            purchaseOrderService.addPurchaseOrder(input);
        }
    }

    @Override
    public DailyTenderOutput gettMatterTenderDetail(Integer purcMatterTenderPurchaseId) {
        // 招标采购
        MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
        MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();

        // 招标备件
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 招标供应商
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();

        MatterTenderPurchase mtp = matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseId);
        DailyTenderOutput mtOutput = new DailyTenderOutput();
        BeanUtils.copyProperties(mtp, mtOutput);
        mtOutput.setInvoiceLangLang(mtp.getInvoice());
        mtOutput.setPurchaseCompanyLangLang(mtp.getPurchaseCompany());
        mtOutput.setSelectSupplierLangLang(mtp.getSelectSupplier());
        mtOutput.setTenderMethodLangLang(mtp.getTenderMethod());
        mtOutput.setTenderStatusLangLang(mtp.getTenderStatus());
        mtOutput.setTenderTypeLangLang(mtp.getTenderType());

        // 需求申请人
        Result<UserInfoOutput> authRs = authFigenClient.userDetail(mtp.getBuyerId());
        if (authRs != null) {
            mtOutput.setStrBuyer(authRs.getData().getUserName());
        }

        // 应邀供应商
        mtsexample.clear();
        mtscriteria = mtsexample.createCriteria();
        mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
        mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.INVITE.getCode());

        List<MatterTenderSuppier> mtsInviteList = matterTenderSuppierDao.selectByExample(mtsexample);
        List<DailyTenderSupplierOutput> inviteSupplierList = new ArrayList<DailyTenderSupplierOutput>();
        // 应邀供应商数据组装
        for (MatterTenderSuppier mtSuppier : mtsInviteList) {
            DailyTenderSupplierOutput mtso = new DailyTenderSupplierOutput();
            mtso.setSupplier(mtSuppier.getSupplier());
            mtso.setSupplierLangLang(mtSuppier.getSupplier());

            // 调用供应商接口取得
            SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
            spsInput.setKey(mtSuppier.getSupplier());
            PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
            mtso.setGrade(supplierOutput.getGrade());
            mtso.setGradeLangLang(supplierOutput.getGrade());
            mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
            mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
            inviteSupplierList.add(mtso);
        }
        mtOutput.setTenderInviteSupplierOutputList(inviteSupplierList);
        // 初审供应商
        mtsexample.clear();
        mtscriteria = mtsexample.createCriteria();
        mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
        mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.FIRSTTRIAL.getCode());

        List<MatterTenderSuppier> mtsFirstList = matterTenderSuppierDao.selectByExample(mtsexample);
        List<DailyTenderSupplierOutput> firstSupplierList = new ArrayList<DailyTenderSupplierOutput>();
        // 应邀供应商数据组装
        for (MatterTenderSuppier mtSuppier : mtsFirstList) {
            DailyTenderSupplierOutput mtso = new DailyTenderSupplierOutput();
            mtso.setSupplier(mtSuppier.getSupplier());
            mtso.setSupplierLangLang(mtSuppier.getSupplier());

            // 调用供应商接口取得
            SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
            spsInput.setKey(mtSuppier.getSupplier());
            PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
            mtso.setGrade(supplierOutput.getGrade());
            mtso.setGradeLangLang(supplierOutput.getGrade());
            mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
            mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
            firstSupplierList.add(mtso);
        }
        mtOutput.setTenderFirstSupplierOutputList(firstSupplierList);
        // 签到供应商
        mtsexample.clear();
        mtscriteria = mtsexample.createCriteria();
        mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
        mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.SIGN.getCode());

        List<MatterTenderSuppier> mtsSignList = matterTenderSuppierDao.selectByExample(mtsexample);
        List<DailyTenderSupplierOutput> signSupplierList = new ArrayList<DailyTenderSupplierOutput>();
        // 应邀供应商数据组装
        for (MatterTenderSuppier mtSuppier : mtsSignList) {
            DailyTenderSupplierOutput mtso = new DailyTenderSupplierOutput();
            mtso.setSupplier(mtSuppier.getSupplier());
            mtso.setSupplierLangLang(mtSuppier.getSupplier());

            // 调用供应商接口取得
            SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
            spsInput.setKey(mtSuppier.getSupplier());
            PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
            mtso.setGrade(supplierOutput.getGrade());
            mtso.setGradeLangLang(supplierOutput.getGrade());
            mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
            mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
            signSupplierList.add(mtso);
        }
        mtOutput.setTenderSignSupplierOutputList(signSupplierList);

        // 招标
        mtpexample.clear();
        mtpcriteria = mtpexample.createCriteria();
        mtpcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

        List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
        List<DailyTenderProductOutput> productList = new ArrayList<DailyTenderProductOutput>();
        // 采购备件数据组装
        for (MatterTenderProduct mtProduct : mtpList) {
            DailyTenderProductOutput mtpo = new DailyTenderProductOutput();
            BeanUtils.copyProperties(mtProduct, mtpo);


            productList.add(mtpo);
        }
        mtOutput.setTenderProductOutputList(productList);



        return mtOutput;    }

    @Override
    public List<TenderNoticeOutput> getTenderNoticeList() {
// 招标采购
        MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
        MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();
        // 招标公告
        TenderNoticeExample tnExample = new TenderNoticeExample();
        TenderNoticeExample.Criteria tnCriteria = tnExample.createCriteria();

        List<TenderNotice> noticeList = tenderNoticeDao.selectByExample(tnExample);

        List<TenderNoticeOutput> noticeOutputList = new ArrayList<TenderNoticeOutput>();
        for (TenderNotice notice : noticeList) {
            TenderNoticeOutput noticeOutput = new TenderNoticeOutput();
            BeanUtils.copyProperties(notice, noticeOutput);
            MatterTenderPurchase tenderPurchase = matterTenderPurchaseDao.selectByPrimaryKey(notice.getTenderPurchaseId());
            noticeOutput.setNoticeType(notice.getNoticeType());
            noticeOutput.setNoticeTypeLangLang(notice.getNoticeType());
            noticeOutput.setTenderName(tenderPurchase.getTenderName());
            noticeOutput.setTenderId(tenderPurchase.getTenderId());
            noticeOutput.setTenderType(tenderPurchase.getTenderType());
            noticeOutput.setTenderTypeLangLang(tenderPurchase.getTenderType());
            noticeOutput.setPurchaseCompany(tenderPurchase.getPurchaseCompany());
            noticeOutput.setPurchaseCompanyLangLang(tenderPurchase.getPurchaseCompany());
            noticeOutput.setCreateTime(tenderPurchase.getCreateTime());
            noticeOutput.setFirstInstanceTime(tenderPurchase.getFirstInstanceTime());
            noticeOutput.setTenderEndTime(tenderPurchase.getTenderEndTime());
            noticeOutput.setTenderStatus(tenderPurchase.getTenderStatus());
            noticeOutput.setTenderStatusLangLang(tenderPurchase.getTenderStatus());
            noticeOutput.setSelectSupplier(tenderPurchase.getSelectSupplier());
            noticeOutput.setSelectSupplierLangLang(tenderPurchase.getSelectSupplier());
            noticeOutputList.add(noticeOutput);
        }

        return noticeOutputList;    }

    @Override
    public List<DailyTenderProductOutput> gettMatterTenderProductList(Integer purcMatterTenderPurchaseId) {
        // 招标备件
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();

        // 招标备件
        mtpexample.clear();
        mtpcriteria = mtpexample.createCriteria();
        mtpcriteria.andTenderPurchaseIdEqualTo(purcMatterTenderPurchaseId);

        List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
        List<DailyTenderProductOutput> productList = new ArrayList<DailyTenderProductOutput>();
        // 采购备件数据组装
        for (MatterTenderProduct mtProduct : mtpList) {
            DailyTenderProductOutput mtpo = new DailyTenderProductOutput();
            BeanUtils.copyProperties(mtProduct, mtpo);

            productList.add(mtpo);
        }

        return productList;
    }

    /**
     * 获取相应供应商
     * @param purcMatterTenderPurchaseId
     * @param type
     * @return
     */
    @Override
    public List<DailyTenderSupplierOutput> getTenderSupplierList(Integer purcMatterTenderPurchaseId, String type) {

        System.out.println("type"+type);
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
        mtsexample.clear();
        mtscriteria = mtsexample.createCriteria();
        mtscriteria.andTenderPurchaseIdEqualTo(purcMatterTenderPurchaseId);
        if (type.contains(PurchaseSupplierTypeEnum.SIGN.getCode())){
            mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.SIGN.getCode());

        }else if(type.contains(PurchaseSupplierTypeEnum.FIRSTTRIAL.getCode())){
            mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.FIRSTTRIAL.getCode());

        }else if (type.contains(PurchaseSupplierTypeEnum.INVITE.getCode())){
            mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.INVITE.getCode());

        }

        List<MatterTenderSuppier> mtsSignList = matterTenderSuppierDao.selectByExample(mtsexample);
        List<DailyTenderSupplierOutput> signSupplierList = new ArrayList<DailyTenderSupplierOutput>();
        // 供应商数据组装
        for (MatterTenderSuppier mtSuppier : mtsSignList) {
            DailyTenderSupplierOutput mtso = new DailyTenderSupplierOutput();
            mtso.setSupplier(mtSuppier.getSupplier());
            mtso.setSupplierLangLang(mtSuppier.getSupplier());
            mtso.setSupplierLangLang(mtSuppier.getSupplier());

            // 调用供应商接口取得
            SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
            spsInput.setKey(mtSuppier.getSupplier());
            PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
            mtso.setGrade(supplierOutput.getGrade());
            mtso.setGradeLangLang(supplierOutput.getGrade());
            mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
            mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
            signSupplierList.add(mtso);
        }
        return  signSupplierList;
    }

    /**
     * 为供应商发邮件
     * @param secondSpecials
     * @param supplierKeys
     * @param text
     * @param subject
     */
    @Override
    public void sendMail(String[] supplierKeys,String text,String subject) {
        try {
            // 相关所有供应商
            if (supplierKeys.length != 0) {
                for (String key : supplierKeys) {
                    SearchPurcSupplierInput input = new SearchPurcSupplierInput();
                    input.setKey(key);
                    PurcSupplierOutput supplier = supplierService.getSupplierByKey(input);
                    if (supplier.getContactInformations().size() > 0
                            && StringUtils.isNotEmpty(supplier.getContactInformations().get(0).getEmailAddress())) {
                        MailUtil.sendMail(supplier.getContactInformations().get(0).getEmailAddress(), text, subject);
                    }
                }

            }
        } catch (Exception e) {
           //throw new RuntimeException("sendMailFail");
            e.printStackTrace();
        }
    }

}

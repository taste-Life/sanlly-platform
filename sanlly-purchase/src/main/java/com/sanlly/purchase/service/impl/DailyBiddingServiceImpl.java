package com.sanlly.purchase.service.impl;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.purchase.dao.*;
import com.sanlly.purchase.entity.*;
import com.sanlly.purchase.enums.*;
import com.sanlly.purchase.models.input.dailybidding.AddDailyBiddingInput;
import com.sanlly.purchase.models.input.dailybidding.AddDailyBiddingResultInput;
import com.sanlly.purchase.models.input.dailybidding.SearchDailyBIddingInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderDetailInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderInput;
import com.sanlly.purchase.models.input.supplier.SearchPurcSupplierInput;
import com.sanlly.purchase.models.output.dailybidding.*;
import com.sanlly.purchase.models.output.dailydemand.DailyDemandOutput;
import com.sanlly.purchase.models.output.matterbidding.MatterBiddingOutput;
import com.sanlly.purchase.models.output.matterbidding.MatterSupplierTenderOutput;
import com.sanlly.purchase.models.output.matterbidding.SupplierTenderOutput;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.service.*;
import com.sanlly.purchase.service.feign.WareFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description: TODO
 * @ClassName: DailyBiddingServiceImpl
 * @Date: 2019/8/26 9:22
 * @Version 1.0
 * @Author mqz
 */
@Service
public class DailyBiddingServiceImpl  extends  BaseServiceImpl implements DailyBiddingService {
    // 竞价采购
    @Autowired
    private MatterTenderPurchaseMapper matterTenderPurchaseDao;
    // 竞价备件
    @Autowired
    private MatterTenderProductMapper matterTenderProductDao;
    // 竞价仓库
    @Autowired
    private MatterTenderWarehouseMapper matterTenderWarehouseDao;
    // 邀请供应商
    @Autowired
    private MatterTenderSuppierMapper matterTenderSuppierDao;
    // 供应商报价记录
    @Autowired
    private SupplierTenderExtMapper supplierTenderExtDao;
    @Autowired
    private SupplierTenderMapper supplierTenderDao;
    // 供应商备件报价详细
    @Autowired
    private SupplierTenderProductMapper supplierTenderProductDao;
    @Autowired
    private MatterDemandMapper matterDemandDao;
    @Autowired
    private WareFeignClient wareFeignClient;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private AuthFigenClient authFigenClient;
    @Autowired
    private PeriodProductService periodProductService;
@Autowired
private DailyOrderService purchaseOrderService;

    @Override
    public PagedList<DailyBiddingOutput> getMatterBiddingPagedList(SearchDailyBIddingInput input) {
        // 竞价采购
        MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
        MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();

        // 竞价备件
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 竞价供应商
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();

        // 竞价截止时间
        if (input.getTenderCreateTimeStart() != null && input.getTenderCreateTimeEnd() != null) {
            criteria.andCreateTimeBetween(input.getTenderCreateTimeStart(), input.getTenderCreateTimeEnd());
        }
        // 采购单位
        if (StringUtils.isNotEmpty(input.getPurchaseCompany())) {
            criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
        }
        // 竞价状态
        if (StringUtils.isNotEmpty(input.getTenderStatus())) {
            criteria.andTenderStatusEqualTo(input.getTenderStatus());
        }
        // 竞价方式
        if (StringUtils.isNotEmpty(input.getTenderMethod())) {
            criteria.andTenderMethodEqualTo(input.getTenderMethod());
        }
        // 竞价项目名称
        if (StringUtils.isNotEmpty(input.getTenderName())) {
            criteria.andTenderNameLike("%" + input.getTenderName() + "%");
        }

        // 是否日常采购
        criteria.andIsDayPruchaseEqualTo(CommonEnum.YES.getCode());
        // 竞价
        criteria.andTenderTypeEqualTo(PurchasingPatternEnum.BIDDING.getCode());
        criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
        example.setOrderByClause("create_time desc");
        // 总条数
        Integer totalItemCount = (int) matterTenderPurchaseDao.countByExample(example);
        // 分页查询
        PagedList<DailyBiddingOutput> pagedList = new PagedList<DailyBiddingOutput>(input.getPageIndex(),
                input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());

        List<MatterTenderPurchase> matterTenderList = matterTenderPurchaseDao.selectByExample(example);
        List<DailyBiddingOutput> mtOutputList = new ArrayList<DailyBiddingOutput>();
        for (MatterTenderPurchase mtp : matterTenderList) {
            DailyBiddingOutput mtOutput = new DailyBiddingOutput();
            BeanUtils.copyProperties(mtp, mtOutput);
            mtOutput.setInvoiceLangLang(mtp.getInvoice());
            //mtOutput.setIsPeriodLangLang(mtp.getIsPeriod());
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
            List<SupplierTenderOutput> supplierTenderOutputs = supplierTenderExtDao.selectSupplierByTenderPurchaseId(mtp.getPurcMatterTenderPurchaseId());
            List<DailyBiddingSupplierOutput> quoteSupplierList = new ArrayList<DailyBiddingSupplierOutput>();

            for (SupplierTenderOutput mtSuppier : supplierTenderOutputs) {
                DailyBiddingSupplierOutput mtso = new DailyBiddingSupplierOutput();
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
                quoteSupplierList.add(mtso);
            }
            mtOutput.setTenderQuoteSupplierOutputList(quoteSupplierList);

            // 应邀供应商
            mtsexample.clear();
            mtscriteria = mtsexample.createCriteria();
            mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
            mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.INVITE.getCode());

            List<MatterTenderSuppier> mtsInviteList = matterTenderSuppierDao.selectByExample(mtsexample);
            List<DailyBiddingSupplierOutput> inviteSupplierList = new ArrayList<DailyBiddingSupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsInviteList) {
                DailyBiddingSupplierOutput mtso = new DailyBiddingSupplierOutput();
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
            List<DailyBiddingSupplierOutput> firstSupplierList = new ArrayList<DailyBiddingSupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsFirstList) {
                DailyBiddingSupplierOutput mtso = new DailyBiddingSupplierOutput();
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
            List<DailyBiddingSupplierOutput> signSupplierList = new ArrayList<DailyBiddingSupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsSignList) {
                DailyBiddingSupplierOutput mtso = new DailyBiddingSupplierOutput();
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

            // 竞价备件
            mtpexample.clear();
            mtpcriteria = mtpexample.createCriteria();
            mtpcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

            List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
            List<DailyBiddingProductOutput> productList = new ArrayList<DailyBiddingProductOutput>();
            // 采购备件数据组装
            for (MatterTenderProduct mtProduct : mtpList) {
                DailyBiddingProductOutput mtpo = new DailyBiddingProductOutput();
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
    public void addMatterBidding(AddDailyBiddingInput input) {
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
        int count = (int) matterDemandDao.countByExample(mdExample);
        if (count > 0) {
            throw new RuntimeException("TenderExist");
        }

        // 1.插入竞价采购表
        MatterTenderPurchase record = new MatterTenderPurchase();
        BeanUtils.copyProperties(input, record);
        record.setIsDayPruchase(CommonEnum.YES.getCode());
        record.setTenderType(PurchasingPatternEnum.BIDDING.getCode());
        record.setBuyerId(getCurrentUserId());
        record.setBiddingNum(input.getBiddingNum());
        record.setBiddingStartTime(input.getBiddingStartTime());
        record.setBiddingEndTime(input.getBiddingEndTime());
        record.setIsDel(CommonEnum.NO.getCode());
        record.setCreateTime(new Date());
        record.setCreateUser(getCurrentUserId());
        if (input.getFirstInstanceTime() == null) {
            record.setIsFirstTrial(CommonEnum.NO.getCode());
        } else {
            record.setIsFirstTrial(CommonEnum.YES.getCode());
        }
        record.setTenderStatus(TenderStatusEnum.ING.getCode());
        matterTenderPurchaseDao.insertSelective(record);

        // 3.插入竞价备件表
        BigDecimal sum = new BigDecimal("0");
        for (DailyDemandOutput demand : input.getMatterDemandList()) {

            MatterTenderProduct pRecord = new MatterTenderProduct();
            BeanUtils.copyProperties(demand, pRecord);
            pRecord.setProductName(demand.getProductNum());
            pRecord.setWeight(demand.getWeight());
            pRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
            pRecord.setDeliveryTime(demand.getRequireArriveTime());
            pRecord.setCreateTime(new Date());
            pRecord.setCreateUser(getCurrentUserId());
            pRecord.setWarehouseAddress(demand.getAddress());
            pRecord.setProduct(demand.getProductNum());
            matterTenderProductDao.insertSelective(pRecord);
        }

        // 4.插入邀请供应商表
        if (TenderMethodEnum.INVITE.getCode().equals(input.getTenderMethod())) {
            for (String supplier : input.getPurcSupplierIds()) {
                MatterTenderSuppier sRecord = new MatterTenderSuppier();
                sRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
                sRecord.setSupplier(supplier);
                sRecord.setType(PurchaseSupplierTypeEnum.INVITE.getCode());
                sRecord.setCreateTime(new Date());
                sRecord.setCreateUser(getCurrentUserId());
                matterTenderSuppierDao.insertSelective(sRecord);
            }
        }
        // 6.更新需求表
        for (DailyDemandOutput mdOutput : input.getMatterDemandList()) {
            MatterDemand md = new MatterDemand();
            md.setPurcMatterDemandId(mdOutput.getPurcMatterDemandId());
            md.setIsCreateOrder(PurchaseStatusEnum.CREATED.getCode());
            md.setTenderType(PurchasingPatternEnum.BIDDING.getCode());
            md.setUpdateTime(new Date());
            md.setUpdateUser(getCurrentUserId());
            md.setProductCount(mdOutput.getProductCount());
            matterDemandDao.updateByPrimaryKeySelective(md);
        }
    }

    @Override
    public MatterBiddingOutput gettMatterBiddingDetail(Integer purcMatterTenderPurchaseId) {
        return null;
    }

    @Override
    public void addBiddingResult(AddDailyBiddingResultInput input) {
// 招标备件
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 备件报价详情addBiddingResult
        SupplierTenderProductExample stpexample = new SupplierTenderProductExample();
        SupplierTenderProductExample.Criteria stpcriteria = stpexample.createCriteria();
        MatterTenderPurchase record = new MatterTenderPurchase();
        MatterTenderPurchase matterTenderPurchase = matterTenderPurchaseDao.selectByPrimaryKey(input.getPurcMatterTenderPurchaseId());
        // 判断结果
        if(TenderStatusEnum.SUCCESS.getCode().equals(input.getTenderStatus())) {
            // 采纳供应商
            String selectSupplier = supplierTenderDao.selectByPrimaryKey(input.getPurcSupplierTenderId()).getSupplier();
            // 中标
            // 1、更新采购表
            record.setPurcMatterTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
            record.setSelectSupplier(selectSupplier);
            //record.setInvoice(input.getInvoiceType());
            record.setTenderStatus(input.getTenderStatus());
            if (StringUtils.isNotBlank(input.getReason())){
                record.setReason(input.getReason());
            }
            record.setUpdateTime(new Date());
            record.setUpdateUser(getCurrentUserId());

            // 2、更新报价记录表
            SupplierTender stRecord = new SupplierTender();
            stRecord.setPurcSupplierTenderId(input.getPurcSupplierTenderId());
            stRecord.setStatus(TenderStatusEnum.SUCCESS.getCode());
            stRecord.setUpdateTime(new Date());
            stRecord.setUpdateUser(getCurrentUserId());
            supplierTenderDao.updateByPrimaryKeySelective(stRecord);
// 取得招标备件
            // 备件报价详情
            stpcriteria.andSupplierTenderIdEqualTo(input.getPurcSupplierTenderId());
            List<SupplierTenderProduct> stpList = supplierTenderProductDao.selectByExample(stpexample);
            record.setInvoice(stpList.get(0).getInvoice());
            matterTenderPurchaseDao.updateByPrimaryKeySelective(record);
            for (SupplierTenderProduct supplierTenderProduct:stpList){
                mtpexample.clear();
                mtpcriteria=mtpexample.createCriteria();
                mtpcriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
                mtpcriteria.andDemandNoEqualTo(supplierTenderProduct.getDemandNo());
                MatterTenderProduct productRecord = new MatterTenderProduct();
                productRecord.setPrice(supplierTenderProduct.getPrice());
                productRecord.setInvoice(supplierTenderProduct.getInvoice());
                productRecord.setDeliveryTime(supplierTenderProduct.getArriveTime());
                matterTenderProductDao.updateByExampleSelective(productRecord,mtpexample);
            }

          /*  Map<String,BigDecimal> stpMap =  new HashMap<String, BigDecimal>();
            for(SupplierTenderProduct stp : stpList) {
                stpMap.put(stp.getProduct(), stp.getPrice());
            }
            // 更新竞价备件中标单价
            for (MatterTenderProduct product : mtpList) {
                MatterTenderProduct productRecord = new MatterTenderProduct();
                productRecord.setPrice(stpMap.get(product.getProduct()));
                productRecord.setPurcMatterTenderProductId(product.getPurcMatterTenderProductId());
                productRecord.setInvoice(stpMap.);
                matterTenderProductDao.updateByPrimaryKeySelective(productRecord);
            }*/
            createOrder(matterTenderPurchase);
        }else {
            // 更新采购表
            record.setPurcMatterTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
            record.setTenderStatus(input.getTenderStatus());
            record.setReason(input.getReason());
            matterTenderPurchaseDao.updateByPrimaryKeySelective(record);
        }
        }
    /**
     *取得报价信息
     */
    @Override
    public DailySupplierTenderDetailOutput getSupplierTenderList(Integer purcMatterTenderPurchaseId) {
        SupplierTenderProductExample example = new SupplierTenderProductExample();
        SupplierTenderProductExample.Criteria criteria = example.createCriteria();


        // 招标信息取得
        MatterTenderPurchase mtp = matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseId);
        DailySupplierTenderDetailOutput output = new DailySupplierTenderDetailOutput();
        BeanUtils.copyProperties(mtp, output);
        output.setInvoiceLangLang(mtp.getInvoice());
        //output.setIsPeriodLangLang(mtp.getIsPeriod());
        output.setPurchaseCompanyLangLang(mtp.getPurchaseCompany());
        output.setSelectSupplierLangLang(mtp.getSelectSupplier());
        output.setTenderMethodLangLang(mtp.getTenderMethod());
        output.setTenderStatusLangLang(mtp.getTenderStatus());
        output.setTenderTypeLangLang(mtp.getTenderType());

        // 1.取得供应商报价记录
        List<MatterSupplierTenderOutput> supplierTenderList = supplierTenderExtDao.selectByTenderPurchaseId(purcMatterTenderPurchaseId);
        List<MatterSupplierTenderOutput> supplierTenderList2 =new ArrayList<>();
        System.out.println("supplierTenderList:"+supplierTenderList.size());
        // 供应商最终报价记录id集合
        List<Integer> supplierTenderIdList = supplierTenderList.stream().map(MatterSupplierTenderOutput::getPurcSupplierTenderId).collect(Collectors.toList());
        // 2、取得供应商备件报价详细信息
        int stop= supplierTenderList.size();
        for(int j=0;j<stop;j++) {
            System.out.println("supplierTenderList.get(j):"+supplierTenderList.get(j).getSupplier());
            MatterSupplierTenderOutput msto1 = supplierTenderList.get(j);
            DailySupplierTenderOutput msto=new DailySupplierTenderOutput();
            BeanUtils.copyProperties(msto1,msto);
            // 调用供应商接口取得
            SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
            spsInput.setKey(msto.getSupplier());
            PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
            msto.setSupplierLangLang(msto.getSupplier());
            msto.setGrade(supplierOutput.getGrade());
            msto.setGradeLangLang(supplierOutput.getGrade());
            msto.setSettlementCycle(supplierOutput.getSettlementCycle());
            msto.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
            // 设置供应商排名
            msto.setRank(j+1);
            if(j==0) {

            }

            example.clear();
            criteria = example.createCriteria();
            criteria.andSupplierTenderIdEqualTo(msto.getPurcSupplierTenderId());
            System.out.println("msto.getPurcSupplierTenderId():"+msto.getPurcSupplierTenderId());
            List<DailySupplierTenderProductOutput> productOutputList = new ArrayList<>();
            // 取得供应商的最低报价
            List<SupplierTenderProduct> productList = supplierTenderProductDao.selectByExample(example);
            System.out.println("productlist:"+productList.size());
            for(SupplierTenderProduct stp:productList) {
                DailySupplierTenderProductOutput mstpo = new DailySupplierTenderProductOutput();

                // 竞价备件
                MatterTenderProductExample mtpexample = new MatterTenderProductExample();
                MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
                mtpcriteria.andDemandNoEqualTo(stp.getDemandNo());
               List<MatterTenderProduct> matterTenderProducts= matterTenderProductDao.selectByExample(mtpexample);
                System.out.println("matterTenderProducts:"+matterTenderProducts.size());
                BeanUtils.copyProperties(matterTenderProducts.get(0), mstpo);
                System.out.println("matterTenderProducts.get(0):"+matterTenderProducts.get(0).getWarehouseAddress());
                mstpo.setPrice(stp.getPrice());
                mstpo.setRemark(stp.getRemark());
                mstpo.setArriveTime(stp.getArriveTime());
                mstpo.setInvoiceLangLang(stp.getInvoice());
                mstpo.setInvoice(stp.getInvoice());
                // 取得供应商报价商品排名
                example.clear();
                criteria = example.createCriteria();
                criteria.andProductEqualTo(stp.getProduct());
                criteria.andDemandNoEqualTo(stp.getDemandNo());
                criteria.andSupplierTenderIdIn(supplierTenderIdList);
                criteria.andTenderPurchaseIdEqualTo(msto.getTenderPurchaseId());
                example.setOrderByClause("price");
                List<SupplierTenderProduct> productPriceList = supplierTenderProductDao.selectByExample(example);
                for(int i=0;i<productPriceList.size();i++) {
                    if(stp.getPurcSupplierTenderProductId().equals(productPriceList.get(i).getPurcSupplierTenderProductId())) {
                        mstpo.setRank(i+1);
                    }
                }
                productOutputList.add(mstpo);

            }
            msto.setProductOutputList2(productOutputList);
            supplierTenderList2.add(msto);

        }
        output.setSupplierTenderOutputList(supplierTenderList2);
        return output;
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
            input.setPurchaseTime(matterTenderPurchase.getCreateTime());
            input.setInvoice(matterTenderPurchase.getInvoice());
            input.setReciverAddress(wareHouse.getWarehouseAddress());
            // 组装采购商品详情数据
            List<AddPurchaseOrderDetailInput> details = new ArrayList<>();
            for(MatterTenderProduct product:products) {
                if(wareHouse.getWarehouseAddress().equals(product.getWarehouseAddress())) {
                    AddPurchaseOrderDetailInput  detail = new AddPurchaseOrderDetailInput();
                    BeanUtils.copyProperties(product,detail);
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
}

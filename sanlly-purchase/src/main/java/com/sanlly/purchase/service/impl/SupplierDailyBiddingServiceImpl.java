package com.sanlly.purchase.service.impl;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.purchase.dao.*;
import com.sanlly.purchase.entity.*;
import com.sanlly.purchase.enums.PurchaseSupplierTypeEnum;
import com.sanlly.purchase.enums.PurchasingPatternEnum;
import com.sanlly.purchase.enums.TenderMethodEnum;
import com.sanlly.purchase.enums.TenderStatusEnum;
import com.sanlly.purchase.models.input.dailybidding.SearchDailyBIddingInput;
import com.sanlly.purchase.models.input.supplier.SearchPurcSupplierInput;
import com.sanlly.purchase.models.input.supplierbidding.AddSupplierDailyBiddingInput;
import com.sanlly.purchase.models.input.supplierbidding.SupplierDailyBiddingProductInput;
import com.sanlly.purchase.models.output.dailybidding.*;
import com.sanlly.purchase.models.output.matterbidding.MatterSupplierTenderOutput;
import com.sanlly.purchase.models.output.matterbidding.SupplierTenderOutput;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.service.*;
import com.sanlly.purchase.service.feign.WareFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: TODO
 * @ClassName: SupplierDailyBiddingServiceImpl
 * @Version 1.0
 * @Author mqz
 */
@Service
public class SupplierDailyBiddingServiceImpl extends BaseServiceImpl implements SupplierDailyBiddingService {
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
    private SupplierMapper supplierDao;
    @Autowired
    SupplierTenderMapper supplierTenderMapper;
    @Autowired
    InvoiceTypeService invoiceTypeService;

    /**
     * 获取日常采购供应商竞价列表
     *
     * @param input
     * @return
     */
    @Override
    public PagedList<DailyBiddingOutput> getSupplerBiddingList(SearchDailyBIddingInput input) {

        // 竞价采购
        MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
        MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();

        // 竞价备件
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 竞价供应商
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();


        SupplierExample supplierExample2 = new SupplierExample();
        supplierExample2.createCriteria().andUserIdEqualTo(getCurrentUserId());
        System.out.println(getCurrentUserId());
        List<Supplier> suppliers2 = supplierDao.selectByExample(supplierExample2);
        //获取供应商关联的采购
        List<Integer> purchases = new ArrayList<>();
        criteria.andTenderMethodEqualTo(TenderMethodEnum.OPEN.getCode());
        List<MatterTenderPurchase> matterTenderPurchases = matterTenderPurchaseDao.selectByExample(example);
        for (MatterTenderPurchase matterTenderPurchase : matterTenderPurchases) {
            purchases.add(matterTenderPurchase.getPurcMatterTenderPurchaseId());
        }

        mtscriteria.andSupplierEqualTo(suppliers2.get(0).getKey());
        List<MatterTenderSuppier> matterTenderSuppiers = matterTenderSuppierDao.selectByExample(mtsexample);
        for (MatterTenderSuppier matterTenderSuppier : matterTenderSuppiers) {
            purchases.add(matterTenderSuppier.getTenderPurchaseId());
        }
        System.out.println("purchases:" + purchases.size());
        mtsexample.clear();
        mtscriteria = mtsexample.createCriteria();
        example.clear();
        criteria = example.createCriteria();
        if (purchases.size() == 0) {
            return null;
        }
        criteria.andPurcMatterTenderPurchaseIdIn(purchases);

        // 竞价截止时间
        if (input.getTenderCreateTimeStart() != null && input.getTenderCreateTimeEnd() != null) {
            criteria.andCreateTimeBetween(input.getTenderCreateTimeStart(), input.getTenderCreateTimeEnd());
        }
        // 采购单位
        if (StringUtils.isNotEmpty(input.getPurchaseCompany())) {
            criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
        }
       /* // 竞价状态
        if (StringUtils.isNotEmpty(input.getTenderStatus())) {
            criteria.andTenderStatusEqualTo(input.getTenderStatus());
        }
        // 竞价方式
        if (StringUtils.isNotEmpty(input.getTenderMethod())) {
            criteria.andTenderMethodEqualTo(input.getTenderMethod());
        }*/
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
            if (mtp.getTenderStatus().equals(TenderStatusEnum.SUCCESS.getCode())) {
                if (suppliers2.get(0).getKey().equals(mtp.getSelectSupplier())) {
                    mtOutput.setStatusLang(CommonEnum.YES.getCode());

                } else {
                    mtOutput.setStatusLang(CommonEnum.NO.getCode());
                }
            }

            // 是否签到供应商
            mtsexample.clear();
            mtscriteria = mtsexample.createCriteria();
            mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
            mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.SIGN.getCode());
            mtscriteria.andSupplierEqualTo(suppliers2.get(0).getKey());
            List<MatterTenderSuppier> matterTenderSuppiers1 = matterTenderSuppierDao.selectByExample(mtsexample);
            if (!matterTenderSuppiers1.isEmpty() && matterTenderSuppiers1.size() == 1) {
                mtOutput.setSign(true);
            } else {
                mtOutput.setSign(false);

            }
            List<SupplierTenderOutput> supplierTenderOutputs = supplierTenderExtDao.selectSupplierByTenderPurchaseId(mtp.getPurcMatterTenderPurchaseId());
            mtOutput.setQuote(false);
            for (SupplierTenderOutput supplierTenderOutput : supplierTenderOutputs) {
                if (supplierTenderOutput.getSupplier().equals(suppliers2.get(0).getKey())) {
                    mtOutput.setQuote(true);
                }
            }

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
           /* mtsexample.clear();
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
*/
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

                if (mtp.getTenderStatus().equals(TenderStatusEnum.SUCCESS.getCode())) {
                    if (CommonEnum.YES.getCode().equals(mtOutput.getStatusLang())) {
                        mtpo.setStatusLang(CommonEnum.YES.getCode());
                    } else {
                        mtpo.setStatusLang(CommonEnum.NO.getCode());

                    }
                }

                productList.add(mtpo);
            }
            mtOutput.setTenderProductOutputList(productList);


            mtOutputList.add(mtOutput);
        }

        // 将分页数据放入结果中
        pagedList.getDataList().addAll(mtOutputList);
        return pagedList;
    }

    /**
     * 获取竞价详情
     *
     * @param pureMatterPurchaseId
     * @return
     */
    @Override
    public DailySupplierTenderDetailOutput getSupplierBiddingListDetail(Integer purcMatterTenderPurchaseId) {
        SupplierTenderProductExample example = new SupplierTenderProductExample();
        SupplierTenderProductExample.Criteria criteria = example.createCriteria();

        // 招标信息取得
        MatterTenderPurchase mtp = matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseId);
        DailySupplierTenderDetailOutput output = new DailySupplierTenderDetailOutput();
        BeanUtils.copyProperties(mtp, output);
        output.setInvoiceLangLang(mtp.getInvoice());
        output.setPurchaseCompanyLangLang(mtp.getPurchaseCompany());
        output.setSelectSupplierLangLang(mtp.getSelectSupplier());
        output.setTenderMethodLangLang(mtp.getTenderMethod());
        output.setTenderStatusLangLang(mtp.getTenderStatus());
        output.setTenderTypeLangLang(mtp.getTenderType());
        // 需求申请人
        Result<UserInfoOutput> authRs = authFigenClient.userDetail(mtp.getBuyerId());
        if (authRs != null) {
            output.setStrBuyer(authRs.getData().getUserName());
        }
        SupplierTenderExample supplierTenderExample = new SupplierTenderExample();
        SupplierExample supplierExample2 = new SupplierExample();
        supplierExample2.createCriteria().andUserIdEqualTo(getCurrentUserId());
        System.out.println(getCurrentUserId());
        List<Supplier> suppliers2 = supplierDao.selectByExample(supplierExample2);

        supplierTenderExample.createCriteria().andTenderPurchaseIdEqualTo(purcMatterTenderPurchaseId)
                .andSupplierEqualTo(suppliers2.get(0).getKey());
        List<SupplierTender> supplierTenders = supplierTenderDao.selectByExample(supplierTenderExample);

        if (supplierTenders == null || supplierTenders.size() == 0) {
            List<MatterSupplierTenderOutput> supplierTenderList = new ArrayList<>();

            MatterSupplierTenderOutput msto1 = new MatterSupplierTenderOutput();

            msto1.setStatusLangLang(CommonEnum.NO.getCode());
            msto1.setSupplier(suppliers2.get(0).getKey());
            // 调用供应商接口取得
            SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
            spsInput.setKey(suppliers2.get(0).getKey());
            PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
            msto1.setSupplierLangLang(suppliers2.get(0).getKey());

            msto1.setGrade(supplierOutput.getGrade());
            msto1.setGradeLangLang(supplierOutput.getGrade());
            msto1.setSettlementCycle(supplierOutput.getSettlementCycle());
            msto1.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
            msto1.setRank(0);
            msto1.setBiddingNum(0);
            DailySupplierTenderOutput msto = new DailySupplierTenderOutput();
            BeanUtils.copyProperties(msto1, msto);
            msto.setTotal(new BigDecimal(0));
            msto.setStatusLangLang(CommonEnum.NO.getCode());

            // 竞价备件
            // 竞价备件
            MatterTenderProductExample mtpexample = new MatterTenderProductExample();
            MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
            mtpexample.clear();
            mtpcriteria = mtpexample.createCriteria();
            mtpcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
            List<MatterTenderProduct> productList = matterTenderProductDao.selectByExample(mtpexample);
            List<DailySupplierTenderProductOutput> productOutputList = new ArrayList<>();
            // 采购备件数据组装
            for (MatterTenderProduct stp : productList) {
                DailySupplierTenderProductOutput mstpo = new DailySupplierTenderProductOutput();
                BeanUtils.copyProperties(stp, mstpo);
                mstpo.setRemark(stp.getComments());
                mstpo.setArriveTime(stp.getDeliveryTime());
                mstpo.setRank(0);
                msto.setRemark(stp.getComments());
                productOutputList.add(mstpo);
            }

            msto.setProductOutputList2(productOutputList);
            supplierTenderList.add(msto);
            output.setSupplierTenderOutputList(supplierTenderList);
            return output;


        }

        // 1.取得供应商报价记录
        List<MatterSupplierTenderOutput> supplierTenderList = supplierTenderExtDao.selectByTenderPurchaseId(purcMatterTenderPurchaseId);
        System.out.println("supplierTenderList:" + supplierTenderList.size());
        // 供应商最终报价记录id集合
        List<Integer> supplierTenderIdList = supplierTenderList.stream().map(MatterSupplierTenderOutput::getPurcSupplierTenderId).collect(Collectors.toList());
        List<MatterSupplierTenderOutput> supplierTenderList2 = new ArrayList<>();

        // 2、取得供应商备件报价详细信息
        for (int j = 0; j < supplierTenderList.size(); j++) {
            System.out.println("supplierTenderList.get(j):" + supplierTenderList.get(j).getSupplier());
            MatterSupplierTenderOutput msto1 = supplierTenderList.get(j);
            DailySupplierTenderOutput msto = new DailySupplierTenderOutput();
            BeanUtils.copyProperties(msto1, msto);
            msto.setStatusLangLang(msto1.getStatus());
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
            msto.setRank(j + 1);
            if (j == 0) {

            }

            example.clear();
            criteria = example.createCriteria();
            criteria.andSupplierTenderIdEqualTo(msto.getPurcSupplierTenderId());
            List<DailySupplierTenderProductOutput> productOutputList = new ArrayList<>();
            // 取得供应商的最低报价
            List<SupplierTenderProduct> productList = supplierTenderProductDao.selectByExample(example);
            System.out.println("productlist:" + productList.size());
            for (SupplierTenderProduct stp : productList) {
                DailySupplierTenderProductOutput mstpo = new DailySupplierTenderProductOutput();

                // 竞价备件
                MatterTenderProductExample mtpexample = new MatterTenderProductExample();
                MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
                mtpcriteria.andDemandNoEqualTo(stp.getDemandNo());
                List<MatterTenderProduct> matterTenderProducts = matterTenderProductDao.selectByExample(mtpexample);
                BeanUtils.copyProperties(matterTenderProducts.get(0), mstpo);
                mstpo.setPrice(stp.getPrice());
                mstpo.setRemark(stp.getRemark());
                mstpo.setArriveTime(stp.getArriveTime());
                mstpo.setPurcSupplierTenderProductId(stp.getPurcSupplierTenderProductId());
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
                for (int i = 0; i < productPriceList.size(); i++) {
                    if (stp.getPurcSupplierTenderProductId().equals(productPriceList.get(i).getPurcSupplierTenderProductId())) {
                        mstpo.setRank(i + 1);
                    }
                }
                productOutputList.add(mstpo);

            }
            System.out.println("productOutputList:" + productOutputList.size());
            msto.setProductOutputList2(productOutputList);
            if (supplierTenderList.get(j).getSupplier().contains(suppliers2.get(0).getKey())) {
                supplierTenderList2.add(msto);

            }

        }
    /*    for (int i = 0; i < supplierTenderList2.size(); i++) {

            if (!supplierTenderList2.get(i).getSupplier().contains(suppliers2.get(0).getKey())) {
                supplierTenderList2.remove(i);
            }
        }*/
        //System.out.println("biddingNum:"+output.getSupplierTenderOutputList().get(0).getBiddingNum());
        output.setSupplierTenderOutputList(supplierTenderList2);
        return output;
    }

    /**
     * 保存供应商竞价
     *
     * @param input
     */
    @Override
    @Transactional
    public Result saveBiddingResult(AddSupplierDailyBiddingInput input) {
        SupplierExample supplierExample2 = new SupplierExample();
        supplierExample2.createCriteria().andUserIdEqualTo(getCurrentUserId());
        System.out.println(getCurrentUserId());
        List<Supplier> suppliers2 = supplierDao.selectByExample(supplierExample2);
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
        mtscriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
        mtscriteria.andSupplierEqualTo(suppliers2.get(0).getKey());
        mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.SIGN.getCode());
        List<MatterTenderSuppier> matterTenderSuppiers = matterTenderSuppierDao.selectByExample(mtsexample);

        MatterTenderPurchaseExample mtp = new MatterTenderPurchaseExample();
        mtp.createCriteria().andPurcMatterTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
        List<MatterTenderPurchase> matterTenderPurchases = matterTenderPurchaseDao.selectByExample(mtp);
        Date startime = matterTenderPurchases.get(0).getBiddingStartTime();
        Date endTime = matterTenderPurchases.get(0).getBiddingEndTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(endTime);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(startime);
        Date now = new Date();
        if (now.getTime() > calendar.getTime().getTime() || now.getTime() < calendar2.getTime().getTime()) {
            return Result.Error(ResultCodeEnum.ERROR.getCode(), "不在竞价时间内");
        }
        if (!matterTenderPurchases.get(0).getTenderStatus().equals(TenderStatusEnum.ING.getCode())) {
            return Result.Error(ResultCodeEnum.ERROR.getCode(), "竞价状态不正确");
        }
        if (matterTenderPurchases.get(0).getFirstInstanceTime() != null) {
            if (matterTenderSuppiers == null || matterTenderSuppiers.size() == 0) {

                return Result.Error(ResultCodeEnum.ERROR.getCode(), "未签到");
            }
        } else {
            if (matterTenderSuppiers == null || matterTenderSuppiers.size() == 0) {
                if (matterTenderSuppiers == null || matterTenderSuppiers.size() == 0) {
                    MatterTenderSuppier matterTenderSuppier = new MatterTenderSuppier();
                    matterTenderSuppier.setUpdateTime(new Date());
                    matterTenderSuppier.setUpdateUser(getCurrentUserId());
                    matterTenderSuppier.setType(PurchaseSupplierTypeEnum.SIGN.getCode());
                    matterTenderSuppier.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
                    matterTenderSuppier.setSupplier(suppliers2.get(0).getKey());
                    matterTenderSuppierDao.insertSelective(matterTenderSuppier);

                }
            }
        }


        Integer purchaseid = input.getPurcMatterTenderPurchaseId();
        SupplierTender supplierTender = new SupplierTender();
        SupplierTenderExample supplierTenderExample = new SupplierTenderExample();
        supplierTenderExample.createCriteria().andTenderPurchaseIdEqualTo(purchaseid)
                .andSupplierEqualTo(suppliers2.get(0).getKey());
        supplierTenderExample.setOrderByClause("purc_supplier_tender_id desc");
        List<SupplierTender> supplierTenders = supplierTenderDao.selectByExample(supplierTenderExample);
        if (supplierTenders == null || supplierTenders.size() == 0) {
            BigDecimal total = new BigDecimal("0");
            SupplierTender supplierTender1 = new SupplierTender();
            supplierTender.setBiddingNum(1);
            supplierTender.setCreateTime(new Date());
            supplierTender.setCreateUser(getCurrentUserId());
            supplierTender.setSupplier(suppliers2.get(0).getKey());
            supplierTender.setStatus(CommonEnum.NO.getCode());
            supplierTender.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
            supplierTender.setTenderType(PurchasingPatternEnum.BIDDING.getCode());
            supplierTender.setCreateUser(getCurrentUserId());
            supplierTender.setCreateTime(new Date());
            supplierTenderMapper.insertSelective(supplierTender);
            supplierTenderExample.clear();
            supplierTenderExample.createCriteria().andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId())
                    .andSupplierEqualTo(suppliers2.get(0).getKey());
            List<SupplierTender> supplierTenders1 = supplierTenderDao.selectByExample(supplierTenderExample);
            Integer id = supplierTenders1.get(0).getPurcSupplierTenderId();

            for (SupplierDailyBiddingProductInput supplierBiddingProductInput : input.getSupplierTenderProductList()) {

                SupplierTenderProduct supplierTenderProduct = new SupplierTenderProduct();
                BeanUtils.copyProperties(supplierBiddingProductInput, supplierTenderProduct);
                supplierTenderProduct.setProduct(supplierBiddingProductInput.getProductNum());
                supplierTenderProduct.setPrice(supplierBiddingProductInput.getPrice());
                supplierTenderProduct.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
                supplierTenderProduct.setSupplierTenderId(id);
                supplierTenderProduct.setWeight(supplierBiddingProductInput.getWeight());
                supplierTenderProduct.setArriveTime(supplierBiddingProductInput.getArriveTime());
                supplierTenderProduct.setCreateTime(new Date());
                supplierTenderProduct.setUpdateUser(getCurrentUserId());
                supplierTenderProduct.setRemark(supplierBiddingProductInput.getComments());
                supplierTenderProduct.setDemandNo(supplierBiddingProductInput.getDemandNo());
                supplierTenderProduct.setSparePartsUnit(supplierBiddingProductInput.getSparePartsUnit());
                supplierTenderProduct.setInvoice(supplierBiddingProductInput.getInvoice());
                Double invoicePoint = invoiceTypeService.getInvoiceTypes(supplierBiddingProductInput.getInvoice());
                supplierTenderProduct.setNoTaxPrice(supplierBiddingProductInput.getPrice().multiply(new BigDecimal(1 - invoicePoint)));
                supplierTenderProductDao.insertSelective(supplierTenderProduct);
                Double invoice = invoiceTypeService.getInvoiceTypes(supplierBiddingProductInput.getInvoice());
                BigDecimal invoicedecimal = new BigDecimal(Double.toString(1 + invoice));


                total = total.add(supplierBiddingProductInput.getPrice().divide(invoicedecimal, 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(supplierBiddingProductInput.getProductCount())));


            }
            SupplierTender supplierTender2 = new SupplierTender();

            supplierTender2.setTotal(total);
            supplierTender2.setUpdateTime(new Date());
            supplierTender2.setUpdateUser(getCurrentUserId());

            supplierTenderMapper.updateByExampleSelective(supplierTender2, supplierTenderExample);
        } else {
      /*      BigDecimal total1 = new BigDecimal("0");

            for (SupplierDailyBiddingProductInput supplierBiddingProductInput : input.getSupplierTenderProductList()) {
                Double invoice = invoiceTypeService.getInvoiceTypes(supplierBiddingProductInput.getInvoice());
                BigDecimal invoicedecimal = new BigDecimal(Double.toString(1 + invoice));
                total1 = total1.add(supplierBiddingProductInput.getPrice().divide(invoicedecimal, 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(supplierBiddingProductInput.getWeight())));

            }
            if(supplierTenders.get(0).getTotal().compareTo(total1)<1){
                return Result.Error(ResultCodeEnum.ERROR.getCode(), "商品报价应低于上次报价");

            }*/
            supplierTenderExample.clear();
            supplierTenderExample.createCriteria().andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId())
                    .andSupplierEqualTo(suppliers2.get(0).getKey());
            supplierTenderExample.setOrderByClause("purc_supplier_tender_id desc");
            int count = (int) supplierTenderDao.countByExample(supplierTenderExample);
            BigDecimal total = new BigDecimal("0");
            SupplierTender supplierTender1 = new SupplierTender();
            supplierTender.setBiddingNum(count + 1);
            supplierTender.setCreateTime(new Date());
            supplierTender.setCreateUser(getCurrentUserId());
            supplierTender.setSupplier(suppliers2.get(0).getKey());
            supplierTender.setStatus(CommonEnum.NO.getCode());
            supplierTender.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
            supplierTender.setTenderType(PurchasingPatternEnum.BIDDING.getCode());
            supplierTender.setCreateUser(getCurrentUserId());
            supplierTender.setCreateTime(new Date());
            supplierTenderMapper.insertSelective(supplierTender);
            supplierTenderExample.clear();
            supplierTenderExample.createCriteria().andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId())
                    .andSupplierEqualTo(suppliers2.get(0).getKey());
            supplierTenderExample.setOrderByClause("purc_supplier_tender_id desc");
            List<SupplierTender> supplierTenders1 = supplierTenderDao.selectByExample(supplierTenderExample);
            Integer id = supplierTenders1.get(0).getPurcSupplierTenderId();

            for (SupplierDailyBiddingProductInput supplierBiddingProductInput : input.getSupplierTenderProductList()) {
                SupplierTenderProduct supplierTenderProduct = new SupplierTenderProduct();
                BeanUtils.copyProperties(supplierBiddingProductInput, supplierTenderProduct);
                supplierTenderProduct.setProduct(supplierBiddingProductInput.getProductNum());
                supplierTenderProduct.setPrice(supplierBiddingProductInput.getPrice());
                supplierTenderProduct.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
                supplierTenderProduct.setSupplierTenderId(id);
                supplierTenderProduct.setWeight(supplierBiddingProductInput.getWeight());
                supplierTenderProduct.setArriveTime(supplierBiddingProductInput.getArriveTime());
                supplierTenderProduct.setCreateTime(new Date());
                supplierTenderProduct.setUpdateUser(getCurrentUserId());
                supplierTenderProduct.setRemark(supplierBiddingProductInput.getComments());
                supplierTenderProduct.setDemandNo(supplierBiddingProductInput.getDemandNo());
                supplierTenderProduct.setSparePartsUnit(supplierBiddingProductInput.getSparePartsUnit());
                supplierTenderProduct.setInvoice(supplierBiddingProductInput.getInvoice());
                supplierTenderProduct.setPurcSupplierTenderProductId(null);
                Double invoicePoint = invoiceTypeService.getInvoiceTypes(supplierBiddingProductInput.getInvoice());
                supplierTenderProduct.setNoTaxPrice(supplierBiddingProductInput.getPrice().multiply(new BigDecimal(1 - invoicePoint)));

                supplierTenderProductDao.insertSelective(supplierTenderProduct);
                Double invoice = invoiceTypeService.getInvoiceTypes(supplierBiddingProductInput.getInvoice());
                BigDecimal invoicedecimal = new BigDecimal(Double.toString(1 + invoice));
                total = total.add(supplierBiddingProductInput.getPrice().divide(invoicedecimal, 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(supplierBiddingProductInput.getProductCount())));

            }
            supplierTenderExample.clear();
            supplierTenderExample.createCriteria().andPurcSupplierTenderIdEqualTo(id);
            SupplierTender supplierTender2 = new SupplierTender();

            supplierTender2.setTotal(total);
            supplierTender2.setUpdateTime(new Date());
            supplierTender2.setUpdateUser(getCurrentUserId());

            supplierTenderMapper.updateByExampleSelective(supplierTender2, supplierTenderExample);


        }/*else
            {
            SupplierTenderExample supplierTenderExample1 = new SupplierTenderExample();
            supplierTenderExample1.createCriteria().andSupplierEqualTo(suppliers2.get(0).getKey()).andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());

            List<SupplierTender> supplierTenders1 = supplierTenderDao.selectByExample(supplierTenderExample1);
            BigDecimal total = new BigDecimal("0");
            SupplierTender supplierTender1 = new SupplierTender();
            for (SupplierDailyBiddingProductInput supplierBiddingProductInput : input.getSupplierTenderProductList()) {
                SupplierTenderProduct supplierTenderProduct = new SupplierTenderProduct();
                supplierTenderProduct.setPrice(supplierBiddingProductInput.getPrice());
                SupplierTenderProductExample supplierTenderProductExample = new SupplierTenderProductExample();
                supplierTenderProductExample.createCriteria()
                        .andPurcSupplierTenderProductIdEqualTo(supplierBiddingProductInput.getPurcSupplierTenderProductId());

                supplierTenderProduct.setUpdateUser(getCurrentUserId());
                supplierTenderProduct.setUpdateTime(new Date());
                supplierTenderProduct.setArriveTime(supplierBiddingProductInput.getArriveTime());
                supplierTenderProduct.setInvoice(supplierBiddingProductInput.getInvoice());
                supplierTenderProductDao.updateByExampleSelective(supplierTenderProduct, supplierTenderProductExample);
                Double invoice= invoiceTypeService.getInvoiceTypes(supplierBiddingProductInput.getInvoice());
                BigDecimal invoicedecimal=new BigDecimal(Double.toString(1+invoice));
                total = total.add(supplierBiddingProductInput.getPrice().divide(invoicedecimal,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(supplierBiddingProductInput.getWeight())));
            }

            supplierTender1.setTotal(total);
            supplierTender1.setUpdateUser(getCurrentUserId());
            supplierTender1.setUpdateTime(new Date());
            supplierTender1.setBiddingNum(supplierTenders1.get(0).getBiddingNum() + 1);
            supplierTenderMapper.updateByExampleSelective(supplierTender1, supplierTenderExample1);

        }*/
        return Result.Success();
    }

    /**
     * 供应商签到
     *
     * @param pureMatterPurchaseId
     */
    @Override
    @Transactional
    public void supplierSign(Integer pureMatterPurchaseId) {

    }
}

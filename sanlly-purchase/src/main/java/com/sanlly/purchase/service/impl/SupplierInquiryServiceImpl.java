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
import com.sanlly.purchase.models.input.bidding.SearchMatterBiddingInput;
import com.sanlly.purchase.models.input.supplier.SearchPurcSupplierInput;
import com.sanlly.purchase.models.input.supplierbidding.AddsupplierBiddingInput;
import com.sanlly.purchase.models.input.supplierbidding.SupplierBiddingProductInput;
import com.sanlly.purchase.models.output.feign.SparePartsOutput;
import com.sanlly.purchase.models.output.feign.WareWarehouse;
import com.sanlly.purchase.models.output.matterbidding.*;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.service.*;
import com.sanlly.purchase.service.feign.WareFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description: TODO
 * @ClassName: SupplierInquiryServiceImpl
 * @Version 1.0
 * @Author mqz
 */
@Service
public class SupplierInquiryServiceImpl extends BaseServiceImpl implements SupplierInquiryService {
    // 询价采购
    @Autowired
    private MatterTenderPurchaseMapper matterTenderPurchaseDao;
    // 询价商品
    @Autowired
    private MatterTenderProductMapper matterTenderProductDao;
    // 询价仓库
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
    // 供应商商品报价详细
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

    @Override
    public PagedList<MatterBiddingOutput> getSupplerBiddingList(SearchMatterBiddingInput input) {


// 竞价采购
        MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
        MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();

        // 竞价备件
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 竞价供应商
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
        // 竞价仓库
        MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
        MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();
        //获取供应商关联的采购
        List<Integer> purchases = new ArrayList<>();
        SupplierExample supplierExample2 = new SupplierExample();
        supplierExample2.createCriteria().andUserIdEqualTo(getCurrentUserId());
       // System.out.println(getCurrentUserId());
        List<Supplier> suppliers2 = supplierDao.selectByExample(supplierExample2);
        //String supplierKey = suppliers2.get(0).getKey();
        criteria.andTenderMethodEqualTo(TenderMethodEnum.OPEN.getCode());
        criteria.andIsDayPruchaseEqualTo(CommonEnum.NO.getCode());
        List<MatterTenderPurchase> matterTenderPurchases = matterTenderPurchaseDao.selectByExample(example);
        for (MatterTenderPurchase matterTenderPurchase : matterTenderPurchases) {
            MatterTenderProductExample mtpexample1 = new MatterTenderProductExample();
            MatterTenderProductExample.Criteria mtpcriteria1 = mtpexample1.createCriteria();
            mtpcriteria1.andTenderPurchaseIdEqualTo(matterTenderPurchase.getPurcMatterTenderPurchaseId());
            List<MatterTenderProduct> matterTenderProducts = matterTenderProductDao.selectByExample(mtpexample1);
            List<String> secondSpecials = new ArrayList<String>();
            for (MatterTenderProduct matterTenderProduct : matterTenderProducts) {
                SparePartsOutput rsSparePart = wareFeignClient.getSparePart(matterTenderProduct.getProduct()).getData();
                if (rsSparePart != null) {
                    secondSpecials.add(rsSparePart.getSparePartsCategoriesDetails());
                }

            }
            try {
                List<PurcSupplierOutput> purcSupplierOutputs = supplierService.getSupplierBySecondSpecial(secondSpecials.toArray(new String[secondSpecials.size()]), suppliers2.get(0).getName(), null);
                if (purcSupplierOutputs != null && purcSupplierOutputs.size() != 0) {
                    purchases.add(matterTenderPurchase.getPurcMatterTenderPurchaseId());
                }
            } catch (Exception e) {
                System.out.println("未找到供应商");
            }

            //purchases.add(matterTenderPurchase.getPurcMatterTenderPurchaseId());
        }
        mtscriteria.andSupplierEqualTo(suppliers2.get(0).getKey());
        List<MatterTenderSuppier> matterTenderSuppiers = matterTenderSuppierDao.selectByExample(mtsexample);
        for (MatterTenderSuppier matterTenderSuppier : matterTenderSuppiers) {
            purchases.add(matterTenderSuppier.getTenderPurchaseId());
        }
        //System.out.println("purchases:" + purchases.size());
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



      /*  // 竞价状态
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
        }*/

        // 是否周期性定价
        // criteria.andIsPeriodEqualTo(input.getIsPeriod());
        // 是否日常采购
        criteria.andIsDayPruchaseEqualTo(CommonEnum.NO.getCode());
        // 竞价
        criteria.andTenderTypeEqualTo(PurchasingPatternEnum.INQUIRY.getCode());
        //System.out.println("PurchasingPatternEnum.INQUIRY.getCode():" + PurchasingPatternEnum.INQUIRY.getCode());
        criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
        example.setOrderByClause("create_time desc");
        // 总条数
        Integer totalItemCount = (int) matterTenderPurchaseDao.countByExample(example);
        // 分页查询
        PagedList<MatterBiddingOutput> pagedList = new PagedList<MatterBiddingOutput>(input.getPageIndex(),
                input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());

        List<MatterTenderPurchase> matterTenderList = matterTenderPurchaseDao.selectByExample(example);
        List<MatterBiddingOutput> mtOutputList = new ArrayList<MatterBiddingOutput>();
        for (MatterTenderPurchase mtp : matterTenderList) {
            MatterBiddingOutput mtOutput = new MatterBiddingOutput();
            BeanUtils.copyProperties(mtp, mtOutput);
            mtOutput.setInvoiceLangLang(mtp.getInvoice());
            mtOutput.setIsPeriodLangLang(mtp.getIsPeriod());
            mtOutput.setPurchaseCompanyLangLang(mtp.getPurchaseCompany());
            mtOutput.setSelectSupplierLangLang(mtp.getSelectSupplier());
            mtOutput.setTenderMethodLangLang(mtp.getTenderMethod());
            mtOutput.setTenderStatusLangLang(mtp.getTenderStatus());
            mtOutput.setTenderTypeLangLang(mtp.getTenderType());
            if (mtp.getTenderStatus().equals(TenderStatusEnum.SUCCESS.getCode())) {
                if (mtp.getIsPeriod().equals(CommonEnum.NO.getCode())){
                    if (suppliers2.get(0).getKey().equals(mtp.getSelectSupplier())){
                        mtOutput.setStatusLang(CommonEnum.YES.getCode());

                    }else {
                        mtOutput.setStatusLang(CommonEnum.NO.getCode());
                    }
                }
            }
            List<SupplierTenderOutput> supplierTenderOutputs = supplierTenderExtDao.selectSupplierByTenderPurchaseId(mtp.getPurcMatterTenderPurchaseId());
            mtOutput.setQuote(false);
            for (SupplierTenderOutput supplierTenderOutput:supplierTenderOutputs){
               if (supplierTenderOutput.getSupplier().equals(suppliers2.get(0).getKey())){
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
            List<MatterBiddingSupplierOutput> inviteSupplierList = new ArrayList<MatterBiddingSupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsInviteList) {
                MatterBiddingSupplierOutput mtso = new MatterBiddingSupplierOutput();
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
            List<MatterBiddingSupplierOutput> firstSupplierList = new ArrayList<MatterBiddingSupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsFirstList) {
                MatterBiddingSupplierOutput mtso = new MatterBiddingSupplierOutput();
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
        /*    mtsexample.clear();
            mtscriteria = mtsexample.createCriteria();
            mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
            mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.SIGN.getCode());

            List<MatterTenderSuppier> mtsSignList = matterTenderSuppierDao.selectByExample(mtsexample);
            List<MatterBiddingSupplierOutput> signSupplierList = new ArrayList<MatterBiddingSupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsSignList) {
                MatterBiddingSupplierOutput mtso = new MatterBiddingSupplierOutput();
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
            List<MatterBiddingProductOutput> productList = new ArrayList<MatterBiddingProductOutput>();
            // 采购备件数据组装
            for (MatterTenderProduct mtProduct : mtpList) {
                MatterBiddingProductOutput mtpo = new MatterBiddingProductOutput();
                BeanUtils.copyProperties(mtProduct, mtpo);
                if (mtp.getTenderStatus().equals(TenderStatusEnum.SUCCESS.getCode())) {
                    if (CommonEnum.YES.getCode().equals(mtp.getIsPeriod())){
                        if (suppliers2.get(0).getKey().equals(mtProduct.getSelectSupplier())){
                            mtpo.setStatusLang(CommonEnum.YES.getCode());
                            mtOutput.setStatusLang(CommonEnum.YES.getCode());
                        }else {
                            mtpo.setStatusLang(CommonEnum.NO.getCode());
                        }
                    }else {
                        if (CommonEnum.YES.getCode().equals(mtOutput.getStatusLang())){
                            mtpo.setStatusLang(CommonEnum.YES.getCode());
                        }else {
                            mtpo.setStatusLang(CommonEnum.NO.getCode());

                        }

                    }
                }

                SparePartsOutput rsSparePart = wareFeignClient.getSparePart(mtProduct.getProduct()).getData();
                if (rsSparePart != null) {
                    mtpo.setSparePartsNo(rsSparePart.getSparePartsNo());
                    mtpo.setProductLangLang(rsSparePart.getKey());
                    mtpo.setGenaralTypeLangLang(rsSparePart.getSparePartsCategories());
                    mtpo.setSecondType(rsSparePart.getSparePartsCategoriesDetails());
                    mtpo.setSecondTypeLangLang(rsSparePart.getSparePartsCategoriesDetails());
                    mtpo.setProductSpecial(rsSparePart.getSparePartsSpec());
                    mtpo.setProductModel(rsSparePart.getModel());
                    mtpo.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
                    if (StringUtils.isNotBlank(mtProduct.getWarehouse())){
                        WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(mtProduct.getWarehouse()).getData();
                        if (warehouse != null) {
                            mtpo.setWarehouseAddress(warehouse.getWarehouseAddr());
                        }
                    }

                    //mtpo.setLastPrice(rsSparePart.getLastEntryPrice());
                }
                productList.add(mtpo);
            }
            mtOutput.setTenderProductOutputList(productList);
            if (TenderStatusEnum.SUCCESS.equals(mtp.getTenderStatus())){
                if (mtOutput.getStatusLang()==null){
                    mtOutput.setStatusLang(CommonEnum.NO.getCode());
                }
            }

            // 竞价仓库
            mtwexample.clear();
            mtwcriteria = mtwexample.createCriteria();
            mtwcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

            List<MatterTenderWarehouse> mtwList = matterTenderWarehouseDao.selectByExample(mtwexample);
            List<MatterBiddingWarehouseOutput> warehouseList = new ArrayList<MatterBiddingWarehouseOutput>();
            // 采购仓库数据组装
            for (MatterTenderWarehouse mtWarehouse : mtwList) {
                MatterBiddingWarehouseOutput mtwo = new MatterBiddingWarehouseOutput();
                WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(mtWarehouse.getWarehouse()).getData();
                if (warehouse != null) {
                    mtwo.setWarehouseAddress(warehouse.getWarehouseAddr());
                }
               /* if (rsWarehouse != null) {
                    Map<String, Object> map = (Map<String, Object>) rsWarehouse.getData();
                    mtwo.setWarehouseAddress(map.get("warehouseAddr").toString());
                }*/
                mtwo.setWarehouse(mtWarehouse.getWarehouse());
                mtwo.setWarehouseLangLang(mtWarehouse.getWarehouse());
                warehouseList.add(mtwo);
            }
            mtOutput.setWarehouseOutputList(warehouseList);

            mtOutputList.add(mtOutput);
        }

        // 将分页数据放入结果中
        pagedList.getDataList().addAll(mtOutputList);
        //System.out.println("mtOutputList:" + mtOutputList.size());
        return pagedList;
    }

    @Override
    public MatterSupplierTenderDetailOutput getSupplierBiddingListDetail(Integer purcMatterTenderPurchaseId) {
        //报价商品
        SupplierTenderProductExample example = new SupplierTenderProductExample();
        SupplierTenderProductExample.Criteria criteria = example.createCriteria();


        // 招标信息取得
        MatterTenderPurchase mtp = matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseId);
        MatterSupplierTenderDetailOutput output = new MatterSupplierTenderDetailOutput();
        BeanUtils.copyProperties(mtp, output);
        output.setInvoiceLangLang(mtp.getInvoice());
        output.setIsPeriodLangLang(mtp.getIsPeriod());
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
        System.out.println("strBuyer:" + output.getStrBuyer());
        // 竞价仓库
        // 招标仓库
        MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
        MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();

        mtwexample.clear();
        mtwcriteria = mtwexample.createCriteria();
        mtwcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

        List<MatterTenderWarehouse> mtwList = matterTenderWarehouseDao.selectByExample(mtwexample);
        List<MatterBiddingWarehouseOutput> warehouseList = new ArrayList<MatterBiddingWarehouseOutput>();
        // 采购仓库数据组装
        for (MatterTenderWarehouse mtWarehouse : mtwList) {
            MatterBiddingWarehouseOutput mtwo = new MatterBiddingWarehouseOutput();
            WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(mtWarehouse.getWarehouse()).getData();
            if (warehouse != null) {
                mtwo.setWarehouseAddress(warehouse.getWarehouseAddr());
            }
           /* Result rsWarehouse = wareFeignClient.getWarehouseDetail(mtWarehouse.getWarehouse());

            if (rsWarehouse != null) {
                Map<String, Object> map = (Map<String, Object>) rsWarehouse.getData();
                mtwo.setWarehouseAddress(map.get("warehouseAddr").toString());
            }*/
            mtwo.setWarehouse(mtWarehouse.getWarehouse());
            mtwo.setWarehouseLangLang(mtWarehouse.getWarehouse());
            warehouseList.add(mtwo);
        }
        output.setWarehouseOutputList(warehouseList);

        //
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


            MatterSupplierTenderOutput msto = new MatterSupplierTenderOutput();

            msto.setStatusLangLang(CommonEnum.NO.getCode());
            msto.setSupplier(suppliers2.get(0).getKey());
            // 调用供应商接口取得
            SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
            spsInput.setKey(msto.getSupplier());
            PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
            msto.setSupplierLangLang(suppliers2.get(0).getKey());

            msto.setGrade(supplierOutput.getGrade());
            msto.setGradeLangLang(supplierOutput.getGrade());
            msto.setSettlementCycle(supplierOutput.getSettlementCycle());
            msto.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
            msto.setRank(0);
            msto.setInquiryNum(0);
            msto.setTotal(new BigDecimal(0));
            msto.setStatusLangLang(CommonEnum.NO.getCode());


            // 竞价备件
            // 竞价备件
            MatterTenderProductExample mtpexample = new MatterTenderProductExample();
            MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
            mtpexample.clear();
            mtpcriteria = mtpexample.createCriteria();
            mtpcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
            List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
            List<MatterSupplierTenderProductOutput> productList = new ArrayList<MatterSupplierTenderProductOutput>();
            // 采购备件数据组装
            for (MatterTenderProduct mtProduct : mtpList) {
                MatterSupplierTenderProductOutput mstpo = new MatterSupplierTenderProductOutput();
                BeanUtils.copyProperties(mtProduct, mstpo);
                mstpo.setArriveTime(mtProduct.getDeliveryTime());
                mstpo.setRemark(mtProduct.getComments());
                mstpo.setInvoiceLangLang(mtProduct.getInvoice());
                // 备件信息取得
                SparePartsOutput rsSparePart = wareFeignClient.getSparePart(mtProduct.getProduct()).getData();
                if (rsSparePart != null) {
                    mstpo.setSparePartsNo(rsSparePart.getSparePartsNo());
                    mstpo.setProduct(rsSparePart.getKey());
                    mstpo.setProductLangLang(rsSparePart.getKey());
                    mstpo.setGenaralTypeLangLang(rsSparePart.getSparePartsCategories());
                    mstpo.setSecondType(rsSparePart.getSparePartsCategoriesDetails());
                    mstpo.setSecondTypeLangLang(rsSparePart.getSparePartsCategoriesDetails());
                    mstpo.setProductSpecial(rsSparePart.getSparePartsSpec());
                    mstpo.setProductModel(rsSparePart.getModel());
                    mstpo.setRank(0);
                    mstpo.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
                    if (StringUtils.isNotBlank(mtProduct.getWarehouse())){
                        WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(mtProduct.getWarehouse()).getData();
                        if (warehouse != null) {
                            mstpo.setWarehouseAddress(warehouse.getWarehouseAddr());
                        }
                    }

                }
                productList.add(mstpo);
            }
            msto.setProductOutputList(productList);
            supplierTenderList.add(msto);
            output.setSupplierTenderOutputList(supplierTenderList);
            return output;

        }

        // 1.取得供应商报价记录
        List<MatterSupplierTenderOutput> supplierTenderList = supplierTenderExtDao.selectByTenderPurchaseId(purcMatterTenderPurchaseId);
        System.out.println("supplierTenderLIat:" + supplierTenderList.size());

        // 供应商最终报价记录id集合
        List<Integer> supplierTenderIdList = supplierTenderList.stream().map(MatterSupplierTenderOutput::getPurcSupplierTenderId).collect(Collectors.toList());
        // 2、取得供应商备件报价详细信息
        List<MatterSupplierTenderOutput> supplierTenderList2 =new ArrayList<>();
        for (int j = 0; j < supplierTenderList.size(); j++) {
            MatterSupplierTenderOutput msto = supplierTenderList.get(j);
            msto.setStatusLangLang(msto.getStatus());
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

            List<MatterSupplierTenderProductOutput> productOutputList = new ArrayList<>();
            // 取得供应商的最低报价
            List<SupplierTenderProduct> productList = supplierTenderProductDao.selectByExample(example);
            for (SupplierTenderProduct stp : productList) {
                MatterSupplierTenderProductOutput mstpo = new MatterSupplierTenderProductOutput();
                BeanUtils.copyProperties(stp, mstpo);
                MatterTenderProductExample mtpexample = new MatterTenderProductExample();
                MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
                mtpcriteria.andDemandNoEqualTo(stp.getDemandNo());
                List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
                mstpo.setProductCount(mtpList.get(0).getProductCount());
                mstpo.setRemark(mtpList.get(0).getComments());
                if (StringUtils.isNotBlank(mtpList.get(0).getWarehouse())){
                    WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(mtpList.get(0).getWarehouse()).getData();
                    if (warehouse != null) {
                        mstpo.setWarehouseAddress(warehouse.getWarehouseAddr());
                    }
                }

                mstpo.setInvoiceLangLang(stp.getInvoice());
                mstpo.setInvoice(stp.getInvoice());

                // 备件信息取得
                SparePartsOutput rsSparePart = wareFeignClient.getSparePart(stp.getProduct()).getData();
                if (rsSparePart != null) {
                    mstpo.setSparePartsNo(rsSparePart.getSparePartsNo());
                    mstpo.setProductLangLang(rsSparePart.getKey());
                    mstpo.setGenaralTypeLangLang(rsSparePart.getSparePartsCategories());
                    mstpo.setSecondType(rsSparePart.getSparePartsCategoriesDetails());
                    mstpo.setSecondTypeLangLang(rsSparePart.getSparePartsCategoriesDetails());
                    mstpo.setProductSpecial(rsSparePart.getSparePartsSpec());
                    mstpo.setProductModel(rsSparePart.getModel());
                    mstpo.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
                    mstpo.setPurcSupplierTenderProductId(stp.getPurcSupplierTenderProductId());

                }
                // 取得供应商报价商品排名
                example.clear();
                criteria = example.createCriteria();
                criteria.andProductEqualTo(stp.getProduct());
                criteria.andSupplierTenderIdIn(supplierTenderIdList);
                criteria.andTenderPurchaseIdEqualTo(msto.getTenderPurchaseId());
                criteria.andDemandNoEqualTo(stp.getDemandNo());

                if (output.getIsPeriod().equals(CommonEnum.YES.getCode())){
                    example.setOrderByClause("no_tax_price");

                }else {
                    example.setOrderByClause("price");
                }
                List<SupplierTenderProduct> productPriceList = supplierTenderProductDao.selectByExample(example);
                for (int i = 0; i < productPriceList.size(); i++) {
                    if (stp.getPurcSupplierTenderProductId().equals(productPriceList.get(i).getPurcSupplierTenderProductId())) {
                        mstpo.setRank(i + 1);
                    }
                }
                productOutputList.add(mstpo);
            }
            msto.setProductOutputList(productOutputList);
            if (supplierTenderList.get(j).getSupplier().contains(suppliers2.get(0).getKey())) {
                supplierTenderList2.add(msto);

            }

        }

        output.setSupplierTenderOutputList(supplierTenderList2);
        return output;
    }

    @Override
    @Transactional
    public Result saveBiddingResult(AddsupplierBiddingInput input) {
        SupplierExample supplierExample2 = new SupplierExample();
        supplierExample2.createCriteria().andUserIdEqualTo(getCurrentUserId());
        System.out.println(getCurrentUserId());
        List<Supplier> suppliers2 = supplierDao.selectByExample(supplierExample2);
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
        mtscriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
        mtscriteria.andSupplierEqualTo(suppliers2.get(0).getKey());
        mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.INVITE.getCode());
        List<MatterTenderSuppier> matterTenderSuppiers = matterTenderSuppierDao.selectByExample(mtsexample);


        MatterTenderPurchaseExample mtp = new MatterTenderPurchaseExample();
        mtp.createCriteria().andPurcMatterTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());

        List<MatterTenderPurchase> matterTenderPurchases = matterTenderPurchaseDao.selectByExample(mtp);
        Date endTime = matterTenderPurchases.get(0).getTenderEndTime();


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(endTime);
       /* calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);*/
        calendar.set(Calendar.SECOND, 59);
        if ((new Date()).getTime() > calendar.getTime().getTime()) {
            return Result.Error(ResultCodeEnum.ERROR.getCode(), "询价时间结束");
        }
        if (!matterTenderPurchases.get(0).getTenderStatus().equals(TenderStatusEnum.ING.getCode())) {
            return Result.Error(ResultCodeEnum.ERROR.getCode(), "竞价状态不正确");
        }
        if (matterTenderPurchases.get(0).getTenderMethod().equals(TenderMethodEnum.INVITE) && matterTenderSuppiers.size() == 0) {

            return Result.Error(ResultCodeEnum.ERROR.getCode(), "未邀请");
        }
      /*  if (matterTenderPurchases.get(0).getFirstInstanceTime()!=null){
            if (matterTenderSuppiers==null||matterTenderSuppiers.size()==0){

                return Result.Error(ResultCodeEnum.ERROR.getCode(),"未签到");
            }
        }else {
            if (matterTenderSuppiers == null || matterTenderSuppiers.size() == 0 ) {
                if (matterTenderSuppiers == null || matterTenderSuppiers.size() == 0 ) {
                    MatterTenderSuppier matterTenderSuppier = new MatterTenderSuppier();
                    matterTenderSuppier.setUpdateTime(new Date());
                    matterTenderSuppier.setUpdateUser(getCurrentUserId());
                    matterTenderSuppier.setType(PurchaseSupplierTypeEnum.SIGN.getCode());
                    matterTenderSuppier.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
                    matterTenderSuppier.setSupplier(suppliers2.get(0).getKey());
                    matterTenderSuppierDao.insertSelective(matterTenderSuppier);

                }
            }
        }*/


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
            supplierTender.setInquiryNum(1);
            supplierTender.setSupplier(suppliers2.get(0).getKey());
            supplierTender.setCreateTime(new Date());
            supplierTender.setCreateUser(getCurrentUserId());
            supplierTender.setStatus(CommonEnum.NO.getCode());
            supplierTender.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
            supplierTender.setTenderType(PurchasingPatternEnum.BIDDING.getCode());
            supplierTender.setTotal(new BigDecimal("44"));
            supplierTender.setCreateUser(getCurrentUserId());
            supplierTender.setCreateTime(new Date());
            supplierTenderMapper.insertSelective(supplierTender);
            supplierTenderExample.clear();
            ;
            supplierTenderExample.createCriteria().andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId())
                    .andSupplierEqualTo(suppliers2.get(0).getKey());
            List<SupplierTender> supplierTenders1 = supplierTenderDao.selectByExample(supplierTenderExample);
            Integer id = supplierTenders1.get(0).getPurcSupplierTenderId();

            for (SupplierBiddingProductInput supplierBiddingProductInput : input.getSupplierTenderProductList()) {

                SupplierTenderProduct supplierTenderProduct = new SupplierTenderProduct();
                BeanUtils.copyProperties(supplierBiddingProductInput, supplierTenderProduct);
                supplierTenderProduct.setProduct(supplierBiddingProductInput.getProduct());
                supplierTenderProduct.setPrice(supplierBiddingProductInput.getPrice());
                supplierTenderProduct.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
                supplierTenderProduct.setSupplierTenderId(id);
                supplierTenderProduct.setWeight(supplierBiddingProductInput.getWeight());
                supplierTenderProduct.setArriveTime(supplierBiddingProductInput.getArriveTime());
                supplierTenderProduct.setCreateTime(new Date());
                supplierTenderProduct.setUpdateUser(getCurrentUserId());
                //supplierTenderProduct.setRemark(supplierBiddingProductInput.getComments());
                supplierTenderProduct.setDemandNo(supplierBiddingProductInput.getDemandNo());
                supplierTenderProduct.setInvoice(supplierBiddingProductInput.getInvoice());
                Double invoicePoint= invoiceTypeService.getInvoiceTypes(supplierBiddingProductInput.getInvoice());
                supplierTenderProduct.setNoTaxPrice(supplierBiddingProductInput.getPrice().multiply(new BigDecimal(1 -invoicePoint)));
                supplierTenderProductDao.insertSelective(supplierTenderProduct);
              /*  MatterTenderProduct matterTenderProduct = new MatterTenderProduct();
                matterTenderProduct.setPurcMatterTenderProductId(supplierBiddingProductInput.getPurcMatterTenderProductId());
                matterTenderProduct.setInvoice(supplierBiddingProductInput.getInvoice());
                matterTenderProductDao.updateByPrimaryKeySelective(matterTenderProduct);
*/
                Double invoice = invoiceTypeService.getInvoiceTypes(supplierBiddingProductInput.getInvoice());
                BigDecimal invoicedecimal = new BigDecimal(Double.toString(1 + invoice));

               MatterTenderPurchase matterTenderPurchase= matterTenderPurchaseDao.selectByPrimaryKey(input.getPurcMatterTenderPurchaseId());
                if (matterTenderPurchase.getIsPeriod().equals(CommonEnum.YES.getCode())){
                    total = total.add(supplierBiddingProductInput.getPrice().divide(invoicedecimal, 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(supplierBiddingProductInput.getWeight())));

                }else {
                    total = total.add(supplierBiddingProductInput.getPrice().divide(invoicedecimal, 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(supplierBiddingProductInput.getProductCount())));

                }

            }
            SupplierTender supplierTender2 = new SupplierTender();

            supplierTender2.setTotal(total);
            supplierTender2.setUpdateTime(new Date());
            supplierTender2.setUpdateUser(getCurrentUserId());

            supplierTenderMapper.updateByExampleSelective(supplierTender2, supplierTenderExample);
        }
        else  {
        /*    BigDecimal total1 = new BigDecimal("0");

            for (SupplierBiddingProductInput supplierBiddingProductInput : input.getSupplierTenderProductList()) {
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
            int count =(int) supplierTenderDao.countByExample(supplierTenderExample);
            BigDecimal total = new BigDecimal("0");
            SupplierTender supplierTender1 = new SupplierTender();
            supplierTender.setInquiryNum(count+1);
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

            for (SupplierBiddingProductInput supplierBiddingProductInput : input.getSupplierTenderProductList()) {
                SupplierTenderProduct supplierTenderProduct = new SupplierTenderProduct();
                BeanUtils.copyProperties(supplierBiddingProductInput, supplierTenderProduct);
                supplierTenderProduct.setPrice(supplierBiddingProductInput.getPrice());
                supplierTenderProduct.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
                supplierTenderProduct.setSupplierTenderId(id);
                supplierTenderProduct.setWeight(supplierBiddingProductInput.getWeight());
                supplierTenderProduct.setArriveTime(supplierBiddingProductInput.getArriveTime());
                supplierTenderProduct.setCreateTime(new Date());
                supplierTenderProduct.setUpdateUser(getCurrentUserId());
                supplierTenderProduct.setDemandNo(supplierBiddingProductInput.getDemandNo());
                supplierTenderProduct.setSparePartsUnit(supplierBiddingProductInput.getSparePartsUnit());
                supplierTenderProduct.setInvoice(supplierBiddingProductInput.getInvoice());
                supplierTenderProduct.setPurcSupplierTenderProductId(null);
                Double invoicePoint= invoiceTypeService.getInvoiceTypes(supplierBiddingProductInput.getInvoice());
                supplierTenderProduct.setNoTaxPrice(supplierBiddingProductInput.getPrice().multiply(new BigDecimal(1 -invoicePoint)));
                supplierTenderProductDao.insertSelective(supplierTenderProduct);
                Double invoice = invoiceTypeService.getInvoiceTypes(supplierBiddingProductInput.getInvoice());
                BigDecimal invoicedecimal = new BigDecimal(Double.toString(1 + invoice));

                MatterTenderPurchase matterTenderPurchase= matterTenderPurchaseDao.selectByPrimaryKey(input.getPurcMatterTenderPurchaseId());
                if (matterTenderPurchase.getIsPeriod().equals(CommonEnum.YES.getCode())){
                    total = total.add(supplierBiddingProductInput.getPrice().divide(invoicedecimal, 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(supplierBiddingProductInput.getWeight())));

                }else {
                    total = total.add(supplierBiddingProductInput.getPrice().divide(invoicedecimal, 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(supplierBiddingProductInput.getProductCount())));

                }
            }
            supplierTenderExample.clear();
            supplierTenderExample.createCriteria().andPurcSupplierTenderIdEqualTo(id);
            SupplierTender supplierTender2 = new SupplierTender();

            supplierTender2.setTotal(total);
            supplierTender2.setUpdateTime(new Date());
            supplierTender2.setUpdateUser(getCurrentUserId());

            supplierTenderMapper.updateByExampleSelective(supplierTender2, supplierTenderExample);


        }



        /* else {
            SupplierTenderExample supplierTenderExample1 = new SupplierTenderExample();
            supplierTenderExample1.createCriteria().andSupplierEqualTo(suppliers2.get(0).getKey()).andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());

            List<SupplierTender> supplierTenders1 = supplierTenderDao.selectByExample(supplierTenderExample1);
            BigDecimal total = new BigDecimal("0");
            SupplierTender supplierTender1 = new SupplierTender();
            for (SupplierBiddingProductInput supplierBiddingProductInput : input.getSupplierTenderProductList()) {
                SupplierTenderProduct supplierTenderProduct = new SupplierTenderProduct();
                supplierTenderProduct.setPrice(supplierBiddingProductInput.getPrice());
                SupplierTenderProductExample supplierTenderProductExample = new SupplierTenderProductExample();
                supplierTenderProductExample.createCriteria()
                        .andPurcSupplierTenderProductIdEqualTo(supplierBiddingProductInput.getPurcSupplierTenderProductId());
                supplierTenderProduct.setArriveTime(supplierBiddingProductInput.getArriveTime());
                supplierTenderProduct.setUpdateUser(getCurrentUserId());
                supplierTenderProduct.setUpdateTime(new Date());
                supplierTenderProduct.setInvoice(supplierBiddingProductInput.getInvoice());                supplierTenderProduct.setRemark(supplierBiddingProductInput.getRemark());
                supplierTenderProduct.setRemark(supplierBiddingProductInput.getRemark());
                supplierTenderProductDao.updateByExampleSelective(supplierTenderProduct, supplierTenderProductExample);
                Double invoice = invoiceTypeService.getInvoiceTypes(supplierBiddingProductInput.getInvoice());
                BigDecimal invoicedecimal = new BigDecimal(Double.toString(1 + invoice));
                total = total.add(supplierBiddingProductInput.getPrice().divide(invoicedecimal, 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(supplierBiddingProductInput.getWeight())));
            }

            supplierTender1.setTotal(total);
            supplierTender1.setUpdateUser(getCurrentUserId());
            supplierTender1.setUpdateTime(new Date());
            if (supplierTenders1.get(0).getInquiryNum()==null){
                supplierTenders1.get(0).setInquiryNum(0);
            }
            supplierTender1.setInquiryNum(supplierTenders1.get(0).getInquiryNum() + 1);
            supplierTenderMapper.updateByExampleSelective(supplierTender1, supplierTenderExample1);

        }*/
        return Result.Success();
    }

    @Override
    @Transactional
    public Result supplierSign(Integer pureMatterPurchaseId) {

        MatterTenderPurchaseExample matterTenderPurchaseExample = new MatterTenderPurchaseExample();
        matterTenderPurchaseExample.createCriteria().andPurcMatterTenderPurchaseIdEqualTo(pureMatterPurchaseId);
        List<MatterTenderPurchase> matterTenderPurchases = matterTenderPurchaseDao.selectByExample(matterTenderPurchaseExample);
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.set(Calendar.SECOND, 0);
        now = calendar.getTime();
        if (matterTenderPurchases.get(0).getFirstInstanceTime() != null) {
            if (dateCompare1(now, matterTenderPurchases.get(0).getFirstInstanceTime()) > 0) {
                return Result.Error(ResultCodeEnum.ERROR.getCode(), "签到时间已经截止");
            }
        } else {

            if (matterTenderPurchases.get(0).getTenderEndTime().before(now)) {
                return Result.Error(ResultCodeEnum.ERROR.getCode(), "询价截止");
            }
        }
        SupplierExample supplierExample2 = new SupplierExample();
        supplierExample2.createCriteria().andUserIdEqualTo(getCurrentUserId());
        System.out.println(getCurrentUserId());
        List<Supplier> suppliers2 = supplierDao.selectByExample(supplierExample2);
        // 竞价供应商
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
        if (matterTenderPurchases.get(0).getTenderMethod().equals(TenderMethodEnum.OPEN.getCode())) {
            mtscriteria.andTenderPurchaseIdEqualTo(pureMatterPurchaseId);
            mtscriteria.andSupplierEqualTo(suppliers2.get(0).getKey());
            mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.SIGN.getCode());
            List<MatterTenderSuppier> matterTenderSuppiers = matterTenderSuppierDao.selectByExample(mtsexample);
            MatterTenderSuppier matterTenderSuppier = new MatterTenderSuppier();
            matterTenderSuppier.setUpdateTime(new Date());
            matterTenderSuppier.setUpdateUser(getCurrentUserId());
            matterTenderSuppier.setType(PurchaseSupplierTypeEnum.SIGN.getCode());
            matterTenderSuppier.setTenderPurchaseId(pureMatterPurchaseId);
            matterTenderSuppier.setSupplier(suppliers2.get(0).getKey());
            if (matterTenderSuppiers.size() == 0) {
                matterTenderSuppierDao.insertSelective(matterTenderSuppier);
                return Result.Success();
            } else {
                return Result.Error(ResultCodeEnum.ERROR.getCode(), "已经签到");
            }
        } else if (matterTenderPurchases.get(0).getTenderMethod().equals(TenderMethodEnum.INVITE.getCode())) {

            mtsexample.clear();
            mtscriteria = mtsexample.createCriteria();
            mtscriteria.andTenderPurchaseIdEqualTo(pureMatterPurchaseId);
            mtscriteria.andSupplierEqualTo(suppliers2.get(0).getKey());
            mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.INVITE.getCode());
            List<MatterTenderSuppier> matterTenderSuppiers = matterTenderSuppierDao.selectByExample(mtsexample);
            if (matterTenderSuppiers == null || matterTenderPurchases.size() == 0) {
                return Result.Error(ResultCodeEnum.ERROR.getCode(), "未被邀请");
            } else {

                mtsexample.clear();
                mtscriteria = mtsexample.createCriteria();
                mtscriteria.andTenderPurchaseIdEqualTo(pureMatterPurchaseId);
                mtscriteria.andSupplierEqualTo(suppliers2.get(0).getKey());
                mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.SIGN.getCode());
                List<MatterTenderSuppier> matterTenderSuppiers2 = matterTenderSuppierDao.selectByExample(mtsexample);
                if (matterTenderSuppiers2.size() == 0) {
                    MatterTenderSuppier matterTenderSuppier = new MatterTenderSuppier();
                    matterTenderSuppier.setUpdateTime(new Date());
                    matterTenderSuppier.setUpdateUser(getCurrentUserId());
                    matterTenderSuppier.setType(PurchaseSupplierTypeEnum.SIGN.getCode());
                    matterTenderSuppier.setTenderPurchaseId(pureMatterPurchaseId);
                    matterTenderSuppier.setSupplier(suppliers2.get(0).getKey());
                    matterTenderSuppierDao.insertSelective(matterTenderSuppier);
                    return Result.Success();
                } else {
                    return Result.Error(ResultCodeEnum.ERROR.getCode(), "已经签到");
                }


            }

        }
        return Result.Error(ResultCodeEnum.ERROR.getCode(), "签到错误");
    }

    /**
     * @param date1 日期1
     * @param date2 日期2
     * @return
     * @title: dateCompare
     * @description: 比较日期大小
     */
    public static int dateCompare1(Date date1, Date date2) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String dateFirst = dateFormat.format(date1);
        String dateLast = dateFormat.format(date2);
        int dateFirstIntVal = Integer.parseInt(dateFirst);
        int dateLastIntVal = Integer.parseInt(dateLast);
        if (dateFirstIntVal > dateLastIntVal) {
            return 1;
        } else if (dateFirstIntVal < dateLastIntVal) {
            return -1;
        }
        return 0;
    }

    /**
     * @param date1 日期1
     * @param date2 日期2
     * @return
     * @title: dateCompare
     * @description: 比较日期大小
     */
    public static int dateCompare(Date date1, Date date2) {
        long dateFirstIntVal = date1.getTime();
        long dateLastIntVal = date2.getTime();
        if (dateFirstIntVal > dateLastIntVal) {
            return 1;
        } else if (dateFirstIntVal < dateLastIntVal) {
            return -1;
        }
        return 0;
    }
}

package com.sanlly.purchase.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.activiti.TaskOutPut;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.purchase.dao.*;
import com.sanlly.purchase.entity.*;
import com.sanlly.purchase.enums.*;
import com.sanlly.purchase.models.input.MultiSelectInput;
import com.sanlly.purchase.models.input.feign.SearchModelInput;
import com.sanlly.purchase.models.input.inquiry.AddInquiryResultInput;
import com.sanlly.purchase.models.input.inquiry.AddMatterInquiryInput;
import com.sanlly.purchase.models.input.inquiry.AddReInquiryInput;
import com.sanlly.purchase.models.input.inquiry.SearchMatterInquiryInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderDetailInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderInput;
import com.sanlly.purchase.models.input.periodproduct.AddPeriodProductInput;
import com.sanlly.purchase.models.input.supplier.SearchPurcSupplierInput;
import com.sanlly.purchase.models.output.MatterDemand.MatterDemandOutput;
import com.sanlly.purchase.models.output.feign.SparePartsOutput;
import com.sanlly.purchase.models.output.feign.WareWarehouse;
import com.sanlly.purchase.models.output.matterbidding.MatterSupplierTenderDetailOutput;
import com.sanlly.purchase.models.output.matterbidding.MatterSupplierTenderOutput;
import com.sanlly.purchase.models.output.matterbidding.MatterSupplierTenderProductOutput;
import com.sanlly.purchase.models.output.matterbidding.SupplierTenderOutput;
import com.sanlly.purchase.models.output.matterinquiry.*;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.service.*;
import com.sanlly.purchase.service.feign.WareFeignClient;
import com.sanlly.purchase.service.feign.WorkFlowFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author jlx   
 * @version V1.0   
 * @Package com.sanlly.purchase.service.impl 
 * @Description: 询价采购实现类
 * @date 2019年8月24日 下午4:57:03 
 */
@Service
public class MatterInquiryServiceImpl extends BaseServiceImpl implements MatterInquiryService {

    // 询价采购
    @Autowired
    private MatterTenderPurchaseMapper matterTenderPurchaseDao;
    // 询价备件
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
    private MatterOrderService purchaseOrderService;
    @Autowired
    private MatterTenderService matterTenderService;
    @Autowired
    private InvoiceTypeService invoiceTypeService;
    @Autowired
    private WorkFlowFeignClient workflowFeignClient;

    /**
     * 询价采购分页列表
     */
    @Override
    public PagedList<MatterInquiryOutput> getMatterInquiryPagedList(SearchMatterInquiryInput input) {
        // 询价采购
        MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
        MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();

        // 询价备件
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 询价供应商
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
        // 询价仓库
        MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
        MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();
        //
        SupplierTenderProductExample productExample = new SupplierTenderProductExample();
        SupplierTenderProductExample.Criteria productCriteria = productExample.createCriteria();

        // 询价发布时间起止
        if (input.getTenderCreateTimeStart() != null && input.getTenderCreateTimeEnd() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(input.getTenderCreateTimeStart());
            criteria.andCreateTimeLessThanOrEqualTo(input.getTenderCreateTimeEnd());
        }
        // 采购单位
        if (StringUtils.isNotEmpty(input.getPurchaseCompany())) {
            criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
        }
        // 询价状态
        if (StringUtils.isNotEmpty(input.getTenderStatus())) {
            criteria.andTenderStatusEqualTo(input.getTenderStatus());
        }
        // 询价方式
        if (StringUtils.isNotEmpty(input.getTenderMethod())) {
            criteria.andTenderMethodEqualTo(input.getTenderMethod());
        }
        // 询价项目名称
        if (StringUtils.isNotEmpty(input.getTenderName())) {
            criteria.andTenderNameLike("%" + input.getTenderName() + "%");
        }

        // 是否周期性定价
        criteria.andIsPeriodEqualTo(input.getIsPeriod());
        // 是否日常采购
        criteria.andIsDayPruchaseEqualTo(CommonEnum.NO.getCode());
        // 询价
        criteria.andTenderTypeEqualTo(PurchasingPatternEnum.INQUIRY.getCode());
        criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
        example.setOrderByClause("create_time desc");
        // 总条数
        Integer totalItemCount = (int) matterTenderPurchaseDao.countByExample(example);
        // 分页查询
        PagedList<MatterInquiryOutput> pagedList = new PagedList<MatterInquiryOutput>(input.getPageIndex(),
                input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());

        List<MatterTenderPurchase> matterTenderList = matterTenderPurchaseDao.selectByExample(example);
        List<MatterInquiryOutput> mtOutputList = new ArrayList<MatterInquiryOutput>();
        for (MatterTenderPurchase mtp : matterTenderList) {
            MatterInquiryOutput mtOutput = new MatterInquiryOutput();
            BeanUtils.copyProperties(mtp, mtOutput);
            mtOutput.setInvoiceLangLang(mtp.getInvoice());
            mtOutput.setIsPeriodLangLang(mtp.getIsPeriod());
            mtOutput.setPurchaseCompanyLangLang(mtp.getPurchaseCompany());
            mtOutput.setSelectSupplierLangLang(mtp.getSelectSupplier());
            mtOutput.setTenderMethodLangLang(mtp.getTenderMethod());
            mtOutput.setTenderStatusLangLang(mtp.getTenderStatus());
            mtOutput.setTenderTypeLangLang(mtp.getTenderType());
            mtOutput.setAuditStatusLangLang(mtp.getAuditStatus());
            if (AuditStatusEnum.AUDIT.getCode().equals(mtp.getAuditStatus())) {
                JSONObject obj = new JSONObject();
                obj.put("processInstanceId", mtp.getProcessInstanceId());
                List<Map<String, Object>> lists = workflowFeignClient.getByProcessInstanceId(obj);
                if (lists.size() > 0) {
                    mtOutput.setAuditStatusDis("待" + lists.get(0).get("taskName").toString());
                }
            }

            // 需求申请人
            UserInfoOutput rs = authFigenClient.userDetail(mtp.getBuyerId()).getData();
            if (rs != null) {
                mtOutput.setStrBuyer(rs.getUserName());
            }
            productExample.clear();
            productCriteria = productExample.createCriteria();
            productCriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
            List<SupplierTenderProduct> offers = supplierTenderProductDao.selectByExample(productExample);
            if (offers.size() > 0) {
                mtOutput.setOffered("true");
            } else {
                mtOutput.setOffered("false");
            }
            List<SupplierTenderOutput> supplierTenderOutputs = supplierTenderExtDao.selectSupplierByTenderPurchaseId(mtp.getPurcMatterTenderPurchaseId());
            List<MatterInquirySupplierOutput> quoteSupplierList = new ArrayList<MatterInquirySupplierOutput>();

            for (SupplierTenderOutput mtSuppier : supplierTenderOutputs) {
                MatterInquirySupplierOutput mtso = new MatterInquirySupplierOutput();
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
            List<MatterInquirySupplierOutput> inviteSupplierList = new ArrayList<MatterInquirySupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsInviteList) {
                MatterInquirySupplierOutput mtso = new MatterInquirySupplierOutput();
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
            List<MatterInquirySupplierOutput> firstSupplierList = new ArrayList<MatterInquirySupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsFirstList) {
                MatterInquirySupplierOutput mtso = new MatterInquirySupplierOutput();
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
            List<MatterInquirySupplierOutput> signSupplierList = new ArrayList<MatterInquirySupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsSignList) {
                MatterInquirySupplierOutput mtso = new MatterInquirySupplierOutput();
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

            // 询价备件
            mtpexample.clear();
            mtpcriteria = mtpexample.createCriteria();
            mtpcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

            List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
            List<MatterInquiryProductOutput> productList = new ArrayList<MatterInquiryProductOutput>();
            // 采购备件数据组装
            for (MatterTenderProduct mtProduct : mtpList) {
                MatterInquiryProductOutput mtpo = new MatterInquiryProductOutput();
                BeanUtils.copyProperties(mtProduct, mtpo);
                mtpo.setWarehouseLangLang(mtProduct.getWarehouse());
                mtpo.setInvoiceLangLang(mtProduct.getInvoice());
                mtpo.setSelectSupplierLangLang(mtProduct.getSelectSupplier());
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
                    mtpo.setLastPrice(wareFeignClient.getLastEntryPrice(mtProduct.getProduct(), mtProduct.getWarehouse()).getData());
                }
                productList.add(mtpo);
            }
            mtOutput.setTenderProductOutputList(productList);

            // 询价仓库
            mtwexample.clear();
            mtwcriteria = mtwexample.createCriteria();
            mtwcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

            List<MatterTenderWarehouse> mtwList = matterTenderWarehouseDao.selectByExample(mtwexample);
            List<MatterInquiryWarehouseOutput> warehouseList = new ArrayList<MatterInquiryWarehouseOutput>();
            // 采购仓库数据组装
            for (MatterTenderWarehouse mtWarehouse : mtwList) {
                MatterInquiryWarehouseOutput mtwo = new MatterInquiryWarehouseOutput();
                WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(mtWarehouse.getWarehouse()).getData();

                if (warehouse != null) {
                    mtwo.setWarehouseAddress(warehouse.getWarehouseAddr());
                }
                // Result rsWarehouse =
                // wareFeignClient.getWarehouses(mtWarehouse.getWarehouse());
                //
                // if (rsWarehouse != null) {
                // Map<String, Object> map = (Map<String, Object>) rsWarehouse.getData();
                // mtwo.setWarehouseAddress(map.get("warehouseAddr").toString());
                // }
                mtwo.setWarehouse(mtWarehouse.getWarehouse());
                mtwo.setWarehouseLangLang(mtWarehouse.getWarehouse());
                warehouseList.add(mtwo);
            }
            mtOutput.setWarehouseOutputList(warehouseList);

            mtOutputList.add(mtOutput);
        }

        // 将分页数据放入结果中
        pagedList.getDataList().addAll(mtOutputList);
        return pagedList;
    }

    /**
     * 询价采购分页列表
     */
    @Override
    public PagedList<MatterInquiryOutput> getMatterAuditPagedList(SearchMatterInquiryInput input) {
        // 询价采购
        MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
        MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();

        // 询价备件
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 询价供应商
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
        // 询价仓库
        MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
        MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();

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
            // 符合审核条件的数据
            SearchModelInput smInput = new SearchModelInput();
            smInput.setCategory("采购审核");
            smInput.setName("采购审核");
            smInput.setLoginAccount(getCurrentUserAccount());
            List<TaskOutPut> taskOutPutList = workflowFeignClient.getMyAgencyTask(smInput);


            if (taskOutPutList != null && taskOutPutList.size() > 0) {
                for (TaskOutPut item : taskOutPutList) {
                    processInstanceIdList.add(item.getProcessInstanceId());
                    processMap.put(item.getProcessInstanceId(), item);
                }
            }
        }
        // 询价发布时间起止
        if (input.getTenderCreateTimeStart() != null && input.getTenderCreateTimeEnd() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(input.getTenderCreateTimeStart());
            criteria.andCreateTimeLessThanOrEqualTo(input.getTenderCreateTimeEnd());
        }
        // 采购单位
        if (StringUtils.isNotEmpty(input.getPurchaseCompany())) {
            criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
        }
        // 询价状态
        if (StringUtils.isNotEmpty(input.getTenderStatus())) {
            criteria.andTenderStatusEqualTo(input.getTenderStatus());
        }
        // 询价方式
        if (StringUtils.isNotEmpty(input.getTenderMethod())) {
            criteria.andTenderMethodEqualTo(input.getTenderMethod());
        }
        // 询价项目名称
        if (StringUtils.isNotEmpty(input.getTenderName())) {
            criteria.andTenderNameLike("%" + input.getTenderName() + "%");
        }
        // 是否日常采购
        criteria.andIsDayPruchaseEqualTo(CommonEnum.NO.getCode());
        criteria.andIsDelEqualTo(CommonEnum.NO.getCode());


        criteria.andProcessInstanceIdIn(processInstanceIdList);
        example.setOrderByClause("create_time desc");
        // 总条数
        Integer totalItemCount = (int) matterTenderPurchaseDao.countByExample(example);
        // 分页查询
        PagedList<MatterInquiryOutput> pagedList = new PagedList<MatterInquiryOutput>(input.getPageIndex(),
                input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());

        List<MatterTenderPurchase> matterTenderList = matterTenderPurchaseDao.selectByExample(example);
        List<MatterInquiryOutput> mtOutputList = new ArrayList<MatterInquiryOutput>();
        for (MatterTenderPurchase mtp : matterTenderList) {
            MatterInquiryOutput mtOutput = new MatterInquiryOutput();
            BeanUtils.copyProperties(mtp, mtOutput);
            mtOutput.setInvoiceLangLang(mtp.getInvoice());
            mtOutput.setIsPeriodLangLang(mtp.getIsPeriod());
            mtOutput.setPurchaseCompanyLangLang(mtp.getPurchaseCompany());
            mtOutput.setSelectSupplierLangLang(mtp.getSelectSupplier());
            mtOutput.setTenderMethodLangLang(mtp.getTenderMethod());
            mtOutput.setTenderStatusLangLang(mtp.getTenderStatus());
            mtOutput.setTenderTypeLangLang(mtp.getTenderType());
            if (AuditStatusEnum.AUDIT.getCode().equals(mtp.getAuditStatus())) {
                JSONObject obj = new JSONObject();
                obj.put("processInstanceId", mtp.getProcessInstanceId());
                List<Map<String, Object>> lists = workflowFeignClient.getByProcessInstanceId(obj);
                if (lists.size() > 0) {
                    mtOutput.setAuditStatusDis("待" + lists.get(0).get("taskName").toString());
                }
            }

            // 需求申请人
            UserInfoOutput rs = authFigenClient.userDetail(mtp.getBuyerId()).getData();
            if (rs != null) {
                mtOutput.setStrBuyer(rs.getUserName());
            }
            // 审核任务id
            if (!processMap.isEmpty()) {
                mtOutput.setTaskId(processMap.get(mtp.getProcessInstanceId()).getTaskId());

            }
            mtOutput.setProcessInstanceId(mtp.getProcessInstanceId());

            // 应邀供应商
            mtsexample.clear();
            mtscriteria = mtsexample.createCriteria();
            mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
            mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.INVITE.getCode());

            List<MatterTenderSuppier> mtsInviteList = matterTenderSuppierDao.selectByExample(mtsexample);
            List<MatterInquirySupplierOutput> inviteSupplierList = new ArrayList<MatterInquirySupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsInviteList) {
                MatterInquirySupplierOutput mtso = new MatterInquirySupplierOutput();
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
            List<MatterInquirySupplierOutput> firstSupplierList = new ArrayList<MatterInquirySupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsFirstList) {
                MatterInquirySupplierOutput mtso = new MatterInquirySupplierOutput();
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
            List<MatterInquirySupplierOutput> signSupplierList = new ArrayList<MatterInquirySupplierOutput>();
            // 应邀供应商数据组装
            for (MatterTenderSuppier mtSuppier : mtsSignList) {
                MatterInquirySupplierOutput mtso = new MatterInquirySupplierOutput();
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

            // 询价备件
            mtpexample.clear();
            mtpcriteria = mtpexample.createCriteria();
            mtpcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

            List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
            List<MatterInquiryProductOutput> productList = new ArrayList<MatterInquiryProductOutput>();
            // 采购备件数据组装
            for (MatterTenderProduct mtProduct : mtpList) {
                MatterInquiryProductOutput mtpo = new MatterInquiryProductOutput();
                BeanUtils.copyProperties(mtProduct, mtpo);
                mtpo.setWarehouseLangLang(mtProduct.getWarehouse());
                mtpo.setInvoiceLangLang(mtProduct.getInvoice());
                mtpo.setSelectSupplierLangLang(mtProduct.getSelectSupplier());
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
                    mtpo.setLastPrice(wareFeignClient.getLastEntryPrice(mtProduct.getProduct(), mtProduct.getWarehouse()).getData());
                }
                productList.add(mtpo);
            }
            mtOutput.setTenderProductOutputList(productList);

            // 询价仓库
            mtwexample.clear();
            mtwcriteria = mtwexample.createCriteria();
            mtwcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

            List<MatterTenderWarehouse> mtwList = matterTenderWarehouseDao.selectByExample(mtwexample);
            List<MatterInquiryWarehouseOutput> warehouseList = new ArrayList<MatterInquiryWarehouseOutput>();
            // 采购仓库数据组装
            for (MatterTenderWarehouse mtWarehouse : mtwList) {
                MatterInquiryWarehouseOutput mtwo = new MatterInquiryWarehouseOutput();
                WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(mtWarehouse.getWarehouse()).getData();

                if (warehouse != null) {
                    mtwo.setWarehouseAddress(warehouse.getWarehouseAddr());
                }
                // Result rsWarehouse =
                // wareFeignClient.getWarehouses(mtWarehouse.getWarehouse());
                //
                // if (rsWarehouse != null) {
                // Map<String, Object> map = (Map<String, Object>) rsWarehouse.getData();
                // mtwo.setWarehouseAddress(map.get("warehouseAddr").toString());
                // }
                mtwo.setWarehouse(mtWarehouse.getWarehouse());
                mtwo.setWarehouseLangLang(mtWarehouse.getWarehouse());
                warehouseList.add(mtwo);
            }
            mtOutput.setWarehouseOutputList(warehouseList);

            mtOutputList.add(mtOutput);
        }

        // 将分页数据放入结果中
        pagedList.getDataList().addAll(mtOutputList);
        return pagedList;
    }

    /**
     * 询价发布
     *
     * @throws Exception
     */
    @Transactional
    @Override
    public void addMatterInquiry(AddMatterInquiryInput input) throws Exception {

        List<String> secondSpecials = new ArrayList<>();
        List<String> supplierKeys = new ArrayList<>();
        // 0.判断备件是否已生成招采
        // 采购需求备件
        if (input.getPurcMatterTenderPurchaseId() == null) {
            List<Integer> demandIdList = new ArrayList<Integer>();
            for (MatterDemandOutput demand : input.getMatterDemandList()) {
                demandIdList.add(demand.getPurcMatterDemandId());
                // 非周期性定价的询价，需求数量必须大于0
                if (CommonEnum.NO.getCode().equals(input.getIsPeriod())
                        && (demand.getProductCount() == null || demand.getProductCount() == 0)) {
                    throw new RuntimeException("ProductCountError");
                }
            }
            MatterDemandExample mdExample = new MatterDemandExample();
            MatterDemandExample.Criteria mdCriteria = mdExample.createCriteria();
            mdCriteria.andPurcMatterDemandIdIn(demandIdList);
            mdCriteria.andIsCreateOrderEqualTo(PurchaseStatusEnum.CREATED.getCode());
            int count = (int) matterDemandDao.countByExample(mdExample);
            if (count > 0) {
                throw new RuntimeException("TenderExist");
            }
        }

        // 1.插入询价采购表
        MatterTenderPurchase record = new MatterTenderPurchase();
        BeanUtils.copyProperties(input, record);
        record.setIsDayPruchase(CommonEnum.NO.getCode());
        record.setTenderType(PurchasingPatternEnum.INQUIRY.getCode());
        record.setInquiryNum(1);
        record.setBuyerId(getCurrentUserId());
        record.setTenderEndTime(input.getTenderEndTime());
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

        if (CommonEnum.YES.getCode().equals(input.getIsPeriod())) {
            // 2.插入仓库表
            for (MultiSelectInput warehouse : input.getWarehouseInputs()) {
                MatterTenderWarehouse whRecord = new MatterTenderWarehouse();
                whRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
                whRecord.setWarehouse(warehouse.getValue());
                whRecord.setCreateTime(new Date());
                whRecord.setCreateUser(getCurrentUserId());
                matterTenderWarehouseDao.insertSelective(whRecord);
            }
        }

        // 3.插入询价备件表
        BigDecimal sum = new BigDecimal("0");
        for (MatterDemandOutput demand : input.getMatterDemandList()) {

            MatterTenderProduct pRecord = new MatterTenderProduct();
            BeanUtils.copyProperties(demand, pRecord);
            // 取得备件参考价格
            SparePartsOutput rsSparePart = wareFeignClient.getSparePart(demand.getProduct()).getData();
            if (rsSparePart != null) {
                pRecord.setLastPrice(wareFeignClient.getLastEntryPrice(demand.getProduct(), demand.getWarehouse()).getData());
                pRecord.setPurchasingReferencePrice(
                        rsSparePart.getPurchasingReferencePrice() == null ? new BigDecimal("0")
                                : rsSparePart.getPurchasingReferencePrice());
                sum = sum.add(pRecord.getPurchasingReferencePrice());
                secondSpecials.add(rsSparePart.getSparePartsCategoriesDetails());
            }
            pRecord.setDemandUserId(demand.getApplicantUserId());
            pRecord.setWeight(demand.getWeight());
            pRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
            pRecord.setDeliveryTime(demand.getRequireArriveTime());
            pRecord.setCreateTime(new Date());
            pRecord.setCreateUser(getCurrentUserId());
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
                supplierKeys.add(supplier);
            }
        } else {
            List<PurcSupplierOutput> suppliers = supplierService.getSupplierBySecondSpecial(secondSpecials.toArray(new String[secondSpecials.size()]), "", "");
            for (PurcSupplierOutput supplier : suppliers) {
                MatterTenderSuppier sRecord = new MatterTenderSuppier();
                sRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
                sRecord.setSupplier(supplier.getKey());
//				sRecord.setType(PurchaseSupplierTypeEnum.INVITE.getCode());
                sRecord.setCreateTime(new Date());
                sRecord.setCreateUser(getCurrentUserId());
                matterTenderSuppierDao.insertSelective(sRecord);
                supplierKeys.add(supplier.getKey());
            }
        }

        matterTenderService.sendMail(secondSpecials.toArray(new String[secondSpecials.size()]),
                supplierKeys.toArray(new String[supplierKeys.size()]),
                // input.getTenderContent(),
                "鑫三利集采平台发布询价采购，请登录查看。", input.getTenderName());
        // 6.更新需求表
        for (MatterDemandOutput mdOutput : input.getMatterDemandList()) {
            MatterDemand md = new MatterDemand();
            md.setPurcMatterDemandId(mdOutput.getPurcMatterDemandId());
            md.setIsCreateOrder(PurchaseStatusEnum.CREATED.getCode());
            md.setTenderType(PurchasingPatternEnum.INQUIRY.getCode());
            md.setUpdateTime(new Date());
            md.setUpdateUser(getCurrentUserId());
            matterDemandDao.updateByPrimaryKeySelective(md);
        }

    }

    /**
     * 重新询价发布
     *
     * @throws Exception
     */
    @Transactional
    @Override
    public void addMatterReInquiry(AddMatterInquiryInput input) throws Exception {

        List<String> secondSpecials = new ArrayList<>();
        List<String> supplierKeys = new ArrayList<>();
        // 0.判断备件是否已生成招采
        // 采购需求备件
        if (input.getPurcMatterTenderPurchaseId() == null) {
            List<Integer> demandIdList = new ArrayList<Integer>();
            for (MatterDemandOutput demand : input.getMatterDemandList()) {
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
        }

        // 1.插入询价采购表
        MatterTenderPurchase record = new MatterTenderPurchase();
        BeanUtils.copyProperties(input, record);
        record.setIsDayPruchase(CommonEnum.NO.getCode());
        record.setTenderType(PurchasingPatternEnum.INQUIRY.getCode());
        record.setInquiryNum(1);
        record.setBuyerId(getCurrentUserId());
        record.setTenderEndTime(input.getTenderEndTime());
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
        if (CommonEnum.YES.getCode().equals(input.getIsPeriod())) {
            // 2.插入仓库表
            for (MultiSelectInput warehouse : input.getWarehouseInputs()) {
                MatterTenderWarehouse whRecord = new MatterTenderWarehouse();
                whRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
                whRecord.setWarehouse(warehouse.getValue());
                whRecord.setCreateTime(new Date());
                whRecord.setCreateUser(getCurrentUserId());
                matterTenderWarehouseDao.insertSelective(whRecord);
            }
        }

        // 3.插入询价备件表
        BigDecimal sum = new BigDecimal("0");
        for (MatterDemandOutput demand : input.getMatterDemandList()) {

            MatterTenderProduct pRecord = new MatterTenderProduct();
            BeanUtils.copyProperties(demand, pRecord);
            // 取得备件参考价格
            SparePartsOutput rsSparePart = wareFeignClient.getSparePart(demand.getProduct()).getData();
            if (rsSparePart != null) {
                pRecord.setLastPrice(wareFeignClient.getLastEntryPrice(demand.getProduct(), demand.getWarehouse()).getData());
                pRecord.setPurchasingReferencePrice(
                        rsSparePart.getPurchasingReferencePrice() == null ? new BigDecimal("0")
                                : rsSparePart.getPurchasingReferencePrice());
                sum = sum.add(pRecord.getPurchasingReferencePrice());
                secondSpecials.add(rsSparePart.getSparePartsCategoriesDetails());
            }
            pRecord.setDemandUserId(demand.getApplicantUserId());
            pRecord.setWeight(demand.getWeight());
            pRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
            pRecord.setDeliveryTime(demand.getRequireArriveTime());
            pRecord.setCreateTime(new Date());
            pRecord.setCreateUser(getCurrentUserId());
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
                supplierKeys.add(supplier);
            }
        } else {
            List<PurcSupplierOutput> suppliers = supplierService.getSupplierBySecondSpecial(secondSpecials.toArray(new String[secondSpecials.size()]), "", "");
            for (PurcSupplierOutput supplier : suppliers) {
                MatterTenderSuppier sRecord = new MatterTenderSuppier();
                sRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
                sRecord.setSupplier(supplier.getKey());
//				sRecord.setType(PurchaseSupplierTypeEnum.INVITE.getCode());
                sRecord.setCreateTime(new Date());
                sRecord.setCreateUser(getCurrentUserId());
                matterTenderSuppierDao.insertSelective(sRecord);
                supplierKeys.add(supplier.getKey());
            }
        }
        matterTenderService.sendMail(secondSpecials.toArray(new String[secondSpecials.size()]),
                supplierKeys.toArray(new String[supplierKeys.size()]), "鑫三利集采平台发布询价采购，请登录查看。",
                input.getTenderName() + "重新询价");
        // 6.更新需求表
        for (MatterDemandOutput mdOutput : input.getMatterDemandList()) {
            MatterDemand md = new MatterDemand();
            md.setPurcMatterDemandId(mdOutput.getPurcMatterDemandId());
            md.setIsCreateOrder(PurchaseStatusEnum.CREATED.getCode());
            md.setTenderType(PurchasingPatternEnum.TENDER.getCode());
            md.setUpdateTime(new Date());
            md.setUpdateUser(getCurrentUserId());
            matterDemandDao.updateByPrimaryKeySelective(md);
        }

        MatterTenderPurchase mtpRecord = new MatterTenderPurchase();
        mtpRecord.setPurcMatterTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
        mtpRecord.setTenderStatus(TenderStatusEnum.CANCEL.getCode());
        mtpRecord.setReason("重新询价,新项目编号：" + input.getTenderId());
        matterTenderPurchaseDao.updateByPrimaryKeySelective(mtpRecord);

    }

    /**
     * 询价详情
     */
    @Override
    public MatterInquiryOutput gettMatterInquiryDetail(Integer purcMatterTenderPurchaseId) {

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

        MatterTenderPurchase mtp = matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseId);
        MatterInquiryOutput mtOutput = new MatterInquiryOutput();
        BeanUtils.copyProperties(mtp, mtOutput);
        mtOutput.setInvoiceLangLang(mtp.getInvoice());
        mtOutput.setIsPeriodLangLang(mtp.getIsPeriod());
        mtOutput.setPurchaseCompanyLangLang(mtp.getPurchaseCompany());
        mtOutput.setSelectSupplierLangLang(mtp.getSelectSupplier());
        mtOutput.setTenderMethodLangLang(mtp.getTenderMethod());
        mtOutput.setTenderStatusLangLang(mtp.getTenderStatus());
        mtOutput.setTenderTypeLangLang(mtp.getTenderType());

        // 需求申请人
        UserInfoOutput rs = authFigenClient.userDetail(mtp.getBuyerId()).getData();
        if (rs != null) {
            mtOutput.setStrBuyer(rs.getUserName());
        }

        // 1.应邀供应商
        mtsexample.clear();
        mtscriteria = mtsexample.createCriteria();
        mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
        mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.INVITE.getCode());

        List<MatterTenderSuppier> mtsInviteList = matterTenderSuppierDao.selectByExample(mtsexample);
        List<MatterInquirySupplierOutput> inviteSupplierList = new ArrayList<MatterInquirySupplierOutput>();
        // 应邀供应商数据组装
        for (MatterTenderSuppier mtSuppier : mtsInviteList) {
            MatterInquirySupplierOutput mtso = new MatterInquirySupplierOutput();
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
        // 2.初审供应商
        mtsexample.clear();
        mtscriteria = mtsexample.createCriteria();
        mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
        mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.FIRSTTRIAL.getCode());

        List<MatterTenderSuppier> mtsFirstList = matterTenderSuppierDao.selectByExample(mtsexample);
        List<MatterInquirySupplierOutput> firstSupplierList = new ArrayList<MatterInquirySupplierOutput>();
        // 应邀供应商数据组装
        for (MatterTenderSuppier mtSuppier : mtsFirstList) {
            MatterInquirySupplierOutput mtso = new MatterInquirySupplierOutput();
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
        // 3.签到供应商
        mtsexample.clear();
        mtscriteria = mtsexample.createCriteria();
        mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
        mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.SIGN.getCode());

        List<MatterTenderSuppier> mtsSignList = matterTenderSuppierDao.selectByExample(mtsexample);
        List<MatterInquirySupplierOutput> signSupplierList = new ArrayList<MatterInquirySupplierOutput>();
        // 应邀供应商数据组装
        for (MatterTenderSuppier mtSuppier : mtsSignList) {
            MatterInquirySupplierOutput mtso = new MatterInquirySupplierOutput();
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
        // 4.供应商报价排名列表

        // 招标备件
        mtpexample.clear();
        mtpcriteria = mtpexample.createCriteria();
        mtpcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

        List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
        List<MatterInquiryProductOutput> productList = new ArrayList<MatterInquiryProductOutput>();
        // 采购备件数据组装
        for (MatterTenderProduct mtProduct : mtpList) {
            MatterInquiryProductOutput mtpo = new MatterInquiryProductOutput();
            BeanUtils.copyProperties(mtProduct, mtpo);
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
                mtpo.setLastPrice(wareFeignClient.getLastEntryPrice(mtProduct.getProduct(), mtProduct.getWarehouse()).getData());
            }
            productList.add(mtpo);
        }
        mtOutput.setTenderProductOutputList(productList);

        // 招标仓库
        mtwexample.clear();
        mtwcriteria = mtwexample.createCriteria();
        mtwcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

        List<MatterTenderWarehouse> mtwList = matterTenderWarehouseDao.selectByExample(mtwexample);
        List<MatterInquiryWarehouseOutput> warehouseList = new ArrayList<MatterInquiryWarehouseOutput>();
        // 采购仓库数据组装
        for (MatterTenderWarehouse mtWarehouse : mtwList) {
            MatterInquiryWarehouseOutput mtwo = new MatterInquiryWarehouseOutput();
            // Result rsWarehouse =
            // wareFeignClient.getWarehouses(mtWarehouse.getWarehouse());
            //
            // if (rsWarehouse != null) {
            // Map<String, Object> map = (Map<String, Object>) rsWarehouse.getData();
            // mtwo.setWarehouseAddress(map.get("warehouseAddr").toString());
            // }
            WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(mtWarehouse.getWarehouse()).getData();

            if (warehouse != null) {
                mtwo.setWarehouseAddress(warehouse.getWarehouseAddr());
            }
            mtwo.setWarehouse(mtWarehouse.getWarehouse());
            mtwo.setWarehouseLangLang(mtWarehouse.getWarehouse());
            warehouseList.add(mtwo);
        }
        mtOutput.setWarehouseOutputList(warehouseList);

        return mtOutput;
    }

    /**
     * 重新询价
     */
    @Override
    public MatterReInquiryOutput getReMatterInquiry(Integer purcMatterTenderPurchaseId) {
        // 需求备件
        MatterDemandExample example = new MatterDemandExample();
        MatterDemandExample.Criteria criteria = example.createCriteria();
        // 招标备件
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 招标供应商
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
        // 招标仓库
        MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
        MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();

        MatterTenderPurchase mtp = matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseId);
        MatterReInquiryOutput mtOutput = new MatterReInquiryOutput();
        BeanUtils.copyProperties(mtp, mtOutput);
        mtOutput.setInvoiceLangLang(mtp.getInvoice());
        mtOutput.setIsPeriodLangLang(mtp.getIsPeriod());
        mtOutput.setPurchaseCompanyLangLang(mtp.getPurchaseCompany());
        mtOutput.setSelectSupplierLangLang(mtp.getSelectSupplier());
        mtOutput.setTenderMethodLangLang(mtp.getTenderMethod());
        mtOutput.setTenderStatusLangLang(mtp.getTenderStatus());
        mtOutput.setTenderTypeLangLang(mtp.getTenderType());

        // 需求申请人
        UserInfoOutput rs = authFigenClient.userDetail(mtp.getBuyerId()).getData();
        if (rs != null) {
            mtOutput.setStrBuyer(rs.getUserName());
        }

        // 1.应邀供应商
        mtsexample.clear();
        mtscriteria = mtsexample.createCriteria();
        mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
        mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.INVITE.getCode());

        List<MatterTenderSuppier> mtsInviteList = matterTenderSuppierDao.selectByExample(mtsexample);
        List<MatterInquirySupplierOutput> inviteSupplierList = new ArrayList<MatterInquirySupplierOutput>();
        // 应邀供应商数据组装
        for (MatterTenderSuppier mtSuppier : mtsInviteList) {
            MatterInquirySupplierOutput mtso = new MatterInquirySupplierOutput();
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

        // 招标备件
        mtpexample.clear();
        mtpcriteria = mtpexample.createCriteria();
        mtpcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
        // 取得招标备件
        List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
        List<String> demandNoList = mtpList.stream().map(MatterTenderProduct::getDemandNo).collect(Collectors.toList());
        // 取得相应的需求备件信息
        criteria.andDemandNoIn(demandNoList);
        List<MatterDemand> purcMatterDemandList = matterDemandDao.selectByExample(example);
        List<MatterDemandOutput> mdOutputList = new ArrayList<MatterDemandOutput>();
        BigDecimal sum = new BigDecimal("0");
        for (MatterDemand md : purcMatterDemandList) {

            MatterDemandOutput matterDemand = new MatterDemandOutput();
            BeanUtils.copyProperties(md, matterDemand);
            // 需求申请人
            UserInfoOutput user = authFigenClient.userDetail(md.getApplicantUserId()).getData();
            if (user != null) {
                matterDemand.setStrApplicantUser(user.getUserName());
            }
            // 仓库提交采购模式
            matterDemand.setPurchasingPatternLangLang(md.getPurchasingPattern());
            // 实际采购模式
            matterDemand.setTenderTypeLangLang(md.getTenderType());
            // 采购状态
            matterDemand.setIsCreateOrderLangLang(md.getIsCreateOrder());
            // 采购单位
            matterDemand.setPurchaseCompanyLangLang(md.getPurchaseCompany());
            // 备件大类
            matterDemand.setGenaralTypeLangLang(md.getGenaralType());
            // 备件明细
            matterDemand.setSecondType(md.getSecondType());
            matterDemand.setSecondTypeLangLang(md.getSecondType());
            // 仓库
            matterDemand.setWarehouseLangLang(md.getWarehouse());
            // 备件名称
            matterDemand.setProductLangLang(md.getProduct());

            SparePartsOutput rsSparePart = wareFeignClient.getSparePart(md.getProduct()).getData();
            if (rsSparePart != null) {
                matterDemand.setProductSpecial(rsSparePart.getSparePartsSpec());
                matterDemand.setProductModel(rsSparePart.getModel());
                matterDemand.setProductUnit(rsSparePart.getSparePartsUnit());
                matterDemand.setProductUnitLangLang(rsSparePart.getSparePartsUnit());
                matterDemand.setPurchasingReferencePrice(rsSparePart.getPurchasingReferencePrice());
                sum = sum.add(rsSparePart.getPurchasingReferencePrice() == null ? new BigDecimal("0")
                        : rsSparePart.getPurchasingReferencePrice());
            }
            mdOutputList.add(matterDemand);
        }

        for (MatterDemandOutput matterDemand : mdOutputList) {
            // 权重计算
            if (sum.compareTo(BigDecimal.ZERO) == 0) {
                matterDemand.setWeight(1d);
            } else if (matterDemand.getPurchasingReferencePrice().compareTo(BigDecimal.ZERO) == 0) {
                matterDemand.setWeight(1d);
            } else {
                matterDemand.setWeight(matterDemand.getPurchasingReferencePrice().divide(sum, 2).doubleValue());
            }
        }
        mtOutput.setDemandOutputList(mdOutputList);
        // 招标仓库
        mtwexample.clear();
        mtwcriteria = mtwexample.createCriteria();
        mtwcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

        List<MatterTenderWarehouse> mtwList = matterTenderWarehouseDao.selectByExample(mtwexample);
        List<MatterInquiryWarehouseOutput> warehouseList = new ArrayList<MatterInquiryWarehouseOutput>();
        // 采购仓库数据组装
        for (MatterTenderWarehouse mtWarehouse : mtwList) {
            MatterInquiryWarehouseOutput mtwo = new MatterInquiryWarehouseOutput();
            // Result rsWarehouse =
            // wareFeignClient.getWarehouses(mtWarehouse.getWarehouse());
            //
            // if (rsWarehouse != null) {
            // Map<String, Object> map = (Map<String, Object>) rsWarehouse.getData();
            // mtwo.setWarehouseAddress(map.get("warehouseAddr").toString());
            // }
            WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(mtWarehouse.getWarehouse()).getData();

            if (warehouse != null) {
                mtwo.setWarehouseAddress(warehouse.getWarehouseAddr());
            }
            mtwo.setWarehouse(mtWarehouse.getWarehouse());
            mtwo.setWarehouseLangLang(mtWarehouse.getWarehouse());
            warehouseList.add(mtwo);
        }
        mtOutput.setWarehouseOutputList(warehouseList);

        // 作废重新询价前的询价
        // MatterTenderPurchase record = new MatterTenderPurchase();
        // record.setPurcMatterTenderPurchaseId(purcMatterTenderPurchaseId);
        // record.setTenderStatus(TenderStatusEnum.CANCEL.getCode());
        // record.setReason("重新询价");
        // matterTenderPurchaseDao.updateByPrimaryKeySelective(record);

        return mtOutput;
    }

    /**
     * 取得报价信息
     */
    @Override
    public MatterSupplierTenderDetailOutput getSupplierTenderList(Integer purcMatterTenderPurchaseId) {
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

        // 1.取得供应商报价记录
        List<MatterSupplierTenderOutput> supplierTenderList = supplierTenderExtDao
                .selectByTenderPurchaseId(purcMatterTenderPurchaseId);
        // 供应商最终报价记录id集合
        List<Integer> supplierTenderIdList = supplierTenderList.stream()
                .map(MatterSupplierTenderOutput::getPurcSupplierTenderId).collect(Collectors.toList());
        // 2、取得供应商备件报价详细信息
        for (int j = 0; j < supplierTenderList.size(); j++) {
            MatterSupplierTenderOutput msto = supplierTenderList.get(j);
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
                mstpo.setInvoiceLangLang(stp.getInvoice());
                mstpo.setTotal(stp.getPrice().multiply(new BigDecimal(stp.getProductCount())));
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
                }
                // 取得供应商报价商品排名
                example.clear();
                criteria = example.createCriteria();
                criteria.andDemandNoEqualTo(stp.getDemandNo());
                criteria.andSupplierTenderIdIn(supplierTenderIdList);
                criteria.andTenderPurchaseIdEqualTo(msto.getTenderPurchaseId());
                example.setOrderByClause("no_tax_price");
                List<SupplierTenderProduct> productPriceList = supplierTenderProductDao.selectByExample(example);
                for (int i = 0; i < productPriceList.size(); i++) {
                    if (stp.getPurcSupplierTenderProductId()
                            .equals(productPriceList.get(i).getPurcSupplierTenderProductId())) {
                        mstpo.setRank(i + 1);
                    }
                }
                productOutputList.add(mstpo);
            }
            msto.setProductOutputList(productOutputList);

        }
        output.setSupplierTenderOutputList(supplierTenderList);
        return output;
    }

    /**
     * 取得周期性报价信息
     */
    @Override
    public MatterPeriodSupplierTenderDetailOutput getPeriodSupplierTenderList(Integer purcMatterTenderPurchaseId) {

        MatterTenderProductExample example = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria criteria = example.createCriteria();

        SupplierTenderProductExample stpExample = new SupplierTenderProductExample();
        SupplierTenderProductExample.Criteria stpCriteria = stpExample.createCriteria();

        // 取得报价信息
        // stCriteria.andTenderPurchaseIdEqualTo(purcMatterTenderPurchaseId);
        // List<SupplierTender> supplierTenders =
        // supplierTenderDao.selectByExample(stExample);
        List<MatterSupplierTenderOutput> supplierTenders = supplierTenderExtDao
                .selectByTenderPurchaseId(purcMatterTenderPurchaseId);
        Map<Integer, MatterSupplierTenderOutput> supplierTenderMap = supplierTenders.stream()
                .collect(Collectors.toMap(MatterSupplierTenderOutput::getPurcSupplierTenderId, a -> a));
        List<Integer> purcSupplierTenderIds = new ArrayList<>(supplierTenderMap.keySet());
        // 招标信息取得
        MatterTenderPurchase mtp = matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseId);
        MatterPeriodSupplierTenderDetailOutput output = new MatterPeriodSupplierTenderDetailOutput();
        BeanUtils.copyProperties(mtp, output);
        output.setIsPeriodLangLang(mtp.getIsPeriod());
        output.setPurchaseCompanyLangLang(mtp.getPurchaseCompany());
        output.setSelectSupplierLangLang(mtp.getSelectSupplier());
        output.setTenderMethodLangLang(mtp.getTenderMethod());
        output.setTenderStatusLangLang(mtp.getTenderStatus());
        output.setTenderTypeLangLang(mtp.getTenderType());
        // 取得招标备件信息
        criteria.andTenderPurchaseIdEqualTo(purcMatterTenderPurchaseId);
        List<MatterTenderProduct> tenderProducts = matterTenderProductDao.selectByExample(example);
        List<MatterPeriodProductOutput> periodProductOutputs = new ArrayList<>();
        for (MatterTenderProduct tenderProduct : tenderProducts) {
            MatterPeriodProductOutput mppo = new MatterPeriodProductOutput();
            mppo.setPurcMatterTenderProductId(tenderProduct.getPurcMatterTenderProductId());
            mppo.setDemandNo(tenderProduct.getDemandNo());
            mppo.setProduct(tenderProduct.getProduct());
            mppo.setRemark(tenderProduct.getComments());
            BeanUtils.copyProperties(tenderProduct, mppo);

            // 备件信息取得
            SparePartsOutput rsSparePart = wareFeignClient.getSparePart(tenderProduct.getProduct()).getData();
            if (rsSparePart != null) {
                mppo.setSparePartsNo(rsSparePart.getSparePartsNo());
                mppo.setProductLangLang(rsSparePart.getKey());
                mppo.setGenaralTypeLangLang(rsSparePart.getSparePartsCategories());
                mppo.setSecondType(rsSparePart.getSparePartsCategoriesDetails());
                mppo.setSecondTypeLangLang(rsSparePart.getSparePartsCategoriesDetails());
                mppo.setProductSpecial(rsSparePart.getSparePartsSpec());
                mppo.setProductModel(rsSparePart.getModel());
                mppo.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
            }
            // 供应商报价信息
            stpExample.clear();
            stpCriteria = stpExample.createCriteria();
            stpCriteria.andDemandNoEqualTo(tenderProduct.getDemandNo());
            stpCriteria.andSupplierTenderIdIn(purcSupplierTenderIds);
            List<SupplierTenderProduct> supplierTenderProducts = supplierTenderProductDao.selectByExample(stpExample);
            List<MatterPeriodSupplierTenderOutput> periodSupplierTenderOutputs = new ArrayList<>();
            for (SupplierTenderProduct stp : supplierTenderProducts) {
                MatterPeriodSupplierTenderOutput mpsto = new MatterPeriodSupplierTenderOutput();
                mpsto.setPrice(stp.getPrice());
                mpsto.setArriveTime(stp.getArriveTime());
                mpsto.setInvoice(stp.getInvoice());
                mpsto.setInvoiceLangLang(stp.getInvoice());
                mpsto.setInvoicePoint(invoiceTypeService.getInvoiceTypes(stp.getInvoice()));
                mpsto.setNoTaxPrice(mpsto.getPrice().multiply(new BigDecimal(1 - mpsto.getInvoicePoint())));
                // 调用供应商接口取得
                SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
                spsInput.setKey(supplierTenderMap.get(stp.getSupplierTenderId()).getSupplier());
                PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
                mpsto.setSupplier(spsInput.getKey());
                mpsto.setSupplierLangLang(spsInput.getKey());
                mpsto.setGrade(supplierOutput.getGrade());
                mpsto.setGradeLangLang(supplierOutput.getGrade());
                mpsto.setSettlementCycle(supplierOutput.getSettlementCycle());
                mpsto.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());

                periodSupplierTenderOutputs.add(mpsto);
            }
            periodSupplierTenderOutputs.sort(Comparator.comparing(MatterPeriodSupplierTenderOutput::getNoTaxPrice));

            for (int i = 0; i < periodSupplierTenderOutputs.size(); i++) {
                periodSupplierTenderOutputs.get(i).setRank(i + 1);
            }
            mppo.setSupplierTenderOutputList(periodSupplierTenderOutputs);
            // 设置默认排名第一的供应商为中标
            mppo.setSupplier(tenderProduct.getSelectSupplier());
            mppo.setSupplierLangLang(tenderProduct.getSelectSupplier());
            periodProductOutputs.add(mppo);

        }
        output.setPeriodProductOutputList(periodProductOutputs);
        return output;
    }

    /**
     * 询价结果处理
     */
    @Transactional
    @Override
    public void addInquiryResult(AddInquiryResultInput input) {
        // 采购表
        // MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
        // MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();
        // 招标仓库
        MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
        MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();
        // 招标备件
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 备件报价详情
        SupplierTenderProductExample stpexample = new SupplierTenderProductExample();
        SupplierTenderProductExample.Criteria stpcriteria = stpexample.createCriteria();
        // 采购需求
        MatterDemandExample mdexample = new MatterDemandExample();

        MatterTenderPurchase record = new MatterTenderPurchase();
        // 判断结果
        if (TenderStatusEnum.SUCCESS.getCode().equals(input.getTenderStatus())) {
            // 采纳供应商
            String selectSupplier = supplierTenderDao.selectByPrimaryKey(input.getPurcSupplierTenderId()).getSupplier();
            // 中标
            // 1、更新采购表
            record.setPurcMatterTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
            record.setSelectSupplier(selectSupplier);
            record.setInvoice(input.getInvoiceType());
            if (StringUtils.isEmpty(input.getReason())) {
                record.setTenderStatus(input.getTenderStatus());
            } else {
                // 0.发起审核流程
                JSONObject obj = new JSONObject();
                obj.put("key", "PurcAudit");

                JSONObject vars = new JSONObject();
                //发起人ID
                vars.put("userId", "admin");
                //公司key
                vars.put("companyKey", "sanlly");


                obj.put("vars", vars);
                String processInstanceId;
                try {
                    // 发起审核流程
                    processInstanceId = workflowFeignClient.startByKeyWithVars(obj);
                    if (processInstanceId == null) {
                        throw new RuntimeException("workflowError");
                    }
                    record.setProcessInstanceId(processInstanceId);
                    record.setAuditStatus(AuditStatusEnum.AUDIT.getCode());
                } catch (Exception e) {
                    throw new RuntimeException("workflowError");
                }

            }
            record.setUpdateTime(new Date());
            record.setUpdateUser(getCurrentUserId());
            record.setReason(input.getReason());
            matterTenderPurchaseDao.updateByPrimaryKeySelective(record);
            // 2、更新报价记录表
            SupplierTender stRecord = new SupplierTender();
            stRecord.setPurcSupplierTenderId(input.getPurcSupplierTenderId());
            stRecord.setStatus(TenderStatusEnum.SUCCESS.getCode());
            stRecord.setUpdateTime(new Date());
            stRecord.setUpdateUser(getCurrentUserId());
            supplierTenderDao.updateByPrimaryKeySelective(stRecord);
            // 3、如果是周期性定价插入周期性定价表
//			MatterTenderPurchase matterTenderPurchase = matterTenderPurchaseDao
//					.selectByPrimaryKey(input.getPurcMatterTenderPurchaseId());

            // 取得招标备件
            mtpcriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
            List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
            // 取得招标仓库
//			mtwcriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
//			List<MatterTenderWarehouse> mtwList = matterTenderWarehouseDao.selectByExample(mtwexample);
            // 备件报价详情
            stpcriteria.andSupplierTenderIdEqualTo(input.getPurcSupplierTenderId());
            List<SupplierTenderProduct> stpList = supplierTenderProductDao.selectByExample(stpexample);

            Map<String, BigDecimal> stpMap = new HashMap<String, BigDecimal>();
            for (SupplierTenderProduct stp : stpList) {
                stpMap.put(stp.getDemandNo(), stp.getPrice());
            }
//			if (CommonEnum.YES.getCode().equals(matterTenderPurchase.getIsPeriod())) {
//				for (MatterTenderProduct product : mtpList) {
//					for (MatterTenderWarehouse warehouse : mtwList) {
//
//						AddPeriodProductInput periodInput = new AddPeriodProductInput();
//						periodInput.setDemandNo(product.getDemandNo());
//						periodInput.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
//						periodInput.setProduct(product.getProduct());
//						periodInput.setPurchaseCompany(matterTenderPurchase.getPurchaseCompany());
//						periodInput.setWarehouse(warehouse.getWarehouse());
//						periodInput.setProductPrice(stpMap.get(product.getProduct()));
//						periodInput.setInvoice(stpList.get(0).getInvoice());
//						periodInput.setSupplier(selectSupplier);
//						periodInput.setTenderType(PurchasingPatternEnum.INQUIRY.getCode());
//						periodInput.setEndTime(matterTenderPurchase.getSupplyEndTime());
//						// 备件信息
//						SparePartsOutput rsSparePart = wareFeignClient.getSparePart(product.getProduct()).getData();
//						if (rsSparePart != null) {
//							periodInput.setProductNum(rsSparePart.getSparePartsNo());
//							periodInput.setProductUnit(rsSparePart.getSparePartsUnit());
//						}
//						periodInput.setComments(product.getComments());
//						periodProductService.addPeriodProduct(periodInput);
//					}
//					MatterTenderProduct productRecord = new MatterTenderProduct();
//					productRecord.setPrice(stpMap.get(product.getProduct()));
//					productRecord.setInvoice(stpList.get(0).getInvoice());
//					productRecord.setPurcMatterTenderProductId(product.getPurcMatterTenderProductId());
//					matterTenderProductDao.updateByPrimaryKeySelective(productRecord);
//				}
//
//			} else {
            // 更新竞价备件中标单价
            for (MatterTenderProduct product : mtpList) {
                MatterTenderProduct productRecord = new MatterTenderProduct();
                productRecord.setPrice(stpMap.get(product.getDemandNo()));
                productRecord.setInvoice(stpList.get(0).getInvoice());
                productRecord.setPurcMatterTenderProductId(product.getPurcMatterTenderProductId());
                matterTenderProductDao.updateByPrimaryKeySelective(productRecord);
            }
            // 4、如果不是周期性定价往订单表插入一条数据
            // 生成订单
            if (StringUtils.isEmpty(input.getReason())) {
                MatterTenderPurchase purchase = matterTenderPurchaseDao
                        .selectByPrimaryKey(input.getPurcMatterTenderPurchaseId());
                createOrder(purchase);
            }
//			}
        } else {
            // 更新采购表
            record.setPurcMatterTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
            record.setTenderStatus(input.getTenderStatus());
            record.setReason(input.getReason());
            matterTenderPurchaseDao.updateByPrimaryKeySelective(record);

            // 更新需求的采购状态
            mtpexample.clear();
            MatterTenderProductExample.Criteria productCriteria = mtpexample.createCriteria();
            productCriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
            List<MatterTenderProduct> productList = matterTenderProductDao.selectByExample(mtpexample);

            for (MatterTenderProduct product : productList) {
                mdexample.clear();
                MatterDemandExample.Criteria mdCriteria = mdexample.createCriteria();
                mdCriteria.andDemandNoEqualTo(product.getDemandNo());
                MatterDemand md = new MatterDemand();
                // 将采购需求状态改回未采购
                md.setIsCreateOrder(PurchaseStatusEnum.UNCREATED.getCode());
                md.setTenderType("");
                matterDemandDao.updateByExampleSelective(md, mdexample);
            }

        }

    }

    /**
     * 周期性询价结果处理
     */
    @Transactional
    @Override
    public void addPeriodInquiryResult(MatterPeriodSupplierTenderDetailOutput input) {
        boolean isAudit = false;
        // 招标仓库
        MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
        MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();
        // 招标备件
        MatterTenderProductExample mtpexample = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
        // 采购需求
        MatterDemandExample mdexample = new MatterDemandExample();

        MatterTenderPurchase record = new MatterTenderPurchase();
        // 判断结果
        if (TenderStatusEnum.SUCCESS.getCode().equals(input.getTenderStatus())) {
            // 中标
            // 1、更新采购表
            record.setPurcMatterTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
            record.setUpdateTime(new Date());
            record.setUpdateUser(getCurrentUserId());
            // 3、如果是周期性定价插入周期性定价表
            MatterTenderPurchase matterTenderPurchase = matterTenderPurchaseDao
                    .selectByPrimaryKey(input.getPurcMatterTenderPurchaseId());

            // 取得招标仓库
            mtwcriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
            List<MatterTenderWarehouse> mtwList = matterTenderWarehouseDao.selectByExample(mtwexample);

            for (MatterPeriodProductOutput product : input.getPeriodProductOutputList()) {
/*
                for (MatterTenderWarehouse warehouse : mtwList) {
                    AddPeriodProductInput periodInput = new AddPeriodProductInput();
                    periodInput.setDemandNo(product.getDemandNo());
                    periodInput.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
                    periodInput.setProduct(product.getProduct());
                    periodInput.setPurchaseCompany(matterTenderPurchase.getPurchaseCompany());
                    periodInput.setWarehouse(warehouse.getWarehouse());
                    periodInput.setProductPrice(product.getSupplierTenderOutputList().get(0).getPrice());
                    periodInput.setInvoice(product.getSupplierTenderOutputList().get(0).getInvoice());
                    periodInput.setSupplier(product.getSupplierTenderOutputList().get(0).getSupplier());
                    periodInput.setTenderType(PurchasingPatternEnum.INQUIRY.getCode());
                    periodInput.setEndTime(matterTenderPurchase.getSupplyEndTime());
                    // 备件信息
                    SparePartsOutput rsSparePart = wareFeignClient.getSparePart(product.getProduct()).getData();
                    if (rsSparePart != null) {
                        periodInput.setProductNum(rsSparePart.getSparePartsNo());
                        periodInput.setProductUnit(rsSparePart.getSparePartsUnit());
                    }
                    periodInput.setComments(product.getRemark());
                    periodProductService.addPeriodProduct(periodInput);
                }
*/
                MatterTenderProduct productRecord = new MatterTenderProduct();
                BigDecimal price = new BigDecimal("0");
                String supplier = "";
                String invoice = "";
                for (int i = 0; i < product.getSupplierTenderOutputList().size(); i++) {
                    MatterPeriodSupplierTenderOutput matterPeriodSupplierTenderOutput = product.getSupplierTenderOutputList().get(i);
                    int j = 0;
                    if (product.getSupplier().equals(matterPeriodSupplierTenderOutput.getSupplier())) {
                        invoice = matterPeriodSupplierTenderOutput.getInvoice();
                        price = matterPeriodSupplierTenderOutput.getPrice();
                        supplier = product.getSupplier();
                        if (i > 0 && j == 0) {
                            isAudit = true;
                            j++;
                        }else if (i==0){
                            product.setReason("推荐供应商");
                        }
                    }

                    if (StringUtils.isNotBlank(product.getReason())) {
                        productRecord.setReason(product.getReason());
                    }
                    productRecord.setPrice(price);
                    productRecord.setInvoice(invoice);
                    productRecord.setPurcMatterTenderProductId(product.getPurcMatterTenderProductId());
                    productRecord.setSelectSupplier(supplier);
                    matterTenderProductDao.updateByPrimaryKeySelective(productRecord);
                }
            }
            if (isAudit) {
// 0.发起审核流程
                JSONObject obj = new JSONObject();
                obj.put("key", "PurcAudit");

                JSONObject vars = new JSONObject();
                //发起人ID
                vars.put("userId", "admin");
                //公司key
                vars.put("companyKey", "sanlly");


                obj.put("vars", vars);
                String processInstanceId;
                try {
                    // 发起审核流程
                    processInstanceId = workflowFeignClient.startByKeyWithVars(obj);
                    if (processInstanceId == null) {
                        throw new RuntimeException("workflowError");
                    }
                    record.setProcessInstanceId(processInstanceId);
                    record.setAuditStatus(AuditStatusEnum.AUDIT.getCode());
                } catch (Exception e) {
                    throw new RuntimeException("workflowError");
                }
                record.setTenderStatus(TenderStatusEnum.SUCCESS.getCode());
            } else {

                for (MatterPeriodProductOutput product : input.getPeriodProductOutputList()) {
                    for (MatterTenderWarehouse warehouse : mtwList) {
                        AddPeriodProductInput periodInput = new AddPeriodProductInput();
                        periodInput.setDemandNo(product.getDemandNo());
                        periodInput.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
                        periodInput.setProduct(product.getProduct());
                        periodInput.setPurchaseCompany(matterTenderPurchase.getPurchaseCompany());
                        periodInput.setWarehouse(warehouse.getWarehouse());
                        periodInput.setProductPrice(product.getSupplierTenderOutputList().get(0).getPrice());
                        periodInput.setInvoice(product.getSupplierTenderOutputList().get(0).getInvoice());
                        periodInput.setSupplier(product.getSupplierTenderOutputList().get(0).getSupplier());
                        periodInput.setTenderType(PurchasingPatternEnum.INQUIRY.getCode());
                        periodInput.setEndTime(matterTenderPurchase.getSupplyEndTime());
                        // 备件信息
                        SparePartsOutput rsSparePart = wareFeignClient.getSparePart(product.getProduct()).getData();
                        if (rsSparePart != null) {
                            periodInput.setProductNum(rsSparePart.getSparePartsNo());
                            periodInput.setProductUnit(rsSparePart.getSparePartsUnit());
                        }
                        periodInput.setComments(product.getRemark());
                        periodProductService.addPeriodProduct(periodInput);
                    }
                }
                record.setTenderStatus(TenderStatusEnum.SUCCESS.getCode());
            }
            matterTenderPurchaseDao.updateByPrimaryKeySelective(record);


        } else {
            // 更新采购表
            record.setPurcMatterTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
            record.setTenderStatus(input.getTenderStatus());
            record.setReason(input.getReason());
            matterTenderPurchaseDao.updateByPrimaryKeySelective(record);

            // 更新需求的采购状态
            mtpcriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
            List<MatterTenderProduct> productList = matterTenderProductDao.selectByExample(mtpexample);

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


    /**
     * 再次询价
     *
     * @throws Exception
     */
    @Override
    public void addReInquiry(AddReInquiryInput input) throws Exception {
        List<String> secondSpecials = new ArrayList<>();
        List<String> supplierKeys = new ArrayList<>();

        // 取得招标信息
        MatterTenderPurchase matterTenderPurchase = matterTenderPurchaseDao
                .selectByPrimaryKey(input.getPurcMatterTenderPurchaseId());

        MatterTenderPurchase record = new MatterTenderPurchase();
        record.setTenderEndTime(input.getTenderEndTime());
        record.setPurcMatterTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
        record.setInquiryNum(matterTenderPurchase.getInquiryNum() + 1);
        matterTenderPurchaseDao.updateByPrimaryKeySelective(record);

        // 询价供应商
        MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
        MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
        mtscriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
        List<MatterTenderSuppier> suppliers = matterTenderSuppierDao.selectByExample(mtsexample);
        if (suppliers.size() > 0) {
            for (MatterTenderSuppier supplier : suppliers) {
                supplierKeys.add(supplier.getSupplier());
            }
        } else {
            // 询价备件
            MatterTenderProductExample mtpexample = new MatterTenderProductExample();
            MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
            mtpcriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
            List<MatterTenderProduct> products = matterTenderProductDao.selectByExample(mtpexample);
            for (MatterTenderProduct product : products) {
                SparePartsOutput rsSparePart = wareFeignClient.getSparePart(product.getProduct()).getData();
                if (rsSparePart != null) {
                    secondSpecials.add(rsSparePart.getSparePartsCategoriesDetails());
                }
            }
        }
        // 向相关供应商发送邮件
        matterTenderService.sendMail(secondSpecials.toArray(new String[secondSpecials.size()]),
                supplierKeys.toArray(new String[supplierKeys.size()]), "鑫三利集采平台发布询价采购截止时间延长，请登录查看。",
                matterTenderPurchase.getTenderName());

    }

    /**
     * 采购单审核通过生成订单
     *
     * @param purcMatterTemporaryPurchaseId
     * @return
     */
    private void createOrder(MatterTenderPurchase matterTenderPurchase) {
        // 调用订单接口向订单表插入数据
        MatterTenderProductExample example = new MatterTenderProductExample();
        MatterTenderProductExample.Criteria criteria = example.createCriteria();
        criteria.andTenderPurchaseIdEqualTo(matterTenderPurchase.getPurcMatterTenderPurchaseId());
        List<MatterTenderProduct> products = matterTenderProductDao.selectByExample(example);
        List<MatterTenderProduct> wareHouses = products.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(
                                () -> new TreeSet<>(Comparator.comparing(MatterTenderProduct::getWarehouse))),
                        ArrayList::new));
        for (MatterTenderProduct wareHouse : wareHouses) {
            // 组装采购订单
            AddPurchaseOrderInput input = new AddPurchaseOrderInput();
            input.setPurchaseCompany(matterTenderPurchase.getPurchaseCompany());
            input.setPurchaseWare(wareHouse.getWarehouse());
            input.setPurchaseType(matterTenderPurchase.getTenderType());
            input.setPurchaseUserId(matterTenderPurchase.getCreateUser());
            input.setSupplier(matterTenderPurchase.getSelectSupplier());
            input.setPurchaseTime(matterTenderPurchase.getCreateTime());
            input.setInvoice(products.get(0).getInvoice());
            // 组装采购商品详情数据
            List<AddPurchaseOrderDetailInput> details = new ArrayList<>();
            for (MatterTenderProduct product : products) {
                if (wareHouse.getWarehouse().equals(product.getWarehouse())) {
                    AddPurchaseOrderDetailInput detail = new AddPurchaseOrderDetailInput();
                    detail.setDemandNo(product.getDemandNo());
                    detail.setProduct(product.getProduct());
                    detail.setOrderNum(product.getProductCount());
                    detail.setUnitPrice(product.getPrice());
                    detail.setComments(product.getComments());
                    detail.setRequiredDeliveryDate(product.getDeliveryTime());
                    details.add(detail);
                }
            }
            input.setDetails(details);
            purchaseOrderService.addPurchaseOrder(input);
        }
    }

    @Override
    public void auditMatterPurchase(Integer[] purcMatterTenderPurchaseIds, String[] processInstanceIds,
                                    String[] taskIds) {

        MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
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
                MatterTenderPurchase record = new MatterTenderPurchase();
                record.setPurcMatterTenderPurchaseId(purcMatterTenderPurchaseIds[i]);
                record.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
                record.setTenderStatus(TenderStatusEnum.SUCCESS.getCode());
//				MatterTenderPurchase matterTenderPurchase =matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseIds[i]);
//				if(matterTenderPurchase.getCreateUser()==null) {
//					record.setCreateUser(getCurrentUserId());
//				}
                record.setUpdateTime(new Date());
                record.setUpdateUser(getCurrentUserId());

                matterTenderPurchaseDao.updateByPrimaryKeySelective(record);
                MatterTenderPurchase purchase = matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseIds[i]);
                if (CommonEnum.YES.getCode().equals(purchase.getIsPeriod())) {
                    MatterTenderProductExample matterTenderProductExample = new MatterTenderProductExample();
                    matterTenderProductExample.createCriteria().andTenderPurchaseIdEqualTo(purchase.getPurcMatterTenderPurchaseId());
                    List<MatterTenderProduct> matterTenderProducts = matterTenderProductDao.selectByExample(matterTenderProductExample);
                    // 取得招标仓库
                    MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
                    MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();
                    mtwcriteria.andTenderPurchaseIdEqualTo(purchase.getPurcMatterTenderPurchaseId());
                    List<MatterTenderWarehouse> mtwList = matterTenderWarehouseDao.selectByExample(mtwexample);

                    for (MatterTenderProduct product : matterTenderProducts) {
                        for (MatterTenderWarehouse warehouse : mtwList) {
                            AddPeriodProductInput periodInput = new AddPeriodProductInput();
                            periodInput.setDemandNo(product.getDemandNo());
                            periodInput.setTenderPurchaseId(purchase.getPurcMatterTenderPurchaseId());
                            periodInput.setProduct(product.getProduct());
                            periodInput.setPurchaseCompany(purchase.getPurchaseCompany());
                            periodInput.setWarehouse(warehouse.getWarehouse());
                            periodInput.setProductPrice(product.getPrice());
                            periodInput.setInvoice(product.getInvoice());
                            periodInput.setSupplier(product.getSelectSupplier());
                            periodInput.setTenderType(purchase.getTenderType());
                            periodInput.setEndTime(purchase.getSupplyEndTime());
                            // 备件信息
                            SparePartsOutput rsSparePart = wareFeignClient.getSparePart(product.getProduct()).getData();
                            if (rsSparePart != null) {
                                periodInput.setProductNum(rsSparePart.getSparePartsNo());
                                periodInput.setProductUnit(rsSparePart.getSparePartsUnit());
                            }
                            periodInput.setComments(product.getComments());
                            periodProductService.addPeriodProduct(periodInput);
                        }
                    }
                } else {
                    // 生成采购单

                    createOrder(purchase);
                }

            } else {
                example.clear();
//				 更新审核状态
                MatterTenderPurchase record = new MatterTenderPurchase();
                record.setUpdateTime(new Date());
                record.setUpdateUser(getCurrentUserId());
                record.setPurcMatterTenderPurchaseId(purcMatterTenderPurchaseIds[i]);
                record.setAuditStatus(AuditStatusEnum.AUDIT.getCode());
                matterTenderPurchaseDao.updateByPrimaryKeySelective(record);

            }
        }

    }

    @Override
    public void rejectMatterPurchase(Integer[] purcMatterTenderPurchaseIds, String[] processInstanceIds,
                                     String[] taskIds) {
        for (int i = 0; i < processInstanceIds.length; i++) {
            Result rs = workflowFeignClient.removeProcessByProcessId(processInstanceIds[i]);
//
//			example.clear();
//			MatterTemporaryPurchaseExample.Criteria criteria = example.createCriteria();
            // 更新审核状态
            MatterTenderPurchase record = new MatterTenderPurchase();
            record.setPurcMatterTenderPurchaseId(purcMatterTenderPurchaseIds[i]);
            record.setAuditStatus(AuditStatusEnum.AUDITREJECT.getCode());
            record.setTenderStatus(TenderStatusEnum.ING.getCode());
            matterTenderPurchaseDao.updateByPrimaryKeySelective(record);
            MatterTenderPurchase matterTenderPurchase=matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseIds[i]);
            SupplierTenderExample supplierTenderExample =new SupplierTenderExample();
            supplierTenderExample.createCriteria().andTenderIdEqualTo(matterTenderPurchase.getTenderId());
            SupplierTender supplierTender = new SupplierTender();
            supplierTender.setStatus("");
            supplierTenderDao.updateByExampleSelective(supplierTender,supplierTenderExample);
        }

    }

}

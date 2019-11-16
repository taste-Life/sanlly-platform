package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.dao.WareInternalProcurementDetailMapper;
import com.sanlly.warehouse.dao.WareInternalProcurementMapper;
import com.sanlly.warehouse.entity.WareInternalProcurement;
import com.sanlly.warehouse.entity.WareInternalProcurementDetail;
import com.sanlly.warehouse.entity.WareInternalProcurementDetailExample;
import com.sanlly.warehouse.entity.WareInternalProcurementExample;
import com.sanlly.warehouse.enums.ChargeStatus;
import com.sanlly.warehouse.enums.OutStatusEnum;
import com.sanlly.warehouse.models.input.interiorSale.*;
import com.sanlly.warehouse.models.input.purchaseOrder.AddPurchaseOrderDetailInput;
import com.sanlly.warehouse.models.input.purchaseOrder.AddPurchaseOrderInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.output.interiorSale.InteriorSaleDetailOutput;
import com.sanlly.warehouse.models.output.interiorSale.InteriorSaleOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import com.sanlly.warehouse.service.*;
import com.sanlly.warehouse.service.feign.AuthFeignClient;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * ClassName: WareInteriorSaleServiceImpl
 * Description: 内部销售服务层实现
 * date: 2019/8/22 14:13
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareInteriorSaleServiceImpl extends BaseServiceImpl implements WareInteriorSaleService {

    @Autowired
    private WareInternalProcurementMapper interiorMapper;

    @Autowired
    private WareInternalProcurementDetailMapper interiorDeatilMapper;

    @Autowired
    private BillTypeService billTypeService;

    @Autowired
    private WareSparePartsService sparePartsService;

    @Autowired
    private WareStockService stockService;

    @Autowired
    private WarePurchaseOrderService purchaseOrderService;

    @Autowired
    private AuthFeignClient authFeignClient;

    /**
     * 分页查询内部销售单
     * @param input
     * @return
     */
    @Override
    public PagedList<InteriorSaleOutput> getPageList(SearchInteriorSaleInput input) {
        WareInternalProcurementExample example = new WareInternalProcurementExample();
        WareInternalProcurementExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        example.setOrderByClause("create_time desc");
        if(input.getPurchasingOrderNo()!=null && input.getPurchasingOrderNo()!=""){
            criteria.andPurchasingOrderNoLike("%"+input.getPurchasingOrderNo()+"%");
        }
        if(input.getBillType() != null && input.getBillType() !=""){
            criteria.andBillTypeEqualTo(input.getBillType());
        }
        if(input.getAuditStatus()!=null && input.getAuditStatus() != ""){
            criteria.andAuditStatusEqualTo(input.getAuditStatus());
        }
        if(input.getIntWarehouse()!=null && input.getIntWarehouse()!=""){
            criteria.andIntWarehouseEqualTo(input.getIntWarehouse());
        }
        if(input.getOutWarehouse()!=null && input.getOutWarehouse()!=""){
            criteria.andOutWarehouseEqualTo(input.getOutWarehouse());
        }
        if(input.getStartDate()!=null && input.getEndDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),input.getEndDate());
        }else if(input.getStartDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),new Date());
        }else if(input.getEndDate()!=null){
            criteria.andCreateTimeBetween(new Date(0),input.getEndDate());
        }

        //查询页数
        Integer totalItemCount =(int) interiorMapper.countByExample(example);
        PagedList<InteriorSaleOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        //组装返回数据
        List<WareInternalProcurement> list = interiorMapper.selectByExample(example);
        List<InteriorSaleOutput> outputs = new ArrayList<>();
        for (WareInternalProcurement procurement : list) {
            InteriorSaleOutput output = new InteriorSaleOutput();
            BeanUtils.copyProperties(procurement,output);
            output.setCompanyLangLang(procurement.getCompany());
            output.setStatusLangLang(procurement.getStatus());
            if(procurement.getApplicantUser() != null){
                UserInfoOutput data = authFeignClient.getUserInfo(procurement.getApplicantUser()).getData();
                if(data != null){
                    output.setApplicantUserStr(data.getUserName());
                }
            }
            output.setAuditStatusLangLang(procurement.getAuditStatus());
            output.setChargeStatusLangLang(procurement.getChargeStatus());
            output.setIntWarehouseLangLang(procurement.getIntWarehouse());
            output.setOutWarehouseLangLang(procurement.getOutWarehouse());
            if(procurement.getReceivingUser() != null && procurement.getReceivingUser() != "" ){
                UserInfoOutput data = authFeignClient.getUserInfo(Integer.parseInt(procurement.getReceivingUser())).getData();
                if(data != null){
                    output.setReceivingUserStr(data.getUserName());
                }
            }

            output.setApplicantDate(DateUtil.date2String(procurement.getApplicantDate()));
            output.setDetailOutput(getDetail(procurement.getWareInternalProcurementId()));
            outputs.add(output);
        }
        pagedList.getDataList().addAll(outputs);
        return pagedList;
    }

    /**
     * 新增内部销售单
     * @param input
     */
    @Override
    @Transactional
    public void add(AddInteriorSaleInput input) {
        WareInternalProcurement procurement = new WareInternalProcurement();
        BeanUtils.copyProperties(input,procurement);
        procurement.setCompany(getCurrentCompanyKey());
        procurement.setReceivingUser(input.getReceivingUser());
        procurement.setCreateTime(new Date());
        procurement.setIsDel(PlatformConstants.ISDEL_NO);
        procurement.setCreateUser(getCurrentUserId());
        procurement.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
        procurement.setChargeStatus(ChargeStatus.NO.getCode());
        procurement.setApplicantUser(getCurrentUserId());
        procurement.setApplicantDate(new Date());
        procurement.setPurchasingOrderNo(billTypeService.getBillNumberByKey(input.getBillType()));
        procurement.setStatus(OutStatusEnum.NO.getCode());
        interiorMapper.insert(procurement);
        for (AddInteriorSaleDetailInput detailInput : input.getInteriordetail()) {
            WareInternalProcurementDetail detail = new WareInternalProcurementDetail();
            BeanUtils.copyProperties(detailInput,detail);
            detail.setCreateTime(new Date());
            detail.setCreateUser(getCurrentUserId());
            detail.setCompany(getCurrentCompanyKey());
            detail.setOutWarehouse(detailInput.getOutWarehouse());
            detail.setIsDel(PlatformConstants.ISDEL_NO);
            detail.setWareInternalProcurement(procurement.getWareInternalProcurementId());
            interiorDeatilMapper.insert(detail);
        }

    }

    /**
     * 审核内部销售单
     * @param interiorSaleInput
     */
    @Override
    @Transactional
    public void auditPass(EditInteriorSaleInput interiorSaleInput) {
        WareInternalProcurementExample example = new WareInternalProcurementExample();
        WareInternalProcurementExample.Criteria criteria = example.createCriteria();
        WareInternalProcurement procurement = interiorMapper.selectByPrimaryKey(interiorSaleInput.getWareInternalProcurementId());
        if(!AuditStateEnum.UNAUDIT.getCode().equals(procurement.getAuditStatus())){
            throw new RuntimeException("notAudit");
        }
        procurement.setRemark(interiorSaleInput.getRemark());
        procurement.setAuditStatus(AuditStateEnum.AUDITED.getCode());
        if(OutStatusEnum.CANCEL.getCode().equals(interiorSaleInput.getStatus())){
            procurement.setStatus(OutStatusEnum.NO.getCode());
        }
        procurement.setUpdateTime(new Date());
        procurement.setUpdateUser(getCurrentUserId());
        interiorMapper.updateByPrimaryKeySelective(procurement);

        List<String> outWarehouseList = new ArrayList<>();
        for (EditInteriorSaleDetailInput detailInput : interiorSaleInput.getInteriordetail()) {
            if(outWarehouseList.indexOf(detailInput.getOutWarehouse()) == -1){
                outWarehouseList.add(detailInput.getOutWarehouse());
            }
        }
        for (String s : outWarehouseList) {
            AddPurchaseOrderInput purchaseOrderInput = new AddPurchaseOrderInput();
            purchaseOrderInput.setCompany(getCurrentCompanyKey());
            purchaseOrderInput.setIntWarehouse(procurement.getIntWarehouse());
            purchaseOrderInput.setReceivingUser(procurement.getReceivingUser());
            purchaseOrderInput.setReceivingAddress(procurement.getReceivingAddress());
            purchaseOrderInput.setNo(procurement.getPurchasingOrderNo());
            purchaseOrderInput.setBillType(procurement.getBillType());
            purchaseOrderInput.setOutWarehouse(s);
            List<AddPurchaseOrderDetailInput> purchaseOrderDetailInputs = new ArrayList<>();
            for (EditInteriorSaleDetailInput detailOutput : interiorSaleInput.getInteriordetail()) {
                if(detailOutput.getOutWarehouse().equals(s)){
                    WareInternalProcurementDetail detail = interiorDeatilMapper.selectByPrimaryKey(detailOutput.getWareInternalProcurementDetailId());
                    detail.setPrice(detailOutput.getPrice());
                    detail.setNum(detailOutput.getNum());
                    detail.setUpdateTime(new Date());
                    detail.setUpdateUser(getCurrentUserId());
                    interiorDeatilMapper.updateByPrimaryKeySelective(detail);
                    AddPurchaseOrderDetailInput orderDetailInput = new AddPurchaseOrderDetailInput();
                    orderDetailInput.setCompany(getCurrentCompanyKey());
                    orderDetailInput.setFreight(detail.getFreight());
                    orderDetailInput.setNum(detail.getNum());
                    orderDetailInput.setOutWarehouse(detail.getOutWarehouse());
                    orderDetailInput.setPrice(detail.getPrice());
                    orderDetailInput.setSpareParts(detail.getSpareParts());
                    orderDetailInput.setTotalAmount(detail.getTotalAmount());
                    purchaseOrderDetailInputs.add(orderDetailInput);
                }
            }
            purchaseOrderInput.setDetailList(purchaseOrderDetailInputs);
            purchaseOrderService.add(purchaseOrderInput);
        }
    }

    /**
     * 根据ID驳回内部销售单
     * @param id
     * @param reject
     */
    @Override
    @Transactional
    public void auditReject(Integer id, String reject) {
        WareInternalProcurementExample example = new WareInternalProcurementExample();
        WareInternalProcurementExample.Criteria criteria = example.createCriteria();
        WareInternalProcurement procurement = interiorMapper.selectByPrimaryKey(id);
        if(!AuditStateEnum.UNAUDIT.getCode().equals(procurement.getAuditStatus())){
            throw new RuntimeException("notAudit");
        }
        procurement.setAuditStatus(AuditStateEnum.REJECTED.getCode());
        procurement.setReasonsRejection(reject);
        procurement.setUpdateTime(new Date());
        procurement.setUpdateUser(getCurrentUserId());
        interiorMapper.updateByPrimaryKeySelective(procurement);
    }

    /**
     * 批量确认状态
     * @param ids
     */
    @Override
    @Transactional
    public void statusPass(Integer[] ids) {
        WareInternalProcurementExample example = new WareInternalProcurementExample();
        WareInternalProcurementExample.Criteria criteria = example.createCriteria();
        criteria.andWareInternalProcurementIdIn(Arrays.asList(ids));
        List<WareInternalProcurement> procurements = interiorMapper.selectByExample(example);
        for (WareInternalProcurement procurement : procurements) {
            //确认状态校验
//            if(ChargeStatus.NO.getCode().equals(procurement.getChargeStatus())){
//                throw new RuntimeException("isChargeStatus");
//            }
            if(!OutStatusEnum.NO.getCode().equals(procurement.getStatus())){
                throw new RuntimeException("isStatus");
            }
            procurement.setStatus(OutStatusEnum.YES.getCode());
            procurement.setUpdateUser(getCurrentUserId());
            procurement.setUpdateTime(new Date());
            interiorMapper.updateByPrimaryKeySelective(procurement);

        }

    }

    /**
     * 批量取消确认
     * @param ids
     */
    @Override
    @Transactional
    public void statusCancel(Integer[] ids) {
        WareInternalProcurementExample example = new WareInternalProcurementExample();
        WareInternalProcurementExample.Criteria criteria = example.createCriteria();
        criteria.andWareInternalProcurementIdIn(Arrays.asList(ids));
        List<WareInternalProcurement> procurements = interiorMapper.selectByExample(example);
        for (WareInternalProcurement procurement : procurements) {
            if(OutStatusEnum.CANCEL.getCode().equals(procurement.getStatus())){
                throw new RuntimeException("isStatus");
            }
            procurement.setStatus(OutStatusEnum.CANCEL.getCode());
            procurement.setUpdateUser(getCurrentUserId());
            procurement.setUpdateTime(new Date());
            interiorMapper.updateByPrimaryKeySelective(procurement);

        }
    }

    /**
     * 批量收费
     * @param ids
     */
    @Override
    public void charge(Integer[] ids) {
        WareInternalProcurementExample example = new WareInternalProcurementExample();
        WareInternalProcurementExample.Criteria criteria = example.createCriteria();
        criteria.andWareInternalProcurementIdIn(Arrays.asList(ids));
        List<WareInternalProcurement> procurements = interiorMapper.selectByExample(example);
        for (WareInternalProcurement procurement : procurements) {
            if(!OutStatusEnum.YES.getCode().equals(procurement.getStatus())){
                throw new RuntimeException("isStatus");
            }
            if(!ChargeStatus.NO.getCode().equals(procurement.getChargeStatus())){
                throw new RuntimeException("isStatus");
            }
            procurement.setChargeStatus(ChargeStatus.ALL.getCode());
            procurement.setUpdateUser(getCurrentUserId());
            procurement.setUpdateTime(new Date());
            interiorMapper.updateByPrimaryKeySelective(procurement);

        }
    }

    /**
     * 根据主单据ID查询详细
     * @param id
     * @return
     */
    public List<InteriorSaleDetailOutput> getDetail(Integer id){
        WareInternalProcurementDetailExample example = new WareInternalProcurementDetailExample();
        WareInternalProcurementDetailExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareInternalProcurementEqualTo(id);
        List<WareInternalProcurementDetail> details = interiorDeatilMapper.selectByExample(example);
        List<InteriorSaleDetailOutput> outputs = new ArrayList<>();
        for (WareInternalProcurementDetail detail : details) {
            InteriorSaleDetailOutput output = new InteriorSaleDetailOutput();
            BeanUtils.copyProperties(detail,output);
            output.setCompanyLangLang(detail.getCompany());
            output.setOutWarehouseLangLang(detail.getOutWarehouse());
            output.setSparePartsLangLang(detail.getSpareParts());
            SparePartsOutput spareParts = sparePartsService.getSpareParts(new EditSparePartsInput(output.getSpareParts()));
            output.setSparePartsCategories(spareParts.getSparePartsCategories());
            output.setSparePartsCategoriesLangLang(spareParts.getSparePartsCategoriesLangLang());
            output.setSparePartsNo(spareParts.getSparePartsNo());
            output.setSurplusNum(stockService.getStockByCompanyOrSP(detail.getCompany(),detail.getOutWarehouse(),detail.getSpareParts()));
            outputs.add(output);
        }
        return outputs;
    }
}

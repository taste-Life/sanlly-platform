package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.StockinEnum;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.dao.WarePurchaseOrderDetailMapper;
import com.sanlly.warehouse.dao.WarePurchaseOrderMapper;
import com.sanlly.warehouse.entity.WarePurchaseOrder;
import com.sanlly.warehouse.entity.WarePurchaseOrderDetail;
import com.sanlly.warehouse.entity.WarePurchaseOrderDetailExample;
import com.sanlly.warehouse.entity.WarePurchaseOrderExample;
import com.sanlly.warehouse.models.input.delivery.AddDeliveryDetailInput;
import com.sanlly.warehouse.models.input.delivery.AddDeliveryInput;
import com.sanlly.warehouse.models.input.purchaseOrder.AddPurchaseOrderDetailInput;
import com.sanlly.warehouse.models.input.purchaseOrder.AddPurchaseOrderInput;
import com.sanlly.warehouse.models.input.purchaseOrder.SearchPurchaseOrderInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.output.delivery.DeliveryDetailOutput;
import com.sanlly.warehouse.models.output.delivery.DeliveryOutput;
import com.sanlly.warehouse.models.output.purchaseOrder.PurchaseOrderDetailOutput;
import com.sanlly.warehouse.models.output.purchaseOrder.PurchaseOrderOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.WareDeliveryService;
import com.sanlly.warehouse.service.WarePurchaseOrderService;
import com.sanlly.warehouse.service.WareSparePartsService;
import com.sanlly.warehouse.service.feign.AuthFeignClient;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName: WarePurchaseOrderServiceImpl
 * Description: 采购订单服务实现
 * date: 2019/8/27 9:28
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WarePurchaseOrderServiceImpl extends BaseServiceImpl implements WarePurchaseOrderService {

    @Autowired
    private WarePurchaseOrderMapper purchaseOrderMapper;

    @Autowired
    private WarePurchaseOrderDetailMapper purchaseOrderDetailMapper;

    @Autowired
    private BillTypeService billTypeService;

    @Autowired
    private WareSparePartsService sparePartsService;

    @Autowired
    private WareDeliveryService deliveryService;

    @Autowired
    private AuthFeignClient authFeignClient;
    /**
     * 条件查询分页结果
     * @param input
     * @return
     */
    @Override
    public PagedList<PurchaseOrderOutput> getPageList(SearchPurchaseOrderInput input) {
        //组装查询条件
        WarePurchaseOrderExample example = new WarePurchaseOrderExample();
        WarePurchaseOrderExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        example.setOrderByClause("create_time desc");
        if(input.getPurchaseNo() != null && input.getPurchaseNo() != ""){
            criteria.andPurchaseNoLike("%"+input.getPurchaseNo()+"%");
        }
        if(input.getNo()!=null && input.getNo() !=""){
            criteria.andNoLike("%"+input.getNo()+"%");
        }
        if(input.getIntWarehouse()!=null && input.getIntWarehouse() != ""){
            criteria.andIntWarehouseEqualTo(input.getIntWarehouse());
        }
        if(input.getIsFinish()!=null && input.getIsFinish() !=""){
            criteria.andIsFinishEqualTo(input.getIsFinish());
        }
        if(input.getStockoutStatus()!=null && input.getStockoutStatus()!=""){
            criteria.andStockoutStatusEqualTo(input.getStockoutStatus());
        }
        if(input.getStartDate()!=null && input.getEndDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),input.getEndDate());
        }else if(input.getStartDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),new Date());
        }else if(input.getEndDate()!=null){
            criteria.andCreateTimeBetween(new Date(0),input.getEndDate());
        }
        //查询页数
        Integer totalItemCount = (int) purchaseOrderMapper.countByExample(example);
        PagedList<PurchaseOrderOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        //组装返回数据
        List<WarePurchaseOrder> purchaseOrders = purchaseOrderMapper.selectByExample(example);
        List<PurchaseOrderOutput> outputs = new ArrayList<>();
        for (WarePurchaseOrder purchaseOrder : purchaseOrders) {
            PurchaseOrderOutput output = new PurchaseOrderOutput();
            BeanUtils.copyProperties(purchaseOrder,output);
            output.setCompanyLangLang(purchaseOrder.getCompany());
            output.setIntWarehouseLangLang(purchaseOrder.getIntWarehouse());
            output.setIsFinishLangLang(purchaseOrder.getIsFinish());
            if(purchaseOrder.getReceivingUser() != null && purchaseOrder.getReceivingUser() != ""){
                UserInfoOutput data = authFeignClient.getUserInfo(Integer.parseInt(purchaseOrder.getReceivingUser())).getData();
                if(data != null){
                    output.setReceivingUserStr(data.getUserName());
                }
            }
            output.setStockoutStatusLangLang(purchaseOrder.getStockoutStatus());
            output.setDetailList(getDetailList(purchaseOrder.getWarePurchaseOrderId()));
            output.setBillTypeLangLang(purchaseOrder.getBillType());
            output.setPurchaseDateStr(DateUtil.date2String(purchaseOrder.getPurchaseDate()));
            outputs.add(output);
        }
        pagedList.getDataList().addAll(outputs);
        return pagedList;
    }

    /**
     * 新增采购订单
     * @param input
     */
    @Override
    @Transactional
    public void add(AddPurchaseOrderInput input) {
        WarePurchaseOrder purchaseOrder = new WarePurchaseOrder();
        BeanUtils.copyProperties(input,purchaseOrder);
        purchaseOrder.setPurchaseNo(billTypeService.getBillNumberByKey(BillTypeConstants.PURCHORDER));
        purchaseOrder.setCreateTime(new Date());
        purchaseOrder.setCreateUser(getCurrentUserId());
        purchaseOrder.setIsDel(PlatformConstants.ISDEL_NO);
        purchaseOrder.setIsFinish(CommonEnum.NO.getCode());
        purchaseOrder.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
        purchaseOrder.setPurchaseDate(new Date());
        purchaseOrderMapper.insert(purchaseOrder);
        for (AddPurchaseOrderDetailInput detailInput : input.getDetailList()) {
            WarePurchaseOrderDetail detail = new WarePurchaseOrderDetail();
            BeanUtils.copyProperties(detailInput,detail);
            detail.setWarePurchaseOrderId(purchaseOrder.getWarePurchaseOrderId());
            detail.setSurplusNum(detail.getNum());
            detail.setCreateTime(new Date());
            detail.setCreateUser(getCurrentUserId());
            detail.setCompany(input.getCompany());
            detail.setIsDel(PlatformConstants.ISDEL_NO);
            detail.setIsFinish(CommonEnum.NO.getCode());
            detail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
            detail.setStockinStatus(StockinEnum.NOIN.getCode());
            detail.setOutWarehouse(detailInput.getOutWarehouse());
            purchaseOrderDetailMapper.insert(detail);
        }
    }

    /**
     * 根据采购订单生成送货单
     * @param input
     */
    @Override
    @Transactional
    public void addDelivery(AddDeliveryInput input) {
        WarePurchaseOrderExample example = new WarePurchaseOrderExample();
        WarePurchaseOrderExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andPurchaseNoEqualTo(input.getPurchaseNo());
        WarePurchaseOrder purchaseOrder = purchaseOrderMapper.selectByExample(example).get(0);
        WarePurchaseOrderDetailExample detailExample = new WarePurchaseOrderDetailExample();
        WarePurchaseOrderDetailExample.Criteria detailCriteria = detailExample.createCriteria();
        detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        detailCriteria.andWarePurchaseOrderIdEqualTo(purchaseOrder.getWarePurchaseOrderId());
        List<WarePurchaseOrderDetail> purchaseOrderDetails = purchaseOrderDetailMapper.selectByExample(detailExample);
        for (WarePurchaseOrderDetail orderDetail : purchaseOrderDetails) {
            for (AddDeliveryDetailInput detailOutput : input.getDetailOutputs()) {
                if(orderDetail.getSpareParts().equals(detailOutput.getSpareParts()) && orderDetail.getOutWarehouse().equals(detailOutput.getOutWarehouse())){
                    orderDetail.setSurplusNum(orderDetail.getSurplusNum() - detailOutput.getDeliveryNum());
                }
                if(orderDetail.getSurplusNum() < 0){
                    throw new RuntimeException("deliveryNumErr");
                }
                orderDetail.setOutWarehouse(detailOutput.getOutWarehouse());
            }
            purchaseOrderDetailMapper.updateByPrimaryKeySelective(orderDetail);
        }
        Double num = 0D;
        for (AddDeliveryDetailInput detailOutput : input.getDetailOutputs()) {
            num += detailOutput.getDeliveryNum();
        }
        input.setDeliveryNum(num);
        deliveryService.addDelivery(input);
    }

    /**
     * 送货单回调
     * @param input
     */
    @Override
    @Transactional
    public void setStatus(DeliveryOutput input) {
        WarePurchaseOrderExample example = new WarePurchaseOrderExample();
        WarePurchaseOrderExample.Criteria criteria = example.createCriteria();
        criteria.andPurchaseNoEqualTo(input.getPurchaseNo());
        WarePurchaseOrder purchaseOrder = purchaseOrderMapper.selectByExample(example).get(0);

        WarePurchaseOrderDetailExample detailExample = new WarePurchaseOrderDetailExample();
        WarePurchaseOrderDetailExample.Criteria detailCriteria = detailExample.createCriteria();
        detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        detailCriteria.andWarePurchaseOrderIdEqualTo(purchaseOrder.getWarePurchaseOrderId());
        List<WarePurchaseOrderDetail> warePurchaseOrderDetails = purchaseOrderDetailMapper.selectByExample(detailExample);
        int i = 0 ;
        for (WarePurchaseOrderDetail orderDetail : warePurchaseOrderDetails) {
            for (DeliveryDetailOutput detailOutput : input.getDetailOutputs()) {
                if(orderDetail.getSpareParts().equals(detailOutput.getSpareParts()) && orderDetail.getOutWarehouse().equals(detailOutput.getOutWarehouse())){
                    if(orderDetail.getNum() == detailOutput.getNum()){
                        orderDetail.setStockoutStatus(StockoutEnum.YESOUT.getCode());
                    }else {
                        orderDetail.setStockoutStatus(StockoutEnum.PORTIONOUT.getCode());
                        purchaseOrderDetailMapper.updateByPrimaryKeySelective(orderDetail);
                    }
                    if(StockoutEnum.YESOUT.getCode().equals(orderDetail.getStockoutStatus())){
                        i++;
                    }
                }
            }
        }
        purchaseOrder.setStockoutStatus(warePurchaseOrderDetails.size() == i ? StockoutEnum.YESOUT.getCode() : StockoutEnum.PORTIONOUT.getCode());
        purchaseOrderMapper.updateByPrimaryKeySelective(purchaseOrder);
    }

    /**
     * 批量状态确认
     * @param ids
     */
    @Override
    public void statusPass(Integer[] ids) {

    }

    /**
     * 批量取消确认
     * @param ids
     */
    @Override
    public void statusCancel(Integer[] ids) {

    }

    /**
     * 根据主单ID查询明细列表
     * @param id
     * @return
     */
    public List<PurchaseOrderDetailOutput> getDetailList(Integer id){
        WarePurchaseOrderDetailExample example = new WarePurchaseOrderDetailExample();
        WarePurchaseOrderDetailExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWarePurchaseOrderIdEqualTo(id);
        List<WarePurchaseOrderDetail> purchaseOrderDetails = purchaseOrderDetailMapper.selectByExample(example);
        List<PurchaseOrderDetailOutput> outputs = new ArrayList<>();
        for (WarePurchaseOrderDetail orderDetail : purchaseOrderDetails) {
            PurchaseOrderDetailOutput output = new PurchaseOrderDetailOutput();
            BeanUtils.copyProperties(orderDetail,output);
            output.setSurplusNum(orderDetail.getSurplusNum());
            output.setCompanyLangLang(orderDetail.getCompany());
            output.setIsFinishLangLang(orderDetail.getIsFinish());
            output.setOutWarehouseLangLang(orderDetail.getOutWarehouse());
            SparePartsOutput sparePartsBrief = sparePartsService.getSpareParts(new EditSparePartsInput(orderDetail.getSpareParts()));
            output.setSparePartsCategoriesLangLang(sparePartsBrief.getSparePartsCategoriesLangLang());
            output.setSparePartsCategories(sparePartsBrief.getSparePartsCategories());
            output.setSparePartsNo(sparePartsBrief.getSparePartsNo());
            output.setSparePartsLangLang(orderDetail.getSpareParts());
            output.setStockoutStatusLangLang(orderDetail.getStockoutStatus());
            output.setStockinStatus(orderDetail.getStockinStatus());
            output.setStockinStatusLangLang(orderDetail.getStockinStatus());
            outputs.add(output);
        }
        return outputs;
    }
}

package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.delivery.AddDeliveryInput;
import com.sanlly.warehouse.models.input.purchaseOrder.AddPurchaseOrderInput;
import com.sanlly.warehouse.models.input.purchaseOrder.SearchPurchaseOrderInput;
import com.sanlly.warehouse.models.output.delivery.DeliveryOutput;
import com.sanlly.warehouse.models.output.purchaseOrder.PurchaseOrderOutput;

/**
 * ClassName: WarePurchaseOrderService
 * Description: 采购订单服务层
 * date: 2019/8/27 9:27
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WarePurchaseOrderService {

        /**
     * 条件查询分页
     * @param input
     * @return
     */
    PagedList<PurchaseOrderOutput> getPageList(SearchPurchaseOrderInput input);

    /**
     * 新增采购订单
     * @param input
     */
    void add (AddPurchaseOrderInput input);

    /**
     * 通过采购订单新增送货单
     * @param input
     */
    void addDelivery(AddDeliveryInput input);

    /**
     * 送货单回调
     * @param input
     */
    void setStatus(DeliveryOutput input);

    /**
     * 批量确认状态
     * @param ids
     */
    void statusPass(Integer[] ids);

    /**
     * 批量确认状态
     * @param ids
     */
    void statusCancel(Integer[] ids);

}

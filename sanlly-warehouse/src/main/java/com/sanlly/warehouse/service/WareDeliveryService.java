package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.delivery.AddDeliveryInput;
import com.sanlly.warehouse.models.input.delivery.SearchDeliveryInput;
import com.sanlly.warehouse.models.input.stockin.AddStockinInput;
import com.sanlly.warehouse.models.output.delivery.DeliveryOutput;
import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;
import com.sanlly.warehouse.models.output.stockoutApply.StockoutApplyOutput;

/**
 * ClassName: WareDeliveryService
 * Description: 送货单服务层
 * date: 2019/9/2 13:30
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareDeliveryService {

    /**
     * 查询送货单分页列表
     * @param input
     * @return
     */
    PagedList<DeliveryOutput> pageList(SearchDeliveryInput input);

    /**
     * 新增送货单
     * @param input
     */
    void addDelivery(AddDeliveryInput input);

    /**
     * 根据送货单新增出库单
     * @param ids
     */
    void addStockout(Integer[] ids);

    /**
     * 根据送货单新增入库单
     * @param input
     */
    void addStockin(AddStockinInput input);

    /**
     * 出库单回调 修改送货单出库状态
     * @param input
     */
    void editStockoutStatus(StockoutApplyOutput input);

    /**
     * 入库单回调 修改送货单入库状态
     * @param output
     */
    void editStockinStatus(StockinOutput output);

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

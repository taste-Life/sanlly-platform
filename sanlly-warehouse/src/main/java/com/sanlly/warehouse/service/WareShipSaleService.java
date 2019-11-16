package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.shipSale.AddShipSaleInput;
import com.sanlly.warehouse.models.input.shipSale.EditShipSaleInput;
import com.sanlly.warehouse.models.input.shipSale.SearchShipSaleInput;
import com.sanlly.warehouse.models.output.shipSale.ShipSaleOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;

/**
 * ClassName: WareShipSaleService
 * Description: 供船服务层
 * date: 2019/9/17 11:17
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareShipSaleService {

    /**
     * 查询供船单分页列表
     * @param input
     * @return
     */
    PagedList<ShipSaleOutput> pageList(SearchShipSaleInput input);

    /**
     * 新增供船单
     * @param input
     */
    void add(AddShipSaleInput input);

    /**
     * 修改供船单
     * @param input
     */
    void edit(EditShipSaleInput input);

    /**
     * 供船单确认
     * @param ids
     */
    void editState(Integer[] ids);

    /**
     * 汇率确认
     * @param input
     */
    void exchangeRate(EditShipSaleInput input);

    /**
     * 供船出库
     * @param input
     */
    void shipSaleStockout(EditShipSaleInput input);

    /**
     * 供船退库
     * @param input
     */
    void shipSaleReturn(EditShipSaleInput input);

    /**
     * 取消供船
     * @param ids
     */
    void shipSalecancel(Integer[] ids);
}

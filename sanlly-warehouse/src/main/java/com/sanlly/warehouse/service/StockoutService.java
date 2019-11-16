package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.stockout.SearchStockoutInput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;

/**
 * 出库服务接口
 * @author lishzh
 *
 */
public interface StockoutService {
	
	/**
	 * 获取可退库的出库单列表 
	 * @param input
	 * @return
	 */
	PagedList<StockoutOutput> getReturnStockouts(SearchStockoutInput input);

}

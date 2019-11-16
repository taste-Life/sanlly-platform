package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.returnwarehouse.SearchReturnWarehouseInput;
import com.sanlly.warehouse.models.output.returnwarehouse.ReturnWarehouseOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;

/**
 * ClassName: ReturnWarehouseService
 * Description: 退库服务层
 * date: 2019/9/19 17:33
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface ReturnWarehouseService {

	/**
	 * 添加退库单
	 * 
	 * @param input
	 */
	void addReturnWarehouse(StockoutOutput input);
	
	/**
	 * 获取退库单列表
	 * @param input
	 * @return
	 */
	PagedList<ReturnWarehouseOutput> getReturnWarehouses(SearchReturnWarehouseInput input);

}

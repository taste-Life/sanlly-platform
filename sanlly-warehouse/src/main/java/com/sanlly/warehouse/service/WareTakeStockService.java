package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.takestock.SearchTakeStockInput;
import com.sanlly.warehouse.models.output.takestock.TakeStockOutput;

/**
 * 
* @Package com.sanlly.warehouse.service 
* @Description: 库存盘点 
* @author jlx   
* @date 2019年10月10日 下午4:56:36 
* @version V1.0   
 */
public interface WareTakeStockService {
	/**
	 * 库存盘点分页列表
	 * @param input
	 * @return
	 */
	PagedList<TakeStockOutput> getWareTakeStockPagedList(SearchTakeStockInput input);
	
}

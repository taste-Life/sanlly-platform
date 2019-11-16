package com.sanlly.warehouse.service;

import com.sanlly.warehouse.models.input.CostPool.AddSellPoolInput;

/**
 * 
* @Package com.sanlly.warehouse.service 
* @Description: 销售-费用池service  
* @author jlx   
* @date 2019年10月21日 上午10:49:09 
* @version V1.0   
 */
public interface SellPoolService {

	/**
	 * 添加上传SBS数据至费用池
	 */
	void addSellPool(AddSellPoolInput input);

	/**
	 * 更新费用池的上传状态
	 */
	void updateSellPool(AddSellPoolInput input);
}

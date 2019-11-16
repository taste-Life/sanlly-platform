package com.sanlly.warehouse.service;

import com.sanlly.warehouse.entity.WarePurchasePool;
import com.sanlly.warehouse.models.input.CostPool.AddPurchasePoolInput;

/**
 * 
* @Package com.sanlly.warehouse.service 
* @Description: 采购-费用池service  
* @author jlx   
* @date 2019年10月21日 上午10:48:52 
* @version V1.0   
 */
public interface PurchasePoolService {
	
	/**
	 * 添加上传SBS数据至费用池
	 */
	void addPurchasePool(AddPurchasePoolInput input);

	/**
	 * 更新费用池的上传状态
	 */
	void updatePurchasePool(AddPurchasePoolInput input);
	
	/**
	 * 取得递增单据id
	 */
	String getLegacyOrdrId(String stockinId);
	
	/**
	 * 取得递增单据号
	 */
	String getLegacyOrdrNum(String stockinNo);
	
	/**
	 * 
	 */
	WarePurchasePool getDataByStockinNo(String stockinNo);

}

package com.sanlly.warehouse.service;

import com.sanlly.warehouse.models.input.CostPool.AddStorePoolInput;
/**
 * 
* @Package com.sanlly.warehouse.service 
* @Description: 仓库-费用池service  
* @author jlx   
* @date 2019年10月21日 上午10:49:35 
* @version V1.0   
 */
public interface StorePoolService {
	/**
	 * 添加上传SBS数据至费用池
	 */
	void addStorePool(AddStorePoolInput input);
	/**
	 * 更新费用池的上传状态
	 */
	void updateStorePool(AddStorePoolInput input);

}

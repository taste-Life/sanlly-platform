package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderInput;
import com.sanlly.purchase.models.input.matterorder.SearchPurchaseOrderInput;
import com.sanlly.purchase.models.output.matterorder.PurchaseOrderOutput;

/**
 * 
* @Package com.sanlly.purchase.service 
* @Description: 订单服务层 
* @author jlx   
* @date 2019年9月4日 下午1:28:43 
* @version V1.0   
 */
public interface MatterOrderService {
	/**
	 * 
	* @Description: 生成订单 
	* @param input void
	* @throws 
	 */
	void addPurchaseOrder(AddPurchaseOrderInput input);
	/**
	 * 订单分页列表
	 * @param input
	 * @return
	 */
	PagedList<PurchaseOrderOutput> getPurchaseOrderPagedList(SearchPurchaseOrderInput input);
	
	/**
	 * 
	* @Description: 更新订单状态为完成 
	* @param purcPurchaseOrderId void
	* @throws 
	 */
	void updateOrderStatus(Integer purcPurchaseOrderId);
	
	
	
}

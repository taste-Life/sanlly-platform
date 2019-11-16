package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.app.newContainer.OrderDetailSubInput;
import com.sanlly.production.models.output.app.newContainer.NewContainerDetailListOutput;
import com.sanlly.production.models.output.app.newContainer.NewContainerListOutput;

/**
 * 新箱Service
 * @author zhangkai
 *
 */
public interface NewContainerAppService {

	/**
	 * 新箱订单列表
	 * @param orderNo 订单号
	 * @param status 审核状态
	 * @param pageNum 页码
	 * @param pageSize 条数
	 * @return
	 */
	PagedList<NewContainerListOutput> list(String orderNo, String status, Integer pageNum, Integer pageSize);
	
	/**
	 * 新箱订单明细列表
	 * @param order
	 * @param containerNo
	 * @param status
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	PagedList<NewContainerDetailListOutput> detailList(
		String orderNo, 
		String containerNo, 
		String status, 
		Integer pageNum, 
		Integer pageSize);
	
	/**
	 * 批量确认订单明细
	 * @param orderDetailIds
	 */
	void orderDetailConfirm(String orderDetailIds);
	
	/**
	 * 新增修改新箱订单明细
	 * @param input
	 */
	void orderDetailsSub(OrderDetailSubInput input);
}

package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.newContainer.NewContainerAddInput;
import com.sanlly.production.models.output.newContainer.NewContainerListOutput;

/**
 * 新箱service
 * @author zhangkai
 *
 */
public interface NewContainerService {

	/**
	 * 新增&更新
	 * @param input
	 */
	Integer add(NewContainerAddInput input);
	
	/**
	 * 新箱列表
	 * @param beginTime
	 * @param endTime
	 * @param customerName
	 * @param orderNo
	 * @param state
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	PagedList<NewContainerListOutput> list(String beginTime, String endTime, String customerName, String orderNo, String state, Integer pageNum, Integer pageSize);
	
	/**
	 * 提交审核
	 * @param orderIds
	 */
	void auditSumbit(Integer[] orderIds);
	
	/**
	 * 根据订单号获取订单详情
	 * @param orderNo
	 * @return
	 */
	NewContainerListOutput getDetail(String orderNo);
	
	/**
	 * 删除订单
	 * @param orderIds
	 */
	void delete(Integer[] orderIds);
	
	/**
	 * 检验完成
	 * @param detailIds
	 */
	void finishCheck(Integer[] detailIds);
}

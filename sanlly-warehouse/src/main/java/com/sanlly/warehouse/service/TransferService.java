package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.transfer.AddTransferInput;
import com.sanlly.warehouse.models.input.transfer.EditTransferInput;
import com.sanlly.warehouse.models.input.transfer.SearchTransferInput;
import com.sanlly.warehouse.models.output.transfer.TransferOutput;

/**
 * 调拨 移动 下料服务接口
 * 
 * @author lishzh
 *
 */
public interface TransferService {

	/**
	 * 添加调拨单
	 * 
	 * @param input
	 */
	void addTransfer(AddTransferInput input);

	/**
	 * 修改调拨单
	 * 
	 * @param input
	 */
	void editTransfer(EditTransferInput input);

	/**
	 * 删除调拨单
	 * 
	 * @param input
	 */
	void deleteTransfer(List<Integer> ids);

	/**
	 * 根据调拨单id获取调拨单详情
	 * 
	 * @param id
	 * @return
	 */
	TransferOutput getTransferById(Integer id);

	/**
	 * 查询调拨单列表
	 * 
	 * @param input
	 * @return
	 */
	PagedList<TransferOutput> getPageTransfers(SearchTransferInput input);

	/**
	 * 调拨单审核
	 * 
	 * @param input
	 */
	void transferAudit(List<Integer> ids);

	/**
	 * 调拨单驳回
	 *
	 * @author lishzh
	 * @param input
	 */
	void transferReject(EditTransferInput input);

	/**
	 * 调拨单确认
	 * 
	 * @param input
	 */
	void transferConfirm(List<Integer> ids);

}

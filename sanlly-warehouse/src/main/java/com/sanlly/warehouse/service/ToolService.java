package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.tool.SearchToolInput;
import com.sanlly.warehouse.models.input.tool.ToolDetailInput;
import com.sanlly.warehouse.models.input.tool.ToolInput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;
import com.sanlly.warehouse.models.output.tool.ToolDetailOutput;
import com.sanlly.warehouse.models.output.tool.ToolOutput;

/**
 * 工具服务
 * 
 * @author lishzh
 *
 */
public interface ToolService {

	/**
	 * 添加工具申请单
	 * 
	 * @param input
	 */
	void addToolApply(ToolInput input);

	/**
	 * 根据工具申请单id获取工具申请单
	 * 
	 * @param id
	 * @return
	 */
	ToolOutput getToolApplyById(Integer id);

	/**
	 * 修改工具申请单
	 * 
	 * @param input
	 */
	void editToolApply(ToolInput input);

	/**
	 * 提交工具申请单
	 * 
	 * @param input
	 */
	void submitToolApply(List<Integer> ids);

	/**
	 * 获取工具申请单分页列表
	 * 
	 * @param input
	 * @return
	 */
	PagedList<ToolOutput> getToolApplys(SearchToolInput input);
	
	/**
	 * 部门审核
	 * 
	 * @param input
	 */
	void departmentAudit(List<Integer> ids);

	/**
	 * 部门驳回
	 * 
	 * @param input
	 */
	void departmentReject(ToolInput input);

	/**
	 * 主管审核工具申请单
	 * 
	 * @param input
	 */
	void supervisorAudit(List<Integer> ids);
	
	/**
	 * 工具出库
	 *
	 *@author lishzh 
	 *@param inputs
	 */
	void toolOut(ToolInput input);

	/**
	 * 删除工具申请单
	 * 
	 * @param input
	 */
	void deleteToolApply(List<Integer> ids);

	/**
	 * 已出库工具管理
	 * 
	 * @author lishzh
	 * @param input
	 */
	void toolStockedManage(StockoutOutput input);

	/**
	 * 获取已出库的工具(工具管理列表)
	 * 
	 * @author lishzh
	 * @param input
	 * @return
	 */
	PagedList<ToolDetailOutput> getTools(SearchToolInput input);

	/**
	 * 工具派发
	 * 
	 * @author lishzh
	 * @param inputs
	 */
	void toolDistribute(List<ToolDetailInput> inputs);

	/**
	 * 工具报废申请
	 * 
	 * @author lishzh
	 * @param input
	 */
	void scrapApply(ToolInput input);

	/**
	 * 修改工具报废申请单
	 * 
	 * @author lishzh
	 * @param input
	 */
	void editScrapApply(ToolInput input);
	
	/**
	 * 主管审核工具报废申请单
	 * 
	 * @param input
	 */
	void supervisorAuditScrap(List<Integer> ids);
	
	/**
	 * 工具调拨
	 *
	 *@author lishzh 
	 *@param inputs
	 */
	void toolTransfer(List<ToolDetailInput> inputs);


}

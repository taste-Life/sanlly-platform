package com.sanlly.warehouse.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.tool.SearchToolInput;
import com.sanlly.warehouse.models.input.tool.ToolDetailInput;
import com.sanlly.warehouse.models.input.tool.ToolInput;
import com.sanlly.warehouse.service.ToolService;

import io.swagger.annotations.Api;

/**
 * 工具申请、管理API
 * 
 * @author lishzh
 *
 */
@Api(tags = { "工具申请、管理API" })
@RestController
public class ToolController {

	@Autowired
	ToolService toolService;

	/**
	 * 添加工具申请单
	 * 
	 * @author lishzh
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/toolApplies")
	public Result addToolApply(@RequestBody ToolInput input) {
		toolService.addToolApply(input);
		return Result.Success();
	}

	/**
	 * 根据工具申请单id获取工具申请单
	 * 
	 * @author lishzh
	 * @param id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/toolApplies/{applyId}")
	public Result getToolApplyById(@PathVariable(value = "applyId") Integer applyId) {
		return Result.Success(toolService.getToolApplyById(applyId));
	}

	/**
	 * 修改工具申请单
	 * 
	 * @author lishzh
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/toolApplies")
	public Result editToolApply(@RequestBody ToolInput input) {
		toolService.editToolApply(input);
		return Result.Success();
	}

	/**
	 * 获取工具申请单分页列表
	 * 
	 * @author lishzh
	 * @param no
	 * @param auditStatus
	 * @param startDate
	 * @param endDate
	 * @param userId
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/toolApplies")
	public Result getToolApplys(@RequestParam(required = false) String no,
			@RequestParam(required = false) String auditStatus, @RequestParam(required = false) Date startDate,
			@RequestParam(required = false) Date endDate, @RequestParam(required = false) Integer userId,
			@RequestParam(required = false) Integer index, @RequestParam(required = false) Integer size) {
		SearchToolInput input = new SearchToolInput(index, size);
		input.setAuditStatus(auditStatus);
		input.setEndDate(endDate);
		input.setNo(no);
		input.setStartDate(startDate);
		input.setUserId(userId);
		return Result.Success(toolService.getToolApplys(input));
	}

	/**
	 * 提交申请单
	 * 
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/toolApplies/submit")
	public Result submitToolApply(@RequestBody ToolInput input) {
		toolService.submitToolApply(input.getIds());
		return Result.Success();
	}

	/**
	 * 部门审核、驳回
	 * 
	 * @author lishzh
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/toolApplies/departmentAudit")
	public Result departmentAudit(@RequestBody List<Integer> ids) {
		toolService.departmentAudit(ids);
		return Result.Success();
	}

	/**
	 * 部门审核、驳回
	 * 
	 * @author lishzh
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/toolApplies/departmentReject")
	public Result departmentReject(@RequestBody ToolInput input) {
		toolService.departmentReject(input);
		return Result.Success();
	}

	/**
	 * 主管审核工具申请单
	 * 
	 * @author lishzh
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/toolApplies/supervisorAudit")
	public Result supervisorAudit(@RequestBody ToolInput input) {
		toolService.supervisorAudit(input.getIds());
		return Result.Success();
	}

	/**
	 * 工具出库
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/toolApplies/out")
	public Result toolOut(@RequestBody ToolInput input) {
		toolService.toolOut(input);
		return Result.Success();
	}

	/**
	 * 删除工具申请单
	 * 
	 * @author lishzh
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/toolApplies")
	public Result deleteToolApply(@RequestParam Integer[] ids) {
		toolService.deleteToolApply(Arrays.asList(ids));
		return Result.Success();
	}

	/**
	 * 获取工具管理列表
	 * 
	 * @author lishzh
	 * @param name
	 * @param userId
	 * @param department
	 * @param sparePartsNo
	 * @param distributeStatus
	 * @param toolStatus
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/tools")
	public Result getTools(@RequestParam(required = false) String name, @RequestParam(required = false) Integer userId,
			@RequestParam(required = false) String department, @RequestParam(required = false) String sparePartsNo,
			@RequestParam(required = false) String distributeStatus, @RequestParam String toolStatus,
			@RequestParam Integer index, @RequestParam Integer size) {
		SearchToolInput input = new SearchToolInput(index, size);
		input.setName(name);
		input.setUserId(userId);
		input.setDepartment(department);
		input.setSparePartsNo(sparePartsNo);
		input.setDistributeStatus(distributeStatus);
		input.setToolStatus(toolStatus);
		return Result.Success(toolService.getTools(input));
	}

	/**
	 * 工具派发
	 * 
	 * @author lishzh
	 * @param inputs
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/tools/distribute")
	public Result toolDistribute(@RequestBody List<ToolDetailInput> inputs) {
		toolService.toolDistribute(inputs);
		return Result.Success();
	}

	/**
	 * 工具报废申请
	 * 
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/scrapApplies")
	public Result scrapApply(@RequestBody ToolInput input) {
		toolService.scrapApply(input);
		return Result.Success();
	}

	/**
	 * 修改工具报废申请
	 * 
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/scrapApplies")
	public Result editScrapApply(@RequestBody ToolInput input) {
		toolService.editScrapApply(input);
		return Result.Success();
	}

	/**
	 * 工具调拨
	 *
	 * @author lishzh
	 * @param inputs
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/tools/transfers")
	public Result toolTransfer(@RequestBody List<ToolDetailInput> inputs) {
		toolService.toolTransfer(inputs);
		return Result.Success();
	}

}

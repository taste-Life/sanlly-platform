package com.sanlly.production.controller;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.enums.TestingStateEnum;
import com.sanlly.production.models.input.guarantee.MaintenanceAddInput;
import com.sanlly.production.models.input.guarantee.MaintenanceDelInput;
import com.sanlly.production.models.input.guarantee.MaintenanceIdsInput;
import com.sanlly.production.models.input.guarantee.MaintenanceInput;
import com.sanlly.production.models.output.guarantee.ContainerNumsOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceCheckOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceEntryDateOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceOutput;
import com.sanlly.production.service.AuditService;
import com.sanlly.production.service.MaintenanceService;

import io.swagger.annotations.Api;

@RestController
@Api(tags = { "机组保修相关API" })
public class MaintenanceController {

	@Autowired
	private MaintenanceService maintenanceService;

	@Autowired
	private AuditService auditService;

	/**
	 * web端检索机组保修列表
	 * 
	 * @param containerNo   箱号
	 * @param containerUser 用箱人
	 * @param courseType    进场类型
	 * @param startTime     检索起日
	 * @param endTime       检索止日
	 * @param operateType   操作类型
	 * @param isSurrender   是否退租箱
	 * @param yard          进场场站
	 * @param index         分页页码
	 * @param size          分页条数
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/maintenance/list")
	public Result<PagedList<MaintenanceOutput>> list(String containerNo, String containerUser, String courseType,
			Date startTime, Date endTime, String operateType, String isSurrender, String yard,
			@RequestParam(value = "index", required = true) Integer index,
			@RequestParam(value = "size", required = true) Integer size) {
		return Result.Success(maintenanceService.list(containerNo, containerUser, courseType, startTime, endTime,
				operateType, isSurrender, yard, index, size));
	}

	/**
	 * web保修列表批量删除
	 * 
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@PutMapping("/maintenance/cancel")
	@SuppressWarnings("rawtypes")
	public Result maintenanceCancel(@RequestBody MaintenanceDelInput input) {
		Boolean res = maintenanceService.updateByPrimaryKeys(input);
		if (res) {
			return Result.Success();
		} else {
			return Result.Error(ResultCodeEnum.ERROR.getCode(), null);
		}
	}

	/**
	 * web端添加外点保修
	 * 
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@PostMapping("/maintenance/add")
	public Result<String> add(@RequestBody MaintenanceInput input) {
		return Result.Success(maintenanceService.add(input));
	}

	/**
	 * web进场保修批量添加进保修列表
	 * 
	 * @param input
	 * @return
	 */
	@PostMapping("/maintenance/addin")
	@SuppressWarnings("rawtypes")
	public Result addin(@RequestBody MaintenanceIdsInput input) {
		Boolean res = maintenanceService.addWebMaintenance(input);
		if (res) {
			return Result.Success();
		} else {
			return Result.Error(ResultCodeEnum.ERROR.getCode(), null);
		}
	}

	/**
	 * web进场保修批量提交
	 * 
	 * @param input
	 * @return
	 */
	@PutMapping("/maintenance/submit")
	@SuppressWarnings("rawtypes")
	public Result submit(@RequestBody MaintenanceIdsInput input) throws Exception {

		List<String> prodCourseIds = maintenanceService.selectCourseByTestingState(input.getIds(),
				new String[] { TestingStateEnum.TESTING.getCode(), TestingStateEnum.REJECTED.getCode(),
						TestingStateEnum.UNAUDIT.getCode(),TestingStateEnum.AUDITED.getCode() });
		input.setIds(prodCourseIds.toArray(new String[prodCourseIds.size()]));
		maintenanceService.submitMaintenance(input);
		if (input.getIds() != null && input.getIds().length > 0) {
			String message = "";
			for (String courseId : input.getIds()) {
				try {
					auditService.mainEvaluation(courseId);
					auditService.mainReferral(courseId);
				} catch (Exception e) {
					message += courseId + ":" + e.getMessage() + ";";
				}
			}
			if (StringUtils.isNotBlank(message)) {
				throw new Exception(message);
			}
		}
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO web端保修详情
	 * @param prodMaintenanceId
	 * @return Integer @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/maintenance/info")
	public Result maintenanceDetail(
			@RequestParam(value = "prodMaintenanceId", required = true) String prodMaintenanceId) {
		return Result.Success(maintenanceService.maintenanceDetail(prodMaintenanceId));
	}

	/**
	 * app端添加保修基本信息
	 * 
	 * @param maintenanceInput
	 * @return
	 * @author zhangkai
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/subMaintenance")
	public Result subMaintenance(@RequestBody MaintenanceInput maintenanceInput) {
		return Result.Success(maintenanceService.add(maintenanceInput));

	}

	/**
	 * app端根据箱号添加进保修列表
	 * 
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/addMaintenance")
	public Result addMaintenance(@RequestBody MaintenanceAddInput input) {
		Boolean res = maintenanceService.addMaintenance(input);
		if (res == true) {
			return Result.Success();
		} else {
			return Result.Error(ResultCodeEnum.ERROR.getCode(), null);
		}
	}

	/**
	 * app端保修检验列表
	 * 
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/maintenances")
	public Result<PagedList<MaintenanceCheckOutput>> appList(
			@RequestParam(value = "containerNo", required = false) String containerNo,
			@RequestParam(value = "guaranteeCategory", required = false) String guaranteeCategory,
			@RequestParam("index") Integer index, @RequestParam("size") Integer size) {
		return Result.Success(maintenanceService.appList(containerNo, guaranteeCategory, index, size));
	}

	/**
	 * app端根据箱号获取进场时间
	 * 
	 * @param containerNo
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/maintenanceEntryDate/{containerNo}")
	public Result<MaintenanceEntryDateOutput> entryDate(@PathVariable("containerNo") String containerNo) {
		return Result.Success(maintenanceService.entryDate(containerNo));
	}

	/**
	 * app端模糊查询箱号
	 * 
	 * @param containerNo
	 * @return
	 */
	@GetMapping("/containerNums")
	public Result<List<ContainerNumsOutput>> containerNums(
			@RequestParam(required = true, value = "containerNo") String containerNo) {
		return Result.Success(maintenanceService.containerNums(containerNo));
	}

	/**
	 * app端取消保修（批量）
	 * 
	 * @param prodMaintenanceId
	 */
	@PostMapping("/cancelMaintenance")
	@SuppressWarnings("rawtypes")
	public Result cancelMaintenance(
			@RequestParam(required = true, value = "prodMaintenanceIds") String prodMaintenanceIds) {
		if (prodMaintenanceIds == null) {
			return Result.Error(ResultCodeEnum.BAD_REQUEST.getCode(), "");
		}
		String[] ids = prodMaintenanceIds.split(",");
		for (String prodMaintenanceId : ids) {
			maintenanceService.cancelMaintenance(prodMaintenanceId);
		}
		return Result.Success();
	}

}

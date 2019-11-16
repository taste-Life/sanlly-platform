package com.sanlly.production.controller;

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
import com.sanlly.production.models.input.containerTesting.AddMasterAuditInput;
import com.sanlly.production.models.input.containerTesting.AddSonAuditInput;
import com.sanlly.production.models.input.containerTesting.SearchAuditInput;
import com.sanlly.production.models.input.containerTesting.SearchAuditRateInput;
import com.sanlly.production.models.input.containerTesting.UpdateMasterAuditInput;
import com.sanlly.production.models.input.rate.AddMHRateInput;
import com.sanlly.production.models.input.rate.SearchMHRateInput;
import com.sanlly.production.models.input.rate.SearchRateInput;
import com.sanlly.production.models.input.rate.UpdateMHRateInput;
import com.sanlly.production.service.AuditService;

import io.swagger.annotations.Api;

/**
 * 自动审核
 * 
 * @Package com.sanlly.production.controller 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月29日 下午7:53:14 
 * @version V1.0   
 */
@RestController
@Api(tags = { "自动审核接口" })
public class AuditController {

	@Autowired
	private AuditService auditService;

	/**
	 * 自动审核条件列表
	 * 
	 * @Description: TODO
	 * @param containerCategory
	 * @param containerUser
	 * @param index
	 * @param size
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/testing/audit")
	public Result getAuditPagedList(@RequestParam(required = false) String containerCategory,
			@RequestParam(required = false) String containerUser, @RequestParam Integer index,
			@RequestParam Integer size) {
		SearchAuditInput input = new SearchAuditInput(index, size);
		input.setContainerCategory(containerCategory);
		input.setContainerUser(containerUser);
		return Result.Success(auditService.getAuditPagedList(input));
	}

	/**
	 * 自动审核主表新增
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/testing/audit")
	public Result addMasterAudit(@RequestBody AddMasterAuditInput input) {
		auditService.addMasterAudit(input);
		return Result.Success();
	}

	/**
	 * 获取单条自动审核主表数据
	 * 
	 * @param rateId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/testing/audit/{auditId}")
	public Result getMasterAudit(@PathVariable("auditId") Integer auditId) {
		return Result.Success(auditService.getMasterAudit(auditId));
	}

	/**
	 * 自动审核主表编辑
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/testing/audit")
	public Result updateMasterAudit(@RequestBody UpdateMasterAuditInput input) {
		auditService.updateMasterAudit(input);
		return Result.Success();
	}

	/**
	 * 自动审核主表删除
	 * 
	 * @Description: TODO
	 * @param listIds
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/testing/audit")
	public Result delMasterAudit(@RequestParam Integer[] listIds) {
		auditService.delMasterAudit(listIds);
		return Result.Success();
	}

	/**
	 * 编辑自动审核条件
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/testing/audit/item")
	public Result updateSonAudit(@RequestBody AddSonAuditInput input) {
		auditService.updateSonAudit(input);
		return Result.Success();
	}

	/**
	 * 获取自动审核条件信息
	 * 
	 * @param rateId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/testing/audit/item/{auditId}")
	public Result getSonAudit(@PathVariable("auditId") Integer auditId) {
		return Result.Success(auditService.getSonAudit(auditId));
	}

	/**
	 * 限制条目列表查询
	 * 
	 * @Description: TODO
	 * @param partsDetails
	 * @param containerCategory
	 * @param repair
	 * @param index
	 * @param size
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/testing/audit/rate")
	public Result getAuditRatePagedList(@RequestParam(required = false) String partsDetails,
			@RequestParam String containerCategory, @RequestParam(required = false) String repair,
			@RequestParam Integer index, @RequestParam Integer size) {
		SearchAuditRateInput input = new SearchAuditRateInput(index, size);
		input.setContainerCategory(containerCategory);
		input.setPartsDetails(partsDetails);
		input.setRepair(repair);
		return Result.Success(auditService.getAuditRatePagedList(input));
	}

	/**
	 * 自动审核
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/testing/audit/automatic")
	public Result auditAutomatic(@RequestParam String courseId, @RequestParam Boolean isUnit) {
		auditService.auditAutomatic(courseId, isUnit);
		return Result.Success();
	}
}

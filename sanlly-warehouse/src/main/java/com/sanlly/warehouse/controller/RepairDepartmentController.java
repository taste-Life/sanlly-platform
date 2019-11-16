package com.sanlly.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.repairdepartment.RepairDepartmentInput;
import com.sanlly.warehouse.models.input.repairdepartment.SearchRepairDepartmentInput;
import com.sanlly.warehouse.service.RepairDepartmentService;

import io.swagger.annotations.Api;

import java.util.List;

/**
 * 修理部门API
 * 
 * @author lishzh
 *
 */
@Api(tags = { "修理部门API" })
@RestController
public class RepairDepartmentController {

	@Autowired
	private RepairDepartmentService repairDepartmentService;

	/**
	 * 添加修理部门
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/repairDepartments")
	public Result addRefrigeratorCompany(@RequestBody RepairDepartmentInput input) {
		repairDepartmentService.addRepairDepartment(input);
		return Result.Success();
	}

	/**
	 * 修改修理部门
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/repairDepartments")
	public Result editRefrigeratorCompany(@RequestBody RepairDepartmentInput input) {
		repairDepartmentService.editRepairDepartment(input);
		return Result.Success();
	}

	/**
	 * 删除修理部门
	 * 
	 * @param ids
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/repairDepartments")
	public Result deleteRefrigeratorCompany(@RequestParam List<Integer> ids) {
		repairDepartmentService.deleteRepairDepartment(ids);
		return Result.Success();
	}

	/**
	 * 分页查询修理部门
	 * 
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/repairDepartments/pages")
	public Result getPageRefrigeratorCompany(@RequestParam(required = false) String name,
			@RequestParam Integer index, @RequestParam Integer size) {
		SearchRepairDepartmentInput input=new SearchRepairDepartmentInput(index, size);
		input.setName(name);
		return Result.Success(repairDepartmentService.getPageRepairDepartment(input));

	}

	/**
	 * 查询所有修理部门
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/repairDepartments")
	public Result getAllRefrigeratorCompany() {
		return Result.Success(repairDepartmentService.getAllRepairDepartment());
	}

}

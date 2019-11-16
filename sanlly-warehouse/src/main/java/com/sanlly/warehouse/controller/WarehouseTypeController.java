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
import com.sanlly.warehouse.models.input.warehousetype.AddWarehouseTypeInput;
import com.sanlly.warehouse.models.input.warehousetype.EditWarehouseTypeInput;
import com.sanlly.warehouse.models.input.warehousetype.SearchWarehouseTypeInput;
import com.sanlly.warehouse.service.WarehouseTypeService;

import io.swagger.annotations.Api;

/**
 * 仓库类型API
 * 
 * @author lishzh
 *
 */
@Api(tags = { "仓库类型API" })
@RestController
public class WarehouseTypeController {

	@Autowired
	private WarehouseTypeService warehouseTypeService;

	/**
	 * 添加仓库类型
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/warehouseTypes")
	public Result addWarehouseType(@RequestBody AddWarehouseTypeInput input) {

		warehouseTypeService.addWarehouseType(input);
		return Result.Success();

	}

	/**
	 * 修改仓库类型
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/warehouseTypes")
	public Result editWarehouseType(@RequestBody EditWarehouseTypeInput input) {
		warehouseTypeService.editWarehouseType(input);
		return Result.Success();
	}

	/**
	 * 删除仓库类型
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/warehouseTypes")
	public Result deleteWarehouseType(@RequestParam Integer[] ids) {
		warehouseTypeService.deleteWarehouseType(ids);
		return Result.Success();
	}

	/**
	 * 分页查询仓库类型
	 * 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouseTypes/pages")
	public Result getPageWarehouseType(@RequestParam(required = false) String key, @RequestParam Integer index,
			@RequestParam Integer size) {

		SearchWarehouseTypeInput input = new SearchWarehouseTypeInput(index, size);
		input.setKey(key);
		return Result.Success(warehouseTypeService.getPageWarehouseType(input));

	}

	/**
	 * 查询所有仓库类型
	 * 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouseTypes")
	public Result getAllWarehouseType() {

		return Result.Success(warehouseTypeService.getAllWarehouseType());

	}

	/**
	 * 查询所有仓库类型
	 *
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouseTypes/all")
	public Result getPageWarehouseType(@RequestParam(required = false) String cbs) {
		SearchWarehouseTypeInput input = new SearchWarehouseTypeInput();
		input.setCbs(cbs);
		return Result.Success(warehouseTypeService.getAllWarehouseType(input));
	}

}

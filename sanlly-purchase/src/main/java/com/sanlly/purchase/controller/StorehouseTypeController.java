package com.sanlly.purchase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.StoreHouseType.AddStorehouseTypeInput;
import com.sanlly.purchase.models.input.StoreHouseType.EditStorehouseTypeInput;
import com.sanlly.purchase.models.input.StoreHouseType.SearchStorehouseTypeInput;
import com.sanlly.purchase.service.StorehouseTypeService;
@RestController
public class StorehouseTypeController {
	@Autowired
	private StorehouseTypeService storehouseTypeService;
	
	/**
	 * 新增供应商库类别
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/storehouseTypes")
	public Result addStorehouseType(@RequestBody AddStorehouseTypeInput input){
		storehouseTypeService.addStorehouseType(input);
		return Result.Success();
	}
	
	/**
	 * 修改供应商库类别
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/storehouseTypes")
	public Result editStorehouseType(@RequestBody EditStorehouseTypeInput input){
		storehouseTypeService.updateStorehouseType(input);
		return Result.Success();
	}
	/**
	 * 获取单独供应商库类别
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getStorehouseTypes")
	public Result getStorehouseType(@RequestBody EditStorehouseTypeInput input){
		return Result.Success(storehouseTypeService.getStorehouseType(input));
	}
	

	/**
	 * 供应商库类别列表
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/storehouseTypes")
	public Result getStorehouseTypePagedList(@RequestParam(required=false) String storehouseTypeName,@RequestParam Integer index,@RequestParam Integer size ){
		SearchStorehouseTypeInput input = new SearchStorehouseTypeInput(index,size);
		if (storehouseTypeName != null && !storehouseTypeName.equals("")) {
			input.setStorehouseTypeName(storehouseTypeName);
		}	
		return Result.Success(storehouseTypeService.getStorehouseTypePagedList(input));
	}
	
	/**
	 *  删除供应商库类别
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/storehouseTypes")
	public Result deleteStorehouseType(@RequestParam(value = "keys") String[] keys){
		storehouseTypeService.deleteStorehouseType(keys);
		return Result.Success();
	}
}

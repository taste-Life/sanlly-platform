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
import com.sanlly.purchase.models.input.supplierType.AddSupplierTypeInput;
import com.sanlly.purchase.models.input.supplierType.EditSupplierTypeInput;
import com.sanlly.purchase.models.input.supplierType.SearchSupplierTypeInput;
import com.sanlly.purchase.service.SupplierTypeService;
@RestController
public class SupplierTypeController {
	@Autowired
	private SupplierTypeService SupplierTypeService;
	
	/**
	 * 新增供应商类别
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/supplierTypes")
	public Result addSupplierType(@RequestBody AddSupplierTypeInput input){
		SupplierTypeService.addSupplierType(input);
		return Result.Success();
	}
	/**
	 * 获取单独供应商类别
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getSupplierType")
	public Result getSupplierType(@RequestBody EditSupplierTypeInput input){
		return Result.Success(SupplierTypeService.getSupplierType(input));
	}
	/**
	 * 供应商类别修改
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/supplierTypes")
	public Result updateSupplierType(@RequestBody EditSupplierTypeInput input){
		SupplierTypeService.updateSupplierType(input);
		return Result.Success();
		
	}

	/**
	 * 供应商类别列表
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/supplierTypes")
	public Result getSupplierTypePagedList(@RequestParam String supplierTypeName,@RequestParam Integer index,@RequestParam Integer size ){
		SearchSupplierTypeInput input = new SearchSupplierTypeInput(index,size);
		input.setSupplierTypeName(supplierTypeName);
		return Result.Success(SupplierTypeService.getSupplierTypePagedList(input));
	}
	
	/**
	 *  删除供应商类别
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/supplierTypes")
	public Result deleteSupplierType(@RequestParam Integer[] supplierTypeIds){
		SupplierTypeService.deleteSupplierType(supplierTypeIds);
		return Result.Success();
	}
}

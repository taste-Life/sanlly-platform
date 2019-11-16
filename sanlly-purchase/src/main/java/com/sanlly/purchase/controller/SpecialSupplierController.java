package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.specialsupplier.AddSpecialSupplierInput;
import com.sanlly.purchase.models.input.specialsupplier.EditSpecialSupplierInput;
import com.sanlly.purchase.models.input.specialsupplier.SearchSpecialSupplierInput;
import com.sanlly.purchase.service.SpecialSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpecialSupplierController {
	
	@Autowired
	private SpecialSupplierService specialSupplierService;
	
	/**
	 * 新增特殊供应商
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/specialSuppliers")
	public Result addSupplier(@RequestBody AddSpecialSupplierInput input){
		Result result =specialSupplierService.addSpecialSupplier(input);
		return result;
	}
	/**
	 * 修改特殊供应商
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/specialSuppliers")
	public Result updateSpecialSupplier(@RequestBody EditSpecialSupplierInput input){
		specialSupplierService.updateSpecialSupplier(input);
		return Result.Success();
	}
	/**
	 * 获取单独特殊供应商
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getSpecialSupplier")
	public Result getSupplier(@RequestBody EditSpecialSupplierInput input){
		return Result.Success(specialSupplierService.getSpecialSupplier(input));
	}
	

	/**
	 * 特殊供应商列表
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/specialSuppliers")
	public Result getSupplierPagedList(@RequestParam(required = false) String supplierType,@RequestParam(required=false) String name,@RequestParam Integer index,@RequestParam Integer size ){
		SearchSpecialSupplierInput input = new SearchSpecialSupplierInput(index,size);
		if (name != null && !name.equals("")) {
			input.setName(name);
		}
		input.setSupplierType(supplierType);
		return Result.Success(specialSupplierService.getSpecialSupplierPagedList(input));
	}
	
	/**
	 *  删除特殊供应商
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/specialSuppliers")
	public Result deleteUser(@RequestParam Integer[] specialSupplierIds){
		specialSupplierService.deleteSpecialSupplier(specialSupplierIds);
		return Result.Success();
	}
	
}

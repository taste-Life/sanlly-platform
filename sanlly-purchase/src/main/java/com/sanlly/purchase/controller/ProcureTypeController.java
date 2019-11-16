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
import com.sanlly.purchase.models.input.procuretype.AddProcureTypeInput;
import com.sanlly.purchase.models.input.procuretype.EditProcureTypeInput;
import com.sanlly.purchase.models.input.procuretype.SearchProcureTypeInput;
import com.sanlly.purchase.service.ProcureTypeService;
@RestController
public class ProcureTypeController {
	@Autowired
	private ProcureTypeService ProcureTypeService;
	
	/**
	 * 新增供应商类别
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/ProcureTypes")
	public Result addProcureType(@RequestBody AddProcureTypeInput input){
		ProcureTypeService.addProcureType(input);
		return Result.Success();
	}
	/**
	 * 获取单独供应商类别
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getProcureType")
	public Result getProcureType(@RequestBody EditProcureTypeInput input){
		return Result.Success(ProcureTypeService.getProcureType(input));
	}
	/**
	 * 供应商类别修改
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/ProcureTypes")
	public Result updateProcureType(@RequestBody EditProcureTypeInput input){
		ProcureTypeService.updateProcureType(input);
		return Result.Success();
		
	}

	/**
	 * 供应商类别列表
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/ProcureTypes")
	public Result getProcureTypePagedList(@RequestParam String ProcureTypeName,@RequestParam Integer index,@RequestParam Integer size ){
		SearchProcureTypeInput input = new SearchProcureTypeInput(index,size);
		input.setProcureTypeName(ProcureTypeName);
		return Result.Success(ProcureTypeService.getProcureTypePagedList(input));
	}
	
	/**
	 *  删除供应商类别
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/ProcureTypes")
	public Result deleteProcureType(@RequestParam Integer[] ProcureTypeIds){
		ProcureTypeService.deleteProcureType(ProcureTypeIds);
		return Result.Success();
	}
}

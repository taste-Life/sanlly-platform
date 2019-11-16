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
import com.sanlly.warehouse.models.input.laborInsurance.AddLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.EditLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.SearchLaborInsuranceInput;
import com.sanlly.warehouse.models.input.warehouse.AddWarehouseInput;
import com.sanlly.warehouse.models.input.warehouse.EditWarehouseInput;
import com.sanlly.warehouse.models.input.warehouse.SearchWarehouseInput;
import com.sanlly.warehouse.service.LaborInsuranceService;

import io.swagger.annotations.Api;

/**
 * ClassName: LaborInsuranceController
 * Description: 劳保基础信息API
 * date: 2019/8/01 15:24
 *
 * @author zhh
 * 
 */
@Api(tags= {"劳保基础信息API"})
@RestController
public class LaborInsuranceController {

	@Autowired
	private LaborInsuranceService laborInsuranceService;
	
	/**
     * 劳保信息分页列表查询
     * @param sparePartsNo 备件号   
     * @param sparePartsName 备件名称
     * @param sparePartsCategoriesDetails 劳保类型
     * @param index 页码
     * @param size 分页大小
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborInsurances/pages")
    public Result laborInsurancePagedList(@RequestParam(required=false) String sparePartsNo,@RequestParam(required=false) String sparePartsName,@RequestParam(required=false) String sparePartsCategoriesDetails, @RequestParam Integer index, @RequestParam Integer size){
		SearchLaborInsuranceInput input = new SearchLaborInsuranceInput(index, size);
		input.setSparePartsNo(sparePartsNo);
		input.setSparePartsName(sparePartsName);
		input.setSparePartsCategoriesDetails(sparePartsCategoriesDetails);
		return Result.Success(laborInsuranceService.getLaborInsurancePageList(input));
	}
	
	/**
     * 获取全部劳保信息
     * 
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborInsurances")
	public Result laborInsuranceList() {
		return Result.Success(laborInsuranceService.getLaborInsuranceList());
	}
	
	/**
	 * 添加劳保信息
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/laborInsurances")
	public Result addLaborInsurance(@RequestBody AddLaborInsuranceInput input) {
		laborInsuranceService.addLaborInsurance(input);
		return Result.Success();
	}
	
	/**
	 * 修改劳保信息
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/laborInsurances")
	public Result editLaborInsurance(@RequestBody EditLaborInsuranceInput input) {
		laborInsuranceService.editLaborInsurance(input);
		return Result.Success();
	}
	
	/**
	 * 批量删除劳保信息
	 * 
	 * @param key
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/laborInsurances")
	public Result deleteLaborInsurance(@RequestParam String[] keys) {
		laborInsuranceService.deleteLaborInsurance(keys);
		return Result.Success();
	}
}

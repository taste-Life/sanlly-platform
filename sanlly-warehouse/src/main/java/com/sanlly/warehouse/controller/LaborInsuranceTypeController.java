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
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceType.AddLaborInsuranceTypeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceType.EditLaborInsuranceTypeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceType.SearchLaborInsuranceTypeInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.AddSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.EditSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.service.LaborInsuranceTypeService;

import io.swagger.annotations.Api;

/**
 * ClassName: LaborInsuranceTypeController
 * Description: 劳保类别信息API
 * date: 2019/8/12 15:24
 *
 * @author zhh
 * 
 */
@Api(tags= {"劳保类别信息API"})
@RestController
public class LaborInsuranceTypeController {
	
	@Autowired
	private LaborInsuranceTypeService laborInsuranceTypeService;
	
	/**
     * 劳保类别分页列表查询
     * @param sparePartsCategoriesDetails 劳保类别
     * @param index 页码
     * @param size 分页大小
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborInsuranceTypes/pages")
    public Result laborInsuranceTypePagedList(@RequestParam(required=false) String sparepartsCategoriesDetailsName, @RequestParam Integer index, @RequestParam Integer size){
		SearchLaborInsuranceTypeInput input = new SearchLaborInsuranceTypeInput(index, size);
		input.setSparepartsCategoriesDetailsName(sparepartsCategoriesDetailsName);
		return Result.Success(laborInsuranceTypeService.getLaborInsuranceTypePageList(input));
	}
	
	/**
     * 获取全部劳保类别
     * 
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborInsuranceTypes")
	public Result laborInsuranceTypeList() {
		return Result.Success(laborInsuranceTypeService.getLaborInsuranceTypeList());
	}
	
	/**
	 * 添加劳保类别
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/laborInsuranceTypes")
	public Result addLaborInsuranceType(@RequestBody AddSparePartsCategoriesDetailsInput input) {
		laborInsuranceTypeService.addLaborInsuranceType(input);
		return Result.Success();
	}
	
	/**
	 * 修改劳保类别
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/laborInsuranceTypes")
	public Result editLaborInsuranceType(@RequestBody EditSparePartsCategoriesDetailsInput input) {
		laborInsuranceTypeService.editLaborInsuranceType(input);
		return Result.Success();
	}
	
	/**
	 * 批量删除劳保类别
	 * 
	 * @param key
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/laborInsuranceTypes")
	public Result deleteLaborInsuranceType(@RequestParam String[] keys) {
		laborInsuranceTypeService.deleteLaborInsuranceType(keys);
		return Result.Success();
	}
	

}

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
import com.sanlly.production.models.input.rate.AddCode;
import com.sanlly.production.models.input.rate.SearchRateCodeInput;
import com.sanlly.production.models.input.rate.UpdateCode;
import com.sanlly.production.service.RateCodeService;

import io.swagger.annotations.Api;

/**
 * 标准费率
 * 
 * @author wangxzh
 *
 */
@RestController
@Api(tags = { "费率代码对应接口" })
public class RateCodeController {

	@Autowired
	private RateCodeService codeService;

	/**
	 * 代码对应列表
	 * 
	 * @Description: TODO
	 * @param containerCategory
	 * @param partsDetails
	 * @param repair
	 * @param index
	 * @param size
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/code")
	public Result getRateCodePagedList(@RequestParam String containerCategory,
			@RequestParam(required = false) String partsDetails, @RequestParam(required = false) String repair,
			@RequestParam Integer index, @RequestParam Integer size) {
		SearchRateCodeInput input = new SearchRateCodeInput(index, size);
		input.setPartsDetails(partsDetails);
		input.setRepair(repair);
		input.setContainerCategory(containerCategory);
		return Result.Success(codeService.getRateCodePagedList(input));
	}

	/**
	 * 部件修理分类下拉
	 * 
	 * @Description: TODO
	 * @param name
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/code/repairType")
	public Result getPartsRepairTypeList() {
		return Result.Success(codeService.getPartsRepairTypeList());
	}

	/**
	 * 部件修理分类下拉
	 * 
	 * @Description: TODO
	 * @param name
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/code/damage")
	public Result getDamageCodeList() {
		return Result.Success(codeService.getDamageCodeList());
	}

	/**
	 * 代码对应新增
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/rate/code")
	public Result addCode(@RequestBody AddCode input) {
		codeService.addCode(input);
		return Result.Success();
	}

	/**
	 * 获取单条代码对应信息
	 * 
	 * @Description: TODO
	 * @param rateId
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/code/{codeId}")
	public Result getUpdateCode(@PathVariable("codeId") Integer codeId) {
		return Result.Success(codeService.getUpdateCode(codeId));
	}

	/**
	 * 代码对应编辑
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/rate/code")
	public Result updateCode(@RequestBody UpdateCode input) {
		codeService.updateCode(input);
		return Result.Success();
	}

	/**
	 * 代码对应删除
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/rate/code")
	public Result delCode(@RequestParam Integer[] listIds) {
		codeService.delCode(listIds);
		return Result.Success();
	}

}

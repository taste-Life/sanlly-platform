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
import com.sanlly.production.models.input.rate.AddCostRateInput;
import com.sanlly.production.models.input.rate.SearchCostRateInput;
import com.sanlly.production.models.input.rate.UpdateCostRateInput;
import com.sanlly.production.service.RateCostService;

import io.swagger.annotations.Api;

/**
 * 成本费率
 * 
 * @author wangxzh
 *
 */
@RestController
@Api(tags = { "成本费率接口" })
public class RateCostController {

	@Autowired
	private RateCostService rateService;

	/**
	 * 查询费率信息
	 * 
	 * @param partsType
	 *            部件大类
	 * @param partsDetails
	 *            部件明细
	 * @param repair
	 *            维修代码
	 * @param materialCode
	 *            材质代码
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/costrate")
	public Result sanHourPagedList(@RequestParam(required = false) String partsType,
			@RequestParam(required = false) String containerCategory,
			@RequestParam(required = false) String partsDetails, @RequestParam(required = false) String repair,
			@RequestParam(required = false) String materialCode, @RequestParam Integer index,
			@RequestParam Integer size) {
		SearchCostRateInput input = new SearchCostRateInput(index, size);
		input.setContainerCategory(containerCategory);
		input.setPartsDetails(partsDetails);
		input.setRepair(repair);
		input.setPartsType(partsType);
		input.setMaterialCode(materialCode);
		return Result.Success(rateService.getRatePagedList(input));
	}

	/**
	 * 根据费率查询备件信息
	 * 
	 * @param rateId
	 *            费率id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/costrate/{rateId}")
	public Result getSparesMessage(@PathVariable("rateId") String rateId) {
		return Result.Success(rateService.getSparesMessage(rateId));
	}

	/**
	 * 新增成本费率条目
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/costrate")
	public Result addCostRate(@RequestBody AddCostRateInput input) {
		rateService.addCostRate(input);
		return Result.Success();
	}

	/**
	 * 获取单条条目信息
	 * 
	 * @param detId
	 *            条目id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/costrate/one/{rateId}")
	public Result getSanSonOneMessage(@PathVariable("rateId") String rateId) {
		return Result.Success(rateService.getCostItemMessage(rateId));
	}

	/**
	 * 编辑条目信息
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/costrate")
	public Result updateCostRate(@RequestBody UpdateCostRateInput input) {
		rateService.updateCostRate(input);
		return Result.Success();
	}

	/**
	 * 删除条目
	 * 
	 * @param listIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/costrate")
	public Result delCostRate(@RequestParam String[] listIds) {
		rateService.delCostRate(listIds);
		return Result.Success();
	}

	/**
	 * 算法下拉
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/costrate/algorithm")
	public Result getAlgorithmList() {
		return Result.Success(rateService.getAlgorithmList());
	}

	/**
	 * 常用系数下拉
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/costrate/coefficient")
	public Result getCoefficientList() {
		return Result.Success(rateService.getCoefficientList());
	}

	/**
	 * 备件号下拉
	 * 
	 * @Description: TODO
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/costrate/spares")
	public Result getSparesList() {
		return Result.Success(rateService.getSparesList());
	}
}

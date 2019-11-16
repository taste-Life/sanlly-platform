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
import com.sanlly.production.models.input.rate.AddMHRateInput;
import com.sanlly.production.models.input.rate.SearchMHRateInput;
import com.sanlly.production.models.input.rate.UpdateMHRateInput;
import com.sanlly.production.service.RateMHService;

import io.swagger.annotations.Api;

/**
 * 工时费率
 * @author wangxzh
 *
 */
@RestController
@Api(tags = { "工时费率接口" })
public class RateMHController {

	@Autowired
	private RateMHService rateService;
	
	/**
	 * 工时费率列表查询
	 * @param company 地点
	 * @param containerUser 用箱人
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/mhrate")
	public Result mhRatePagedList(@RequestParam(required = false) String company,
			@RequestParam(required = false) String containerUser, @RequestParam Integer index, @RequestParam Integer size) {
		SearchMHRateInput input=new SearchMHRateInput(index,size);
		input.setCompany(company);
		input.setContainerUser(containerUser);
		return Result.Success(rateService.getZYRatePagedList(input));
	}
	/**
	 * 工时费率新增
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/mhrate")
	public Result addMHRate(@RequestBody AddMHRateInput input) {
		rateService.addMHRate(input);
		return Result.Success();
	}
	/**
	 * 获取单条工时费率信息
	 * @param rateId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/mhrate/{rateId}")
	public Result messageDetail(@PathVariable("rateId") Integer rateId) {
		return Result.Success(rateService.getMHRate(rateId));
	}
	/**
	 * 工时费率编辑
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/mhrate")
	public Result updateMHRate(@RequestBody UpdateMHRateInput input) {
		rateService.updateMHRate(input);
		return Result.Success();
	}
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/mhrate")
	public Result delMHRate(@RequestParam Integer[] listIds) {
		rateService.delMHRate(listIds);
		return Result.Success();
	}
}

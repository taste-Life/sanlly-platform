package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.output.BaseSelectOutput;
import com.sanlly.production.service.SelectService;

import io.swagger.annotations.Api;

@RestController
@Api( tags = {"一次性下拉选API"} )
public class SelectController {
	
	@Autowired
	private SelectService selectService;

	/**
	 * 一次性获取下拉选
	 * @return
	 */
	@GetMapping("/baseSelect")
	public Result<BaseSelectOutput> select() {
		return Result.Success(selectService.select());
	}
	/**
	 * 
	* @Description: 集采平台一次性加载下拉选 
	* @return Result<BaseSelectOutput>
	* @throws 
	 */
	@GetMapping("/supplierSelect")
	public Result<BaseSelectOutput> supplierSelect() {
		return Result.Success(selectService.supplierSelect());
	}
}

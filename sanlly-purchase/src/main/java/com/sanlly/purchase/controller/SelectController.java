package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.output.lang.BaseSelectOptionOutput;
import com.sanlly.purchase.service.SelectService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public Result<BaseSelectOptionOutput> select() {
		return Result.Success(selectService.select());
	}
}

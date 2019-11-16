package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.output.app.base.BasicOutput;
import com.sanlly.production.service.AppService;

import io.swagger.annotations.Api;

/**
 * app端基础操作相关API
 * @author zhangkai
 *
 */
@RestController
@Api( tags = {"app端基础操作相关API"} )
public class AppController {
	
	@Autowired
	private AppService appService;
	
	/**
	 * app端一次性加载下拉选
	 * @return
	 */
	@GetMapping("/basic")
	public Result<BasicOutput> select() {
		return Result.Success(appService.select());
	}

}

package com.sanlly.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.FaultTypeOutput;
import com.sanlly.common.models.output.Result;
import com.sanlly.production.service.FaultTypeService;

import io.swagger.annotations.Api;

@RestController
@Api(tags={"故障类型基本信息维护API"})
public class FaultController {
	
	@Autowired
	private FaultTypeService faultTypeService;
	
	@GetMapping("/faultType/list")
	public Result<List<FaultTypeOutput>> list() {
		return Result.Success(faultTypeService.list());
	}

}

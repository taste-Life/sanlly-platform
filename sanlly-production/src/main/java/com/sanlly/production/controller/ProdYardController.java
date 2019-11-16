package com.sanlly.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.service.ProdYardService;

import io.swagger.annotations.Api;

@RestController
@Api(tags = { "场站操作相关API" })
public class ProdYardController {
	
	@Autowired
	private ProdYardService prodYardService;
	
	@GetMapping("/prodYard/{companyKey}")
	public Result<List<YardOutput>> getYardListByCompanyKey(@PathVariable("companyKey") String companyKey) {
		return Result.Success(prodYardService.getYardListByCompanyKey(companyKey));
	}
	
}

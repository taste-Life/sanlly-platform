package com.sanlly.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.auth.service.CompanyService;
import com.sanlly.common.models.output.Result;

/**
 * 公司管理
 * @author RexSheng
 * 2019年8月16日 下午1:16:09
 */
@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	/**
	 * 用户列表
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/companys")
	public Result getAllCompanyList() {
		return Result.Success(companyService.getAllCompanyList(null));
	}
}

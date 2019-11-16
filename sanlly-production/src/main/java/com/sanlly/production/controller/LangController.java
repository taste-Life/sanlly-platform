package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.input.lang.LangInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.production.service.LangService;

/**
 * 用箱人控制器
 * @author 
 *
 */
@RestController
public class LangController {

	@Autowired
	private LangService langService;
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/langs/reload")
	public Result langReload() {
		langService.reload();
		return Result.Success();
	}
	
	/**
	 * 用箱人下拉列表获取
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/langs/{tableName}/key")
	public Result langRuleKeyByTable(@PathVariable("tableName")String tableName) {
		return Result.Success(langService.getLangRuleKeyByTable(tableName));
	}
	
	/**
	 * 用箱人下拉列表获取
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/langs/object")
	public Result lang(@RequestBody LangInput input) {
		return Result.Success(langService.lang(input));
	}
}

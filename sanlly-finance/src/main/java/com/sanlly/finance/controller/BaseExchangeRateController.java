package com.sanlly.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.finance.models.input.BaseExchangeRateInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.service.BaseExchangeRateService;

/**
 * 汇率表控制层
* @Package com.sanlly.finance.controller 
* @Description: TODO 
* @author fjy   
* @date 2019年8月20日 下午1:16:30 
* @version V1.0   
 */
@RestController
@RequestMapping(value = "/exchangeRate")
public class BaseExchangeRateController {
	
	@Autowired
	private BaseExchangeRateService service;
	
	/**
	 * 
	 * @Description:获取最新汇率
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/getNewRate")
	public Result getNewRate() {
		return Result.Success(service.getNewRate());
	}

	
	
	
	/**
	 * 
	 * @Description:获取最新汇率
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getNewRate")
	public Result list(@RequestBody SearchBaseInput input) {
		return Result.Success(service.getPage(input));
	}

	/**
	 * 
	 * @Description:分页查询
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getPage")
	public Result getPage(@RequestBody SearchBaseInput input) {
		return Result.Success(service.getPage(input));
	}
	
	/**
	 * 
	 * @Description:新增或者修改
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/addOrUpadte")
	public Result addOrUpadte(@RequestBody BaseExchangeRateInput input) {
		return Result.Success(service.addOrUpadte(input));
	}
	
	/**
	 * 
	 * @Description:批量删除
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deletes")
	public Result deletes(@RequestParam String [] Ids) {
		return Result.Success(service.deletes(Ids));
	}
	
}

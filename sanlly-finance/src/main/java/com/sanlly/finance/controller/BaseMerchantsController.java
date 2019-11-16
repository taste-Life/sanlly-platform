package com.sanlly.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.finance.models.input.BaseMerchantsInput;
import com.sanlly.finance.models.input.SearchMerchantsInput;
import com.sanlly.finance.service.BaseMerchantsService;

/**
 * 客户信息控制层
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月8日  
*
 */
@RestController
@RequestMapping(value = "/merchants")
public class BaseMerchantsController {
	@Autowired
	private BaseMerchantsService merchantsService;
	
	/**
	 * 
	 * @Description:客户分页查询
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getMerchantsList")
	public Result list(@RequestBody SearchMerchantsInput input) {
		return Result.Success(merchantsService.list(input));
	}

	/**
	 * 
	 * @Description:客户分页查询
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getMerchantsPage")
	public Result getMerchantsPage(@RequestBody SearchMerchantsInput input) {
		return Result.Success(merchantsService.getMerchantsPage(input));
	}
	
	/**
	 * 
	 * @Description:客户信息全部导出
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/exportMerchantsAll")
	public Result exportMerchantsAll(@RequestBody SearchMerchantsInput input) {
		return Result.Success(merchantsService.exportMerchantsAll(input));
	}
	
	/**
	 * 
	 * @Description:新增客户信息
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/addOrUpadteMerchants")
	public Result addOrUpadteMerchants(@RequestBody BaseMerchantsInput input) {
		return Result.Success(merchantsService.addOrUpadteMerchants(input));
	}
	
	/**
	 * 
	 * @Description:批量删除客户信息
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deletesMerchants")
	public Result deletesMerchants(@RequestParam String [] Ids) {
		return Result.Success(merchantsService.deletesMerchants(Ids));
	}
	
	
}

package com.sanlly.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBusinessInput;
import com.sanlly.finance.service.BusinessService;

/**
 * 商务结算控制层
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月8日  
*
 */
@RestController
public class BusinessController {
	@Autowired
	private BusinessService businessService;

	/**
	 * 
	 * @Description:商务结算分页查询
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getBusinessPage")
	public Result getBusinessPage(@RequestBody SearchBusinessInput input) {
		return Result.Success(businessService.getBusinessPage(input));
	}
	
	/**
	 * 
	 * @Description:入账 对接sbs
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/inBills")
	public Result inBill(@RequestParam String [] ids) {
		//后期对接SBS接口
		//接收返回的发票
		return Result.Success(businessService.inBill(ids));
	}
	
	/**
	 * 
	 * @Description:财务驳回
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/reject")
	public Result Reject(@RequestBody RejectInput input) {
		businessService.Reject(input);
		return Result.Success();
	}
	
	/**
	 * 
	 * @Description:获取费用类型字典  前台下拉框显示用
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/getChargeTypeList")
	public Result getChargeTypeList() {
		return Result.Success(businessService.getChargeTypeList());
	}

	
	
	/**
	 * 
	 * @Description:商务结算明细分页查询
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getBusinessDetailPage")
	public Result getBusinessDetailPage(@RequestBody SearchBusinessInput input) {
		return Result.Success(businessService.getBusinessDetailPage(input));
	}
	
	/**
	 * 
	 * @Description:商务结算明细 可入账集合
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getBusinessDetailList")
	public Result getBusinessDetailList(@RequestBody SearchBusinessInput input) {
		return Result.Success(businessService.getBusinessDetailList(input));
	}
	
	
	
	/**
	 * 
	 * @Description:商务结算发票分页查询
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getBusinessInvoicePage")
	public Result getBusinessInvoicePage(@RequestBody SearchBusinessInput input) {
		return Result.Success(businessService.getBusinessInvoicePage(input));
	}
	
	
	/**
	 * 
	 * @Description:商务结算发票全部导出
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/getRejectList")
	public Result getRejectList() {
		return Result.Success(businessService.getRejectList());
	}
	
	
	
	
}

package com.sanlly.purchase.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.demand.SearchDemandOutputInput;
import com.sanlly.purchase.models.input.mattertender.AddMatterTenderInput;
import com.sanlly.purchase.models.input.periodproduct.EditPeriodProductInput;
import com.sanlly.purchase.models.input.periodproduct.SearchPeriodProductInput;
import com.sanlly.purchase.service.PeriodProductService;
/**
 * 
* @Package com.sanlly.purchase.controller 
* @Description: 周期性定价接口 
* @author jlx   
* @date 2019年8月24日 上午11:44:05 
* @version V1.0   
 */
@RestController
public class PeriodProductController {

	@Autowired
	private PeriodProductService periodProductService;
	

	/**
	 * 列表查询
	 * @param 
	 * @param index 页码
	 * @param size 分页大小
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterPeriods")
	public Result getPeriodProductPagedList(@RequestParam(required=false) String purchaseCompany,@RequestParam(required=false) String productNum,
			@RequestParam(required=false) String supplier,@RequestParam(required=false) Date endTimeStart,
			@RequestParam(required=false) Date endTimeEnd,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchPeriodProductInput input = new SearchPeriodProductInput(index,size);
		input.setPurchaseCompany(purchaseCompany);
		input.setProductNum(productNum);
		input.setSupplier(supplier);
		input.setEndTimeStart(endTimeStart);
		input.setEndTimeEnd(endTimeEnd);
		return Result.Success(periodProductService.getPeriodProductPagedList(input));
	}
	
	/**
	 * 
	* @Description: 编辑周期性定价备件价格 
	* @param input
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/matterPeriods")
	public Result addMatterTender(@RequestBody EditPeriodProductInput input){
		periodProductService.UpdateProductPrice(input);
			return Result.Success();
		
	}
	
	/**
	 * 列表查询
	 * @param 
	 * @param index 页码
	 * @param size 分页大小
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterPeriods/products")
	public Result getReTenderProductList(@RequestParam Integer[] periodProductIds){
		return Result.Success(periodProductService.getReTenderProductList(periodProductIds));
	}

	/**
	 * 列表查询
	 * @param 
	 * @param index 页码
	 * @param size 分页大小
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterPeriods/remind")
	public Result getPeriodProductRemindPagedList(@RequestParam(required=false) String purchaseCompany,@RequestParam(required=false) String productNum,
			@RequestParam(required=false) String supplier,@RequestParam(required=false) Date endTimeStart,
			@RequestParam(required=false) Date endTimeEnd,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchPeriodProductInput input = new SearchPeriodProductInput(index,size);
		input.setPurchaseCompany(purchaseCompany);
		input.setProductNum(productNum);
		input.setSupplier(supplier);
		input.setEndTimeStart(endTimeStart);
		input.setEndTimeEnd(endTimeEnd);
		return Result.Success(periodProductService.getPeriodProductRemindPagedList(input));
	}
	
}

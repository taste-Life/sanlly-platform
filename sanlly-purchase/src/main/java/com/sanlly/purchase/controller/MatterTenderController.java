package com.sanlly.purchase.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.mattertender.AddMatterTenderInput;
import com.sanlly.purchase.models.input.mattertender.AddMatterTenderResultInput;
import com.sanlly.purchase.models.input.mattertender.SearchMatterTenderInput;
import com.sanlly.purchase.service.MatterTenderService;

/**
 * 
* Description: 招标采购接口
* @ClassName: MatterTenderController
* @date 2019年8月19日
*
* @author jlx
 */
@RestController
public class MatterTenderController {
	

	@Autowired
	private MatterTenderService matterTenderService;
//	@Autowired
//	private MatterPurchaseSupplierService matterPurchaseSupplierService;
	
	/** 
	* @Description: 招标采购分页列表 
	* @param tenderEndTimeStart
	* @param tenderEndTimeEnd
	* @param purchaseCompany
	* @param tenderMethod
	* @param tenderStatus
	* @param tenderName
	* @param isPeriod
	* @param index
	* @param size
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterTenders")
	public Result getMatterBiddingPagedList(@RequestParam(required=false) Date tenderCreateTimeStart,@RequestParam(required=false) Date tenderCreateTimeEnd,
			@RequestParam(required=false) String purchaseCompany,@RequestParam(required=false) String tenderMethod,
			@RequestParam(required=false) String tenderStatus,@RequestParam(required=false) String tenderName,@RequestParam(required=true) String isPeriod,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchMatterTenderInput input = new SearchMatterTenderInput(index,size);
		input.setPurchaseCompany(purchaseCompany);
		input.setIsPeriod(isPeriod);
		input.setTenderCreateTimeEnd(tenderCreateTimeEnd);
		input.setTenderCreateTimeStart(tenderCreateTimeStart);
		input.setTenderMethod(tenderMethod);
		input.setTenderName(tenderName);
		input.setTenderStatus(tenderStatus);
		return Result.Success(matterTenderService.getMatterTenderPagedList(input));
	}
	/**
	 * 
	* @Description: 发布招标采购 
	* @param input
	* @return Result
	 * @throws Exception 
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/matterTenders")
	public Result addMatterTender(@RequestBody AddMatterTenderInput input) throws Exception{
			matterTenderService.addMatterTender(input);
			return Result.Success();
		
	}

	/**
	 * 
	* @Description: 初审结果录入
	* @param input
	* @return Result
	 * @throws Exception 
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/matterTenders/first")
	public Result addFirstTrial(@RequestParam(required=true) Integer purcMatterTenderPurchaseId,@RequestParam(required=true) String[] purcSupplierIds) throws Exception{
			matterTenderService.addFirstTrial(purcMatterTenderPurchaseId,purcSupplierIds);
			return Result.Success();
		
	}

	/**
	 * 
	* @Description: 招标结果录入
	* @param input
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/matterTenders/result")
	public Result addTenderResult(@RequestBody AddMatterTenderResultInput input){
			matterTenderService.addTenderResult(input);
			return Result.Success();
		
	}

	/**
	 * 
	* @Description: 招标详情
	* @param input
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterTenders/detail")
	public Result gettMatterTenderDetail(@RequestParam(required=true) Integer purcMatterTenderPurchaseId){
			
			return Result.Success(matterTenderService.gettMatterTenderDetail(purcMatterTenderPurchaseId));
		
	}

	/**
	 * 
	* @Description: 供应商查看招标列表 
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterTenders/noticelist")
	public Result getTenderNoticeList(){
			
			return Result.Success(matterTenderService.getTenderNoticeList());
		
	}
	/**
	 * 
	* @Description: 招标详情
	* @param input
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterTenders/productlist")
	public Result gettMatterTenderProductList(@RequestParam(required=true) Integer purcMatterTenderPurchaseId){
			
			return Result.Success(matterTenderService.gettMatterTenderProductList(purcMatterTenderPurchaseId));
		
	}

//	@SuppressWarnings("rawtypes")
//	@GetMapping("/getSupplierByPurchaseId")
//	public Result getSupplierByPurchaseId(Integer purcMatterTenderPurchaseId,String name,String grade){
//		return Result.Success(matterPurchaseSupplierService.getSupplierByPurchaseId(purcMatterTenderPurchaseId, name, grade));
//	}
}

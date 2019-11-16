package com.sanlly.purchase.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.bidding.AddBiddingResultInput;
import com.sanlly.purchase.models.input.bidding.AddMatterBiddingInput;
import com.sanlly.purchase.models.input.bidding.SearchMatterBiddingInput;
import com.sanlly.purchase.models.output.matterinquiry.MatterPeriodSupplierTenderDetailOutput;
import com.sanlly.purchase.service.MatterBiddingService;

/**
 * 
* Description: 竞价采购接口
* @ClassName: MatterBiddingController
* @date 2019年8月19日
*
* @author jlx
 */
@RestController
public class MatterBiddingController {

	@Autowired
	private MatterBiddingService matterBiddingService;
	/**
	 * 
	* @Description: 竞价采购分页列表 
	* @param tenderCreateTimeStart
	* @param tenderCreateTimeEnd
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
	@GetMapping("/matterBidding")
	public Result getMatterBiddingPagedList(@RequestParam(required=false) Date tenderCreateTimeStart,@RequestParam(required=false) Date tenderCreateTimeEnd,
			@RequestParam(required=false) String purchaseCompany,@RequestParam(required=false) String tenderMethod,
			@RequestParam(required=false) String tenderStatus,@RequestParam(required=false) String tenderName,@RequestParam(required=true) String isPeriod,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchMatterBiddingInput input = new SearchMatterBiddingInput(index,size);
		input.setPurchaseCompany(purchaseCompany);
		input.setIsPeriod(isPeriod);
		input.setTenderCreateTimeEnd(tenderCreateTimeEnd);
		input.setTenderCreateTimeStart(tenderCreateTimeStart);
		input.setTenderMethod(tenderMethod);
		input.setTenderName(tenderName);
		input.setTenderStatus(tenderStatus);
		return Result.Success(matterBiddingService.getMatterBiddingPagedList(input));
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
	@PostMapping("/matterBidding")
	public Result addMatterBidding(@RequestBody AddMatterBiddingInput input) throws Exception{
		matterBiddingService.addMatterBidding(input);
		return Result.Success();
		
	}
	

	/**
	 * 
	* @Description: 取得报价结果信息  
	* @param purcMatterTenderPurchaseId
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterBidding/result")
	public Result getSupplierTenderList(@RequestParam(required=true) Integer purcMatterTenderPurchaseId) {
		return Result.Success(matterBiddingService.getSupplierTenderList(purcMatterTenderPurchaseId));
	}

	
	/**
	 * 
	* @Description: 竞价结果处理  
	* @param input
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/matterBidding/result")
	public Result addBiddingResult(@RequestBody AddBiddingResultInput input){
		matterBiddingService.addBiddingResult(input);
		return Result.Success();
		
	}
	

	/**
	 * 
	* @Description: 取得周期性报价结果信息  
	* @param purcMatterTenderPurchaseId
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterBidding/periodResult")
	public Result getPeriodSupplierTenderList(@RequestParam(required=true) Integer purcMatterTenderPurchaseId) {
		return Result.Success(matterBiddingService.getPeriodSupplierTenderList(purcMatterTenderPurchaseId));
	}

	/**
	 * 
	* @Description: 周期性竞价结果处理  
	* @param input
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/matterBidding/periodResult")
	public Result addPeriodInquiryResult(@RequestBody MatterPeriodSupplierTenderDetailOutput input){
		matterBiddingService.addPeriodBiddingResult(input);
		return Result.Success();
		
	}
}

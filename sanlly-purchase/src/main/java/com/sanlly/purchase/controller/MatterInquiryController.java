package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.inquiry.AddInquiryResultInput;
import com.sanlly.purchase.models.input.inquiry.AddMatterInquiryInput;
import com.sanlly.purchase.models.input.inquiry.AddReInquiryInput;
import com.sanlly.purchase.models.input.inquiry.SearchMatterInquiryInput;
import com.sanlly.purchase.models.output.matterinquiry.MatterPeriodSupplierTenderDetailOutput;
import com.sanlly.purchase.service.MatterInquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * 
* Description: 询价采购接口
* @ClassName: MatterInquiryController
* @date 2019年8月19日
*
* @author jlx
 */
@RestController
public class MatterInquiryController {

	@Autowired
	private MatterInquiryService matterInquiryService;
	/**
	 * 
	* @Description: 询价采购分页列表 
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
	@GetMapping("/matterInquiry")
	public Result getMatterInquiryPagedList(@RequestParam(required=false) Date tenderCreateTimeStart,@RequestParam(required=false) Date tenderCreateTimeEnd,
			@RequestParam(required=false) String purchaseCompany,@RequestParam(required=false) String tenderMethod,
			@RequestParam(required=false) String tenderStatus,@RequestParam(required=false) String tenderName,@RequestParam(required=true) String isPeriod,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchMatterInquiryInput input = new SearchMatterInquiryInput(index,size);
		input.setPurchaseCompany(purchaseCompany);
		input.setIsPeriod(isPeriod);
		input.setTenderCreateTimeEnd(tenderCreateTimeEnd);
		input.setTenderCreateTimeStart(tenderCreateTimeStart);
		input.setTenderMethod(tenderMethod);
		input.setTenderName(tenderName);
		input.setTenderStatus(tenderStatus);
		return Result.Success(matterInquiryService.getMatterInquiryPagedList(input));
	}

	/**
	 * 
	* @Description: 招标-竞价-询价未采纳推荐供应商审核列表
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
	@GetMapping("/matterAudit")
	public Result getMatterAuditPagedList(@RequestParam(required=false) String auditStatus,@RequestParam(required=false) Date tenderCreateTimeStart,@RequestParam(required=false) Date tenderCreateTimeEnd,
			@RequestParam(required=false) String purchaseCompany,@RequestParam(required=false) String tenderMethod,
			@RequestParam(required=false) String tenderStatus,@RequestParam(required=false) String tenderName,@RequestParam(required=true) String isPeriod,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchMatterInquiryInput input = new SearchMatterInquiryInput(index,size);
		input.setPurchaseCompany(purchaseCompany);
		input.setIsPeriod(isPeriod);
		input.setTenderCreateTimeEnd(tenderCreateTimeEnd);
		input.setTenderCreateTimeStart(tenderCreateTimeStart);
		input.setTenderMethod(tenderMethod);
		input.setTenderName(tenderName);
		input.setTenderStatus(tenderStatus);
		input.setAuditStatus(auditStatus);
		return Result.Success(matterInquiryService.getMatterAuditPagedList(input));
	}
	/**
	 * 
	* @Description: 发布询价采购 
	* @param input
	* @return Result
	 * @throws Exception 
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/matterInquiry")
	public Result addMatterInquiry(@RequestBody AddMatterInquiryInput input) throws Exception{
		matterInquiryService.addMatterInquiry(input);
		return Result.Success();
		
	}
	/**
	 * 
	* @Description: 重新发布询价采购
	* @param input
	* @return Result
	 * @throws Exception 
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/matterInquiry/addReInquiry")
	public Result addMatterReInquiry(@RequestBody AddMatterInquiryInput input) throws Exception{
		matterInquiryService.addMatterReInquiry(input);
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
	@GetMapping("/matterInquiry/result")
	public Result getSupplierTenderList(@RequestParam(required=true) Integer purcMatterTenderPurchaseId) {
		return Result.Success(matterInquiryService.getSupplierTenderList(purcMatterTenderPurchaseId));
	}
	

	/**
	 * 
	* @Description: 取得周期性报价结果信息  
	* @param purcMatterTenderPurchaseId
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterInquiry/periodResult")
	public Result getPeriodSupplierTenderList(@RequestParam(required=true) Integer purcMatterTenderPurchaseId) {
		return Result.Success(matterInquiryService.getPeriodSupplierTenderList(purcMatterTenderPurchaseId));
	}
	/**
	 * 
	* @Description: 重新询价 
	* @param purcMatterTenderPurchaseId
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterInquiry/reInquiry")
	public Result getReMatterInquiry(@RequestParam(required=true) Integer purcMatterTenderPurchaseId) {
		return Result.Success(matterInquiryService.getReMatterInquiry(purcMatterTenderPurchaseId));
	}

	
	/**
	 * 
	* @Description: 询价结果处理  
	* @param input
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/matterInquiry/result")
	public Result addInquiryResult(@RequestBody AddInquiryResultInput input){
		matterInquiryService.addInquiryResult(input);
		return Result.Success();
		
	}
	/**
	 * 
	* @Description: 周期性询价结果处理  
	* @param input
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/matterInquiry/periodResult")
	public Result addPeriodInquiryResult(@RequestBody MatterPeriodSupplierTenderDetailOutput input){
		matterInquiryService.addPeriodInquiryResult(input);
		return Result.Success();
		
	}
	/**
	 * 
	* @Description: 再次询价
	* @param input
	* @return Result
	 * @throws Exception 
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/matterInquiry/reInquiry")
	public Result addReInquiry(@RequestBody AddReInquiryInput input) throws Exception{
		matterInquiryService.addReInquiry(input);
		return Result.Success();
		
	}

	/**
	 * 未采纳推荐审核或驳回
	 * @param status
	 * @param purcMatterTemporaryPurchaseId
	 * @param processInstanceIds
	 * @param taskIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/matterTenderAudit")
	public Result auditMatterPurchase(@RequestParam(required=false) String status,@RequestParam Integer[] purcMatterTenderPurchaseIds,@RequestParam String[] processInstanceIds,@RequestParam String[] taskIds) {
		if(status.equals("1")) {
			matterInquiryService.auditMatterPurchase(purcMatterTenderPurchaseIds, processInstanceIds, taskIds);
		}else {
			matterInquiryService.rejectMatterPurchase(purcMatterTenderPurchaseIds, processInstanceIds, taskIds);
		}		
		return Result.Success();
	}
}

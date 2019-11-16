package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.demand.AddMatterTemporaryPurchaseInput;
import com.sanlly.purchase.models.input.demand.SearchMatterTemporaryPurchaseInput;
import com.sanlly.purchase.models.output.matterpurchase.MatterPurchaseOutput;
import com.sanlly.purchase.service.MatterTemporaryPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
* Description: 物料直接采购单接口
* @ClassName: MatterTemporaryPurchaseController
* @date 2019年8月10日
*
* @author jlx
 */
@RestController
public class MatterTemporaryPurchaseController {
	
	@Autowired
	private MatterTemporaryPurchaseService matterTemporaryPurchaseService;

	/**
	 * 采购单分页列表
	 * @param demandNo
	 * @param purchaseCompany
	 * @param sparePartsNo
	 * @param supplier
	 * @param auditStatus
	 * @param purchasingPattern
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterPurchase")
	public Result matterPurchasePagedList(@RequestParam(required=false) String demandNo,@RequestParam(required=false) String purchaseCompany,
			@RequestParam(required=false) String sparePartsNo,@RequestParam(required=false) String supplier,
			@RequestParam(required=false) String auditStatus,@RequestParam(required=false) String purchasingPattern,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchMatterTemporaryPurchaseInput input = new SearchMatterTemporaryPurchaseInput(index,size);
		input.setDemandNo(demandNo);
		input.setPurchaseCompany(purchaseCompany);
		input.setSparePartsNo(sparePartsNo);
		input.setSupplier(supplier);
		input.setAuditStatus(auditStatus);		
		input.setPurchasingPattern(purchasingPattern);
		return Result.Success(matterTemporaryPurchaseService.getMatterTemporaryPurchasePagedList(input));
	}
	

	/**
	 * 采购单审核分页列表
	 * @param demandNo
	 * @param purchaseCompany
	 * @param sparePartsNo
	 * @param supplier
	 * @param auditStatus
	 * @param purchasingPattern
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterPurchaseAudit")
	public Result getAuditPurchasePagedList(@RequestParam(required=false) String demandNo,@RequestParam(required=false) String purchaseCompany,
			@RequestParam(required=false) String sparePartsNo,@RequestParam(required=false) String supplier,
			@RequestParam(required=false) String auditStatus,@RequestParam(required=false) String purchasingPattern,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchMatterTemporaryPurchaseInput input = new SearchMatterTemporaryPurchaseInput(index,size);
		input.setDemandNo(demandNo);
		input.setPurchaseCompany(purchaseCompany);
		input.setSparePartsNo(sparePartsNo);
		input.setSupplier(supplier);
		input.setAuditStatus(auditStatus);		
		input.setPurchasingPattern(purchasingPattern);
		return Result.Success(matterTemporaryPurchaseService.getAuditPurchasePagedList(input));
	}
	
	/**
	 * 直接采购生成采购单
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/matterPurchase")
	public Result addMatterTemporaryPurchase(@RequestBody AddMatterTemporaryPurchaseInput input){
		
		   return matterTemporaryPurchaseService.addMatterTemporaryPurchase(input);
	}
	
	/**
	 * 采购审核或驳回
	 * @param status
	 * @param purcMatterTemporaryPurchaseId
	 * @param processInstanceIds
	 * @param taskIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/matterPurchaseAudit")
	public Result auditMatterPurchase(@RequestParam(required=false) String status,@RequestParam Integer[] purcMatterTemporaryPurchaseId,@RequestParam String[] processInstanceIds,@RequestParam String[] taskIds) {
		if(status.equals("1")) {
			matterTemporaryPurchaseService.auditMatterPurchase(purcMatterTemporaryPurchaseId, processInstanceIds, taskIds);
		}else {
			matterTemporaryPurchaseService.rejectMatterPurchase(purcMatterTemporaryPurchaseId, processInstanceIds, taskIds);
		}		
		return Result.Success();
	}
	/**
	 * 协议采购审核
	 * @param status
	 * @param purcMatterTemporaryPurchaseId
	 * @param processInstanceIds
	 * @param taskIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/AgreementAudit")
	public Result auditMatterPurchase(@RequestParam(required=false) String status,@RequestParam Integer[] purcMatterTemporaryPurchaseId) {
		if(status.equals("1")) {
			matterTemporaryPurchaseService.auditMatterPurchase(purcMatterTemporaryPurchaseId);
		}else {
			matterTemporaryPurchaseService.rejectMatterPurchase(purcMatterTemporaryPurchaseId);
		}
		return Result.Success();
	}

	/**
	 * 
	* @Description: 取得采购单编辑信息  
	* @param purcMatterTemporaryPurchaseId
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterPurchase/info")
	public Result getMatterTemporaryPurchaseInfo(@RequestParam Integer purcMatterTemporaryPurchaseId) {
		return Result.Success(matterTemporaryPurchaseService.getMatterTemporaryPurchaseInfo(purcMatterTemporaryPurchaseId));
	}
	

	/**
	 * 编辑采购单
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/matterPurchase")
	public Result editMatterTemporaryPurchase(@RequestBody MatterPurchaseOutput input){
		
		matterTemporaryPurchaseService.editMatterTemporaryPurchase(input);
		return Result.Success();
		
	}
	

	/**
	 * 删除采购单
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/matterPurchase")
	public Result editMatterTemporaryPurchase(@RequestParam Integer[] purchaseIds){
		
		matterTemporaryPurchaseService.delMatterTemporaryPurchase(purchaseIds);
		return Result.Success();
		
	}
}

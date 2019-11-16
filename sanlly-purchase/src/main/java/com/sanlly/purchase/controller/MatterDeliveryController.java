package com.sanlly.purchase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.matterdeliver.AddMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.SearchMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.StockinOutput;
import com.sanlly.purchase.models.input.matterinvoice.AddMatterInvoiceInput;
import com.sanlly.purchase.service.MatterDeliveryService;

@RestController
public class MatterDeliveryController {

	@Autowired
	private MatterDeliveryService matterDeliveryService;
	/**
	 * 
	* @Description: 取得送货信息 
	* @param purcPurchaseOrderId
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/MatterDeliveryInfo")
	public Result getDeliveryInfo(@RequestParam(required=true) Integer purcPurchaseOrderId){
		
		return Result.Success(matterDeliveryService.getDeliveryInfo(purcPurchaseOrderId));
	}
	/**
	 * 
	* @Description: 送货单分页列表 
	* @param deliveryNum
	* @param purchaseCompany
	* @param isVerifyAccount
	* @param reciveStatus
	* @param supplyType
	* @param index
	* @param size
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/MatterDelivery")
	public Result getMatterDeliveryPagedList(@RequestParam(required=false) String deliveryNum,@RequestParam(required=false) String purchaseCompany,
			@RequestParam(required=false) String isVerifyAccount,@RequestParam(required=false) String reciveStatus,
			@RequestParam(required=false) String supplyType,@RequestParam(required=false) String supplier,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchMatterDeliveryInput input = new SearchMatterDeliveryInput(index,size);
		input.setPurchaseCompany(purchaseCompany);
		input.setDeliveryNum(deliveryNum);
		input.setIsVerifyAccount(isVerifyAccount);
		input.setReciveStatus(reciveStatus);
		input.setSupplyType(supplyType);
		input.setSupplier(supplier);
		return Result.Success(matterDeliveryService.getMatterDeliveryPagedList(input));
	}
	
	/**
	 * 
	* @Description: 送货单入库信息取得 
	* @param purcPurchaseDeliveryId
	* @param purcPurchaseDeliveryDetailIds
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/MatterDeliveryTOStockin")
	public Result getMatterDeliveryTOStockin(@RequestParam(required=false) Integer purcPurchaseDeliveryId,@RequestParam(required=false) Integer[] purcPurchaseDeliveryDetailIds) {

		SearchMatterDeliveryInput input = new SearchMatterDeliveryInput();
		input.setPurcPurchaseDeliveryId(purcPurchaseDeliveryId);
		input.setPurcPurchaseDeliveryDetailIds(purcPurchaseDeliveryDetailIds);
		return Result.Success(matterDeliveryService.getMatterDeliveryTOStockin(input));
	}
	/**
	 * 生成送货单
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/MatterDelivery")
	public Result addMatterDelivery(@RequestBody AddMatterDeliveryInput input){
		matterDeliveryService.addMatterDelivery(input);
		return Result.Success();
			
	}

	/**
	 * 
	* @Description: 删除送货信息 
	* @param purcPurchaseDeliveryIds
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/MatterDelivery")
	public Result delMatterDelivery(@RequestParam(required=true) Integer[] purcPurchaseDeliveryIds){
		matterDeliveryService.delMatterDelivery(purcPurchaseDeliveryIds);
		return Result.Success();
	}

	/**
	 * 
	* @Description: 送货单入库 
	* @param stockinOutput
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/MatterDelivery/stockin")
	public Result deliveryStockin(@RequestBody StockinOutput stockinOutput) {
		matterDeliveryService.deliveryStockin(stockinOutput);
		return Result.Success();
	}
	/**
	 * 
	* @Description: 对账 
	* @param purcPurchaseDeliveryIds
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/MatterDelivery/verify")
	public Result verifyMatterDelivery(@RequestParam(required=true) Integer[] purcPurchaseDeliveryIds){
		matterDeliveryService.verifyMatterDelivery(purcPurchaseDeliveryIds);
		return Result.Success();
	}
	/**
	 * 
	* @Description: 对账确认 
	* @param purcPurchaseDeliveryIds
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/MatterDelivery/verifyOk")
	public Result verifyOkMatterDelivery(@RequestParam(required=true) Integer[] purcPurchaseDeliveryIds){
		matterDeliveryService.verifyOkMatterDelivery(purcPurchaseDeliveryIds);
		return Result.Success();
	}

	

	/**
	 * 
	* @Description: 对账-送货单分页列表 
	* @param deliveryNum
	* @param purchaseCompany
	* @param isVerifyAccount
	* @param reciveStatus
	* @param supplyType
	* @param index
	* @param size
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/MatterDelivery/verify")
	public Result getVerifyPagedList(@RequestParam(required=false) String deliveryNum,@RequestParam(required=false) String purchaseCompany,
			@RequestParam(required=false) String isVerifyAccount,
			@RequestParam(required=false) String supplier,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchMatterDeliveryInput input = new SearchMatterDeliveryInput(index,size);
		input.setPurchaseCompany(purchaseCompany);
		input.setDeliveryNum(deliveryNum);
		input.setIsVerifyAccount(isVerifyAccount);
		input.setSupplier(supplier);
		
		return Result.Success(matterDeliveryService.getVerifyPagedList(input));
	}
}

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
import com.sanlly.purchase.models.input.dailydeliver.AddDailyDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.AddMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.SearchMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.StockinOutput;
import com.sanlly.purchase.service.DailyDeliveryService;
import com.sanlly.purchase.service.MatterDeliveryService;

/**
 * 
* @Package com.sanlly.purchase.controller 
* @Description: 日常采购-送货单接口 
* @author jlx   
* @date 2019年9月16日 上午11:29:21 
* @version V1.0   
 */
@RestController
public class DailyDeliveryController {


	@Autowired
	private DailyDeliveryService dailyDeliveryService;
	/**
	 * 
	* @Description: 取得送货信息 
	* @param purcPurchaseOrderId
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/DailyDeliveryInfo")
	public Result getDeliveryInfo(@RequestParam(required=true) Integer purcPurchaseOrderId){
		
		return Result.Success(dailyDeliveryService.getDeliveryInfo(purcPurchaseOrderId));
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
	@GetMapping("/DailyDelivery")
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
		return Result.Success(dailyDeliveryService.getMatterDeliveryPagedList(input));
	}
	/**
	 * 生成送货单
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/DailyDelivery")
	public Result addMatterDelivery(@RequestBody AddDailyDeliveryInput input){
		dailyDeliveryService.addDailyDelivery(input);
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
	@DeleteMapping("/DailyDelivery")
	public Result delMatterDelivery(@RequestParam(required=true) Integer[] purcPurchaseDeliveryIds){
		dailyDeliveryService.delMatterDelivery(purcPurchaseDeliveryIds);
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
	@PutMapping("/DailyDelivery/verify")
	public Result verifyMatterDelivery(@RequestParam(required=true) Integer[] purcPurchaseDeliveryIds){
		dailyDeliveryService.verifyMatterDelivery(purcPurchaseDeliveryIds);
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
	@PutMapping("/DailyDelivery/verifyOk")
	public Result verifyOkMatterDelivery(@RequestParam(required=true) Integer[] purcPurchaseDeliveryIds){
		dailyDeliveryService.verifyOkMatterDelivery(purcPurchaseDeliveryIds);
		return Result.Success();
	}

	

	/**
	 * 
	* @Description: 对账单分页列表 
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
	@GetMapping("/DailyDelivery/verify")
	public Result getVerifyPagedList(@RequestParam(required=false) String deliveryNum,@RequestParam(required=false) String purchaseCompany,
			@RequestParam(required=false) String isVerifyAccount,
			@RequestParam(required=false) String supplier,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchMatterDeliveryInput input = new SearchMatterDeliveryInput(index,size);
		input.setPurchaseCompany(purchaseCompany);
		input.setDeliveryNum(deliveryNum);
		input.setIsVerifyAccount(isVerifyAccount);
		input.setSupplier(supplier);
		
		return Result.Success(dailyDeliveryService.getVerifyPagedList(input));
	}
	

	/**
	 * 
	* @Description: 取得验收信息 
	* @param purcPurchaseOrderId
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/DailyAcceptInfo")
	public Result getAcceptInfo(@RequestParam(required=true) Integer purcPurchaseDeliveryId){
		
		return Result.Success(dailyDeliveryService.getAcceptInfo(purcPurchaseDeliveryId));
	}
	/**
	 * 日常验收
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/DailyAccept")
	public Result addAcceptDelivery(@RequestBody AddDailyDeliveryInput input){
	return 	dailyDeliveryService.addAcceptDelivery(input);

	}
}

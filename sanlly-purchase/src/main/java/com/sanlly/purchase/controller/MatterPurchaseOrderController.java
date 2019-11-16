package com.sanlly.purchase.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.matterorder.SearchPurchaseOrderInput;
import com.sanlly.purchase.models.input.periodproduct.SearchPeriodProductInput;
import com.sanlly.purchase.service.MatterOrderService;

/**
 * 
* @Package com.sanlly.purchase.controller 
* @Description: 物料采购订单接口 
* @author jlx   
* @date 2019年9月4日 下午5:34:37 
* @version V1.0   
 */
@RestController
public class MatterPurchaseOrderController {

	@Autowired
	private MatterOrderService purchaseOrderService;
	
	/**
	 * 
	* @Description: 订单分页列表接口
	* @param purchaseCompany
	* @param purchasingPattern
	* @param supplier
	* @param index
	* @param size
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/matterOrders")
	public Result getPurchaseOrderPagedList(@RequestParam(required=false) String purchaseCompany,@RequestParam(required=false) String purchasingPattern,
			@RequestParam(required=false) String supplier,@RequestParam(required=false) String orderStatus,@RequestParam(required=false) String sparePartsNo,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchPurchaseOrderInput input = new SearchPurchaseOrderInput(index,size);
		input.setPurchaseCompany(purchaseCompany);
		input.setSupplier(supplier);
		input.setPurchasingPattern(purchasingPattern);
		input.setOrderStatus(orderStatus);
		input.setSparePartsNo(sparePartsNo);
		return Result.Success(purchaseOrderService.getPurchaseOrderPagedList(input));
	}
	/**
	 * 
	* @Description: 更新订单状态为完成  
	* @param purcPurchaseOrderId
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/matterOrders")
	public Result updateOrderStatus(@RequestParam(required=true) Integer purcPurchaseOrderId) {
		purchaseOrderService.updateOrderStatus(purcPurchaseOrderId);
		return Result.Success();
	}
	
}

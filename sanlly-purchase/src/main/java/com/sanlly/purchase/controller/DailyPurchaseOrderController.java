package com.sanlly.purchase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.matterorder.SearchPurchaseOrderInput;
import com.sanlly.purchase.service.DailyOrderService;

/**
 * 
* @Package com.sanlly.purchase.controller 
* @Description: 日常采购订单接口 
* @author jlx   
* @date 2019年9月4日 下午5:34:37 
* @version V1.0   
 */
@RestController
public class DailyPurchaseOrderController {

	@Autowired
	private DailyOrderService dailyOrderService;
	
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
	@GetMapping("/dailyOrders")
	public Result getPurchaseOrderPagedList(@RequestParam(required=false) String purchaseCompany,@RequestParam(required=false) String purchasingPattern,
			@RequestParam(required=false) String supplier,@RequestParam(required=false) String orderStatus,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchPurchaseOrderInput input = new SearchPurchaseOrderInput(index,size);
		input.setPurchaseCompany(purchaseCompany);
		input.setSupplier(supplier);
		input.setPurchasingPattern(purchasingPattern);
		input.setOrderStatus(orderStatus);
		return Result.Success(dailyOrderService.getPurchaseOrderPagedList(input));
	}
	/**
	 * 
	* @Description: 更新订单状态为完成  
	* @param purcPurchaseOrderId
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/dailyOrders")
	public Result updateOrderStatus(@RequestParam(required=true) Integer purcPurchaseOrderId) {
		dailyOrderService.updateOrderStatus(purcPurchaseOrderId);
		return Result.Success();
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/supplierKey")
	public Result getSupplierKey() {
		return Result.Success(dailyOrderService.getSupplierKey());
	}
	
}

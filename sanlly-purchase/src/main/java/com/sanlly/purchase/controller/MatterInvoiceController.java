package com.sanlly.purchase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.matterdeliver.SearchMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterinvoice.AddMatterInvoiceInput;
import com.sanlly.purchase.models.input.matterinvoice.SearchMatterInvoiceInput;
import com.sanlly.purchase.service.MatterInvoiceService;

/**
 * 
* @Package com.sanlly.purchase.controller 
* @Description: 集中采购发票接口 
* @author jlx   
* @date 2019年9月9日 上午11:48:05 
* @version V1.0   
 */
@RestController
public class MatterInvoiceController {
	@Autowired
	private MatterInvoiceService matterInvoiceService;

	@SuppressWarnings("rawtypes")
	@GetMapping("/Invoice")
	public Result getMatterDeliveryPagedList(@RequestParam(required=false) String purchaseCompany,
			@RequestParam(required=false) String supplier,
			@RequestParam(required=false) String invoiceNo,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchMatterInvoiceInput input = new SearchMatterInvoiceInput(index,size);
		input.setPurchaseCompany(purchaseCompany);
		input.setSupplier(supplier);
		input.setInvoiceNo(invoiceNo);
		
		return Result.Success(matterInvoiceService.getMatterInvoicePagedList(input));
	}
	/**
	 * 
	* @Description: 发票录入 
	* @param input
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/Invoice")
	public Result addInvoice(@RequestBody AddMatterInvoiceInput input) {
		matterInvoiceService.addInvoice(input);
		return Result.Success();
	}

	@SuppressWarnings("rawtypes")
	@DeleteMapping("/Invoice")
	public Result delInvoice(@RequestParam(required=true) Integer[] purcPurchaseBillIds){
		matterInvoiceService.delInvoice(purcPurchaseBillIds);
		return Result.Success();
	}
}

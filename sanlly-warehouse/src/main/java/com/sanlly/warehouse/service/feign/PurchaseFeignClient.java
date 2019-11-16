package com.sanlly.warehouse.service.feign;

import java.util.List;

import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.invoice.InvoiceTypeOutput;
import com.sanlly.warehouse.config.FeignClientConfig;
import com.sanlly.warehouse.models.input.purchase.AddMatterDemandInput;
import com.sanlly.warehouse.service.fallback.PurchaseFallback;


@FeignClient(name = "purchase",configuration=FeignClientConfig.class,fallback=PurchaseFallback.class)
public interface PurchaseFeignClient {

	@PostMapping("/mutiMatterDemand")
	Result addMutiMatterDemand(List<AddMatterDemandInput> input);


	@GetMapping("/invoiceType")
	Result getInvoiceType();


	@GetMapping("/getinvoiceType")
	Result<Double> getInvoiceTypes(@RequestParam(value="key") String key);

	@PutMapping("/MatterDelivery/stockin")
	Result deliveryStockin(@RequestBody StockinOutput stockinOutput) ;

    @GetMapping("/MatterDelivery")
    Result getMatterDeliveryPagedList(@RequestParam(required=false,value = "deliveryNum") String deliveryNum,
                                      @RequestParam(required=false,value = "purchaseCompany") String purchaseCompany,
                                      @RequestParam(required=false,value = "isVerifyAccount") String isVerifyAccount,
                                      @RequestParam(required=false,value = "reciveStatus") String reciveStatus,
                                      @RequestParam(required=false,value = "supplyType") String supplyType,
                                      @RequestParam(value = "index") Integer index,
                                      @RequestParam(value = "size") Integer size);
    

    /**
     * 根据key 获取发票信息
     * @param key
     * @return
     */
	@GetMapping("/getInvoice")
	Result<InvoiceTypeOutput> getInvoice(@RequestParam(value="key") String key);

	/**
	 * 
	* @Description: 获取供应商币种通过key 
	* @param supplierKey
	* @return Result<String>
	* @throws 
	 */
	@GetMapping("/getSupplierSapByKey")
	Result<String> getSupplierSapByKey(@RequestParam(value="supplierKey") String supplierKey);
	/**
	 * 
	* @Description: 获取供应商币种通过key 
	* @param supplierKey
	* @return Result<String>
	* @throws 
	 */
	@GetMapping("/getCurrencyByKey")
	Result<String> getCurrencyByKey(@RequestParam(value="supplierKey") String supplierKey);

	@PostMapping("/evaluates")
	Result evaluatePriceAndTimely(@RequestParam(value="deliveryNum") String deliveryNum,@RequestParam(value="updateUser",required=false) Integer updateUser);
	
	@PutMapping("/evaluates")
	Result evaluateQualityAndService(@RequestParam(value="deliveryNum") String deliveryNum,@RequestParam(value="qualityScore") Double qualityScore,@RequestParam(value="serviceScore") Double serviceScore,@RequestParam(value="updateUser",required=false) Integer updateUser);
}

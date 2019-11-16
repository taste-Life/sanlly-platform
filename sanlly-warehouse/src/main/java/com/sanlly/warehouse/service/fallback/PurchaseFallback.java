package com.sanlly.warehouse.service.fallback;

import java.util.List;

import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import org.springframework.stereotype.Component;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.invoice.InvoiceTypeOutput;
import com.sanlly.warehouse.models.input.purchase.AddMatterDemandInput;
import com.sanlly.warehouse.service.feign.PurchaseFeignClient;

@Component
public class PurchaseFallback implements PurchaseFeignClient {

	@Override
	public Result addMutiMatterDemand(List<AddMatterDemandInput> input) {
		
		return null;
	}

	@Override
	public Result getInvoiceType() {
		return null;
	}

	@Override
	public Result getInvoiceTypes(String key) {
		return null;
	}

	@Override
	public Result deliveryStockin(StockinOutput stockinOutput) {
		return null;
	}

	@Override
	public Result getMatterDeliveryPagedList(String deliveryNum, String purchaseCompany, String isVerifyAccount, String reciveStatus, String supplyType, Integer index, Integer size) {
		return null;
	}

	@Override
	public Result<InvoiceTypeOutput> getInvoice(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result getSupplierSapByKey(String supplierKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<String> getCurrencyByKey(String supplierKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result evaluatePriceAndTimely(String deliveryNum, Integer updateUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result evaluateQualityAndService(String deliveryNum, Double qualityScore, Double serviceScore,
			Integer updateUser) {
		// TODO Auto-generated method stub
		return null;
	}


}

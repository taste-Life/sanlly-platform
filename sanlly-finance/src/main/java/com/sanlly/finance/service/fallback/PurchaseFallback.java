package com.sanlly.finance.service.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sanlly.common.models.output.Result;
import com.sanlly.finance.service.feign.PurchaseFeignClient;

/**
 * 	供应商 Feign 错误回调
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月9日  
 */
@Component
public class PurchaseFallback implements PurchaseFeignClient {

	@Override
	public List<String> getSupplierList(String name) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Result getOutSuppliersFinance() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	
	
	
}

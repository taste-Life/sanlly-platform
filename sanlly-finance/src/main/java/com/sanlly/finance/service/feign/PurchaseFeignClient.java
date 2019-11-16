package com.sanlly.finance.service.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sanlly.finance.service.fallback.PurchaseFallback;

/**
 * 供应商 Feign 调用入口
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月9日  
*
 */
@FeignClient(name = "purchase", fallback = PurchaseFallback.class)
public interface PurchaseFeignClient {

	/**
	 * 获取供应商列表
	 * 
	 * @return
	 */
	@GetMapping("/getSupplierList")
	List<String> getSupplierList(@RequestParam(value = "name") String name);
//	/**
//	 * @author fjy
//	 * 获取供应商列表  外包商  下拉框
//	 */	
//	@GetMapping("/getOutSuppliersFinance")
//	Result getOutSuppliersFinance();
	
	
	
	

}

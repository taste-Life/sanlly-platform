package com.sanlly.purchase.service.feign;

import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.lang.LangInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.purchase.config.FeignClientConfig;
import com.sanlly.purchase.service.fallback.ProductionFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@FeignClient(name = "production",configuration=FeignClientConfig.class,fallback=ProductionFallback.class)
public interface ProductionFeignClient {
	
	/**
	 * 获取key
	 * @return
	 */
	@GetMapping("/langs/{tableName}/key")
	Result<String> getKey(@PathVariable("tableName")String tableName);
	
	/**
	 * 用箱人下拉列表获取
	 * @return
	 */
	@PostMapping("/langs/object")
	public Result<Object> lang(@RequestBody LangInput input);
	/**
	 *查询公司集合
	 */
	@PostMapping("/company/searchList")
	public Result<List<CompanyOutput>> list(@RequestBody BaseSearchInput input);
}

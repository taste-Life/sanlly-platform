package com.sanlly.purchase.service.fallback;

import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.lang.LangInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.purchase.service.feign.ProductionFeignClient;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ProductionFallback implements ProductionFeignClient{

	@Override
	public Result<String> getKey(String tableName) {
		return null;
	}

	@Override
	public Result<Object> lang(LangInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<CompanyOutput>> list(BaseSearchInput input) {
		return null;
	}

}

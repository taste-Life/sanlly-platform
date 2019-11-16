package com.sanlly.finance.service.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.customerdeliver.CustomerDeliverDetailOutput;
import com.sanlly.finance.service.feign.WareHouseFeignClient;

/**
 * 仓储 Feign 错误回调
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月9日  
 */
@Component
public class WareHouseFallback implements WareHouseFeignClient {

	@Override
	public Result<List<CustomerDeliverDetailOutput>> getCustomerDeliverDetailOutputs(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
 
	
	
	
}

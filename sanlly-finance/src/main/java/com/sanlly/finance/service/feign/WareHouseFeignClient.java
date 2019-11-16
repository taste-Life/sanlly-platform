package com.sanlly.finance.service.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.customerdeliver.CustomerDeliverDetailOutput;
import com.sanlly.finance.service.fallback.ProductionFallback;
import com.sanlly.finance.service.fallback.WareHouseFallback;

/**
 * 生产 Feign 调用入口
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月9日  
*
 */
@FeignClient(name = "warehouse", fallback = WareHouseFallback.class)
public interface WareHouseFeignClient {


    /**
     *获取客户送修单明细byID
     */
    @GetMapping("/repairs/customerDeliver/detail/{id}")
    Result<List<CustomerDeliverDetailOutput>> getCustomerDeliverDetailOutputs(@PathVariable(value = "id") Integer id);
}

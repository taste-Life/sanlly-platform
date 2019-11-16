package com.sanlly.warehouse.service.feign;

import com.sanlly.common.models.input.finance.BillGiveRepairInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.config.FeignClientConfig;
import com.sanlly.warehouse.service.fallback.FinanceFallback;
import com.sanlly.warehouse.service.fallback.ProductionFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author lishzh
 */
@FeignClient(name = "finance", configuration = FeignClientConfig.class, fallback = FinanceFallback.class)
public interface FinanceFeignClient {

    /**
     *
     * @Description: 现场收费，生成账单和明细
     * @param input
     * @return Result
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/billGiveRepair/createBill")
    Result<Boolean> createBill(@RequestBody List<BillGiveRepairInput> list);
}

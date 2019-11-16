package com.sanlly.warehouse.service.fallback;

import com.sanlly.common.models.input.finance.BillGiveRepairInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.service.feign.FinanceFeignClient;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lishzh
 */
@Component
public class FinanceFallback implements FinanceFeignClient {
    /**
     * @param list
     * @return Result
     * @Description: 现场收费，生成账单和明细
     */
    @Override
    public Result<Boolean> createBill(List<BillGiveRepairInput> list) {
        System.out.println("request finance fail");
        return Result.Error(false);
    }
}

package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.quotecurrency.AddQuoteCurrencyInput;
import com.sanlly.warehouse.models.input.quotecurrency.EditQuoteCurrencyInput;
import com.sanlly.warehouse.service.WareQuoteCurrencyService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: WareQuoteCurrencyController
 * Description: 币种Controller层
 * date: 2019/7/25 16:48
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api(value="币种controller",tags={"币种操作接口"})
public class WareQuoteCurrencyController {

    @Autowired
    private WareQuoteCurrencyService quoteCurrencyService;

    /**
     * 获取币种列表
     * @return
     */
    @GetMapping("/quoteCurrency")
    public Result unitList(){

        return Result.Success(quoteCurrencyService.getQuoteCurrencyList());
    }


    /**
     * 根据Key查询币种
     * @param quoteCurrencyKey
     * @return
     */
    @GetMapping("/quoteCurrency/{quoteCurrencyKey}")
    public Result getUnit(@PathVariable(value = "unitKey")String quoteCurrencyKey){
        EditQuoteCurrencyInput editQuoteCurrencyInput = new EditQuoteCurrencyInput();
        editQuoteCurrencyInput.setKey(quoteCurrencyKey);
        return Result.Success(quoteCurrencyService.getQuoteCurrency(editQuoteCurrencyInput));
    }

    /**
     * 添加币种
     * @param input
     * @return
     */
    @PostMapping("/quoteCurrency")
    public Result addUnit(@RequestBody AddQuoteCurrencyInput input){
        quoteCurrencyService.addQuoteCurrency(input);
        return Result.Success();
    }

    /**
     * 修改币种
     * @param input
     * @return
     */
    @PutMapping("/quoteCurrency")
    public Result editUnit(@RequestBody EditQuoteCurrencyInput input){
        quoteCurrencyService.updateQuoteCurrency(input);
        return Result.Success();
    }

    /**
     * 根据单位ID删除币种
     * @param quoteCurrencyIds
     * @return
     */
    @DeleteMapping("/quoteCurrency")
    public Result deleteUnit(@RequestParam Integer[] quoteCurrencyIds){
        quoteCurrencyService.deleteQuoteCurrency(quoteCurrencyIds);
        return Result.Success();
    }
}

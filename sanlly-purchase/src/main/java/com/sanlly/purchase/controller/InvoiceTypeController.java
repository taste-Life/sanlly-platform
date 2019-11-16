package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.invoicetype.AddInvoiceTypeInput;
import com.sanlly.purchase.models.input.invoicetype.EditInvoiceTypeInput;
import com.sanlly.purchase.models.output.invoicetype.InvoiceTypeOutput;
import com.sanlly.purchase.service.InvoiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 发票管理
 * @ClassName: InvoiceTypeController
 * @Version 1.0
 * @Author mqz
 */
@RestController
public class InvoiceTypeController {

    @Autowired
    InvoiceTypeService invoiceTypeService ;

    /**
     * 获取发票列表
     * @return
     */
    @GetMapping("/invoiceType")
    public Result getInvoiceType(){

        return  Result.Success(invoiceTypeService.getInvoiceType());
    }

    /**
     * 删除发票
     * @param purcInvoiceTypeIds
     * @return
     */
    @DeleteMapping("/invoiceType")
    public  Result deleteInvoiceType(@RequestParam Integer[] purcInvoiceTypeIds ){
        invoiceTypeService.deleteInvoiceType(purcInvoiceTypeIds);
        return  Result.Success();

    }

    /**
     * 添加发票类型
     * @param input
     * @return
     */
    @PostMapping("/invoiceType")
    public  Result addInvoiceType(@RequestBody AddInvoiceTypeInput input){
        invoiceTypeService.addInvoiceType(input);
        return Result.Success();
    }

    /**
     * 修改发票类型
     * @param invoiceTypeInput
     * @return
     */
    @PutMapping("/invoiceType")
    public Result editInvoiceType(@RequestBody EditInvoiceTypeInput invoiceTypeInput){

        invoiceTypeService.editInvoiceType(invoiceTypeInput);
        return  Result.Success();
    }
    /**
     *获取税点
     */
    @GetMapping("/getinvoiceType")
    public  Result getInvoiceTypes(@RequestParam String key){

        return  Result.Success(invoiceTypeService.getInvoiceTypes(key));
    }
    /**
     * 根据key 获取发票信息
     * @param key
     * @return
     */
    @GetMapping("/getInvoice")
    public  Result<InvoiceTypeOutput> getInvoice(@RequestParam String key){

        return  Result.Success(invoiceTypeService.getInvoice(key));
    }

}

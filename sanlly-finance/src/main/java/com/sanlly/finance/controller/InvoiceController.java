package com.sanlly.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.finance.models.input.SearchInvoiceInput;
import com.sanlly.finance.service.InvoiceService;

/**
 * 客户信息控制层
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月8日  
*
 */
@RestController
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;
	
	/**
	 * 
	 * @Description:商务结算发票分页查询
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getInvoicePage")
	public Result getBusinessInvoicePage(@RequestBody SearchInvoiceInput input) {
		return Result.Success(invoiceService.getInvoicePage(input));
	}
	
	/**
	 * 
	 * @Description:商务结算发票全部导出
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/exportInvoiceAll")
	public Result exportInvoiceAll(@RequestBody SearchInvoiceInput input) {
		return Result.Success(invoiceService.exportInvoiceAll(input));
	}
	
	/**
	 * 
	 * @Description:商务结算发票全部导出
	 * @param input
	 * @return Result
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws ClassNotFoundException 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getBillByInvoice")
	public Result getBillByInvoice(@RequestBody SearchInvoiceInput input) throws Exception{
		return Result.Success(invoiceService.getBillByInvoice(input));
	}
	
	
	
	
	
	
	
	
}

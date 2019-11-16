package com.sanlly.finance.models.input;

import com.sanlly.common.models.input.PageInput;

/**
 * 发票检索输入类
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月8日  
*
 */
public class SearchInvoiceInput extends PageInput {

	public SearchInvoiceInput(){
		 
	}
	
	public SearchInvoiceInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}
	//发票号
	private String invoiceCode;
	//商务结算主表id
	private String businessId;

	public String getInvoiceCode() {
		return invoiceCode;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

 
	
	
	

}

package com.sanlly.common.enums;

/**
 *发票类型
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月10日  
 *
 */
public enum FinanceInvoiceTypeEnum {

	/**
	 * 普通发票
	 */
	Invoice01("LEFIINVOICE01", "普通发票"), 
	/**
	 * 增值税发票
	 */
	Invoice02("LEFIINVOICE02", "增值税发票"), 
	/**
	 * 收据
	 */
	Invoice03("LEFIINVOICE03", "收据"), 
	/**
	 * Invoice
	 */
	Invoice04("LEFIINVOICE04", "Invoice");
	
	FinanceInvoiceTypeEnum() {

	}

	FinanceInvoiceTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	private String code;

	private String message;

	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

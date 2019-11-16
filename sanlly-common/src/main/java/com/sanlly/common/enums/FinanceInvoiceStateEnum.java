package com.sanlly.common.enums;

/**
 * 发票开票状态
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月10日  
 *
 */
public enum FinanceInvoiceStateEnum {

	/**
	 * 未关联
	 */
	NORELATION("LEFIINVOICESTATE01", "未关联"), 
	/**
	 * 部分关联
	 */
	SUBRELATION("LEFIINVOICESTATE02", "部分关联"),
	/**
	 * 全部关联
	 */
	ISRELATION("LEFIINVOICESTATE03", "全部关联");
	
	FinanceInvoiceStateEnum() {

	}

	FinanceInvoiceStateEnum(String code, String message) {
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

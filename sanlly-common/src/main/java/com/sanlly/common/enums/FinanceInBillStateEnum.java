package com.sanlly.common.enums;

/**
 * 入账状态
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月9日  
*
 */
public enum FinanceInBillStateEnum {
	/**
	 * 待入账
	 */
	UNINBILL("LEFIINBILL01", "待入账"), 
	/**
	 * 已入账
	 */
	INBILL("LEFIINBILL02", "已入账");

	private String code;

	private String message;

	FinanceInBillStateEnum() {

	}

	FinanceInBillStateEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

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

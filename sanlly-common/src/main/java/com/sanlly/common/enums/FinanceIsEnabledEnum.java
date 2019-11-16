package com.sanlly.common.enums;

/**
 * 是否有效 是否启用
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月10日  
 *
 */
public enum FinanceIsEnabledEnum {

	/**
	 * 启用
	 */
	Enabled("LEFIENABLED01", "启用"), 
	/**
	 * 停用
	 */
	NoEnabled("LEFIENABLED02", "停用");
	
	FinanceIsEnabledEnum() {

	}

	FinanceIsEnabledEnum(String code, String message) {
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

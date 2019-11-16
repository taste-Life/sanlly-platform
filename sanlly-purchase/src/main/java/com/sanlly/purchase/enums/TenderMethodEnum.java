package com.sanlly.purchase.enums;

/**
 * 
* @Package com.sanlly.purchase.enums 
* @Description: 招标方式 
* @author jlx   
* @date 2019年8月20日 上午11:25:05 
* @version V1.0   
 */
public enum TenderMethodEnum { 
	INVITE("TenderMethodEnum01", "邀请"), OPEN("TenderMethodEnum02", "公开");

	private String code;

	private String message;

	TenderMethodEnum() {
	}

	TenderMethodEnum(String code, String message) {
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

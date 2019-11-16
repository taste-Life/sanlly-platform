package com.sanlly.purchase.enums;

/**
 * 
* @Package com.sanlly.purchase.enums 
* @Description: 对账状态 
* @author jlx   
* @date 2019年9月5日 下午6:05:53 
* @version V1.0   
 */
public enum VerifyAccountEnum {
	UNVERIFY("VerifyAccountEnum0", "未对账"), VERIFIED("VerifyAccountEnum2", "已对账"), VERIFING("VerifyAccountEnum1", "对账待确认"), INVOICED("VerifyAccountEnum3", "发票已录入");

	private String code;

	private String message;

	VerifyAccountEnum() {
	}

	VerifyAccountEnum(String code, String message) {
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

package com.sanlly.production.enums;
/**
 * 支付状态枚举
 * @author zhangkai
 *
 */
public enum ChargeStateEnum {

	CHARGING("LECHARGESTATE001", "支付中"),
	
	SUCCESS("LECHARGESTATE002", "支付成功"),
	
	FAIL("LECHARGESTATE003", "支付失败");
	
	private String code;
	
	private String message;

	private ChargeStateEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private ChargeStateEnum() {
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

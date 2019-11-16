package com.sanlly.production.enums;
/**
 * 支付结果枚举
 * @author zhangkai
 *
 */
public enum PayResultEnum {

	SUCCESS("LEPAYRESULT001", "支付成功"),
	ERROR("LEPAYRESULT002", "支付失败"),
	PAYING("LEPAYRESULT003", "支付中"),
	NOCHARGE("LEPAYRESULT004", "无此订单");
	
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

	private PayResultEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private PayResultEnum() {
	}
	
	
}

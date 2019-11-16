package com.sanlly.production.enums;

/**
 * 退款状态枚举
 * @author zhangkai
 *
 */
public enum BackStateEnum {

	ALL("LEBACKSTATE001", "全部退款"),
	PART("LEBACKSTATE002", "部分退款");
	
	private String code;
	
	private String message;

	private BackStateEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private BackStateEnum() {
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

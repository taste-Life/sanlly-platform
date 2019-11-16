package com.sanlly.production.enums;

public enum UnitStateEnum {
	/**
	 * 未知
	 */
	UNKNOWN("LEUnitStateEnum01", "未知"), 
	/**
	 * 好机组
	 */
	GOOD("LEUnitStateEnum02", "好机组"), 
	/**
	 * 坏机组
	 */
	BAD("LEUnitStateEnum03", "坏机组");

	private String code;

	private String message;

	UnitStateEnum() {

	}

	UnitStateEnum(String code, String message) {
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

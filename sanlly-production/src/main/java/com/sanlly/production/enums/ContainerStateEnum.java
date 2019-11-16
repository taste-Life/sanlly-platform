package com.sanlly.production.enums;

public enum ContainerStateEnum {
	/**
	 * 未知
	 */
	UNKNOWN("LEContainStateEnum01", "未知"), 
	/**
	 * 好箱
	 */
	GOOD("LEContainStateEnum02", "好箱"), 
	/**
	 * 坏箱
	 */
	BAD("LEContainStateEnum03", "坏箱");

	private String code;

	private String message;

	ContainerStateEnum() {

	}

	ContainerStateEnum(String code, String message) {
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

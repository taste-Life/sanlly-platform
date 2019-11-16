package com.sanlly.production.enums;

/**
 * 洗箱状态枚举
 * @author 
 *
 */
public enum CleaningStateEnum {
	/**
	 * 待洗箱
	 */
	UNCLEANING("LECleanStateEnum01", "待洗箱"),
	/**
	 *待审核
	 */
	UNAUDIT("LECleanStateEnum02", "待审核"),
	/**
	 * 已完工
	 */
	AUDITED("LECleanStateEnum03", "已完工");

	private String code;

	private String message;

	CleaningStateEnum() {

	}

	CleaningStateEnum(String code, String message) {
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

package com.sanlly.production.enums;

/**
 * 洗箱来源枚举
 * @author 
 *
 */
public enum CleaningSourceEnum {
	/**
	 * pti含水洗
	 */
	PTI("LECleanSourceEnum01", "pti含水洗"),
	/**
	 *洗箱条目
	 */
	ENTRY("LECleanSourceEnum02", "洗箱条目");

	private String code;

	private String message;

	CleaningSourceEnum() {

	}

	CleaningSourceEnum(String code, String message) {
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

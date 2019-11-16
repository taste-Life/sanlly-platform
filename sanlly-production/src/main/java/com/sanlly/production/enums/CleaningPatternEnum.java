package com.sanlly.production.enums;

/**
 * 洗箱模式枚举
 * @author 
 *
 */
public enum CleaningPatternEnum {
	/**
	 * 自营
	 */
	SELF("LECleaningPattern01", "自营"),
	/**
	 *外包
	 */
	OUT("LECleaningPattern02", "外包"),
	/**
	 * 自营+外包
	 */
	SELF_OUT("LECleaningPattern03", "自营+外包");

	private String code;

	private String message;

	CleaningPatternEnum() {

	}

	CleaningPatternEnum(String code, String message) {
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

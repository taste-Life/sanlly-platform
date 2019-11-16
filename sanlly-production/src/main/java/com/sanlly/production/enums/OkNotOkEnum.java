package com.sanlly.production.enums;

public enum OkNotOkEnum {
	/**
	 * OK
	 */
	OK("LEOkNotOkEnum01", "OK"), 
	/**
	 *NOTOK
	 */
	NOTOK("LEOkNotOkEnum02", "NOTOK");

	private String code;

	private String message;

	OkNotOkEnum() {

	}

	OkNotOkEnum(String code, String message) {
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

package com.sanlly.production.enums;

public enum OkNotOkNcEnum {
	/**
	 * OK
	 */
	OK("LEOkNotOkNcEnum01", "OK"), 
	/**
	 *NOTOK
	 */
	NOTOK("LEOkNotOkNcEnum02", "NOTOK"),
	/**
	 * NC
	 */
	NC("LEOkNotOkNcEnum03", "NC");

	private String code;

	private String message;

	OkNotOkNcEnum() {

	}

	OkNotOkNcEnum(String code, String message) {
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

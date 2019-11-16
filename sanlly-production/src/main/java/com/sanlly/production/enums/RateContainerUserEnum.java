package com.sanlly.production.enums;

public enum RateContainerUserEnum {
	/**
	 * SAN用箱人key
	 */
	CONTAINERUSERKEY1("LKCONUSER000128", "SAN用箱人key"),
	/**
	 * SAN用箱人Code
	 */
	CONTAINERUSERKEY2("SAN", "SANcode"),
	/**
	 * COS用箱人Code
	 */
	CONTAINERUSERKEY3("COS", "COScode标识");

	private String code;

	private String message;

	RateContainerUserEnum() {

	}

	RateContainerUserEnum(String code, String message) {
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

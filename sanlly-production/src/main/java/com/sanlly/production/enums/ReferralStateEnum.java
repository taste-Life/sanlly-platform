package com.sanlly.production.enums;

public enum ReferralStateEnum {

	/**
	 * 未派工
	 */
	UNREFERRAL("LEReferralStatEnum01", "未派工"), 
	/**
	 * 已派工
	 */
	REFERRALED("LEReferralStatEnum02", "已派工"),
	
	/**
	 * 已完工
	 */
	COMPLETED("LEReferralStatEnum03", "已完工"),
	
	/**
	 * 质检派工
	 */
	QUALITY("LEReferralStatEnum04", "质检派工");

	private String code;

	private String message;

	ReferralStateEnum() {

	}

	ReferralStateEnum(String code, String message) {
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

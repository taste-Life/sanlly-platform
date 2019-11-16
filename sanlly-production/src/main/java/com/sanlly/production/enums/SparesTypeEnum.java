package com.sanlly.production.enums;

public enum SparesTypeEnum {
	/**
	 * 主件
	 */
	SPARESTYPE_01("LESparesType01", "主件"),
	/**
	 * 辅件
	 */
	SPARESTYPE_02("LESparesType02", "辅件"),
	/**
	 * 耗材
	 */
	SPARESTYPE_03("LESparesType03", "耗材");

	private String code;

	private String message;

	SparesTypeEnum() {

	}

	SparesTypeEnum(String code, String message) {
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

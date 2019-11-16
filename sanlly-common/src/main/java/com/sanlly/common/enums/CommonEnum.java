package com.sanlly.common.enums;

public enum CommonEnum {
	/**
	 * 是
	 */
	YES("LECOMMONOO001", "是"),
	/**
	 * 否
	 */
	NO("LECOMMONOO002", "否");

	private String code;

	private String desc;

	CommonEnum() {
	}

	CommonEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}

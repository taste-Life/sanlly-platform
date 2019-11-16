package com.sanlly.finance.enums;

/**
 *	租赁 场地枚举
 * @author fjy
 *
 */
public enum LeaseEnum {
	/**
	 * 每月固定费率
	 */
	Lease_01("LKFIBILEASE01", "每月固定费率"),
	/**
	 * 面积*费率*天数
	 */
	Lease_02("LKFIBILEASE02", "面积*费率*天数");

	private String code;

	private String message;

	LeaseEnum() {

	}

	LeaseEnum(String code, String message) {
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

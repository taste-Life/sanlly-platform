package com.sanlly.finance.enums;

/**
 * 箱类别枚举
 * @author wangxzh
 *
 */
public enum ContainerCategoryEnum {
	/**
	 * 干箱
	 */
	CONTAINER_01("LECONTCATE01", "干箱"),
	/**
	 * 箱体
	 */
	CONTAINER_02("LECONTCATE02", "箱体"),
	/**
	 * 机组
	 */
	CONTAINER_03("LECONTCATE03", "机组"),
	/**
	 * 机组
	 */
	CONTAINER_04("LECONTCATE04", "保修");

	private String code;

	private String message;

	ContainerCategoryEnum() {

	}

	ContainerCategoryEnum(String code, String message) {
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

	public static boolean isUnit(String type) {
        return CONTAINER_03.getCode().equals(type);
    }
	
}

package com.sanlly.production.enums;

/**
 * 箱类别枚举
 * 
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
	CONTAINER_04("LECONTCATE04", "保修"),
	
	/**
	 * 冷箱
	 */
	CONTAINER_05("LECONTCATE05", "冷箱");

	private final String code;

	private final String message;


	ContainerCategoryEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}


	public String getMessage() {
		return message;
	}


	public static boolean isUnit(String type) {
		return CONTAINER_03.getCode().equals(type);
	}

	public static String getMessagebyCode(String code) {
		for (ContainerCategoryEnum platformFree : ContainerCategoryEnum.values()) {
			if (code.equals(platformFree.getCode())) {
				return platformFree.getMessage();
			}
		}
		return null;
	}

	/**
	*@Description: 通过值找到value
	*@Param: [message]
	*@return: java.lang.String
	*@Author: zjd
	*@date: 2019-09-26
	*/
	public static String getCodeByMessage(String message) {
		for (ContainerCategoryEnum platformFree : ContainerCategoryEnum.values()) {
			if (message.equals(platformFree.getMessage())) {
				return platformFree.getCode();
			}
		}
		return null;
	}

}

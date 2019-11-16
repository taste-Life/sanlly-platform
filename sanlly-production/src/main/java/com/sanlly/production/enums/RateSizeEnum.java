package com.sanlly.production.enums;

/**
 * 箱体尺寸枚举，用于费率计算时，尺寸大于40时转换为40
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月27日 下午2:51:55 
 * @version V1.0   
 */
public enum RateSizeEnum {
	/**
	 * 20
	 */
	SIZE_20("LKSIZE000001", "20"),
	/**
	 * 40
	 */
	SIZE_40("LKSIZE000002", "40"),
	/**
	 * 45
	 */
	SIZE_45("LKSIZE000003", "45"),
	/**
	 * 53
	 */
	SIZE_53("LKSIZE000004", "53");

	private String code;

	private String message;

	RateSizeEnum() {

	}

	RateSizeEnum(String code, String message) {
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

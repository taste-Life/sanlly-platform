package com.sanlly.production.enums;

/**
 * 前台tab类型
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月19日 下午2:57:17 
 * @version V1.0   
 */
public enum RateTabTypeEnum {
	/**
	 * SAN费率
	 */
	RATETABTYPE1("1", "SAN费率"),
	/**
	 * 用箱人费率
	 */
	RATETABTYPE2("2", "用箱人费率"),
	/**
	 * 辅助费率
	 */
	RATETABTYPE3("3", "辅助费率"),
	/**
	 * 派工工时
	 */
	RATETABTYPE4("4", "派工工时");

	private String code;

	private String message;

	RateTabTypeEnum() {

	}

	RateTabTypeEnum(String code, String message) {
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

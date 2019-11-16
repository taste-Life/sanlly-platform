package com.sanlly.production.enums;

/**
 * 付费方转换金额计算方式
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月6日 下午1:15:04 
 * @version V1.0   
 */
public enum PayingCalculationTypeEnum {
	/**
	 * 先计算，后处理
	 */
	CALCULATION01("CALCULATION01", "先计算，后处理"),
	/**
	 * 先处理，后计算
	 */
	CALCULATION02("CALCULATION02", "先处理，后计算");

	private String code;

	private String message;

	private PayingCalculationTypeEnum() {
	}

	private PayingCalculationTypeEnum(String code, String message) {
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

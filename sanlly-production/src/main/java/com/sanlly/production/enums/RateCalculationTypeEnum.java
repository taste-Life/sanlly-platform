package com.sanlly.production.enums;

/**
 * 费率计算方式枚举
 * 
 * @author wangxzh
 *
 */
public enum RateCalculationTypeEnum {

	/**
	 * 公式型
	 */
	CALCULATIONTYPE01("LECalculationType01", "公式型"),
	/**
	 * 穷举型
	 */
	CALCULATIONTYPE02("LECalculationType02", "穷举型");

	private String code;

	private String message;

	RateCalculationTypeEnum() {

	}

	RateCalculationTypeEnum(String code, String message) {
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

package com.sanlly.finance.enums;

/**
 * PTI公式枚举
 * @author  
 *
 */
public enum PTIFormulaEnum {
	/**
	 * XX美金*汇率-XX人民币
	 */
	Formula_01("LEFORMULA01", "(xx)USD*汇率-(xx)CNY"),
	/**
	 * XX人民币 -XX美金*汇率
	 */
	Formula_02("LEFORMULA02", "(xx)CNY-(xx)USD*汇率"),
	/**
	 * XX美金*汇率-XX人民币
	 */
	Formula_03("LEFORMULA03", "(xx)USD*汇率+(xx)CNY"),
	/**
	 * XX人民币 -XX美金*汇率
	 */
	Formula_04("LEFORMULA04", "(xx)CNY+(xx)USD*汇率");

	private String code;

	private String message;

	PTIFormulaEnum() {

	}

	PTIFormulaEnum(String code, String message) {
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

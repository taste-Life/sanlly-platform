package com.sanlly.common.enums;

/**
 * 收支类型
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月10日  
 *
 */
public enum FinanceBudgetTypeEnum {

	/**
	 * 收入
	 */
	INCOME("LEFIBUDGET01", "收入"), 
	/**
	 * 成本
	 */
	EXPENDITURE("LEFIBUDGET02", "成本");
	
	FinanceBudgetTypeEnum() {

	}

	FinanceBudgetTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	private String code;

	private String message;

	

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

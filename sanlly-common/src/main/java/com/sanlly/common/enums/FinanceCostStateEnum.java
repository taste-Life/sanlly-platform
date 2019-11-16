package com.sanlly.common.enums;

/**
 * 发票收费状态
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月10日  
 *
 */
public enum FinanceCostStateEnum {

	/**
	 * 未收费
	 */
	NOCOST("LEFICOSTSTATE01", "未收费"), 
	/**
	 * 部分收费
	 */
	SUBCOST("LEFICOSTSTATE02", "部分收费"),
	/**
	 * 已收费
	 */
	ISCOST("LEFICOSTSTATE03", "已收费");
	
	FinanceCostStateEnum() {

	}

	FinanceCostStateEnum(String code, String message) {
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

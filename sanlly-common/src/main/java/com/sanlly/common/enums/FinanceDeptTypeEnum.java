package com.sanlly.common.enums;

/**
 * 部门类型
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月9日  
*
 */
public enum FinanceDeptTypeEnum {
	/**
	 * 成本中心
	 */
	UNINBILL("LEFIDEPTTYPE01", "成本中心"), 
	/**
	 * 利润中心
	 */
	INBILL("LEFIDEPTTYPE02", "利润中心");

	private String code;

	private String message;

	FinanceDeptTypeEnum() {

	}

	FinanceDeptTypeEnum(String code, String message) {
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

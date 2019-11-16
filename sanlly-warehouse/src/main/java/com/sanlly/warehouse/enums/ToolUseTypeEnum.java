package com.sanlly.warehouse.enums;

/**
 * 工具使用类型
 * 
 * @author lishzh
 *
 */
public enum ToolUseTypeEnum {

	PERSONAL_USE("LETOOLUSETYPE01", "个人使用"), 
	DEPARTMENT_USE("LETOOLUSETYPE02", "部门使用"), 
	LOW_VALUE_ASSETS("LETOOLUSETYPE03", "低值资产");

	private String code;

	private String message;

	private ToolUseTypeEnum() {
		// TODO Auto-generated constructor stub
	}

	private ToolUseTypeEnum(String code, String message) {
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

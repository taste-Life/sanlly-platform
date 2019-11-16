package com.sanlly.production.enums;
/**
 * 生产部门枚举，为了业务代码统一维护
 * @author zhangkai
 *
 */
public enum ProdDeptEnum {

	UNIT("LKPRODDEPT003", "机组部门");
	
	private String code;
	
	private String message;

	private ProdDeptEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private ProdDeptEnum() {
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

package com.sanlly.production.enums;
/**
 * 调拨类型枚举
 * @author zhangkai
 *
 */
public enum AllotTypeEnum {

	IN("LEALLOTTYPE001", "调入"),
	BACK("LEALLOTTYPE002", "调回");
	
	private String code;
	
	private String message;

	private AllotTypeEnum(String code, String message) {
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

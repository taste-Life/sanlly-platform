package com.sanlly.production.enums;

public enum OperateTypeEnum {

	ENTRY("LEOPERATETYPE001", "进场保修"),
	
	SITE("LEOPERATETYPE002", "外点保修"),
	
	RUSH("LEOPERATETYPE003", "码头抢修");
	
	private String code;
	
	private String message;

	private OperateTypeEnum() {
	}

	private OperateTypeEnum(String code, String message) {
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

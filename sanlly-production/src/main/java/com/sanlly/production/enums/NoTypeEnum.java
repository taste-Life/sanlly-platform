package com.sanlly.production.enums;

public enum NoTypeEnum {

	CONTAINERNO("LENOTYPE001", "箱号"),
	UNITNO("LENOTYPE002", "机组序列号");
	
	private String code;
	
	private String message;

	private NoTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private NoTypeEnum() {
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

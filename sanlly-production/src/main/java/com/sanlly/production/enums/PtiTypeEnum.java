package com.sanlly.production.enums;

public enum PtiTypeEnum {

	NOTDO("LKPTITYPE000000","不做pti");
	
	private final String code;
	
	private final String message;
	
	private PtiTypeEnum(String code,String message) {
		this.code=code;
		this.message=message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	 
}

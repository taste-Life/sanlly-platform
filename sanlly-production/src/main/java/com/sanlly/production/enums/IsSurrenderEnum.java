package com.sanlly.production.enums;

public enum IsSurrenderEnum {

	IS_SURRENDER("", "退租箱"),
	IS_NOT_SURRENDER("", "在航箱");
	
	private String code;
	
	private String message;

	private IsSurrenderEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private IsSurrenderEnum() {
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

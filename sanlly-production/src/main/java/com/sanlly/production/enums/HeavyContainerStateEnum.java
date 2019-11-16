package com.sanlly.production.enums;

public enum HeavyContainerStateEnum {

	UNENTER("HEAVYCONTSTATE001", "待入港"),
	ENTERED("HEAVYCONTSTATE002", "已入港"),
	WATCHING("HEAVYCONTSTATE003", "监管中"),
	SETSHIP("HEAVYCONTSTATE004", "装船"),
	CHANGESHIP("HEAVYCONTSTATE005", "转船"),
	BACKLOAD("HEAVYCONTSTATE006", "退载");
	
	private String code;
	
	private String message;

	private HeavyContainerStateEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private HeavyContainerStateEnum() {
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

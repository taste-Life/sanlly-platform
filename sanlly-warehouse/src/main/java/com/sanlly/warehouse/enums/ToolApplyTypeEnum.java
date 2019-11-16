package com.sanlly.warehouse.enums;

public enum ToolApplyTypeEnum {
	
	NORMAL_USE("LETOOLAPPLYTYPE01","正常领用"),SCRAP("LETOOLAPPLYTYPE02","工具报废"),
	TRANSFER("LETOOLAPPLYTYPE03","工具调拨"),DISTRIBUTE("LETOOLAPPLYTYPE04","工具派发");
	
	private String code;
	
	private String message;
	
	private ToolApplyTypeEnum() {
		// TODO Auto-generated constructor stub
	}

	private ToolApplyTypeEnum(String code, String message) {
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

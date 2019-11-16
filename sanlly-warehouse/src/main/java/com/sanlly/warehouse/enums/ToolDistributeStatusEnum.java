package com.sanlly.warehouse.enums;

public enum ToolDistributeStatusEnum {
	
	NOT_DISTRIBUTE("LETOOLDISTRIBUTE01","未派发"),
	PART_DISTRIBUTED("LETOOLDISTRIBUTE02","部分派发"),
	DISTRIBUTED("LETOOLDISTRIBUTE03","已派发");
	private String code;
	
	private String message;
	
	private ToolDistributeStatusEnum() {
		// TODO Auto-generated constructor stub
	}

	private ToolDistributeStatusEnum(String code, String message) {
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

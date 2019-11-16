package com.sanlly.production.enums;

public enum CollectStateEnum {
	
	/*
	 * 未采集
	 */
	UNCOLLECT("LECOLLECTSTATE001", "未采集"),
	
	/*
	 * 已采集 
	 */
	COLLECT("LECOLLECTSTATE002", "已采集");
	
	private String code;
	
	private String message;

	private CollectStateEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private CollectStateEnum() {
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

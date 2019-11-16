package com.sanlly.production.enums;

/**
 * 外点保修类型枚举类
 * @author zhangkai
 *
 */
public enum MainTypeEnum {
	
	NONE("LEMAINTYPE001", "无"),
	GUARANTEE("LEMAINTYPE002", "外点保修"),
	UPDATE("LEMAINTYPE003", "外点升级");
	
	private String code;
	
	private String message;

	private MainTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private MainTypeEnum() {
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

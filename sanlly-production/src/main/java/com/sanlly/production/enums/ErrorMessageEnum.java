package com.sanlly.production.enums;
/**
 * 错误提示枚举
 * @author zhangkai
 *
 */
public enum ErrorMessageEnum {

	UNMATCH("LEERROR001", "未匹配到数据"),
	
	OUTIMBALANCE("LEERROR002", "超出差额"),
	
	NOIMBALANCE("LEERROR003", "未维护差额");
	
	private String code;
	
	private String message;

	private ErrorMessageEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private ErrorMessageEnum() {
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

package com.sanlly.production.enums;
/**
 * 新箱明细状态枚举
 * @author zhangkai
 *
 */
public enum OrderDetailStateEnum {

	UNCHECK("LEORDERDETAIL001", "待检"),
	CHECKED("LEORDERDETAIL002", "已完成");
	
	private String code;
	
	private String message;

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

	private OrderDetailStateEnum() {
	}

	private OrderDetailStateEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	
}

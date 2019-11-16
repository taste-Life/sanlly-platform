package com.sanlly.production.enums;
/**
 * 坏箱调拨状态枚举
 * @author zhangkai
 *
 */
public enum AllotStateEnum {

	APPLYIN("LEALLOTSTATE001", "申请调入"),
	ALREADYIN("LEALLOTSTATE002", "已调入"),
	APPLYBACK("LEALLOTSTATE003", "申请调回"),
	ALREADYBACK("LEALLOTSTATE004", "已调回");
	
	private String code;
	
	private String message;

	private AllotStateEnum(String code, String message) {
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

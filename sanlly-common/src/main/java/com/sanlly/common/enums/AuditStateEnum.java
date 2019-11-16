package com.sanlly.common.enums;

/**
 * 审核状态枚举
 * @author RexSheng
 * 2019年8月16日 上午9:51:19
 */
public enum AuditStateEnum {
	/**
	 * 未审核
	 */
	UNAUDIT("LEAuditStateEnum01", "未审核"), 
	/**
	 * 已审核
	 */
	AUDITED("LEAuditStateEnum02", "已审核"),
	
	/**
	 * 已驳回
	 */
	REJECTED("LEAuditStateEnum03", "已驳回");


	private String code;

	private String message;

	AuditStateEnum() {

	}

	AuditStateEnum(String code, String message) {
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

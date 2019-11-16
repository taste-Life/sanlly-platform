package com.sanlly.warehouse.enums;

/**
 * 出库审核状态枚举
 * @author wannt
 * 2019年8月16日 上午9:51:19
 */
public enum OutAuditStateEnum {
	/**
	 * 未审核
	 */
	UNAUDIT("LEOUTAUDITE001", "未审核"),
	/**
	 * 已审核
	 */
	AUDITED("LEOUTAUDITE002", "已审核"),

	/**
	 * 已驳回
	 */
	REJECTED("LEOUTAUDITE003", "已驳回"),

	/**
	 * 已驳回
	 */
	LEADAUDITED("LEOUTAUDITE004", "领导已审核");


	private String code;

	private String message;

	OutAuditStateEnum() {

	}

	OutAuditStateEnum(String code, String message) {
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

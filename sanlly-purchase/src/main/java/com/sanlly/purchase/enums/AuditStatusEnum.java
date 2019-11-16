package com.sanlly.purchase.enums;

/**
 * 
* Description: 采购需求审核状态
* @ClassName: AuditStatusEnum
* @date 2019年7月26日
*
* @author jlx
 */
public enum AuditStatusEnum {
	AUDIT("LEAuditStateEnum01", "未审核"), AUDITOK("LEAuditStateEnum02", "审核通过"), AUDITREJECT("LEAuditStateEnum03", "审核驳回");

	private String code;

	private String message;

	AuditStatusEnum() {
	}

	AuditStatusEnum(String code, String message) {
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

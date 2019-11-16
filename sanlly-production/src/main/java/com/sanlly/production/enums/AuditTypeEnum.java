package com.sanlly.production.enums;

/**
 * 审核类型
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月29日 上午10:19:42 
 * @version V1.0   
 */
public enum AuditTypeEnum {
	/**
	 * 人工审核
	 */
	AuditTypeEnum_01("LKAUDITTYPE001", "人工审核"),
	/**
	 * 自动审核
	 */
	AuditTypeEnum_02("LKAUDITTYPE002", "自动审核");

	private String code;

	private String message;

	AuditTypeEnum() {

	}

	AuditTypeEnum(String code, String message) {
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

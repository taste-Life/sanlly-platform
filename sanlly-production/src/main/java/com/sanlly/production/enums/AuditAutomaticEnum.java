package com.sanlly.production.enums;

/**
 * 自动审核、自动派工启用状态
* @Package com.sanlly.production.enums 
* @Description: TODO 
* @author wangxzh   
* @date 2019年8月30日 上午10:40:08 
* @version V1.0   
 */
public enum AuditAutomaticEnum {
	/**
	 * 启用
	 */
	AUTOMATIC_YES("AUTOMATIC01", "启用"),
	/**
	 * 不启用
	 */
	AUTOMATIC_NO("AUTOMATIC02", "不启用");

	private String code;

	private String message;

	AuditAutomaticEnum() {

	}

	AuditAutomaticEnum(String code, String message) {
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

package com.sanlly.production.enums;

/**
 * 自动审核默认紧急程度
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月25日 下午2:11:53 
 * @version V1.0   
 */
public enum AuditUrgencyEnum {
	/**
	 * 默认紧急程度,一般
	 */
	DEFAULT("LKURGENCY00001", "一般");

	private String code;

	private String message;

	AuditUrgencyEnum() {

	}

	AuditUrgencyEnum(String code, String message) {
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

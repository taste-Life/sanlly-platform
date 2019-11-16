package com.sanlly.production.enums;
/**
 * 工作组类别枚举（为了在业务代码中统一维护）
 * @author zhangkai
 *
 */
public enum WorkGroupTypeEnum {

	UNITCHECK("LKWGTYPE001", "机组检验"),
	/**
	 * 维修班组
	 */
	REFERRAL("LKWGTYPE002", "维修班组");
	
	private String code;
	
	private String message;

	private WorkGroupTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private WorkGroupTypeEnum() {
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

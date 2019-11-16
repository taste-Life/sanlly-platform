package com.sanlly.common.enums;

/**
 * 确认状态
 * 
 * @author lishzh
 *
 */
public enum ConfirmStateEnum {
	CONFIRMED("LEConfirmEnum01", "已确认"),

	NOT_CONFIRMED("LEConfirmEnum02", "未确认");

	private String code;

	private String messgae;

	ConfirmStateEnum() {
	}

	private ConfirmStateEnum(String code, String messgae) {
		this.code = code;
		this.messgae = messgae;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessgae() {
		return messgae;
	}

	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}

}

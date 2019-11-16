package com.sanlly.warehouse.enums;

public enum ToolStatusEnum {

	NORMAL("LETOOLSTATUS01", "正常"), SCRAP("LETOOLSTATUS02", "报废");

	private String code;

	private String message;

	ToolStatusEnum() {

	}

	ToolStatusEnum(String code, String message) {
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

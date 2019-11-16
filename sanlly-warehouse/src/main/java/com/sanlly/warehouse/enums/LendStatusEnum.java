package com.sanlly.warehouse.enums;

public enum LendStatusEnum {
	
	NOT_OUT("LELENDSTATUS01", "待入库"), 
	ALL_IN("LELENDSTATUS02", "全部入库"),
	PART_REPAY("LELENDSTATUS03", "部分还库"),
	ALL_REPAY("LELENDSTATUS04", "全部还库");

	private String code;

	private String message;

	private LendStatusEnum() {
		// TODO Auto-generated constructor stub
	}

	private LendStatusEnum(String code, String message) {
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

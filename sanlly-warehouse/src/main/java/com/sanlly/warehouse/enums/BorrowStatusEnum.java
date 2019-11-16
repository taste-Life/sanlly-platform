package com.sanlly.warehouse.enums;

/**
 * 借入状态枚举
 * @author lishzh
 *
 */
public enum BorrowStatusEnum {
	
	NOT_IN("LEBORROWSTATUS01", "待入库"), 
	ALL_IN("LEBORROWSTATUS02", "全部入库"),
	PART_REPAY("LEBORROWSTATUS03", "部分还库"),
	ALL_REPAY("LEBORROWSTATUS04", "全部还库");

	private String code;

	private String message;

	private BorrowStatusEnum() {
		// TODO Auto-generated constructor stub
	}

	private BorrowStatusEnum(String code, String message) {
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

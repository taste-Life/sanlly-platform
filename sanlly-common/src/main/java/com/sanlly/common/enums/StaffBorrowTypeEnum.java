package com.sanlly.common.enums;

/**
 * 员工借件类型枚举
 * 
 * @author lishzh
 *
 */
public enum StaffBorrowTypeEnum {

	REPAIR("LESTAFFBORROWTYPE01", "维修"), GUARANTEE("LESTAFFBORROWTYPE02", "保修");

	private String code;

	private String message;

	private StaffBorrowTypeEnum() {
		// TODO Auto-generated constructor stub
	}

	private StaffBorrowTypeEnum(String code, String message) {
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

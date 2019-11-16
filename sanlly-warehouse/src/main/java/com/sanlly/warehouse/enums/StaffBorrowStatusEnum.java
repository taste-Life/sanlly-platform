package com.sanlly.warehouse.enums;

/**
 * 员工借件状态枚举
 * @author lishzh
 *
 */
public enum StaffBorrowStatusEnum {
	
	NOT_OUT("LESTAFFBORROW01", "未出库"), 
	ALL_OUT("LESTAFFBORROW02", "全部出库"),
	PART_RETURN("LESTAFFBORROW03", "部分还库"),
	ALL_RETURN("LESTAFFBORROW04", "全部还库");
	
	
	private String code;

	private String message;

	private StaffBorrowStatusEnum() {
		// TODO Auto-generated constructor stub
	}

	private StaffBorrowStatusEnum(String code, String message) {
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

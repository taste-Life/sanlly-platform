package com.sanlly.warehouse.enums;

/**
 * 借入类型枚举
 * 
 * @author lishzh
 *
 */
public enum BorrowTypeEnum {

	EXTERNAL("LEBORROWTYPE01", "外公司借入"), ESCROW("LEBORROWTYPE02", "代管库借入"), LEND("LEBORROWTYPE03", "备件借出");

	private String code;

	private String message;

	private BorrowTypeEnum() {
		// TODO Auto-generated constructor stub
	}

	private BorrowTypeEnum(String code, String message) {
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

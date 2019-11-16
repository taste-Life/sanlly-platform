package com.sanlly.warehouse.enums;
/**
 * 盘盈盘亏类型枚举
 * @author zhh
 *
 */
public enum SurplusLossesTypeEnum {

	SURPLUS("SURPLUSLOSSES001", "盘盈"), 
	LOSSES("SURPLUSLOSSES002", "盘亏");

	private String code;

	private String message;

	private SurplusLossesTypeEnum() {
		// TODO Auto-generated constructor stub
	}

	private SurplusLossesTypeEnum(String code, String message) {
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

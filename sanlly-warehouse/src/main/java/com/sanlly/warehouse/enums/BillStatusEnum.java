package com.sanlly.warehouse.enums;
/**
 * 盘盈盘亏单据状态枚举
 * @author zhh
 *
 */
public enum BillStatusEnum {
	
	IN_AUDIT("LEBILLSTATUS01", "审核中"), 
	COMPLETE_AUDIT("LEBILLSTATUS02", "审核完成"), 
	ALL_IN("LEBILLSTATUS03", "全部入库"), 
	ALL_OUT("LEBILLSTATUS04", "全部出库");

	private String code;

	private String message;

	private BillStatusEnum() {
		// TODO Auto-generated constructor stub
	}

	private BillStatusEnum(String code, String message) {
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

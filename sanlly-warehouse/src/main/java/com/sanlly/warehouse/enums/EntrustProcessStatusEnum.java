package com.sanlly.warehouse.enums;

public enum EntrustProcessStatusEnum {
	
	NOT_OUT("LEENTRUSTPROCESS01", "未出库"), 
	ALL_OUT("LEENTRUSTPROCESS02", "全部出库"),
	ALL_IN("LEENTRUSTPROCESS03", "全部入库");
	
	
	private String code;

	private String message;

	private EntrustProcessStatusEnum() {
		// TODO Auto-generated constructor stub
	}

	private EntrustProcessStatusEnum(String code, String message) {
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

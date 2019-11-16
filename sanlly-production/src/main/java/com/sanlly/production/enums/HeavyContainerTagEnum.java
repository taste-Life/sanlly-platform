package com.sanlly.production.enums;

public enum HeavyContainerTagEnum {

	NOMAL("LETAG001", "正常"),
	HIGHTEMP("LETAG002", "货温高"),
	REPORT("LETAG003", "报警"),
	MONITORING("LETAG004", "重点监控");
	
	private String code;
	
	private String message;

	private HeavyContainerTagEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private HeavyContainerTagEnum() {
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

package com.sanlly.production.enums;

public enum AlgorithmTypeEnum {
	/**
	 * 工时
	 */
	ALGORITHMTYPE01("LEAlgorithmType01", "工时"),
	/**
	 * 材料费
	 */
	ALGORITHMTYPE02("LEAlgorithmType02", "材料费"),
	/**
	 * 耗材费
	 */
	ALGORITHMTYPE03("LEAlgorithmType03", "耗材费");

	private String code;

	private String message;

	AlgorithmTypeEnum() {

	}

	AlgorithmTypeEnum(String code, String message) {
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

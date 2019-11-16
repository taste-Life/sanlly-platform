package com.sanlly.production.enums;

public enum TemperatureUnitEnum {
	/**
	 * 摄氏度
	 */
	CENTIGRADE("LETempUnitEnum01", "摄氏度"), 
	/**
	 *华氏度
	 */
	FAHRENHEIT("LETempUnitEnum02", "华氏度");

	private String code;

	private String message;

	TemperatureUnitEnum() {

	}

	TemperatureUnitEnum(String code, String message) {
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

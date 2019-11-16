package com.sanlly.production.enums;

/**
 * 第三方收费方式
 * 现结，月结，无需第三方付费
 * @author RexSheng
 * 2019年9月12日 下午2:43:09
 */
public enum ThirdPayTypeEnum {
	/**
	 * 现结
	 */
	SPOT("LEPThirdPayType01", "现结"),
	/**
	 * 月结
	 */
	MONTH("LEPThirdPayType02", "月结"),
	/**
	 * 无需第三方付费
	 */
	NO("LEPThirdPayType03", "无需第三方付费");

	private String code;

	private String message;

	ThirdPayTypeEnum() {

	}

	ThirdPayTypeEnum(String code, String message) {
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

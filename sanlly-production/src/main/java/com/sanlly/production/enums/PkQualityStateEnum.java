package com.sanlly.production.enums;

/**
 * 品控质检状态
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月19日 上午11:25:14 
 * @version V1.0   
 */
public enum PkQualityStateEnum {
	/**
	 * 需要质检
	 */
	PKQUALITY_DEFAULT("LEPKQUALITYSTATE01", "需要质检"),
	/**
	 * 质检合格
	 */
	PKQUALITY_YES("LEPKQUALITYSTATE02", "质检合格"),
	/**
	 * 质检不合格
	 */
	PKQUALITY_NO("LEPKQUALITYSTATE03", "质检不合格");

	private String code;

	private String message;

	PkQualityStateEnum() {

	}

	PkQualityStateEnum(String code, String message) {
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

package com.sanlly.production.enums;

/**
 * 质检类型
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月8日 下午4:18:14 
 * @version V1.0   
 */
public enum QualityTypeEnum {
	/**
	 * 抽检箱
	 */
	QUALITYTYPE_CHOOSE("LEQUALITYTYPE001", "抽检箱"),
	/**
	 * 必检箱
	 */
	QUALITYTYPE_MUST("LEQUALITYTYPE002", "必检箱"),
	/**
	 * 复检箱
	 */
	QUALITYTYPE_REPEAT("LEQUALITYTYPE003", "复检箱");

	private String code;

	private String message;

	QualityTypeEnum() {

	}

	QualityTypeEnum(String code, String message) {
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

package com.sanlly.production.enums;

/**
 * 派工类型
* @Package com.sanlly.production.enums 
* @Description: TODO 
* @author wangxzh   
* @date 2019年9月5日 下午5:47:21 
* @version V1.0   
 */
public enum ReferralTypeEnum {
	/**
	 * 自动派工
	 */
	AUTOMATIC("ReferralTypeEnum01", "自动派工"), 
	/**
	 * 报价派工
	 */
	VALUATION("ReferralTypeEnum02", "报价派工"),
	/**
	 * 批复派工
	 */
	REPLY("ReferralTypeEnum03", "批复派工");

	private String code;

	private String message;

	ReferralTypeEnum() {

	}

	ReferralTypeEnum(String code, String message) {
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

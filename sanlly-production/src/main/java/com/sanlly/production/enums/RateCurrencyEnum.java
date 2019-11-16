package com.sanlly.production.enums;

/**
 * 费率币种枚举
* @Package com.sanlly.production.enums 
* @Description: TODO 
* @author wangxzh   
* @date 2019年8月20日 下午2:18:54 
* @version V1.0   
 */
public enum RateCurrencyEnum {
	/**
	 * 人民币
	 */
	CNY("LKCURRENCY000001", "人民币"),
	/**
	 * 美元
	 */
	USD("LKCURRENCY000002", "美元");

	private String code;

	private String message;

	RateCurrencyEnum() {

	}

	RateCurrencyEnum(String code, String message) {
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

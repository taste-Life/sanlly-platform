package com.sanlly.production.enums;

/**
 * 挂衣箱承重
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月25日 上午10:32:08 
 * @version V1.0   
 */
public enum GohWeightEnum {
	/**
	 * 300公斤
	 */
	WEIGHT_300("LEGOHWEIGHT01", "300公斤"),
	/**
	 * 500公斤
	 */
	WEIGHT_500("LEGOHWEIGHT02", "500公斤");

	private String code;

	private String message;

	GohWeightEnum() {

	}

	GohWeightEnum(String code, String message) {
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

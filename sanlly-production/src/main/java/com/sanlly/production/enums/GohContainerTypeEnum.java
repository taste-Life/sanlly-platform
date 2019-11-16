package com.sanlly.production.enums;

/**
 * 挂衣箱箱型
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月25日 上午9:59:59 
 * @version V1.0   
 */
public enum GohContainerTypeEnum {

	/**
	 * H1
	 */
	CONTAINERTYPE_H1("LEGOHCONTTYPE01", "H1"),
	/**
	 * H2
	 */
	CONTAINERTYPE_H2("LEGOHCONTTYPE02", "H2"),
	/**
	 * G1
	 */
	CONTAINERTYPE_G1("LEGOHCONTTYPE03", "G1"),
	/**
	 * G2
	 */
	CONTAINERTYPE_G2("LEGOHCONTTYPE04", "G2");

	private String code;

	private String message;

	GohContainerTypeEnum() {

	}

	GohContainerTypeEnum(String code, String message) {
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

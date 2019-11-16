package com.sanlly.production.enums;

/**
 * 费率通用枚举
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月22日 下午1:39:01 
 * @version V1.0   
 */
public enum RateCommonEnum {
	/**
	 * SAN用箱人key
	 */
	CONTAINERUSERKEY1("LKCONUSER000128", "SAN用箱人key"),
	/**
	 * SAN用箱人Code
	 */
	CONTAINERUSERKEY2("SAN", "SANcode"),
	/**
	 * COS用箱人Code
	 */
	CONTAINERUSERKEY3("COS", "COScode标识"),
	/**
	 * 青岛公司key
	 */
	QINGDAOCOMPANYKEY("LKCOMPANY000001", "青岛公司key");

	private String code;

	private String message;

	RateCommonEnum() {

	}

	RateCommonEnum(String code, String message) {
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

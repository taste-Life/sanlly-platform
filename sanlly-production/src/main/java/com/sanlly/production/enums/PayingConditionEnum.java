package com.sanlly.production.enums;

/**
 * 付费方金额判断条件
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月6日 下午1:20:38 
 * @version V1.0   
 */
public enum PayingConditionEnum {
	/**
	 * 大于
	 */
	CONDITION01("CONDITION01", "大于"),
	/**
	 * 小于
	 */
	CONDITION02("CONDITION02", "小于");

	private String code;

	private String message;

	private PayingConditionEnum() {
	}

	private PayingConditionEnum(String code, String message) {
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
}

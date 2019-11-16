package com.sanlly.production.enums;

/**
 * 算法明细所属类型：标准费率、辅助费率、报价工时
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月23日 上午10:44:28 
 * @version V1.0   
 */
public enum RateFromTypeEnum {
	/**
	 * 标准费率
	 */
	TYPE01("1", "标准费率"),
	/**
	 * 辅助费率
	 */
	TYPE02("2", "辅助费率"),
	/**
	 * 派工工时
	 */
	TYPE03("3", "派工工时");

	private String code;

	private String message;

	RateFromTypeEnum() {

	}

	RateFromTypeEnum(String code, String message) {
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

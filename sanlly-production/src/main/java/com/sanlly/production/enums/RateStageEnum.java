package com.sanlly.production.enums;

/**
 * 费率对应检验、报价、派工三个环节
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月18日 上午10:12:04 
 * @version V1.0   
 */
public enum RateStageEnum {
	/**
	 * 进场检验
	 */
	TYPE01("1", "进场检验"),
	/**
	 * 报价环节
	 */
	TYPE02("2", "报价环节"),
	/**
	 * 派工环节
	 */
	TYPE03("3", "派工环节");

	private String code;

	private String message;

	RateStageEnum() {

	}

	RateStageEnum(String code, String message) {
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

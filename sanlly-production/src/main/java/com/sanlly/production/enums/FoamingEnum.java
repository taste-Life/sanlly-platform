package com.sanlly.production.enums;

/**
 * 发泡判断枚举
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月3日 下午2:46:58 
 * @version V1.0   
 */
public enum FoamingEnum {
	/**
	 * 部件明细
	 */
	PIM("PIM", "部件明细"),
	/**
	 * 维修代码
	 */
	RP("RP", "维修代码");

	private String code;

	private String message;

	FoamingEnum() {

	}

	FoamingEnum(String code, String message) {
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

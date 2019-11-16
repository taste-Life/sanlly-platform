package com.sanlly.production.enums;

/**
 * 发泡状态
* @Package com.sanlly.production.enums 
* @Description: TODO 
* @author wangxzh   
* @date 2019年9月3日 下午5:06:39 
* @version V1.0   
 */
public enum FoamingStateEnum {
	/**
	 * 已发泡
	 */
	yes("FOAMINGSTATE01", "已发泡"),
	/**
	 * 未发泡
	 */
	no("FOAMINGSTATE02", "未发泡");

	private String code;

	private String message;

	FoamingStateEnum() {

	}

	FoamingStateEnum(String code, String message) {
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

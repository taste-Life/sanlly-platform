package com.sanlly.production.enums;

/**
 * 挂衣箱状态枚举
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月23日 上午11:33:26 
 * @version V1.0   
 */
public enum GohStateEnum {
	/**
	 * 待检验
	 */
	GIHSTATE_01("LEGOHSTATE01", "待检验"),
	/**
	 * 待估价
	 */
	GIHSTATE_02("LEGOHSTATE02", "待估价"),
	/**
	 * 待批复
	 */
	GIHSTATE_03("LEGOHSTATE03", "待批复"),
	/**
	 * 已批复
	 */
	GIHSTATE_04("LEGOHSTATE04", "已批复"),
	/**
	 * 撤载
	 */
	GIHSTATE_05("LEGOHSTATE05", "撤载");

	private String code;

	private String message;

	GohStateEnum() {

	}

	GohStateEnum(String code, String message) {
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

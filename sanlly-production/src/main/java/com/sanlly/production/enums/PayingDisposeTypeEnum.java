package com.sanlly.production.enums;

/**
 * 付费方处理方式
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月6日 下午1:17:56 
 * @version V1.0   
 */
public enum PayingDisposeTypeEnum {
	/**
	 * 不处理
	 */
	DISPOSE01("DISPOSE01", "不处理"),
	/**
	 * 取整
	 */
	DISPOSE02("DISPOSE02", "取整"),
	/**
	 * 四舍五入
	 */
	DISPOSE03("DISPOSE03", "四舍五入"),
	/**
	 * 取整进一
	 */
	DISPOSE04("DISPOSE04", "取整进一");

	private String code;

	private String message;

	private PayingDisposeTypeEnum() {
	}

	private PayingDisposeTypeEnum(String code, String message) {
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

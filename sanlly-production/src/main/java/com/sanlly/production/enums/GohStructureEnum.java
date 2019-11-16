package com.sanlly.production.enums;

/**
 * 挂衣箱结构枚举
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月23日 上午9:46:30 
 * @version V1.0   
 */
public enum GohStructureEnum {
	/**
	 * 新结构
	 */
	NEW("LEGOHSTRUCTURE01", "新结构"),
	/**
	 * 老结构
	 */
	OLD("LEGOHSTRUCTURE02", "老结构");

	private String code;

	private String message;

	GohStructureEnum() {

	}

	GohStructureEnum(String code, String message) {
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

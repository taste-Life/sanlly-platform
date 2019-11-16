package com.sanlly.production.enums;

/**
 * 进场类型
* @Package com.sanlly.production.enums 
* @Description: TODO 
* @author wangxzh   
* @date 2019年9月6日 上午10:30:35 
* @version V1.0   
 */
public enum CourseTypeEnum {
	/**
	 * 退租箱key
	 */
	LKCOURSETYPE000005("LKCOURSETYPE000005", "退租箱key");

	private String code;

	private String message;

	CourseTypeEnum() {

	}

	CourseTypeEnum(String code, String message) {
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

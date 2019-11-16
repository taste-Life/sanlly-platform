package com.sanlly.production.enums;

/**
 *  xx箱状态
 * @author RexSheng
 * 2019年8月3日 下午3:23:16
 */
public enum XxStateEnum {
	/**
	 *  xx箱
	 */
	XX("LEXxStateEnum01", "xx箱"),
	
	/**
	 *  xx箱转OK
	 */
	XX_OK("LEXxStateEnum02", "xx箱转OK"), 
	
	/**
	 *  OK
	 */
	OK("LEXxStateEnum03", "OK");

	private String code;

	private String message;

	XxStateEnum() {

	}

	XxStateEnum(String code, String message) {
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
	
	/**
	 * 根据值 获取枚举对象
	 * 
	 * @param value
	 * @return
	 */
	public static XxStateEnum convertToEnum(String key) {
		for (XxStateEnum examType : XxStateEnum.values()) {
			if (key.equals(examType.getCode())) {
				return examType;
			}
		}
		return null;
	}
}

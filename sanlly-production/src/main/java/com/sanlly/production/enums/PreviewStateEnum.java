package com.sanlly.production.enums;

/**
 * 预检区状态
 * @author RexSheng
 * 2019年8月3日 下午3:23:16
 */
public enum PreviewStateEnum {
	/**
	 * 默认
	 */
	DEFAULT("LEPreviewStateEnum01", "默认"), 
	/**
	 * 原移
	 */
	MOVE("LEPreviewStateEnum02", "原移");

	private String code;

	private String message;

	PreviewStateEnum() {

	}

	PreviewStateEnum(String code, String message) {
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
	public static PreviewStateEnum convertToEnum(String key) {
		for (PreviewStateEnum examType : PreviewStateEnum.values()) {
			if (key.equals(examType.getCode())) {
				return examType;
			}
		}
		return null;
	}
}

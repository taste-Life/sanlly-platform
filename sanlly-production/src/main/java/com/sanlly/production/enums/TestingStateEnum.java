package com.sanlly.production.enums;

/**
 * 检验状态
 * @author RexSheng
 * 2019年8月3日 下午3:23:16
 */
public enum TestingStateEnum {
	/**
	 * 待检验
	 */
	UNTEST("LETestingStateEnum01", "待检验"), 
	/**
	 * 检验中
	 */
	TESTING("LETestingStateEnum02", "检验中"), 
	
	/**
	 * 待审核
	 */
	UNAUDIT("LETestingStateEnum03", "待审核"), 
	
	/**
	 * 已审核
	 */
	AUDITED("LETestingStateEnum04", "已审核"), 
	
	/**
	 * 已驳回
	 */
	REJECTED("LETestingStateEnum05", "已驳回");

	private String code;

	private String message;

	TestingStateEnum() {

	}

	TestingStateEnum(String code, String message) {
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
	public static TestingStateEnum convertToEnum(String key) {
		for (TestingStateEnum examType : TestingStateEnum.values()) {
			if (key.equals(examType.getCode())) {
				return examType;
			}
		}
		return null;
	}
}

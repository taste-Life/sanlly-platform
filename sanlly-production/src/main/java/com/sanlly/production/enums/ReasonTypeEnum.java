package com.sanlly.production.enums;

/**
 * 各种原因类型的枚举
 * @author RexSheng
 * 2019年8月13日 下午7:35:05
 */
public enum ReasonTypeEnum {
	
	/**
	 * 报价驳回
	 */
	EVALUATION_REJECT("LEReasonTypeEnum01","报价驳回"),
	/**
	 * 超期
	 */
	EXCEED("LEReasonTypeEnum02","超期"),
	/**
	 * 错项
	 */
	ERROR("LEReasonTypeEnum03","错项"),
	/**
	 * 漏项
	 */
	LOST("LEReasonTypeEnum04","漏项"),
	/**
	 * 返工
	 */
	REWORK("LEReasonTypeEnum05","返工"),
	/**
	 * 检验驳回
	 */
	TESTING("LEReasonTypeEnum06","检验驳回")
	;

	private final String code;

	private final String message;

	private ReasonTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}


	/**
	 *@Description: 通过值找到value
	 *@Param: [message]
	 *@return: java.lang.String
	 *@Author: zjd
	 *@date: 2019-09-26
	 */
	public static String getCodeByMessage(String message) {
		for (ReasonTypeEnum platformFree : ReasonTypeEnum.values()) {
			if (message.equals(platformFree.getMessage())) {
				return platformFree.getCode();
			}
		}
		return null;
	}

	public static String getMessagebyCode(String code) {
		for (ReasonTypeEnum platformFree : ReasonTypeEnum.values()) {
			if (code.equals(platformFree.getCode())) {
				return platformFree.getMessage();
			}
		}
		return null;
	}
}

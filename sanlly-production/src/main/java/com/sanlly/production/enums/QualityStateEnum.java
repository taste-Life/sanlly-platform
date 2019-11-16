package com.sanlly.production.enums;

/**
 * 安全质检枚举
 * 
 * @author wangxzh
 *
 */
public enum QualityStateEnum {
	/**
	 * 错项
	 */
	QUALITY_ERROR("LEQUALITYO001", "LEReasonTypeEnum03"),
	/**
	 * 漏项
	 */
	QUALITY_LEAK("LEQUALITYO002", "LEReasonTypeEnum04"),
	/**
	 * 返工
	 */
	QUALITY_BACK("LEQUALITYO003", "LEReasonTypeEnum05"),

	/**
	 * 未质检
	 */
	QUALITY_DEFAULT("LEQUALITYO004", "未质检"),
	/**
	 * 质检合格
	 */
	QUALITY_OK("LEQUALITYO005", "质检合格"),
	/**
	 * 质检不合格
	 */
	QUALITY_NOTOK("LEQUALITYO006", "质检不合格"),

	/**
	 * 质检派工
	 */
	QUALITY_DISPATCHED("LEQUALITYO007", "质检派工"),
	/**
	 * 质检完工
	 */
	QUALITY_FINISHWORK("LEQUALITYO008", "质检完工"),
	/**
	 * 复检完成
	 */
	QUALITY_COMPLETE("LEQUALITYO009", "复检完成");

	private String code;

	private String message;

	QualityStateEnum() {

	}

	QualityStateEnum(String code, String message) {
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

	public static String getMessagebyCode(String code) {
		for (QualityStateEnum platformFree : QualityStateEnum.values()) {
			if (code.equals(platformFree.getCode())) {
				return platformFree.getMessage();
			}
		}
		return null;
	}

}

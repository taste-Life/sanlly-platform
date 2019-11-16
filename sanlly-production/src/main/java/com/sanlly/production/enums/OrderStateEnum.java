package com.sanlly.production.enums;

/**
 * 新箱订单状态枚举
 * @author zhangkai
 *
 */
public enum OrderStateEnum {

	GERNERATED("LEORDER001", "已生成"),
	UNAUDIT("LEORDER002", "待审核"),
	AUDITED("LEORDER003", "已审核");
	
	private String code;
	
	private String message;

	private OrderStateEnum(String code, String message) {
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

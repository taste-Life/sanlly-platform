package com.sanlly.purchase.enums;

/**
 * 
* @Package com.sanlly.purchase.enums 
* @Description: 招标公告类型 
* @author jlx   
* @date 2019年8月20日 下午6:47:47 
* @version V1.0   
 */
public enum NoticeTypeEnum {
	PUBLISH("NoticeTypeEnum0", "发布"), FIRSTTRIAL("NoticeTypeEnum1", "初审"), RESULT("NoticeTypeEnum2", "签到");

	private String code;

	private String message;

	NoticeTypeEnum() {
	}

	NoticeTypeEnum(String code, String message) {
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

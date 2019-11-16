package com.sanlly.purchase.enums;

/**
 * 
* @Package com.sanlly.purchase.enums 
* @Description: 送货方式 
* @author jlx   
* @date 2019年9月4日 下午7:51:10 
* @version V1.0   
 */
public enum SupplyTypeEnum {
	SELF("SupplyTypeEnum0", "供方直送"), POST("SupplyTypeEnum1", "寄送"), TAKE("SupplyTypeEnum2", "自提");

	private String code;

	private String message;

	SupplyTypeEnum() {
	}

	SupplyTypeEnum(String code, String message) {
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

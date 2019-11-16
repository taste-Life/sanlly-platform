package com.sanlly.warehouse.enums;

/**
 * 
* Description: 采购单生成类型
* @ClassName: PurchaseFromTypeEnum
* @date 2019年7月26日
*
* @author jlx
 */
public enum PurchaseFromTypeEnum {
	MANUAL("LEPurchaseFromType01", "手动"), AUTO("LEPurchaseFromType02", "自动");

	private String code;

	private String message;

	PurchaseFromTypeEnum() {
	}

	PurchaseFromTypeEnum(String code, String message) {
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

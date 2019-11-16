package com.sanlly.purchase.enums;

public enum PurchaseStatusEnum {
	CREATED("LEPurchaseStatus1", "已生成采购单"), UNCREATED("LEPurchaseStatus0", "未生成采购单");

	private String code;

	private String message;
	
	PurchaseStatusEnum(String code, String message) {
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

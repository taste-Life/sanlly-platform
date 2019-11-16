package com.sanlly.purchase.enums;

public enum SupplierReviewEnum {
	
	UNREVIEW("LEUNREVIEW0", "未审核"),REVIEW("LEREVIEW1", "审核通过"),REVIEWING("LEREVIEWING2", "审核通过");

	
	private String code;

	private String message;



	SupplierReviewEnum(String code, String message) {
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

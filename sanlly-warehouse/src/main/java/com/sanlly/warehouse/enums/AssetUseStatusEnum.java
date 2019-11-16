package com.sanlly.warehouse.enums;
/**
 * 资产使用状态枚举
 * @author zhh
 *
 */
public enum AssetUseStatusEnum {

	IN_USE("LEUSESTATUS001", "使用中"), 
	SCRAP("LEUSESTATUS002", "已报废");

	private String code;

	private String message;

	private AssetUseStatusEnum() {
		// TODO Auto-generated constructor stub
	}

	private AssetUseStatusEnum(String code, String message) {
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

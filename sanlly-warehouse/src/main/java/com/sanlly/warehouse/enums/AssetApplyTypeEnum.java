package com.sanlly.warehouse.enums;
/**
 * 
* Description: 资产申请类型
* @ClassName: AssetApplyTypeEnum
* @date 2019年10月16日
*
* @author zhh
 */
public enum AssetApplyTypeEnum {

	RECEIVE("ASSETAPPLYTYPE01", "资产领用"), ALLOT("ASSETAPPLYTYPE02", "资产调拨"), SCRAP("ASSETAPPLYTYPE03", "资产报废"), ADD("ASSETAPPLYTYPE04", "新增资产"), UPDATE("ASSETAPPLYTYPE05", "信息修改");

	private String code;

	private String message;

	AssetApplyTypeEnum() {
	}

	AssetApplyTypeEnum(String code, String message) {
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

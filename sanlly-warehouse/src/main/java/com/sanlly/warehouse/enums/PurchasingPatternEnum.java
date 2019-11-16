package com.sanlly.warehouse.enums;

/**
 * 
* Description: 采购模式
* @ClassName: PurchasingPatternEnum
* @date 2019年7月26日
*
* @author jlx
 */
public enum PurchasingPatternEnum {

	TENDER("LEPurchasingPattern0", "招标"), BIDDING("LEPurchasingPattern1", "竞价"), INQUIRY("LEPurchasingPattern2", "询价"), 
	AGREEMENT("LEPurchasingPattern3", "协议"), ONLY("LEPurchasingPattern4", "单一来源"), TEMPORARY("LEPurchasingPattern5", "临时应急"), 
	TENDERBIDDINGINQUIRY("LEPurchasingPattern6", "招采"), ONLYANDTENDER("LEPurchasingPattern7", "单一/招采");
	private String code;

	private String message;

	PurchasingPatternEnum() {
	}

	PurchasingPatternEnum(String code, String message) {
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

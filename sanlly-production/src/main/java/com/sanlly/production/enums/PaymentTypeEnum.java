package com.sanlly.production.enums;


/**   
* @Package com.sanlly.production.enums 
* @Description: TODO 第三方收费 付费方式
* @author tianzhl   
* @date 2019年10月7日 下午3:48:56 
* @version V1.0   
*/
public enum PaymentTypeEnum {
	/**
	 * 二维码
	 */
	QRCODE("LEPaymentTypeEnum01", "二维码"),
	/**
	 * 现金
	 */
	CASH("LEPaymentTypeEnum02", "现金"),
	/**
	 * 刷卡
	 */
	CARD("LEPaymentTypeEnum03", "刷卡");

	private String code;

	private String message;

	PaymentTypeEnum() {

	}

	PaymentTypeEnum(String code, String message) {
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

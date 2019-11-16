package com.sanlly.production.enums;


/**   
* @Package com.sanlly.production.enums 
* @Description: TODO 第三方收费 收费方式
* @author tianzhl   
* @date 2019年10月7日 下午3:48:56 
* @version V1.0   
*/
public enum ChargeTypeEnum {
	/**
	 * 实收费用
	 */
	ACTUAL("LEChargeTypeEnum01", "实收费用"),
	/**
	 * 押金
	 */
	DEPOSIT("LEChargeTypeEnum02", "押金");

	private String code;

	private String message;

	ChargeTypeEnum() {

	}

	ChargeTypeEnum(String code, String message) {
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

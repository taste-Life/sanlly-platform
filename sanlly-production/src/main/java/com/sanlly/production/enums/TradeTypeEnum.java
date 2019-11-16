package com.sanlly.production.enums;


/**   
* @Package com.sanlly.production.enums 
* @Description: TODO 内外贸
* @author tianzhl   
* @date 2019年9月24日 下午7:29:26 
* @version V1.0   
*/
public enum TradeTypeEnum {
	/**
	 * 内贸
	 */
	DOMESTIC("LETRADE000001", "内贸"),
	/**
	 *外贸"
	 */
	FOREIGN("LETRADE000002", "外贸");

	private String code;

	private String message;

	TradeTypeEnum() {

	}

	TradeTypeEnum(String code, String message) {
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

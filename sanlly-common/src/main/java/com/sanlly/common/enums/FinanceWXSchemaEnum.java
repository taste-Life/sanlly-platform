package com.sanlly.common.enums;

/**
 * 	成本维修核算模式
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月10日  
 *
 */
public enum FinanceWXSchemaEnum {

	/**
	 * 	完工工时*费率
	 */
	WXSchema1("LEFIWXSCHEMA01", "完工工时*比例"), 
	/**
	 * 	实际修理收入*比例
	 */
	WXSchema2("LEFIWXSCHEMA02", "实际收入*比例");
	
	
	FinanceWXSchemaEnum() {

	}

	FinanceWXSchemaEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	private String code;

	private String message;

	

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

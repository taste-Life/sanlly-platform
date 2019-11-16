package com.sanlly.common.enums;

import org.apache.commons.codec.binary.StringUtils;

/**
 * 币种枚举
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月10日  
*
 */
public enum FinanceCurrencyType {
	/**
	 * 人民币
	 */
	CNY("CNY", "人民币"), 
	/**
	 * 美元
	 */
	USD("USD", "美元");

	private String code;

	private String message;

	FinanceCurrencyType() {

	}

	FinanceCurrencyType(String code, String message) {
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
	public static FinanceCurrencyType getFinanceCurrencyTypeByCode(String code){
		for(FinanceCurrencyType financeCurrencyType : FinanceCurrencyType.values()){
			if(StringUtils.equals(code, financeCurrencyType.getMessage())){
				return financeCurrencyType;
			}
		}
		return null;
	}
}

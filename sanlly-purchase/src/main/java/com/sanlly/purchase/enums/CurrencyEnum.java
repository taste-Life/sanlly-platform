package com.sanlly.purchase.enums;

import org.apache.commons.lang.StringUtils;

/**
 * 
* Description: 
* @ClassName: CurrencyEnum
* @date 2019年9月4日
*
* @author mx
 */
public enum CurrencyEnum {
	CurrencyA("CurrencyEnumA", "人民币"),
	CurrencyB("CurrencyEnumB", "美元"),
	CurrencyC("CurrencyEnumC", "港币");

	private String code;

	private String message;

	
	CurrencyEnum(String code, String message) {
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
	public static CurrencyEnum getCurrencyEnumByCode(String code){
		for(CurrencyEnum currencyEnum : CurrencyEnum.values()){
			if(StringUtils.equals(code, currencyEnum.getCode())){
				return currencyEnum;
			}
		}
		return null;
	}

}

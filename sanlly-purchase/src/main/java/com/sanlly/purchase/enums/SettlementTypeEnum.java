package com.sanlly.purchase.enums;

import org.apache.commons.lang.StringUtils;

/**
 * 
* Description: 
* @ClassName: SettlementTypeEnum
* @date 2019年9月4日
*
* @author mx
 */
public enum SettlementTypeEnum {
	SettlementA("SettlementEnum01", "SBS"),
	SettlementB("SettlementEnum02", "CBS");
	
	private String code;

	private String message;

	
	SettlementTypeEnum(String code, String message) {
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
	public static SettlementTypeEnum getSettlementTypeEnumByCode(String code){
		for(SettlementTypeEnum settlementTypeEnum : SettlementTypeEnum.values()){
			if(StringUtils.equals(code, settlementTypeEnum.getMessage())){
				return settlementTypeEnum;
			}
		}
		return null;
	}

}

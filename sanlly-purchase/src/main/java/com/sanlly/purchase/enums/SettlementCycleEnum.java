package com.sanlly.purchase.enums;

import org.apache.commons.lang.StringUtils;

/**
 * 
* Description: 
* @ClassName: SettlementCycleEnum
* @date 2019年9月4日
*
* @author mx
 */
public enum SettlementCycleEnum {
	PREPAID("LESETTLEMENTTIME01", "预付款"),
	COD("LESETTLEMENTTIME02", "货到付款"),
	DAY_15("LESETTLEMENTTIME03", "15天"),
	DAY_30("LESETTLEMENTTIME04", "30天"),
	DAY_45("LESETTLEMENTTIME05", "45天"),
	DAY_60("LESETTLEMENTTIME06", "60天"),
	DAY_90("LESETTLEMENTTIME07", "90天");

	private String code;

	private String message;

	
	SettlementCycleEnum(String code, String message) {
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

	public static SettlementCycleEnum getSettlementCycleEnumByCode(String code){
		for(SettlementCycleEnum settlementCycleEnum : SettlementCycleEnum.values()){
			if(StringUtils.equals(code, settlementCycleEnum.getMessage())){
				return settlementCycleEnum;
			}
		}
		return null;
	}

}

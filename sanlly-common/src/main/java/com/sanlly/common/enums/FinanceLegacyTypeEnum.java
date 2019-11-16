package com.sanlly.common.enums;

/**
 *单据类型
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月10日  
 *
 */
public enum FinanceLegacyTypeEnum {

	/**
	 * 服务对账单
	 */
	LegacyType01("LEFILEGACY01", "服务对账单"), 
	/**
	 * 服务销售调整单
	 */
	LegacyType02("LEFILEGACY02", "服务销售调整单"), 
	/**
	 * 服务采购订单
	 */
	LegacyType03("LEFILEGACY03", "服务采购订单"), 
	/**
	 * 服务采购调整单
	 */
	LegacyType04("LEFILEGACY04", "服务采购调整单");
	
	FinanceLegacyTypeEnum() {

	}

	FinanceLegacyTypeEnum(String code, String message) {
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

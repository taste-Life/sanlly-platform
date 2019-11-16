package com.sanlly.common.enums;

/**
 * 费用状态
* @Package com.sanlly.common.enums 
* @Description: TODO 
* @author fjy   
* @date 2019年8月26日 下午4:23:08 
* @version V1.0   
 */
public enum FinanceCostStatusEnum {
	/**
	 * 费用未确认
	 */
	COSTNOOK("LEFICOSTTYPE01", "费用未确认"),
	/**
	 * 费用已确认
	 */
	COSTOK("LEFICOSTTYPE02", "费用已确认"),
	/**
	 * 无法收费
	 */
	NOCOST("LEFICOSTTYPE03", "无法收费");

	private String code;

	private String desc;

	FinanceCostStatusEnum() {
	}

	FinanceCostStatusEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}

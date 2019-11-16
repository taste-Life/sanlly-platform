package com.sanlly.production.enums;

/**
 * 公式型条目类型
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月19日 下午3:11:06 
 * @version V1.0   
 */
public enum RateItemTypeEnum {
	/**
	 * 报价
	 */
	RATEITEMTYPE1("1", "报价"),
	/**
	 * 派工
	 */
	RATEITEMTYPE2("2", "派工"),
	/**
	 * 辅助
	 */
	RATEITEMTYPE3("3", "辅助");

	private String code;

	private String message;

	RateItemTypeEnum() {

	}

	RateItemTypeEnum(String code, String message) {
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

package com.sanlly.common.enums;

/**
 * 业务类型  对应业务分类表中的大类
 * @Description: 冷箱、干箱、堆场、箱体经营、其他
 * @author fjy
 * @date 2019年8月10日  
 *
 */
public enum FinanceBusinessTypeEnum {

	/**
	 * 冷箱
	 */
	BusinessType1("LEFIBUSINESSTYPE01", "冷箱"), 
	/**
	 * 干箱
	 */
	BusinessType2("LEFIBUSINESSTYPE02", "干箱"),
	
	/**
	 * 堆场
	 */
	BusinessType3("LEFIBUSINESSTYPE03", "堆场"),
	/**
	 * 箱体经营
	 */
	BusinessType4("LEFIBUSINESSTYPE04", "箱体经营"),
	/**
	 * 其他
	 */
	BusinessType5("LEFIBUSINESSTYPE05", "其他");
	
	FinanceBusinessTypeEnum() {

	}

	FinanceBusinessTypeEnum(String code, String message) {
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

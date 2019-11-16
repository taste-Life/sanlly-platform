package com.sanlly.common.enums;

/**
 * 国际化枚举样例
 * @author Work
 *
 */
public enum LangDemoEnum {
	MANAGEMENT("LELANGDEMO001","样例1"),SUPPLIER("LELANGDEMO002","样例2");
	
	private String code;
	
	private String desc;
	
	
	LangDemoEnum(){}
	LangDemoEnum(String code,String desc){
		this.code=code;
		this.desc=desc;
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

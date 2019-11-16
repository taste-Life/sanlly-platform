package com.sanlly.common.enums;

/**
 * 系统类型枚举
 * @author RexSheng
 * 2019年8月16日 上午9:50:06
 */
public enum SystemTypeEnum {
	MANAGEMENT(0,"管理系统"),SUPPLIER(1,"供应商系统"),APP(2,"APP");
	
	private Integer code;
	
	private String desc;
	
	
	SystemTypeEnum(){}
	SystemTypeEnum(Integer code,String desc){
		this.code=code;
		this.desc=desc;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}

package com.sanlly.common.enums;

/**
 * 
 * @Description: 流程专用枚举类  任务监听器使用
 * @author fjy
 * @date 2019年7月26日
 *
 */
public enum ProcessCodeEnum {

	Purc_Company("供应商注册","供应商注册");
	

	private String code;

	private String desc;

	ProcessCodeEnum() {
	}

	ProcessCodeEnum(String code, String desc) {
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

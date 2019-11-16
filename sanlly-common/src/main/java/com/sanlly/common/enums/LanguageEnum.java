package com.sanlly.common.enums;

/**
 *    
 * 
 * @Package com.sanlly.common.enums 
 * @Description: TODO 国际化枚举
 * @author tianzhl   
 * @date 2019年8月14日 上午10:23:06 
 * @version V1.0   
 */
public enum LanguageEnum {
	LANGZH("zh", "中文"), LANGEN("en", "英文");

	private String code;

	private String desc;

	LanguageEnum() {
	}

	LanguageEnum(String code, String desc) {
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

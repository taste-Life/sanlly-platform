package com.sanlly.purchase.models.output.lang;

/**
 * 使用翻译通用  Lang翻译
* @Package com.sanlly.purchase.models.output.lang 
* @Description: TODO 
* @author fjy   
* @date 2019年9月19日 下午2:36:47 
* @version V1.0   
 */
public class LangSelectOutput {
	

	/*
	  * 对应数据库key
	  */
	 private String value;
	 
	 /*
	  * 中文名
	  */
	 private String labelLang;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabelLang() {
		return labelLang;
	}

	public void setLabelLang(String labelLang) {
		this.labelLang = labelLang;
	}
	 
	 


}

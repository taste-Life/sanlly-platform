package com.sanlly.finance.models.output;

/**
 * 通用 国际化类
* @Package com.sanlly.finance.models.output 
* @Description: TODO 
* @author fjy   
* @date 2019年8月24日 下午2:52:08 
* @version V1.0   
 */
public class BaseOutput {

	private String value;
	
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

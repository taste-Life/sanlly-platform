package com.sanlly.production.models.output.rate;

/**
 * 下拉返回实体
 * @author wangxzh
 *
 */
public class SelectItemOutput {

	private String value;

	private String labelLang;

	private String code;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}

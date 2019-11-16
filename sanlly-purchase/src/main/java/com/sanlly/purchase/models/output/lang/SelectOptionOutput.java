package com.sanlly.purchase.models.output.lang;

/**
 * 
* Description: 采购下拉输出类
* @ClassName: SelectOptionOutput
* @date 2019年8月13日
*
* @author jlx
 */
public class SelectOptionOutput {

	/*
	  * 对应数据库key
	  */
	 private String value;
	 
	 /*
	  * 中文名
	  */
	 private String label;
	 
	 /*
	  * 英文名
	  */
	 private String labelEn;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabelEn() {
		return labelEn;
	}

	public void setLabelEn(String labelEn) {
		this.labelEn = labelEn;
	}
	 
	 
}

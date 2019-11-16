package com.sanlly.production.models.output;

/**
 * 一次性下拉选枚举输出类
 * @author zhangkai
 *
 */
public class SelectEnumOutput {

	/*
	 * 枚举key
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
	
	/*
	 * 枚举类名
	 */
	private String enumName;

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

	public String getEnumName() {
		return enumName;
	}

	public void setEnumName(String enumName) {
		this.enumName = enumName;
	}
	
	
}

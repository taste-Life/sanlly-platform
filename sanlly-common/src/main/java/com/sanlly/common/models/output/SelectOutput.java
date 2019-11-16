package com.sanlly.common.models.output;

/**
 * 下拉选记录输出类
 * 
 * @author zhangkai
 *
 */
public class SelectOutput {

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

	/*
	 * 扩展字段
	 */
	private String extend;

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

	public String getExtend() {
		return extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}

}

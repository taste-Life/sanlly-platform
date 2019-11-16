package com.sanlly.production.models.output.app.base;
/**
 * APP端部件修理分类列表输出类
 * @author zhangkai
 *
 */
public class PartsRepairTypeSelectOutput {

	/*
	 * 部件修理分类中文名
	 */
	private String type;
	/*
	 * 部件修理分类英文名
	 */
	private String typeEn;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeEn() {
		return typeEn;
	}

	public void setTypeEn(String typeEn) {
		this.typeEn = typeEn;
	}
	
	
}

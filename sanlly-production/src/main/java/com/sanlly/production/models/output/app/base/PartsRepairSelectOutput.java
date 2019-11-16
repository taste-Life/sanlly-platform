package com.sanlly.production.models.output.app.base;

/**
 * app端部件修理代码基础数据输出类
 * 
 * @author zhangkai
 *
 */
public class PartsRepairSelectOutput {

	/*
	 * 位置代码
	 */
	private String positionCode;
	/*
	 * 分类
	 */
	private String type;
	/*
	 * 分类
	 */
	private String typeEn;
	/*
	 * 部件修理代码
	 */
	private String partsRepairCode;
	/*
	 * 部件修理中文名
	 */
	private String partsRepairName;
	/*
	 * 部件修理英文名
	 */
	private String partsRepairNameEn;
	/*
	 * 部件修理分类key
	 */
	private String typeKey;

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

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

	public String getPartsRepairCode() {
		return partsRepairCode;
	}

	public void setPartsRepairCode(String partsRepairCode) {
		this.partsRepairCode = partsRepairCode;
	}

	public String getPartsRepairName() {
		return partsRepairName;
	}

	public void setPartsRepairName(String partsRepairName) {
		this.partsRepairName = partsRepairName;
	}

	public String getPartsRepairNameEn() {
		return partsRepairNameEn;
	}

	public void setPartsRepairNameEn(String partsRepairNameEn) {
		this.partsRepairNameEn = partsRepairNameEn;
	}

	public String getTypeKey() {
		return typeKey;
	}

	public void setTypeKey(String typeKey) {
		this.typeKey = typeKey;
	}
	
	

}

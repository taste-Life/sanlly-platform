package com.sanlly.production.models.output.app.base;
/**
 * APP端材质代码列表输出类
 * @author zhangkai
 *
 */
public class MaterialSelectOutput {

	/*
	 * 部件明细代码
	 */
	private String partsDetailsCode;
	/*
	 * 修理代码
	 */
	private String repairCode;
	/*
	 * 材质代码
	 */
	private String materialCode;
	/*
	 * 材质中文名
	 */
	private String materialName = "";
	/*
	 * 材质英文名
	 */
	private String materialNameEn = "";
	public String getPartsDetailsCode() {
		return partsDetailsCode;
	}
	public void setPartsDetailsCode(String partsDetailsCode) {
		this.partsDetailsCode = partsDetailsCode;
	}
	public String getRepairCode() {
		return repairCode;
	}
	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}
	public String getMaterialCode() {
		return materialCode;
	}
	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getMaterialNameEn() {
		return materialNameEn;
	}
	public void setMaterialNameEn(String materialNameEn) {
		this.materialNameEn = materialNameEn;
	}

	
	
}

package com.sanlly.production.models.output.app.base;
/**
 * APP端维修代码列表输出类
 * @author zhangkai
 *
 */
public class RepairSelectOutput {

	/*
	 * 部件明细代码
	 */
	private String partsDetailsCode;
	/*
	 * 修理代码
	 */
	private String repairCode;
	/*
	 * 修理中文名
	 */
	private String repairName = "";
	/*
	 * 修理英文名
	 */
	private String repairNameEn = "";

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

	public String getRepairName() {
		return repairName;
	}

	public void setRepairName(String repairName) {
		this.repairName = repairName;
	}

	public String getRepairNameEn() {
		return repairNameEn;
	}

	public void setRepairNameEn(String repairNameEn) {
		this.repairNameEn = repairNameEn;
	}
	
	
}

package com.sanlly.common.models.input.spare;

public class SearchTestingSpareInput {

	// 冷机公司
	private String companyKey;

	// 机型
	private String unitTypeKey;

	// 部件明细
	private String[] partsDetailCode;
	
	//修理code
	private String repairCode;

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public String getUnitTypeKey() {
		return unitTypeKey;
	}

	public void setUnitTypeKey(String unitTypeKey) {
		this.unitTypeKey = unitTypeKey;
	}

	public String[] getPartsDetailCode() {
		return partsDetailCode;
	}

	public void setPartsDetailCode(String[] partsDetailCode) {
		this.partsDetailCode = partsDetailCode;
	}

	public String getRepairCode() {
		return repairCode;
	}

	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}

}

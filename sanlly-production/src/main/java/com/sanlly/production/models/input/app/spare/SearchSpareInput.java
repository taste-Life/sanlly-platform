package com.sanlly.production.models.input.app.spare;

public class SearchSpareInput {

	private String companyKey;

	private String unitTypeKey;

	private String partsDetailsCode;
	
	//维修代码
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
	
}

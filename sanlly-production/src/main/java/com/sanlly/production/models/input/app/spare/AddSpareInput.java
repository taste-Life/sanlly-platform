package com.sanlly.production.models.input.app.spare;

public class AddSpareInput {

	private String sparesNum;

	private String companyKey;

	private String unitTypeKey;

	private String partsDetailKey;

	public String getSparesNum() {
		return sparesNum;
	}

	public void setSparesNum(String sparesNum) {
		this.sparesNum = sparesNum;
	}

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

	public String getPartsDetailKey() {
		return partsDetailKey;
	}

	public void setPartsDetailKey(String partsDetailKey) {
		this.partsDetailKey = partsDetailKey;
	}

}

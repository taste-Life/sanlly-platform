package com.sanlly.production.models.output.app.unitCompany;

public class UnitCompanyOutput {

	private String unitCompanyKey;
	
	private String unitCompanyCode;
	
	private String unitCompanyNameLang;
	
	private UnitTypeOutput[] typeList;

	public String getUnitCompanyKey() {
		return unitCompanyKey;
	}

	public void setUnitCompanyKey(String unitCompanyKey) {
		this.unitCompanyKey = unitCompanyKey;
	}

	public String getUnitCompanyCode() {
		return unitCompanyCode;
	}

	public void setUnitCompanyCode(String unitCompanyCode) {
		this.unitCompanyCode = unitCompanyCode;
	}

	public String getUnitCompanyNameLang() {
		return unitCompanyNameLang;
	}

	public void setUnitCompanyNameLang(String unitCompanyNameLang) {
		this.unitCompanyNameLang = unitCompanyNameLang;
	}

	public UnitTypeOutput[] getTypeList() {
		return typeList;
	}

	public void setTypeList(UnitTypeOutput[] typeList) {
		this.typeList = typeList;
	}
	
	
}

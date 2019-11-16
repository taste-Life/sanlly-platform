package com.sanlly.common.models.output.base;

import com.alibaba.fastjson.JSON;

public class RefrigeratorCompanyOutput {

	private Integer prodUnitCompanyId;

	private String key;

	private String keyLangLang;

	private String UnitCompanyCode;

	public String getUnitCompanyCode() {
		return UnitCompanyCode;
	}

	public void setUnitCompanyCode(String unitCompanyCode) {
		UnitCompanyCode = unitCompanyCode;
	}

	private String unitCompanyName;

    private String unitCompanyNameEn;

	private Integer isValid;
	
	



	public Integer getProdUnitCompanyId() {
		return prodUnitCompanyId;
	}

	public void setProdUnitCompanyId(Integer prodUnitCompanyId) {
		this.prodUnitCompanyId = prodUnitCompanyId;
	}

	public String getUnitCompanyName() {
		return unitCompanyName;
	}

	public void setUnitCompanyName(String unitCompanyName) {
		this.unitCompanyName = unitCompanyName;
	}

	public String getUnitCompanyNameEn() {
		return unitCompanyNameEn;
	}

	public void setUnitCompanyNameEn(String unitCompanyNameEn) {
		this.unitCompanyNameEn = unitCompanyNameEn;
	}

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public String getKeyLangLang() {
		return keyLangLang;
	}

	public void setKeyLangLang(String keyLangLang) {
		this.keyLangLang = keyLangLang;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}

package com.sanlly.production.models.input.refrigerator;

import com.alibaba.fastjson.JSON;

public class AddRefrigeratorCompanyInput {
	
	private String key;

    private String unitCompanyCode;

    private String unitCompanyName;

    private String unitCompanyNameEn;

	private String models;

    private Integer isValid;

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getUnitCompanyCode() {
		return unitCompanyCode;
	}

	public void setUnitCompanyCode(String unitCompanyCode) {
		this.unitCompanyCode = unitCompanyCode;
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

	public String getModels() {
		return models;
	}

	public void setModels(String models) {
		this.models = models;
	}

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

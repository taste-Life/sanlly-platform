package com.sanlly.production.models.input.refrigerator;

import com.sanlly.common.models.input.PageInput;

public class SearchRefrigeratorCompanyInput extends PageInput {

	public SearchRefrigeratorCompanyInput(Integer index, Integer size) {
		super(index, size);
	}

	private String unitCompanyName;

	public String getUnitCompanyName() {
		return unitCompanyName;
	}

	public void setUnitCompanyName(String unitCompanyName) {
		this.unitCompanyName = unitCompanyName;
	}


}

package com.sanlly.production.models.input.app.unitTesting;

public class SetUnitStateInput {

	private String[] prodCourseIdList;
	
	private String unitState;

	public String[] getProdCourseIdList() {
		return prodCourseIdList;
	}

	public void setProdCourseIdList(String[] prodCourseIdList) {
		this.prodCourseIdList = prodCourseIdList;
	}

	public String getUnitState() {
		return unitState;
	}

	public void setUnitState(String unitState) {
		this.unitState = unitState;
	}
	
	
}

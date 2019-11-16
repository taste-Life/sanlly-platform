package com.sanlly.production.models.input.unitTesting;

import com.sanlly.common.models.input.PageInput;

public class UnitTestingSearchInput extends PageInput {

	private String startDate;

	private String endDate;

	/**
	 * 场站
	 */
	private String yard;

	private String containerNo;

	private String containerUser;

	/**
	 * 进场类别
	 */
	private String courseType;

	// TODO 箱东
	private String containerOwner;

	private String isSurrender;

	/**
	 * 区位
	 */
	private String zone;

	/**
	 * 是否预检区
	 */
	private Boolean preZone;

	/**
	 * 机组状态
	 */
	private String[] unitState;

	/**
	 * 检验状态
	 */
	private String[] testingState;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getContainerOwner() {
		return containerOwner;
	}

	public void setContainerOwner(String containerOwner) {
		this.containerOwner = containerOwner;
	}

	public String getIsSurrender() {
		return isSurrender;
	}

	public void setIsSurrender(String isSurrender) {
		this.isSurrender = isSurrender;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Boolean getPreZone() {
		return preZone;
	}

	public void setPreZone(Boolean preZone) {
		this.preZone = preZone;
	}

	public String[] getUnitState() {
		return unitState;
	}

	public void setUnitState(String[] unitState) {
		this.unitState = unitState;
	}

	public String[] getTestingState() {
		return testingState;
	}

	public void setTestingState(String[] testingState) {
		this.testingState = testingState;
	}

}

package com.sanlly.production.models.input.app.unitTesting;

public class UnitTestingSearchInput{

	/**
	 * 检验状态
	 */
	private String testingState;
	
	/**
	 * 审核状态
	 */
	private String auditType;
	
	/**
	 * 区位
	 */
	private String zone;
		
	/**
	 * 箱号
	 */
	private String containerNo;
	
	/**
	 * 机组状态
	 */
	private String unitState;
	
	/**
	 * 页码
	 */
	private Integer index;
	
	/**
	 * 页大小
	 */
	private Integer size;

	public String getTestingState() {
		return testingState;
	}

	public void setTestingState(String testingState) {
		this.testingState = testingState;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getUnitState() {
		return unitState;
	}

	public void setUnitState(String unitState) {
		this.unitState = unitState;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
	
	
}

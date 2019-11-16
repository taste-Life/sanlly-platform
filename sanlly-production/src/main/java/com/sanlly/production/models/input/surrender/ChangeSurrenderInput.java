package com.sanlly.production.models.input.surrender;

public class ChangeSurrenderInput {

	/**
	 * 进场id
	 */
	private String prodCourseId;
	
	/**
	 * 箱类别
	 */
	private String containerCategory;
	
	/**
	 * 状态
	 */
	private String state;
	
	/**
	 * 是否箱东
	 */
	private Boolean isMaster;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Boolean getIsMaster() {
		return isMaster;
	}

	public void setIsMaster(Boolean isMaster) {
		this.isMaster = isMaster;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}
	
	
}

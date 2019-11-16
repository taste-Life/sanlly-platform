package com.sanlly.production.models.input.evaluation;

import java.util.List;

public class AddVersionInput {

	/**
	 * 进场id
	 */
	private String prodCourseId;
	
	/**
	 * 箱类别
	 */
	private String containerCategory;
	
	private List<AddVersionDetailInput> entries;

	public List<AddVersionDetailInput> getEntries() {
		return entries;
	}

	public void setEntries(List<AddVersionDetailInput> entries) {
		this.entries = entries;
	}

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}
	
	
	
}

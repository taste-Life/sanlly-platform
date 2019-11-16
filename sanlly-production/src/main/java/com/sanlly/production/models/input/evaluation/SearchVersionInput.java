package com.sanlly.production.models.input.evaluation;

import com.sanlly.common.models.input.PageInput;

public class SearchVersionInput extends PageInput{

	private String versionNo;
	
	private String prodCourseId;
	
	private String containerCategory;

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
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

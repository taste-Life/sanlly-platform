package com.sanlly.production.models.output.app.unitTesting;

public class CourseOutput {

	/**
	 * 修后照片
	 */
	private String afterPhoto;
	
	/**
	 * 是否预检区修理
	 */
	private String isPreviewLang;
	
	/**
	 * 备注
	 */
	private String remarks;
	
	/**
	 * 明细列表
	 */
	private CourseEntryOutput[] dataList;

	public String getAfterPhoto() {
		return afterPhoto;
	}

	public void setAfterPhoto(String afterPhoto) {
		this.afterPhoto = afterPhoto;
	}


	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public CourseEntryOutput[] getDataList() {
		return dataList;
	}

	public void setDataList(CourseEntryOutput[] dataList) {
		this.dataList = dataList;
	}

	public String getIsPreviewLang() {
		return isPreviewLang;
	}

	public void setIsPreviewLang(String isPreviewLang) {
		this.isPreviewLang = isPreviewLang;
	}
	
	
}

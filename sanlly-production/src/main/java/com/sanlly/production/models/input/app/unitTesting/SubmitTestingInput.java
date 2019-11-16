package com.sanlly.production.models.input.app.unitTesting;

/**
 * 暂存检验明细
 * @author RexSheng
 * 2019年9月17日 上午9:27:45
 */
public class SubmitTestingInput {
	
	private String prodCourseId;
	
	private String afterPhoto;
	
	private String isPreview;
	
	private String remarks;
	
	private SubmitTestingEntryInput[] partList;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getAfterPhoto() {
		return afterPhoto;
	}

	public void setAfterPhoto(String afterPhoto) {
		this.afterPhoto = afterPhoto;
	}

	public String getIsPreview() {
		return isPreview;
	}

	public void setIsPreview(String isPreview) {
		this.isPreview = isPreview;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public SubmitTestingEntryInput[] getPartList() {
		return partList;
	}

	public void setPartList(SubmitTestingEntryInput[] partList) {
		this.partList = partList;
	}
	
	
	
}

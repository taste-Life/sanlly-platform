package com.sanlly.production.models.input.app.cleaning;

/**
 * 完工补充照片
 * @author RexSheng
 * 2019年8月26日 下午1:34:35
 */
public class CleaningPhotoInput {

	/**
	 * 进场id
	 */
	private String prodCourseId;
	
	/**
	 * 洗箱照片
	 */
	private String completePhoto;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getCompletePhoto() {
		return completePhoto;
	}

	public void setCompletePhoto(String completePhoto) {
		this.completePhoto = completePhoto;
	}
	
	
}

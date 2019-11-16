package com.sanlly.production.models.input.app.cleaning;

/**
 * 预检员洗箱审核
 * @author RexSheng
 * 2019年8月26日 下午1:05:32
 */
public class CleaningAuditInput {

	
	/**
	 * 进场id
	 */
	private String prodCourseId;
	
	/**
	 * 预检员照片
	 */
	private String auditPhoto;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getAuditPhoto() {
		return auditPhoto;
	}

	public void setAuditPhoto(String auditPhoto) {
		this.auditPhoto = auditPhoto;
	}
	
	
}

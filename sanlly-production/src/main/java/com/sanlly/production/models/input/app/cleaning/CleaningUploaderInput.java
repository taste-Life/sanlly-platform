package com.sanlly.production.models.input.app.cleaning;

/**
 * 洗箱员洗箱提交
 * @author RexSheng
 * 2019年8月26日 上午11:42:54
 */
public class CleaningUploaderInput {

	/**
	 * 箱进场id
	 */
	private String prodCourseId;
	
	/**
	 * 是否特殊箱
	 */
	private String isSpecial;
	
	/**
	 * 气味种类
	 */
	private String offFlavorTypeKey;
	
	/**
	 * 洗箱员照片
	 */
	private String cleanPhoto;
	
	/**
	 * 备注
	 */
	private String remarks;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getIsSpecial() {
		return isSpecial;
	}

	public void setIsSpecial(String isSpecial) {
		this.isSpecial = isSpecial;
	}

	public String getCleanPhoto() {
		return cleanPhoto;
	}

	public void setCleanPhoto(String cleanPhoto) {
		this.cleanPhoto = cleanPhoto;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getOffFlavorTypeKey() {
		return offFlavorTypeKey;
	}

	public void setOffFlavorTypeKey(String offFlavorTypeKey) {
		this.offFlavorTypeKey = offFlavorTypeKey;
	}
	
	
}

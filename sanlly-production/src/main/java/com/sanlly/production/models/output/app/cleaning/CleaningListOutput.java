package com.sanlly.production.models.output.app.cleaning;

/**
 * 洗箱列表
 * @author RexSheng
 * 2019年8月24日 下午4:25:53
 */
public class CleaningListOutput {

	/**
	 * 	箱子进场Id
	 */
	private String prodCourseId;
	
	/**
	 * 箱号
	 */
	private String containerNo;
	
	/**
	 * 区位
	 */
	private String zoneLang;
	
	/**
	 * 是否特殊箱
	 */
	private String isSpecialLang;
	
	/**
	 * 洗箱状态
	 */
	private String cleaningStateLang;
	
	/**
	 * 异味种类
	 */
	private String offFlavorTypeLang;
	
	private String offFlavorTypeKey;
	
	/**
	 * 洗箱照片
	 */
	private String cleanPhoto;
	
	/**
	 * 预检员照片
	 */
	private String cleanCheckPhoto;
	
	
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 进场日期
	 */
	private String entryDate;
	
	/**
	 * 标记
	 */
	private String sign;
	
	/**
	 * 洗箱日期
	 */
	private String cleanDate;
	
	/**
	 * 箱型
	 */
	private String containerTypeNameLang;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getIsSpecialLang() {
		return isSpecialLang;
	}

	public void setIsSpecialLang(String isSpecialLang) {
		this.isSpecialLang = isSpecialLang;
	}

	public String getCleaningStateLang() {
		return cleaningStateLang;
	}

	public void setCleaningStateLang(String cleaningStateLang) {
		this.cleaningStateLang = cleaningStateLang;
	}

	public String getOffFlavorTypeLang() {
		return offFlavorTypeLang;
	}

	public void setOffFlavorTypeLang(String offFlavorTypeLang) {
		this.offFlavorTypeLang = offFlavorTypeLang;
	}

	public String getCleanPhoto() {
		return cleanPhoto;
	}

	public void setCleanPhoto(String cleanPhoto) {
		this.cleanPhoto = cleanPhoto;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getCleanDate() {
		return cleanDate;
	}

	public void setCleanDate(String cleanDate) {
		this.cleanDate = cleanDate;
	}

	public String getZoneLang() {
		return zoneLang;
	}

	public void setZoneLang(String zoneLang) {
		this.zoneLang = zoneLang;
	}

	public String getCleanCheckPhoto() {
		return cleanCheckPhoto;
	}

	public void setCleanCheckPhoto(String cleanCheckPhoto) {
		this.cleanCheckPhoto = cleanCheckPhoto;
	}

	public String getOffFlavorTypeKey() {
		return offFlavorTypeKey;
	}

	public void setOffFlavorTypeKey(String offFlavorTypeKey) {
		this.offFlavorTypeKey = offFlavorTypeKey;
	}

	public String getContainerTypeNameLang() {
		return containerTypeNameLang;
	}

	public void setContainerTypeNameLang(String containerTypeNameLang) {
		this.containerTypeNameLang = containerTypeNameLang;
	}
}

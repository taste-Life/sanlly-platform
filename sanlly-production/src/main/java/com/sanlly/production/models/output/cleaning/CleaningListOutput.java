package com.sanlly.production.models.output.cleaning;

/**
 * 洗箱列表返回
 * @author RexSheng
 * 2019年8月21日 下午4:45:36
 */
public class CleaningListOutput {
	/**
	 * 主键id
	 */
	private Integer cleaningId;

	/**
	 * 箱号
	 */
	private String containerNo;
	
	/**
	 * 尺寸
	 */
	private String sizeLang;
	
	/**
	 * 箱型
	 */
	private String containerTypeLang;
	
	/**
	 * 进场类别
	 */
	private String courseTypeLang;
	
	/**
	 * 进场场站
	 */
	private String yardLang;
	
	/**
	 * 洗箱模式
	 */
	private String cleaningPatternLang;
	
	/**
	 * 洗箱班组
	 */
	private String team;
	
	
	/**
	 * 洗箱状态
	 */
	private String cleaningStateLang;
	
	/**
	 * 洗箱状态
	 */
	private String cleaningStateKey;
	
	/**
	 * 异味种类
	 */
	private String flavorKey;
	
	/**
	 * 洗箱照片
	 */
	private String cleaningPhoto;
	
	/**
	 * 审核照片
	 */
	private String auditPhoto;

	/**
	 * 备注
	 */
	private String remarks;
	
	/**
	 * 洗箱备注
	 */
	private String cleaningRemarks;
	
	/**
	 * 是否特殊箱
	 */
	private String isSpecial;

	public String getContainerNo() {
		return containerNo;
	}


	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}


	public String getSizeLang() {
		return sizeLang;
	}


	public void setSizeLang(String sizeLang) {
		this.sizeLang = sizeLang;
	}


	public String getYardLang() {
		return yardLang;
	}


	public void setYardLang(String yardLang) {
		this.yardLang = yardLang;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public String getCleaningStateLang() {
		return cleaningStateLang;
	}


	public void setCleaningStateLang(String cleaningStateLang) {
		this.cleaningStateLang = cleaningStateLang;
	}


	public String getContainerTypeLang() {
		return containerTypeLang;
	}


	public void setContainerTypeLang(String containerTypeLang) {
		this.containerTypeLang = containerTypeLang;
	}


	public String getCourseTypeLang() {
		return courseTypeLang;
	}


	public void setCourseTypeLang(String courseTypeLang) {
		this.courseTypeLang = courseTypeLang;
	}


	public String getCleaningPatternLang() {
		return cleaningPatternLang;
	}


	public void setCleaningPatternLang(String cleaningPatternLang) {
		this.cleaningPatternLang = cleaningPatternLang;
	}


	public String getCleaningPhoto() {
		return cleaningPhoto;
	}


	public void setCleaningPhoto(String cleaningPhoto) {
		this.cleaningPhoto = cleaningPhoto;
	}


	public String getAuditPhoto() {
		return auditPhoto;
	}


	public void setAuditPhoto(String auditPhoto) {
		this.auditPhoto = auditPhoto;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public Integer getCleaningId() {
		return cleaningId;
	}


	public void setCleaningId(Integer cleaningId) {
		this.cleaningId = cleaningId;
	}


	public String getCleaningStateKey() {
		return cleaningStateKey;
	}


	public void setCleaningStateKey(String cleaningStateKey) {
		this.cleaningStateKey = cleaningStateKey;
	}


	public String getFlavorKey() {
		return flavorKey;
	}


	public void setFlavorKey(String flavorKey) {
		this.flavorKey = flavorKey;
	}


	public String getIsSpecial() {
		return isSpecial;
	}


	public void setIsSpecial(String isSpecial) {
		this.isSpecial = isSpecial;
	}


	public String getCleaningRemarks() {
		return cleaningRemarks;
	}


	public void setCleaningRemarks(String cleaningRemarks) {
		this.cleaningRemarks = cleaningRemarks;
	}
	
	
	
	
}

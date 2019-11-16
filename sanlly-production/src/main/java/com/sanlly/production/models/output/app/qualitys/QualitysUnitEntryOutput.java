package com.sanlly.production.models.output.app.qualitys;

/**
 * 机组质检返回实体
 * @author wangxzh
 *
 */
public class QualitysUnitEntryOutput {

	private String courseEntryId;

	private String partTypeCodeLang;

	private String partDetailCodeLang;

	private String damageCodeLang;

	private String repairCodeLang;

	private String sparesNumLang;

	private String quantity;

	private String remarks;

	private String manHour;

	private String photo;

	private Integer qualityState;

	private Integer isTechnology;

	private String reworkQuestionLang;

	private String rectificationStandardLang;

	public String getCourseEntryId() {
		return courseEntryId;
	}

	public void setCourseEntryId(String courseEntryId) {
		this.courseEntryId = courseEntryId;
	}

	public String getPartTypeCodeLang() {
		return partTypeCodeLang;
	}

	public void setPartTypeCodeLang(String partTypeCodeLang) {
		this.partTypeCodeLang = partTypeCodeLang;
	}

	public String getPartDetailCodeLang() {
		return partDetailCodeLang;
	}

	public void setPartDetailCodeLang(String partDetailCodeLang) {
		this.partDetailCodeLang = partDetailCodeLang;
	}

	public String getDamageCodeLang() {
		return damageCodeLang;
	}

	public void setDamageCodeLang(String damageCodeLang) {
		this.damageCodeLang = damageCodeLang;
	}

	public String getRepairCodeLang() {
		return repairCodeLang;
	}

	public void setRepairCodeLang(String repairCodeLang) {
		this.repairCodeLang = repairCodeLang;
	}

	public String getSparesNumLang() {
		return sparesNumLang;
	}

	public void setSparesNumLang(String sparesNumLang) {
		this.sparesNumLang = sparesNumLang;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getManHour() {
		return manHour;
	}

	public void setManHour(String manHour) {
		this.manHour = manHour;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getQualityState() {
		return qualityState;
	}

	public void setQualityState(Integer qualityState) {
		this.qualityState = qualityState;
	}

	public Integer getIsTechnology() {
		return isTechnology;
	}

	public void setIsTechnology(Integer isTechnology) {
		this.isTechnology = isTechnology;
	}

	public String getReworkQuestionLang() {
		return reworkQuestionLang;
	}

	public void setReworkQuestionLang(String reworkQuestionLang) {
		this.reworkQuestionLang = reworkQuestionLang;
	}

	public String getRectificationStandardLang() {
		return rectificationStandardLang;
	}

	public void setRectificationStandardLang(String rectificationStandardLang) {
		this.rectificationStandardLang = rectificationStandardLang;
	}

}

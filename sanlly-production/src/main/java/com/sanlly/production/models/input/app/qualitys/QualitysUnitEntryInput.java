package com.sanlly.production.models.input.app.qualitys;

/**
 * 机组条目质检结果接收实体
 * @author wangxzh
 *
 */
public class QualitysUnitEntryInput {

	private String courseEntryId;

	private String qualityState;

	private String isTechnology;

	private String reworkQuestion;

	private String rectificationStandard;

	private String reasonConten;

	private String partTypeCode;

	private String partDetailCode;

	private String damageCode;

	private String repairCode;

	private String sparesNum;

	private String quantity;

	private String remarks;

	private String photo;

	public String getCourseEntryId() {
		return courseEntryId;
	}

	public void setCourseEntryId(String courseEntryId) {
		this.courseEntryId = courseEntryId;
	}

	public String getQualityState() {
		return qualityState;
	}

	public void setQualityState(String qualityState) {
		this.qualityState = qualityState;
	}

	public String getIsTechnology() {
		return isTechnology;
	}

	public void setIsTechnology(String isTechnology) {
		this.isTechnology = isTechnology;
	}

	public String getReworkQuestion() {
		return reworkQuestion;
	}

	public void setReworkQuestion(String reworkQuestion) {
		this.reworkQuestion = reworkQuestion;
	}

	public String getRectificationStandard() {
		return rectificationStandard;
	}

	public void setRectificationStandard(String rectificationStandard) {
		this.rectificationStandard = rectificationStandard;
	}

	public String getReasonConten() {
		return reasonConten;
	}

	public void setReasonConten(String reasonConten) {
		this.reasonConten = reasonConten;
	}

	public String getPartTypeCode() {
		return partTypeCode;
	}

	public void setPartTypeCode(String partTypeCode) {
		this.partTypeCode = partTypeCode;
	}

	public String getPartDetailCode() {
		return partDetailCode;
	}

	public void setPartDetailCode(String partDetailCode) {
		this.partDetailCode = partDetailCode;
	}

	public String getDamageCode() {
		return damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	public String getRepairCode() {
		return repairCode;
	}

	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}

	public String getSparesNum() {
		return sparesNum;
	}

	public void setSparesNum(String sparesNum) {
		this.sparesNum = sparesNum;
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}

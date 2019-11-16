package com.sanlly.production.models.output.app.unitTesting;

public class CourseEntryOutput {

	/**
	 * 条目id
	 */
	private String courseEntryId;
	
	/**
	 * 部件大类
	 */
	private String partTypeCode;
	
	/**
	 * 部件明细
	 */
	private String partDetailCode;
	
	/**
	 * 损坏代码
	 */
	private String damageCode;
	
	/**
	 * 修理代码
	 */
	private String repairCode;
	
	/**
	 * 备件号
	 */
	private String sparesNum;
	
	/**
	 * 数量
	 */
	private String quantity;
	
	/**
	 * 长度
	 */
	private String remarks;
	
	/**
	 * 宽度
	 */
	private String manHour;
	
	/**
	 * 修前视频照片
	 */
	private String photo;
	
	//费率Id
	private String rateId;
	
	//是否拍修前照片 -费率返回
	private String isMustPhoto;
	
	//材料费 -费率返回
	private String materialCost;
	
	//工时费 -费率返回
	private String manHourCost;

	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public String getIsMustPhoto() {
		return isMustPhoto;
	}

	public void setIsMustPhoto(String isMustPhoto) {
		this.isMustPhoto = isMustPhoto;
	}

	public String getMaterialCost() {
		return materialCost;
	}

	public void setMaterialCost(String materialCost) {
		this.materialCost = materialCost;
	}

	public String getManHourCost() {
		return manHourCost;
	}

	public void setManHourCost(String manHourCost) {
		this.manHourCost = manHourCost;
	}

	public String getCourseEntryId() {
		return courseEntryId;
	}

	public void setCourseEntryId(String courseEntryId) {
		this.courseEntryId = courseEntryId;
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
	
	
}

package com.sanlly.production.models.input.quality;

/**
 * 质检条目
 * 
 * @Package com.sanlly.production.models.input.quality 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月15日 上午11:37:15 
 * @version V1.0   
 */
public class QualityCourseEntryInput {
	// TODO 条目id
	private String courseEntryId;
	// TODO 关联主键
	private String parentReferralEntry;
	// TODO 付费方
	private String payingParty;
	// TODO 位置代码
	private String positionCode;
	// TODO 部件修理代码
	private String partsDetailsCode;
	// TODO 部件明细代码
	private String partsRepairCode;
	// TODO 修理代码
	private String repairCode;
	// TODO 损坏代码
	private String damageCode;
	// TODO 材质
	private String materialCode;
	// TODO 长度
	private String length;
	// TODO 宽度
	private String width;
	// TODO 数量
	private String quantity;
	// TODO 费用
	private String sumMoney;
	// TODO 实收
	private String thirdpartyMoney;
	// TODO 备注
	private String remarks;
	// TODO 修前照片视频
	private String photo;
	// TODO 部件大类
	private String partTypeCode;
	// TODO 备件号
	private String sparesNum;
	// TODO 主件
	private String device;
	// TODO 工时
	private String manHour;
	// TODO 工时费
	private String manHourCost;
	// TODO 材料费
	private String materialCost;
	// TODO 是否上传照片
	private String isMustPhoto;
	// TODO 是否已收费
	private String isCharge;
	// TODO 费率Id
	private String rateId;
	// TODO 五位代码
	private String fiveCode;
	// TODO 仓库类型
	private String warehouseType;
	// TODO 质检状态
	private String qualityStateKey;
	// TODO 问题类别
	private String reworkQuestion;
	// TODO 整改标准
	private String rectificationStandard;
	// TODO 原因
	private String qualityCause;
	// TODO 是否有工艺标准
	private String isTechnology;

	public String getCourseEntryId() {
		return courseEntryId;
	}

	public void setCourseEntryId(String courseEntryId) {
		this.courseEntryId = courseEntryId;
	}

	public String getParentReferralEntry() {
		return parentReferralEntry;
	}

	public void setParentReferralEntry(String parentReferralEntry) {
		this.parentReferralEntry = parentReferralEntry;
	}

	public String getPayingParty() {
		return payingParty;
	}

	public void setPayingParty(String payingParty) {
		this.payingParty = payingParty;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getPartsDetailsCode() {
		return partsDetailsCode;
	}

	public void setPartsDetailsCode(String partsDetailsCode) {
		this.partsDetailsCode = partsDetailsCode;
	}

	public String getPartsRepairCode() {
		return partsRepairCode;
	}

	public void setPartsRepairCode(String partsRepairCode) {
		this.partsRepairCode = partsRepairCode;
	}

	public String getRepairCode() {
		return repairCode;
	}

	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}

	public String getDamageCode() {
		return damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(String sumMoney) {
		this.sumMoney = sumMoney;
	}

	public String getThirdpartyMoney() {
		return thirdpartyMoney;
	}

	public void setThirdpartyMoney(String thirdpartyMoney) {
		this.thirdpartyMoney = thirdpartyMoney;
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

	public String getPartTypeCode() {
		return partTypeCode;
	}

	public void setPartTypeCode(String partTypeCode) {
		this.partTypeCode = partTypeCode;
	}

	public String getSparesNum() {
		return sparesNum;
	}

	public void setSparesNum(String sparesNum) {
		this.sparesNum = sparesNum;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getManHour() {
		return manHour;
	}

	public void setManHour(String manHour) {
		this.manHour = manHour;
	}

	public String getManHourCost() {
		return manHourCost;
	}

	public void setManHourCost(String manHourCost) {
		this.manHourCost = manHourCost;
	}

	public String getMaterialCost() {
		return materialCost;
	}

	public void setMaterialCost(String materialCost) {
		this.materialCost = materialCost;
	}

	public String getIsMustPhoto() {
		return isMustPhoto;
	}

	public void setIsMustPhoto(String isMustPhoto) {
		this.isMustPhoto = isMustPhoto;
	}

	public String getIsCharge() {
		return isCharge;
	}

	public void setIsCharge(String isCharge) {
		this.isCharge = isCharge;
	}

	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public String getFiveCode() {
		return fiveCode;
	}

	public void setFiveCode(String fiveCode) {
		this.fiveCode = fiveCode;
	}

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

	public String getQualityStateKey() {
		return qualityStateKey;
	}

	public void setQualityStateKey(String qualityStateKey) {
		this.qualityStateKey = qualityStateKey;
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

	public String getQualityCause() {
		return qualityCause;
	}

	public void setQualityCause(String qualityCause) {
		this.qualityCause = qualityCause;
	}

	public String getIsTechnology() {
		return isTechnology;
	}

	public void setIsTechnology(String isTechnology) {
		this.isTechnology = isTechnology;
	}

}

package com.sanlly.production.models.output.quality;

public class QualityEntryInfoOutput {
	// 条目id
	private String courseEntryId;
	// 质检标识
	private String QualityStateLang;
	// 质检标识
	private String QualityStateKey;
	// 位置代码
	private String positionCode;
	// 部件明细代码
	private String partsDetailsCode;
	// 部件修理代码
	private String partsRepairCode;
	// 修理代码
	private String repairCode;
	// 损坏代码
	private String damageCode;
	// 材质
	private String materialCode;
	// 长度
	private String length;
	// 宽度
	private String width;
	// 数量
	private String quantity;
	// 费用
	private String sumMoney;
	// 实收
	private String thirdpartyMoney;
	// 付费方
	private String payingParty;
	// 备注
	private String remarks;
	// 修前照片视频
	private String photo;
	// 工时
	private String manHour;
	// 部件大类
	private String partTypeCode;
	// 备件号
	private String sparesNum;
	// 费率id
	private String rateId;
	// 真正的五位代码
	private String fiveCode;
	// 是否必须上传照片
	private String isMustPhoto;
	/**
	 * 是否已付费
	 */
	private String isChargeLang;

	private String isChargeKey;

	/**
	 * 主件
	 */
	private String device;

	/**
	 * 工时费
	 */
	private String manHourCost;

	// 材料费
	private String materialCost;

	// 是否允许修理
	private String isRepair;
	// 是否修理
	private String isRepairNameLang;
	// 版本号
	private String versionNo;

	private String partsTypeCode;

	// 仓库类型
	private String warehouseType;
	// 仓库类型
	private String warehouseTypeNameLang;
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

	public String getQualityStateLang() {
		return QualityStateLang;
	}

	public void setQualityStateLang(String qualityStateLang) {
		QualityStateLang = qualityStateLang;
	}

	public String getQualityStateKey() {
		return QualityStateKey;
	}

	public void setQualityStateKey(String qualityStateKey) {
		QualityStateKey = qualityStateKey;
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

	public String getPayingParty() {
		return payingParty;
	}

	public void setPayingParty(String payingParty) {
		this.payingParty = payingParty;
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

	public String getManHour() {
		return manHour;
	}

	public void setManHour(String manHour) {
		this.manHour = manHour;
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

	public String getIsMustPhoto() {
		return isMustPhoto;
	}

	public void setIsMustPhoto(String isMustPhoto) {
		this.isMustPhoto = isMustPhoto;
	}

	public String getIsChargeLang() {
		return isChargeLang;
	}

	public void setIsChargeLang(String isChargeLang) {
		this.isChargeLang = isChargeLang;
	}

	public String getIsChargeKey() {
		return isChargeKey;
	}

	public void setIsChargeKey(String isChargeKey) {
		this.isChargeKey = isChargeKey;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
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

	public String getIsRepair() {
		return isRepair;
	}

	public void setIsRepair(String isRepair) {
		this.isRepair = isRepair;
	}

	public String getIsRepairNameLang() {
		return isRepairNameLang;
	}

	public void setIsRepairNameLang(String isRepairNameLang) {
		this.isRepairNameLang = isRepairNameLang;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public String getPartsTypeCode() {
		return partsTypeCode;
	}

	public void setPartsTypeCode(String partsTypeCode) {
		this.partsTypeCode = partsTypeCode;
	}

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

	public String getWarehouseTypeNameLang() {
		return warehouseTypeNameLang;
	}

	public void setWarehouseTypeNameLang(String warehouseTypeNameLang) {
		this.warehouseTypeNameLang = warehouseTypeNameLang;
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

package com.sanlly.production.models.output.estimate;

public class EstimateCourseEntryOutput {

	// TODO 条目id
	private String courseEntryId;
	// TODO 位置代码
	private String positionCode;
	// TODO 部件明细代码
	private String partsDetailsCode;
	// TODO 部件修理代码
	private String partsRepairCode;
	// TODO 修理代码
	private String repairCode;
	// TODO 损坏代码
	private String damageCode;
	// TODO 材质
	private String materialCode;
	// TODO 部件大类名称
	private String partTypeNameLang;
	// TODO 部件明细代码
	private String partsDetailsNameLang;
	// TODO 部件修理代码
	private String partsRepairNameLang;
	// TODO 修理代码
	private String repairNameLang;
	// TODO 损坏代码
	private String damageNameLang;
	// TODO 材质
	private String materialNameLang;
	// TODO 长度
	private String length;
	// TODO 宽度
	private String width;
	// TODO 数量
	private String quantity;
	// TODO 实收
	private String thirdpartyMoney;
	// TODO 付费方
	private String payingParty;
	// TODO 备注
	private String remarks;
	// TODO 修前照片视频
	private String photo;
	// TODO 工时
	private String manHour;
	// TODO 部件大类
	private String partTypeCode;
	// TODO 备件号
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

	// TODO 工时费
	private String manHourCost;
	// TODO 材料费
	private String materialCost;
	// TODO 费用
	private String sumMoney;
	// TODO 工时费
	private String originalManHourCost;
	// TODO 材料费
	private String originalMaterialCost;
	// TODO 费用
	private String originalSumMoney;

	// 是否允许修理
	private String isRepair;
	// 是否修理
	private String isRepairNameLang;
	// 版本号
	private String versionNo;

	private String partsTypeCode;

	// TODO 备件价格
	private String price;
	// TODO 仓库类型
	private String warehouseType;
	// TODO 公司
	private String company;
	// TODO 仓库
	private String warehouse;
	// TODO 原件维修
	private String isOriginal;
	// TODO 仓库类型
	private String warehouseTypeNameLang;
	// TODO 公司
	private String companyNameLang;
	// TODO 仓库
	private String warehouseNameLang;

	public String getCourseEntryId() {
		return courseEntryId;
	}

	public void setCourseEntryId(String courseEntryId) {
		this.courseEntryId = courseEntryId;
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

	public String getPartTypeNameLang() {
		return partTypeNameLang;
	}

	public void setPartTypeNameLang(String partTypeNameLang) {
		this.partTypeNameLang = partTypeNameLang;
	}

	public String getPartsDetailsNameLang() {
		return partsDetailsNameLang;
	}

	public void setPartsDetailsNameLang(String partsDetailsNameLang) {
		this.partsDetailsNameLang = partsDetailsNameLang;
	}

	public String getPartsRepairNameLang() {
		return partsRepairNameLang;
	}

	public void setPartsRepairNameLang(String partsRepairNameLang) {
		this.partsRepairNameLang = partsRepairNameLang;
	}

	public String getRepairNameLang() {
		return repairNameLang;
	}

	public void setRepairNameLang(String repairNameLang) {
		this.repairNameLang = repairNameLang;
	}

	public String getDamageNameLang() {
		return damageNameLang;
	}

	public void setDamageNameLang(String damageNameLang) {
		this.damageNameLang = damageNameLang;
	}

	public String getMaterialNameLang() {
		return materialNameLang;
	}

	public void setMaterialNameLang(String materialNameLang) {
		this.materialNameLang = materialNameLang;
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

	public String getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(String sumMoney) {
		this.sumMoney = sumMoney;
	}

	public String getOriginalManHourCost() {
		return originalManHourCost;
	}

	public void setOriginalManHourCost(String originalManHourCost) {
		this.originalManHourCost = originalManHourCost;
	}

	public String getOriginalMaterialCost() {
		return originalMaterialCost;
	}

	public void setOriginalMaterialCost(String originalMaterialCost) {
		this.originalMaterialCost = originalMaterialCost;
	}

	public String getOriginalSumMoney() {
		return originalSumMoney;
	}

	public void setOriginalSumMoney(String originalSumMoney) {
		this.originalSumMoney = originalSumMoney;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getIsOriginal() {
		return isOriginal;
	}

	public void setIsOriginal(String isOriginal) {
		this.isOriginal = isOriginal;
	}

	public String getWarehouseTypeNameLang() {
		return warehouseTypeNameLang;
	}

	public void setWarehouseTypeNameLang(String warehouseTypeNameLang) {
		this.warehouseTypeNameLang = warehouseTypeNameLang;
	}

	public String getCompanyNameLang() {
		return companyNameLang;
	}

	public void setCompanyNameLang(String companyNameLang) {
		this.companyNameLang = companyNameLang;
	}

	public String getWarehouseNameLang() {
		return warehouseNameLang;
	}

	public void setWarehouseNameLang(String warehouseNameLang) {
		this.warehouseNameLang = warehouseNameLang;
	}

}

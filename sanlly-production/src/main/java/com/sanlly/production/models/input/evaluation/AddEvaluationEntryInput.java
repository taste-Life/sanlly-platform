package com.sanlly.production.models.input.evaluation;

import java.math.BigDecimal;

/**
 * 估价条目实体
 * 
 * @Package com.sanlly.production.models.input.evaluation 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月5日 上午9:49:12 
 * @version V1.0   
 */
public class AddEvaluationEntryInput {
	// 主键id
	private String prodEvaluationEntryId;
	// 序号
	private Integer serialNumber;
	// 使用费率
	private String rateId;
	// 五位代码
	private String fiveCode;
	// 进场id
	private String course;
	// 箱类别
	private String containerCategory;
	// 位置代码
	private String positionCode;
	// 部件大类
	private String partsTypeCode;
	// 部件明细
	private String partsDetailsCode;
	// 部件修理代码
	private String partsRepairCode;
	// 损坏代码
	private String damageCode;
	// 修理代码
	private String repairCode;
	// 材质代码
	private String materialCode;
	// 主件
	private String device;
	// 备件号
	private String sparesNumber;
	// 长度
	private Double length;
	// 宽度
	private Double width;
	// 数量
	private Double quantity;
	// 工时
	private Double manHour;
	// 工时费
	private BigDecimal manHourCost;
	// 材料费
	private BigDecimal materialCost;
	// 第三方费用
	private BigDecimal thirdpartyMoney;
	// 总费用
	private BigDecimal sumMoney;
	// 是否已收费
	private String isCharge;
	// 付费方key
	private String payingParty;
	// 临时付费方key，暂存修改后的付费方
	private String tempPayingParty;
	// 是否允许修理
	private String isRepair;
	// 备注
	private String remarks;
	// 图片
	private String photo;

	// 减免金额
	private BigDecimal reductionMoney;
	// 是否必须上传照片
	private String isMustPhoto;
	/**
	 * 仓库类型
	 */
	private String warehouseType;

	// 仓库
	private String warehouse;
	// 公司
	private String company;
	// 备件价格
	private BigDecimal price;
	// 是否原件维修
	private String isOriginal;
	// 原工时费
	private BigDecimal originalManHourCost;
	// 原材料费
	private BigDecimal originalMaterialCost;
	// 原总费用
	private BigDecimal originalSumMoney;

	public String getProdEvaluationEntryId() {
		return prodEvaluationEntryId;
	}

	public void setProdEvaluationEntryId(String prodEvaluationEntryId) {
		this.prodEvaluationEntryId = prodEvaluationEntryId;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getPartsTypeCode() {
		return partsTypeCode;
	}

	public void setPartsTypeCode(String partsTypeCode) {
		this.partsTypeCode = partsTypeCode;
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

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getSparesNumber() {
		return sparesNumber;
	}

	public void setSparesNumber(String sparesNumber) {
		this.sparesNumber = sparesNumber;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getManHour() {
		return manHour;
	}

	public void setManHour(Double manHour) {
		this.manHour = manHour;
	}

	public BigDecimal getManHourCost() {
		return manHourCost;
	}

	public void setManHourCost(BigDecimal manHourCost) {
		this.manHourCost = manHourCost;
	}

	public BigDecimal getMaterialCost() {
		return materialCost;
	}

	public void setMaterialCost(BigDecimal materialCost) {
		this.materialCost = materialCost;
	}

	public BigDecimal getThirdpartyMoney() {
		return thirdpartyMoney;
	}

	public void setThirdpartyMoney(BigDecimal thirdpartyMoney) {
		this.thirdpartyMoney = thirdpartyMoney;
	}

	public BigDecimal getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(BigDecimal sumMoney) {
		this.sumMoney = sumMoney;
	}

	public String getIsCharge() {
		return isCharge;
	}

	public void setIsCharge(String isCharge) {
		this.isCharge = isCharge;
	}

	public String getPayingParty() {
		return payingParty;
	}

	public void setPayingParty(String payingParty) {
		this.payingParty = payingParty;
	}

	public String getIsRepair() {
		return isRepair;
	}

	public void setIsRepair(String isRepair) {
		this.isRepair = isRepair;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTempPayingParty() {
		return tempPayingParty;
	}

	public void setTempPayingParty(String tempPayingParty) {
		this.tempPayingParty = tempPayingParty;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public BigDecimal getReductionMoney() {
		return reductionMoney;
	}

	public void setReductionMoney(BigDecimal reductionMoney) {
		this.reductionMoney = reductionMoney;
	}

	public String getIsMustPhoto() {
		return isMustPhoto;
	}

	public void setIsMustPhoto(String isMustPhoto) {
		this.isMustPhoto = isMustPhoto;
	}

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getIsOriginal() {
		return isOriginal;
	}

	public void setIsOriginal(String isOriginal) {
		this.isOriginal = isOriginal;
	}

	public BigDecimal getOriginalManHourCost() {
		return originalManHourCost;
	}

	public void setOriginalManHourCost(BigDecimal originalManHourCost) {
		this.originalManHourCost = originalManHourCost;
	}

	public BigDecimal getOriginalMaterialCost() {
		return originalMaterialCost;
	}

	public void setOriginalMaterialCost(BigDecimal originalMaterialCost) {
		this.originalMaterialCost = originalMaterialCost;
	}

	public BigDecimal getOriginalSumMoney() {
		return originalSumMoney;
	}

	public void setOriginalSumMoney(BigDecimal originalSumMoney) {
		this.originalSumMoney = originalSumMoney;
	}

}

package com.sanlly.production.models.input.referral;

import java.math.BigDecimal;

/**
 * 派工单明细实体
 * 
 * @Package com.sanlly.production.models.input.referral 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月5日 下午2:45:33 
 * @version V1.0   
 */
public class AddReferralEntryInput {
	// 主键id
	private String prodReferralEntryId;
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
	// 是否允许修理
	private String isRepair;
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
	// 仓库类型
	private String warehouseType;
	// 长度
	private Double length;
	// 宽度
	private Double width;
	// 数量
	private Double quantity;
	// 已领数量
	private Double alreadyQuantity;
	// 借件数量
	private Double borrowQuantity;
	// 出库状态
	private String alreadyState;
	// 工时
	private Double manHour;
	// 备注
	private String remarks;
	// 图片
	private String photo;
	// 是否必传图片
	private String isMustPhoto;
	// 仓库
	private String warehouse;
	// 公司
	private String company;
	// 备件价格
	private BigDecimal price;
	// 是否原件维修
	private String isOriginal;

	public String getIsMustPhoto() {
		return isMustPhoto;
	}

	public void setIsMustPhoto(String isMustPhoto) {
		this.isMustPhoto = isMustPhoto;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getProdReferralEntryId() {
		return prodReferralEntryId;
	}

	public void setProdReferralEntryId(String prodReferralEntryId) {
		this.prodReferralEntryId = prodReferralEntryId;
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

	public String getIsRepair() {
		return isRepair;
	}

	public void setIsRepair(String isRepair) {
		this.isRepair = isRepair;
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

	public Double getAlreadyQuantity() {
		return alreadyQuantity;
	}

	public void setAlreadyQuantity(Double alreadyQuantity) {
		this.alreadyQuantity = alreadyQuantity;
	}

	public Double getBorrowQuantity() {
		return borrowQuantity;
	}

	public void setBorrowQuantity(Double borrowQuantity) {
		this.borrowQuantity = borrowQuantity;
	}

	public String getAlreadyState() {
		return alreadyState;
	}

	public void setAlreadyState(String alreadyState) {
		this.alreadyState = alreadyState;
	}

	public Double getManHour() {
		return manHour;
	}

	public void setManHour(Double manHour) {
		this.manHour = manHour;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

}

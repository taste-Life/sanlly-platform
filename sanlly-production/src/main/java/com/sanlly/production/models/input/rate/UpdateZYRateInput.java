package com.sanlly.production.models.input.rate;

import java.math.BigDecimal;

/**
 * 编辑中远费率实体
 * 
 * @author wangxzh
 *
 */
public class UpdateZYRateInput {

	private String rateId;
	// 地点
	private String rateCompany;
	// 箱类别
	private String containerCategory;
	// 费率代码
	private String rateCode;
	// 中远部件代码
	private String cosPartsCode;
	// 中远修理代码
	private String cosRepairCode;
	// 算法
	private String calculationType;
	// 部件大类
	private String partsType;
	// 部件明细
	private String partsDetails;
	// 维修代码
	private String repair;
	// 材质代码
	private String material;
	// 尺寸
	private String size;
	// 箱型
	private String containerType;
	// 位置代码
	private String positionCode;
	// 长
	private Double length;
	// 宽
	private Double width;
	// 数量
	private Integer quantity;
	// 工时
	private Double manHour;
	// 材料费
	private BigDecimal materialCost;
	// 条目重复是否提示
	private String isRepeatPrompts;
	// 是否必传图片
	private String isMustPhoto;

	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public String getRateCompany() {
		return rateCompany;
	}

	public void setRateCompany(String rateCompany) {
		this.rateCompany = rateCompany;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getRateCode() {
		return rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public String getCosPartsCode() {
		return cosPartsCode;
	}

	public void setCosPartsCode(String cosPartsCode) {
		this.cosPartsCode = cosPartsCode;
	}

	public String getCosRepairCode() {
		return cosRepairCode;
	}

	public void setCosRepairCode(String cosRepairCode) {
		this.cosRepairCode = cosRepairCode;
	}

	public String getCalculationType() {
		return calculationType;
	}

	public void setCalculationType(String calculationType) {
		this.calculationType = calculationType;
	}

	public String getPartsType() {
		return partsType;
	}

	public void setPartsType(String partsType) {
		this.partsType = partsType;
	}

	public String getPartsDetails() {
		return partsDetails;
	}

	public void setPartsDetails(String partsDetails) {
		this.partsDetails = partsDetails;
	}

	public String getRepair() {
		return repair;
	}

	public void setRepair(String repair) {
		this.repair = repair;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getManHour() {
		return manHour;
	}

	public void setManHour(Double manHour) {
		this.manHour = manHour;
	}

	public BigDecimal getMaterialCost() {
		return materialCost;
	}

	public void setMaterialCost(BigDecimal materialCost) {
		this.materialCost = materialCost;
	}

	public String getIsRepeatPrompts() {
		return isRepeatPrompts;
	}

	public void setIsRepeatPrompts(String isRepeatPrompts) {
		this.isRepeatPrompts = isRepeatPrompts;
	}

	public String getIsMustPhoto() {
		return isMustPhoto;
	}

	public void setIsMustPhoto(String isMustPhoto) {
		this.isMustPhoto = isMustPhoto;
	}

}

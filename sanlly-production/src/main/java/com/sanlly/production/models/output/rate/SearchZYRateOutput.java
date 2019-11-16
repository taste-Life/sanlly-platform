package com.sanlly.production.models.output.rate;

import java.math.BigDecimal;

/**
 * 中远费率列表返回实体
 * 
 * @author wangxzh
 *
 */
public class SearchZYRateOutput {
	// 主键
	private String zyRateId;
	// 地点
	private String companyLang;
	// 箱类别
	private String containerCategoryLang;
	// 费率代码
	private String rateCode;
	// 部件大类
	private String partsType;
	// 部件明细
	private String partsDetails;
	// 维修代码
	private String repair;
	// 材质代码
	private String material;
	// 算法
	private String calculationTypeLang;
	// 长
	private Double length;
	// 宽
	private Double width;
	// 数量
	private Integer quantity;
	// 位置代码
	private String positionCode;
	// 尺寸
	private String sizeLang;
	// 箱型
	private String containerTypeLang;
	// 中远部件代码
	private String cosPartsCode;
	// 中远修理代码
	private String cosRepairCode;
	// 工时数
	private Double manHour;
	// 材料费
	private BigDecimal materialCost;

	public String getZyRateId() {
		return zyRateId;
	}

	public void setZyRateId(String zyRateId) {
		this.zyRateId = zyRateId;
	}

	public String getCompanyLang() {
		return companyLang;
	}

	public void setCompanyLang(String companyLang) {
		this.companyLang = companyLang;
	}

	public String getContainerCategoryLang() {
		return containerCategoryLang;
	}

	public void setContainerCategoryLang(String containerCategoryLang) {
		this.containerCategoryLang = containerCategoryLang;
	}

	public String getRateCode() {
		return rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
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

	public String getCalculationTypeLang() {
		return calculationTypeLang;
	}

	public void setCalculationTypeLang(String calculationTypeLang) {
		this.calculationTypeLang = calculationTypeLang;
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

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getSizeLang() {
		return sizeLang;
	}

	public void setSizeLang(String sizeLang) {
		this.sizeLang = sizeLang;
	}

	public String getContainerTypeLang() {
		return containerTypeLang;
	}

	public void setContainerTypeLang(String containerTypeLang) {
		this.containerTypeLang = containerTypeLang;
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

}

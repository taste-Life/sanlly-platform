package com.sanlly.production.models.output.rate;

import java.math.BigDecimal;

/**
 * 费率详情（穷举型）
 * 
 * @author wangxzh
 *
 */
public class SearchSanRateQJItemOutput {
	// 主键
	private String rateItemId;
	// 位置代码
	private String positionCode;
	// 箱型
	private String containerTypeLang;
	// 尺寸
	private String sizeLang;
	// 算法依据
	private String algorithmBasisLang;
	// 长
	private Double length;
	// 宽
	private Double width;
	// 数量
	private Double quantity;
	// 工时
	private Double manHour;
	// 材料费
	private BigDecimal materialCost;
	// 费率描述
	private String rateDescribe;

	public String getRateItemId() {
		return rateItemId;
	}

	public void setRateItemId(String rateItemId) {
		this.rateItemId = rateItemId;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getContainerTypeLang() {
		return containerTypeLang;
	}

	public void setContainerTypeLang(String containerTypeLang) {
		this.containerTypeLang = containerTypeLang;
	}

	public String getSizeLang() {
		return sizeLang;
	}

	public void setSizeLang(String sizeLang) {
		this.sizeLang = sizeLang;
	}

	public String getAlgorithmBasisLang() {
		return algorithmBasisLang;
	}

	public void setAlgorithmBasisLang(String algorithmBasisLang) {
		this.algorithmBasisLang = algorithmBasisLang;
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

	public BigDecimal getMaterialCost() {
		return materialCost;
	}

	public void setMaterialCost(BigDecimal materialCost) {
		this.materialCost = materialCost;
	}

	public String getRateDescribe() {
		return rateDescribe;
	}

	public void setRateDescribe(String rateDescribe) {
		this.rateDescribe = rateDescribe;
	}

}

package com.sanlly.production.models.output.rate;

import java.math.BigDecimal;

/**
 * 费率详情（穷举型）
 * 
 * @author wangxzh
 *
 */
public class RateQJItemOutput {
	// 主键
	private String rateItemId;
	// 费率主键
	private String rateId;
	// 位置代码
	private String positionCode;
	// 箱型
	private String containerType;
	// 尺寸
	private String size;
	// 算法依据
	private String algorithmBasis;
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
	// 字段显示状态
	private Boolean itemType;
	// 条目重复是否提示
	private String isRepeatPrompts;
	// 是否必传图片
	private String isMustPhoto;

	public String getRateItemId() {
		return rateItemId;
	}

	public void setRateItemId(String rateItemId) {
		this.rateItemId = rateItemId;
	}

	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getAlgorithmBasis() {
		return algorithmBasis;
	}

	public void setAlgorithmBasis(String algorithmBasis) {
		this.algorithmBasis = algorithmBasis;
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

	public Boolean getItemType() {
		return itemType;
	}

	public void setItemType(Boolean itemType) {
		this.itemType = itemType;
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

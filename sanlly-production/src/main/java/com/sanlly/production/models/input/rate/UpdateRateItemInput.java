package com.sanlly.production.models.input.rate;

import java.math.BigDecimal;

/**
 * 费率条目新增实体
 * 
 * @Package com.sanlly.production.models.input.rate 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月19日 下午2:18:06 
 * @version V1.0   
 */
public class UpdateRateItemInput {
	// id
	private String rateItemId;
	// 计算方式
	private String calculationType;
	// 算法类型
	private String algorithmType;
	// 算法依赖
	private String algorithmBasis;
	// 尺寸
	private String size;
	// 箱型
	private String containerType;
	// 位置代码
	private String positionCode;
	// 长度
	private Double length;
	// 宽度
	private Double width;
	// 数量
	private Double quantity;
	// 工时数
	private Double manHour;
	// 材料费
	private BigDecimal materialCost;
	// 费率描述
	private String rateDescribe;
	// 基数
	private Double cardinalNumber;
	// 起始数值
	private Double startValue;
	// 递增基数
	private Double addCardinalNumber;
	// 递增数值
	private Double addValue;
	// 最大基数
	private Double maxCardinalNumber;
	// 最大数值
	private Double maxValue;
	// 备注
	private String remark;
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

	public String getCalculationType() {
		return calculationType;
	}

	public void setCalculationType(String calculationType) {
		this.calculationType = calculationType;
	}

	public String getAlgorithmType() {
		return algorithmType;
	}

	public void setAlgorithmType(String algorithmType) {
		this.algorithmType = algorithmType;
	}

	public String getAlgorithmBasis() {
		return algorithmBasis;
	}

	public void setAlgorithmBasis(String algorithmBasis) {
		this.algorithmBasis = algorithmBasis;
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

	public Double getCardinalNumber() {
		return cardinalNumber;
	}

	public void setCardinalNumber(Double cardinalNumber) {
		this.cardinalNumber = cardinalNumber;
	}

	public Double getStartValue() {
		return startValue;
	}

	public void setStartValue(Double startValue) {
		this.startValue = startValue;
	}

	public Double getAddCardinalNumber() {
		return addCardinalNumber;
	}

	public void setAddCardinalNumber(Double addCardinalNumber) {
		this.addCardinalNumber = addCardinalNumber;
	}

	public Double getAddValue() {
		return addValue;
	}

	public void setAddValue(Double addValue) {
		this.addValue = addValue;
	}

	public Double getMaxCardinalNumber() {
		return maxCardinalNumber;
	}

	public void setMaxCardinalNumber(Double maxCardinalNumber) {
		this.maxCardinalNumber = maxCardinalNumber;
	}

	public Double getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Double maxValue) {
		this.maxValue = maxValue;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

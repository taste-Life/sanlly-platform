package com.sanlly.production.models.output.rate;

/**
 * SAN费率明细列表（公式型）
 * 
 * @author wangxzh
 *
 */
public class RateGSItemOutput {
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
	// 算法类型
	private String algorithmType;
	// 算法依据
	private String algorithmBasis;
	// 基数
	private Double cardinalNumber;
	// 起始数值
	private Double startValue;
	// 最大数值
	private Double maxValue;
	// 最大基数
	private Double maxCardinalNumber;
	// 递增数值
	private Double addValue;
	// 递增基数
	private Double addCardinalNumber;
	// 备注
	private String remark;
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

	public Double getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Double maxValue) {
		this.maxValue = maxValue;
	}

	public Double getMaxCardinalNumber() {
		return maxCardinalNumber;
	}

	public void setMaxCardinalNumber(Double maxCardinalNumber) {
		this.maxCardinalNumber = maxCardinalNumber;
	}

	public Double getAddValue() {
		return addValue;
	}

	public void setAddValue(Double addValue) {
		this.addValue = addValue;
	}

	public Double getAddCardinalNumber() {
		return addCardinalNumber;
	}

	public void setAddCardinalNumber(Double addCardinalNumber) {
		this.addCardinalNumber = addCardinalNumber;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

package com.sanlly.production.models.output.rate;

/**
 * SAN费率明细列表（公式型）
 * 
 * @author wangxzh
 *
 */
public class SearchSanRateGSItemOutput {
	// 主键
	private String rateItemId;
	// 位置代码
	private String positionCode;
	// 箱型
	private String containerTypeLang;
	// 尺寸
	private String sizeLang;
	// 算法类型
	private String algorithmTypeLang;
	// 算法依据
	private String algorithmBasisLang;
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

	public String getAlgorithmTypeLang() {
		return algorithmTypeLang;
	}

	public void setAlgorithmTypeLang(String algorithmTypeLang) {
		this.algorithmTypeLang = algorithmTypeLang;
	}

	public String getAlgorithmBasisLang() {
		return algorithmBasisLang;
	}

	public void setAlgorithmBasisLang(String algorithmBasisLang) {
		this.algorithmBasisLang = algorithmBasisLang;
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

}

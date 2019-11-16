package com.sanlly.production.models.output.rate;

/**
 * 派工工时字表列表返回实体
 * @author wangxzh
 *
 */
public class SearchSonManHourOutput {

	private Integer referralManhourDetailedId;

	private String positionCode;

	private String sizeLang;

	private String containerTypeLang;

	private String algorithmLang;

	private Double cardinalNumber;

	private Double startValue;

	private Double addCardinalNumber;

	private Double addVlaue;

	private Double maxCardinalNumber;

	private Double maxValue;

	private String remark;

	public Integer getReferralManhourDetailedId() {
		return referralManhourDetailedId;
	}

	public void setReferralManhourDetailedId(Integer referralManhourDetailedId) {
		this.referralManhourDetailedId = referralManhourDetailedId;
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

	public String getAlgorithmLang() {
		return algorithmLang;
	}

	public void setAlgorithmLang(String algorithmLang) {
		this.algorithmLang = algorithmLang;
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

	public Double getAddVlaue() {
		return addVlaue;
	}

	public void setAddVlaue(Double addVlaue) {
		this.addVlaue = addVlaue;
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

}

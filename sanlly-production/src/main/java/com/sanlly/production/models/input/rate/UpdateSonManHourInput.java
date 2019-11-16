package com.sanlly.production.models.input.rate;

/**
 * 编辑派工工时字表实体
 * @author wangxzh
 *
 */
public class UpdateSonManHourInput {

	private Integer manHourDetId;

	private String positionCode;

	private String size;

	private String containerType;

	private String algorithm;

	private Double cardinalNumber;

	private Double startValue;

	private Double addCardinalNumber;

	private Double addVlaue;

	private Double maxCardinalNumber;

	private Double maxValue;

	private String remark;

	public Integer getManHourDetId() {
		return manHourDetId;
	}

	public void setManHourDetId(Integer manHourDetId) {
		this.manHourDetId = manHourDetId;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
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

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
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

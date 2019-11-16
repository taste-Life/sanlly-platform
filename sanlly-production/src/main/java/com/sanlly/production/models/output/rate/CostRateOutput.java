package com.sanlly.production.models.output.rate;

/**
 * 成本费率编辑返回实体
 * @author wangxzh
 *
 */
public class CostRateOutput {

	private String costRateId;

	private String positionCode;

	private String size;

	private String containerType;

	private String sparesType;

	private String spares;

	private String useAlgorithm;

	private String useCoefficientOne;

	private String useCoefficientTwo;

	private Double useConstant;

	private String remark;

	public String getCostRateId() {
		return costRateId;
	}

	public void setCostRateId(String costRateId) {
		this.costRateId = costRateId;
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

	public String getSparesType() {
		return sparesType;
	}

	public void setSparesType(String sparesType) {
		this.sparesType = sparesType;
	}

	public String getSpares() {
		return spares;
	}

	public void setSpares(String spares) {
		this.spares = spares;
	}

	public String getUseAlgorithm() {
		return useAlgorithm;
	}

	public void setUseAlgorithm(String useAlgorithm) {
		this.useAlgorithm = useAlgorithm;
	}

	public String getUseCoefficientOne() {
		return useCoefficientOne;
	}

	public void setUseCoefficientOne(String useCoefficientOne) {
		this.useCoefficientOne = useCoefficientOne;
	}

	public String getUseCoefficientTwo() {
		return useCoefficientTwo;
	}

	public void setUseCoefficientTwo(String useCoefficientTwo) {
		this.useCoefficientTwo = useCoefficientTwo;
	}

	public Double getUseConstant() {
		return useConstant;
	}

	public void setUseConstant(Double useConstant) {
		this.useConstant = useConstant;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}

package com.sanlly.production.models.output.rate;

/**
 * 成本费率字表列表返回实体
 * 
 * @author wangxzh
 *
 */
public class SearchCostRateSonOutput {
	// 主键
	private String costRateId;
	// 位置代码
	private String positionCode;
	// 尺寸
	private String sizeLang;
	// 箱型
	private String containerTypeLang;
	// 备件类别
	private String sparesTypeLang;
	// 备件号
	private String spares;
	// 使用算法
	private String useAlgorithmLang;
	// 使用系数1
	private String useCoefficientOneLang;
	// 使用系数2
	private String useCoefficientTwoLang;
	// 使用常数
	private Double useConstant;
	// 备注
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

	public String getSparesTypeLang() {
		return sparesTypeLang;
	}

	public void setSparesTypeLang(String sparesTypeLang) {
		this.sparesTypeLang = sparesTypeLang;
	}

	public String getSpares() {
		return spares;
	}

	public void setSpares(String spares) {
		this.spares = spares;
	}

	public String getUseAlgorithmLang() {
		return useAlgorithmLang;
	}

	public void setUseAlgorithmLang(String useAlgorithmLang) {
		this.useAlgorithmLang = useAlgorithmLang;
	}

	public String getUseCoefficientOneLang() {
		return useCoefficientOneLang;
	}

	public void setUseCoefficientOneLang(String useCoefficientOneLang) {
		this.useCoefficientOneLang = useCoefficientOneLang;
	}

	public String getUseCoefficientTwoLang() {
		return useCoefficientTwoLang;
	}

	public void setUseCoefficientTwoLang(String useCoefficientTwoLang) {
		this.useCoefficientTwoLang = useCoefficientTwoLang;
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

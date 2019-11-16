package com.sanlly.production.models.output.rate;

/**
 * SAN费率列表返回
 * 
 * @author wangxzh
 *
 */
public class SearchSanRateOutput {
	// 费率id
	private String rateId;
	// 箱类别
	private String containerCategoryLang;
	// 部件大类
	private String partsType;
	// 部件明细
	private String partsDetails;
	// 维修代码
	private String repair;
	// 计算方式
	private String calculationTypeLang;
	// 计算方式key
	private String calculationTypeKey;

	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public String getContainerCategoryLang() {
		return containerCategoryLang;
	}

	public void setContainerCategoryLang(String containerCategoryLang) {
		this.containerCategoryLang = containerCategoryLang;
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

	public String getCalculationTypeLang() {
		return calculationTypeLang;
	}

	public void setCalculationTypeLang(String calculationTypeLang) {
		this.calculationTypeLang = calculationTypeLang;
	}

	public String getCalculationTypeKey() {
		return calculationTypeKey;
	}

	public void setCalculationTypeKey(String calculationTypeKey) {
		this.calculationTypeKey = calculationTypeKey;
	}

}

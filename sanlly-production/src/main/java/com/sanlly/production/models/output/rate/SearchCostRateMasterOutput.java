package com.sanlly.production.models.output.rate;

/**
 * 成本费率主表列表返回实体
 * 
 * @author wangxzh
 *
 */
public class SearchCostRateMasterOutput {

	private String rateId;

	private String containerCategoryLang;

	private String partsType;

	private String partsTypeNameLang;

	private String partsDetails;

	private String partsDetailsName;

	private String repair;

	private String materialCode;

	private String rateDescribe;

	private String remark;

	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public String getPartsType() {
		return partsType;
	}

	public void setPartsType(String partsType) {
		this.partsType = partsType;
	}

	public String getPartsTypeNameLang() {
		return partsTypeNameLang;
	}

	public void setPartsTypeNameLang(String partsTypeNameLang) {
		this.partsTypeNameLang = partsTypeNameLang;
	}

	public String getPartsDetails() {
		return partsDetails;
	}

	public void setPartsDetails(String partsDetails) {
		this.partsDetails = partsDetails;
	}

	public String getPartsDetailsName() {
		return partsDetailsName;
	}

	public void setPartsDetailsName(String partsDetailsName) {
		this.partsDetailsName = partsDetailsName;
	}

	public String getRepair() {
		return repair;
	}

	public void setRepair(String repair) {
		this.repair = repair;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getRateDescribe() {
		return rateDescribe;
	}

	public void setRateDescribe(String rateDescribe) {
		this.rateDescribe = rateDescribe;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getContainerCategoryLang() {
		return containerCategoryLang;
	}

	public void setContainerCategoryLang(String containerCategoryLang) {
		this.containerCategoryLang = containerCategoryLang;
	}

}

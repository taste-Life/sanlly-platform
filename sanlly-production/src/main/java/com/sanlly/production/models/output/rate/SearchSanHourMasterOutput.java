package com.sanlly.production.models.output.rate;

/**
 * 派工工时主表列表返回实体
 * @author wangxzh
 *
 */
public class SearchSanHourMasterOutput {

	private Integer referralManhourId;

	private String containerUserLang;

	private String partsType;

	private String partsDetails;

	private String partsDetailsNameLang;

	private String repair;

	private String materialCode;

	private String rateDescribe;

	private String remarks;

	public Integer getReferralManhourId() {
		return referralManhourId;
	}

	public void setReferralManhourId(Integer referralManhourId) {
		this.referralManhourId = referralManhourId;
	}

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
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

	public String getPartsDetailsNameLang() {
		return partsDetailsNameLang;
	}

	public void setPartsDetailsNameLang(String partsDetailsNameLang) {
		this.partsDetailsNameLang = partsDetailsNameLang;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRateDescribe() {
		return rateDescribe;
	}

	public void setRateDescribe(String rateDescribe) {
		this.rateDescribe = rateDescribe;
	}

}

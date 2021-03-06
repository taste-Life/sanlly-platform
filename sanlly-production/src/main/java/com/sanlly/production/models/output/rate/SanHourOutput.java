package com.sanlly.production.models.output.rate;

/**
 * 派工工时主表编辑返回实体
 * @author wangxzh
 *
 */
public class SanHourOutput {

	private Integer manHourId;

	private String containerCategory;

	private String containerUser;

	private String partsType;

	private String partsDetails;

	private String repair;

	private String materialCode;

	private String rateDescribe;

	private String remark;

	public Integer getManHourId() {
		return manHourId;
	}

	public void setManHourId(Integer manHourId) {
		this.manHourId = manHourId;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
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

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRateDescribe() {
		return rateDescribe;
	}

	public void setRateDescribe(String rateDescribe) {
		this.rateDescribe = rateDescribe;
	}

}

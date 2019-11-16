package com.sanlly.production.models.input.surrender;

public class SurrenderPlanDetailInput {
	// TODO id
	private Integer prodSurrenderPlanDetailId;

	// TODO 计划id
	private Integer prodSurrenderPlanId;

	// TODO 箱号
	private String containerNo;

	// TODO 尺寸key
	private String size;

	// TODO 箱型key
	private String containerType;

	// TODO 账单类型枚举
	private String billType;

	// TODO dpp
	private String dpp;

	// TODO 上次起租时间
	private String startTime;

	// TODO 备注
	private String remarks;

	public Integer getProdSurrenderPlanDetailId() {
		return prodSurrenderPlanDetailId;
	}

	public void setProdSurrenderPlanDetailId(Integer prodSurrenderPlanDetailId) {
		this.prodSurrenderPlanDetailId = prodSurrenderPlanDetailId;
	}

	public Integer getProdSurrenderPlanId() {
		return prodSurrenderPlanId;
	}

	public void setProdSurrenderPlanId(Integer prodSurrenderPlanId) {
		this.prodSurrenderPlanId = prodSurrenderPlanId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
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

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getDpp() {
		return dpp;
	}

	public void setDpp(String dpp) {
		this.dpp = dpp;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
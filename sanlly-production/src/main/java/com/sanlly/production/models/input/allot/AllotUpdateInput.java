package com.sanlly.production.models.input.allot;
/**
 * 坏箱调拨编辑输入类
 * @author zhangkai
 *
 */
public class AllotUpdateInput {
	
	/*
	 * 坏箱调拨id
	 */
	private Integer prodBadContainerAllocationId;
	/*
	 * 调出场站
	 */
	private String exitYard;
	/*
	 * 调入场站
	 */
	private String entryYard;
	/*
	 * 车队
	 */
	private String fleet;
	/*
	 * 车牌号
	 */
	private String plateNo;
	/*
	 * 费用
	 */
	private String cost;
	/*
	 * 调拨原因
	 */
	private String reason;

	public String getExitYard() {
		return exitYard;
	}

	public void setExitYard(String exitYard) {
		this.exitYard = exitYard;
	}

	public String getEntryYard() {
		return entryYard;
	}

	public void setEntryYard(String entryYard) {
		this.entryYard = entryYard;
	}

	public String getFleet() {
		return fleet;
	}

	public void setFleet(String fleet) {
		this.fleet = fleet;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getProdBadContainerAllocationId() {
		return prodBadContainerAllocationId;
	}

	public void setProdBadContainerAllocationId(Integer prodBadContainerAllocationId) {
		this.prodBadContainerAllocationId = prodBadContainerAllocationId;
	}
	
	
}

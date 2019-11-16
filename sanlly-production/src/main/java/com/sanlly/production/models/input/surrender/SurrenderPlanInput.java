package com.sanlly.production.models.input.surrender;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.surrender 
 * @Description: TODO 退租箱-退租计划
 * @author tianzhl   
 * @date 2019年10月21日 上午10:57:24 
 * @version V1.0   
 */
public class SurrenderPlanInput {

	// TODO id
	private Integer prodSurrenderPlanId;

	// TODO 计划号
	private String planNo;

	// TODO 箱东key
	private String containerOwner;

	// TODO 开始时间
	private String startTime;

	// TODO 结束时间
	private String endTime;

	// TODO 是否有效
	private String isValid;

	// TODO 备注
	private String remarks;

	public Integer getProdSurrenderPlanId() {
		return prodSurrenderPlanId;
	}

	public void setProdSurrenderPlanId(Integer prodSurrenderPlanId) {
		this.prodSurrenderPlanId = prodSurrenderPlanId;
	}

	public String getPlanNo() {
		return planNo;
	}

	public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}

	public String getContainerOwner() {
		return containerOwner;
	}

	public void setContainerOwner(String containerOwner) {
		this.containerOwner = containerOwner;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
package com.sanlly.purchase.models.input.dailydemand;


/**
 * 
*
 */
public class AuditDailyDemandInput {

	//主键
	private Integer purcMatterDemandId;
	// 审核状态
	private Integer auditStatus;
	// 驳回原因
	private String reasonsRejection;

	public Integer getPurcMatterDemandId() {
		return purcMatterDemandId;
	}

	public void setPurcMatterDemandId(Integer purcMatterDemandId) {
		this.purcMatterDemandId = purcMatterDemandId;
	}

	public Integer getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getReasonsRejection() {
		return reasonsRejection;
	}
	public void setReasonsRejection(String reasonsRejection) {
		this.reasonsRejection = reasonsRejection;
	}
	
	
}

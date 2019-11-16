package com.sanlly.warehouse.models.input.wareearlywarning;


/**
 * 
* Description: 采购需求确认
* @ClassName: AuditPurchaseRequisitionsInput
* @date 2019年7月25日
*
* @author jlx
 */
public class AuditPurchaseRequisitionsInput {

	// id
	private Integer warePurchaseRequisitionsId;
	// 审核状态
	private Integer auditStatus;
	// 驳回原因
	private String reasonsRejection;
	public Integer getWarePurchaseRequisitionsId() {
		return warePurchaseRequisitionsId;
	}
	public void setWarePurchaseRequisitionsId(Integer warePurchaseRequisitionsId) {
		this.warePurchaseRequisitionsId = warePurchaseRequisitionsId;
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

package com.sanlly.common.models.output.activiti;

import java.util.Date;

/**
 * 
* Description: 审核流程节点信息
* @ClassName: AuditTaskInfoOutput
* @date 2019年8月16日
*
* @author jlx
 */
public class AuditTaskInfoOutput {
	// 审核人
	private String auditUser;
	// 审核时间
	private Date auditDate;
	// 下一审核节点
	private String nextAudit;
	public String getAuditUser() {
		return auditUser;
	}
	public void setAuditUser(String auditUser) {
		this.auditUser = auditUser;
	}
	public Date getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}
	public String getNextAudit() {
		return nextAudit;
	}
	public void setNextAudit(String nextAudit) {
		this.nextAudit = nextAudit;
	}
	
	
}

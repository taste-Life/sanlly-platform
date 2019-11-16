package com.sanlly.production.models.input.app.unitTesting;

/**
 * 进场审核
 * @author RexSheng
 * 2019年8月17日 下午3:54:00
 */
public class UnitTestingApproveInput {

	/**
	 * 进场Id列表
	 */
	private String[] prodCourseIdList;
	
	/**
	 * 通过，驳回
	 */
	private String auditType;
	
	/**
	 * 驳回原因
	 */
	private String reason;

	public String[] getProdCourseIdList() {
		return prodCourseIdList;
	}

	public void setProdCourseIdList(String[] prodCourseIdList) {
		this.prodCourseIdList = prodCourseIdList;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	} 
	
	
}

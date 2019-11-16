package com.sanlly.production.models.input.containerTesting;

/**   
* @Package com.sanlly.production.models.input.containerTesting 
* @Description: TODO 提交审核实体
* @author tianzhl   
* @date 2019年8月15日 下午5:35:04 
* @version V1.0   
*/
public class AuditContainerInput{
	// TODO 进场id数字
	private String[] prodCourseIdList;

	// TODO 通过LEAuditStateEnum02，驳回LEAuditStateEnum03
	private String auditType;
		
	// TODO 驳回原因
	private String reason;

	public String[] getProdCourseIdList() {
		return prodCourseIdList;
	}

	public String getAuditType() {
		return auditType;
	}

	public String getReason() {
		return reason;
	}

	public void setProdCourseIdList(String[] prodCourseIdList) {
		this.prodCourseIdList = prodCourseIdList;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
}

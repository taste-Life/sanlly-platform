package com.sanlly.production.models.input.unitTesting;

public class AuditUnitInput{

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

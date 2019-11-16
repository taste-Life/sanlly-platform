package com.sanlly.production.models.input.evaluation;

public class ThirdPartPayEntryInput {

	// TODO 条目id
		private String courseEntryId;
		// TODO 修理代码
		private String repairCode;

		// TODO 实收
		private String thirdpartyMoney;
		// TODO 付费方
		private String payingParty;
		//备注
		private String remarks;
		
		public String getCourseEntryId() {
			return courseEntryId;
		}
		public void setCourseEntryId(String courseEntryId) {
			this.courseEntryId = courseEntryId;
		}
		public String getRepairCode() {
			return repairCode;
		}
		public void setRepairCode(String repairCode) {
			this.repairCode = repairCode;
		}
		public String getThirdpartyMoney() {
			return thirdpartyMoney;
		}
		public void setThirdpartyMoney(String thirdpartyMoney) {
			this.thirdpartyMoney = thirdpartyMoney;
		}
		public String getPayingParty() {
			return payingParty;
		}
		public void setPayingParty(String payingParty) {
			this.payingParty = payingParty;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		
		
}

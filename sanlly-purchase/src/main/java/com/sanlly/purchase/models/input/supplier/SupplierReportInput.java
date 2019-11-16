package com.sanlly.purchase.models.input.supplier;

import com.sanlly.common.models.input.PageInput;

import java.util.Date;

public class SupplierReportInput extends PageInput{
		//开始时间
		private Date startTime;
		//结束时间
		private Date endTime;
		//所属公司
		private String company;
		
		public SupplierReportInput(Integer pageIndex,Integer pageSize){
				super(pageIndex,pageSize);
		}
		public Date getStartTime() {
			return startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
		public Date getEndTime() {
			return endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		
		
}

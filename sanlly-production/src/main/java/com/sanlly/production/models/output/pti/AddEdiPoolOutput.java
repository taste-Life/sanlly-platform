package com.sanlly.production.models.output.pti;

import java.util.ArrayList;
import java.util.List;

public class AddEdiPoolOutput {

	private Integer successCount;
	
	private List<AddEdiPoolErrorOutput> error;
	
	public AddEdiPoolOutput() {
		this.setSuccessCount(new Integer(0));
		this.setError(new ArrayList<>());
	}

	public List<AddEdiPoolErrorOutput> getError() {
		return error;
	}

	public void setError(List<AddEdiPoolErrorOutput> error) {
		this.error = error;
	}

	public Integer getSuccessCount() {
		return successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public static class AddEdiPoolErrorOutput{
		private String containerNo;
		
		private String ediTypeLang;
		
		private String reason;
		
		public AddEdiPoolErrorOutput() {}
		public AddEdiPoolErrorOutput(String containerNo,String ediType) {
			this.containerNo=containerNo;
			this.ediTypeLang=ediType;
		}
		public AddEdiPoolErrorOutput(String containerNo,String ediType,String reason) {
			this.containerNo=containerNo;
			this.ediTypeLang=ediType;
			this.reason=reason;
		}
		public String getContainerNo() {
			return containerNo;
		}
		public void setContainerNo(String containerNo) {
			this.containerNo = containerNo;
		}
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		public String getEdiTypeLang() {
			return ediTypeLang;
		}
		public void setEdiTypeLang(String ediTypeLang) {
			this.ediTypeLang = ediTypeLang;
		}
		
		
	}
}

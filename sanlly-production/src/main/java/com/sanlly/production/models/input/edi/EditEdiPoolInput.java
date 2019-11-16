package com.sanlly.production.models.input.edi;

public class EditEdiPoolInput {

	private Integer poolId;
	
	private String cwFee;
	
	private String dppFee;
	
	private String clientCode;

	public Integer getPoolId() {
		return poolId;
	}

	public void setPoolId(Integer poolId) {
		this.poolId = poolId;
	}

	public String getCwFee() {
		return cwFee;
	}

	public void setCwFee(String cwFee) {
		this.cwFee = cwFee;
	}

	public String getDppFee() {
		return dppFee;
	}

	public void setDppFee(String dppFee) {
		this.dppFee = dppFee;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}
	
	
}

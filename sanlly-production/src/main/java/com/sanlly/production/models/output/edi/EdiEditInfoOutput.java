package com.sanlly.production.models.output.edi;

public class EdiEditInfoOutput {
	private Integer poolId;
	
	private String containerNo;
	
	private String cwFee;
	
	private String dppFee;
	
	private String clientCode;

	public Integer getPoolId() {
		return poolId;
	}

	public void setPoolId(Integer poolId) {
		this.poolId = poolId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
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

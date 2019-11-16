package com.sanlly.common.models.input.user;

public class LoginInput {

	private String loginName;
	
	private String loginPassword;
	
	private Integer companyId;
	
	private Integer yardId;
	
	private Integer systemType;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getYardId() {
		return yardId;
	}

	public void setYardId(Integer yardId) {
		this.yardId = yardId;
	}

	public Integer getSystemType() {
		return systemType;
	}

	public void setSystemType(Integer systemType) {
		this.systemType = systemType;
	}
	
	
}

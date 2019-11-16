package com.sanlly.common.models.input.user;

import com.sanlly.common.enums.SystemTypeEnum;

public class AddUserInput {
	
	private Integer userSex;
	
	private String userName;
	
	private String loginAccount;
	
	private String loginPassword;
	
	private String email;
	
	private String mobile;
	
	/**
	 * 供应商无值
	 */
	private Integer companyId;
	
	private SystemTypeEnum systemType;

	public Integer getUserSex() {
		return userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public SystemTypeEnum getSystemType() {
		return systemType;
	}

	public void setSystemType(SystemTypeEnum systemType) {
		this.systemType = systemType;
	}
	
	
}

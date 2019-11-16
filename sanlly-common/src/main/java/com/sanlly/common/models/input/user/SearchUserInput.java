package com.sanlly.common.models.input.user;

import com.sanlly.common.models.input.PageInput;

public class SearchUserInput extends PageInput{
	
	public SearchUserInput(){
		 
	}
	
	public SearchUserInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}
	
	

	private Integer company;
	
	private String userName;
	
	//0管理系统、1供应商
	private Integer systemType;
	
	private String companyKey;
	private Integer roleId;

	public Integer getCompany() {
		return company;
	}

	public void setCompany(Integer company) {
		this.company = company;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getSystemType() {
		return systemType;
	}

	public void setSystemType(Integer systemType) {
		this.systemType = systemType;
	}

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	
}

package com.sanlly.common.models.input.role;

import com.sanlly.common.models.input.PageInput;

public class SearchRoleInput extends PageInput{

	private String roleName;
	
	private Integer roleType;
	
	public SearchRoleInput(){
		 
	}
	
	public SearchRoleInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}
	
	
}

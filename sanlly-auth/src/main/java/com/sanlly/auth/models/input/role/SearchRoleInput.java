package com.sanlly.auth.models.input.role;

import com.sanlly.common.models.input.PageInput;

/**
 * 角色列表搜索
 * @author RexSheng
 * 2019年8月16日 上午9:40:44
 */
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

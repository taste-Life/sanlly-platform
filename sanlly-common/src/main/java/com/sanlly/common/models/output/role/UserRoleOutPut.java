package com.sanlly.common.models.output.role;

import com.sanlly.common.models.output.user.UserInfoOutput;

public class UserRoleOutPut {

	private RoleOutPut role;
	
	private UserInfoOutput user;

	public RoleOutPut getRole() {
		return role;
	}

	public void setRole(RoleOutPut role) {
		this.role = role;
	}

	public UserInfoOutput getUser() {
		return user;
	}

	public void setUser(UserInfoOutput user) {
		this.user = user;
	}
	
	
	
}

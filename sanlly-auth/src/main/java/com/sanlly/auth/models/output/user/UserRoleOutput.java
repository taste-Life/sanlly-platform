package com.sanlly.auth.models.output.user;

import java.util.List;

import com.sanlly.auth.models.output.role.RoleDetailOutput;

/**
 * 用户角色输出类
 * @author RexSheng
 * 2019年8月16日 上午9:47:33
 */
public class UserRoleOutput {

	/**
	 * 用户id
	 */
	private Integer userId;
	
	/**
	 * 角色列表
	 */
	private List<RoleDetailOutput> roleList;
	
	/**
	 * 角色id
	 */
	private Integer[] roleIds;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<RoleDetailOutput> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<RoleDetailOutput> roleList) {
		this.roleList = roleList;
	}

	public Integer[] getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(Integer[] roleIds) {
		this.roleIds = roleIds;
	}
	
}

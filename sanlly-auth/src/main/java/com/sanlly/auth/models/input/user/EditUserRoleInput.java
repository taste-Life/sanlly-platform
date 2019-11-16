package com.sanlly.auth.models.input.user;

/**
 * 修改用户角色输入类
 * @author RexSheng
 * 2019年8月16日 上午9:40:59
 */
public class EditUserRoleInput {
	/**
	 * 角色id集合
	 */
	private Integer[] roleIds;
	/**
	 * 场站角色id集合
	 */
	private Integer[] yardRoleIds;
	public Integer[] getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(Integer[] roleIds) {
		this.roleIds = roleIds;
	}
	public Integer[] getYardRoleIds() {
		return yardRoleIds;
	}
	public void setYardRoleIds(Integer[] yardRoleIds) {
		this.yardRoleIds = yardRoleIds;
	}
	
	
}

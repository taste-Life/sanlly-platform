package com.sanlly.auth.models.output.role;

import java.util.List;

import com.sanlly.common.models.output.menu.MenuDetailOutput;

/**
 * 角色权限输出
 * @author RexSheng
 * 2019年8月16日 上午9:44:01
 */
public class RoleAuthOutput {
	/**
	 * 角色id
	 */
	private Integer roleId;
	
	/**
	 * 包含菜单
	 */
	private List<MenuDetailOutput> menuList;
	
	/**
	 * 包含权限id
	 */
	private Integer[] authIds;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public List<MenuDetailOutput> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<MenuDetailOutput> menuList) {
		this.menuList = menuList;
	}
	public Integer[] getAuthIds() {
		return authIds;
	}
	public void setAuthIds(Integer[] authIds) {
		this.authIds = authIds;
	}
	
}

package com.sanlly.auth.service;

import com.sanlly.auth.models.input.role.AddRoleInput;
import com.sanlly.auth.models.input.role.EditRoleInput;
import com.sanlly.auth.models.input.role.SearchRoleInput;
import com.sanlly.auth.models.output.role.RoleAuthOutput;
import com.sanlly.auth.models.output.role.RoleDetailOutput;
import com.sanlly.auth.models.output.role.RoleYardOutput;
import com.sanlly.common.models.output.pagination.PagedList;

/**
 * 角色接口
 * @author 生旭鹏
 *
 */
public interface RoleService {

	/**
	 * 角色分页列表
	 * @param input
	 * @return
	 */
	PagedList<RoleDetailOutput> getRolePagedList(SearchRoleInput input);
	
	/**
	 * 新增角色
	 * @param input
	 */
	void addRole(AddRoleInput input);
	
	/**
	 * 获取角色信息
	 * @param input
	 * @return
	 */
	RoleDetailOutput getRole(EditRoleInput input);
	
	/**
	 * 修改角色
	 * @param input
	 */
	void updateRole(EditRoleInput input);
	
	/**
	 * 批量删除角色
	 * @param roleIds
	 */
	void deleteRole(Integer[] roleIds);
	
	/**
	 * 修改角色的功能权限
	 * @param roleId
	 * @param authIds
	 */
	void updateAuth(Integer roleId,Integer[] authIds);
	
	/**
	 * 修改角色的场站权限
	 * @param roleId
	 * @param yardIds
	 */
	void updateYardAuth(Integer roleId,Integer[] yardIds);
	
	/**
	 * 根据角色获取功能权限
	 * @param roleId
	 * @return
	 */
	RoleAuthOutput getAuthByRole(Integer roleId);
	
	/**
	 * 根据角色获取场站权限
	 * @param roleId
	 * @return
	 */
	RoleYardOutput getYardAuthByRole(Integer roleId);
}

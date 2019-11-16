package com.sanlly.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.auth.models.input.role.AddRoleInput;
import com.sanlly.auth.models.input.role.EditRoleInput;
import com.sanlly.auth.models.input.role.SearchRoleInput;
import com.sanlly.auth.service.RoleService;
import com.sanlly.common.models.output.Result;

/**
 * 角色控制器
 * @author 生旭鹏
 *
 */
@RestController
public class RoleController {

	/**
	 * 角色接口
	 */
	@Autowired
	private RoleService roleService;
	
	/**
	 * 角色列表查询
	 * @param roleName 要搜索的角色名称
	 * @param index 页码
	 * @param size 分页大小
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/roles")
	public Result rolePagedList(@RequestParam(required=false) String roleName,@RequestParam(required=false)  Integer roleType,@RequestParam Integer index,@RequestParam Integer size){
		SearchRoleInput input=new SearchRoleInput(index,size);
		input.setRoleName(roleName);
		input.setRoleType(roleType);
		return Result.Success(roleService.getRolePagedList(input));
	}
	
	/**
	 * 根据id获取角色信息
	 * @param roleId 角色id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/roles/{roleId}")
	public Result getRole(@PathVariable(value="roleId") Integer roleId){
		EditRoleInput input=new EditRoleInput();
		input.setRoleId(roleId);
		return Result.Success(roleService.getRole(input));
	}
	
	/**
	 * 新增角色
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/roles")
	public Result addRole(@RequestBody AddRoleInput input){
		roleService.addRole(input);
		return Result.Success();
	}
	
	/**
	 * 修改角色
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/roles")
	public Result editRole(@RequestBody EditRoleInput input){
		roleService.updateRole(input);
		return Result.Success();
	}
	
	/**
	 * 根据角色id删除角色
	 * @param roleIds 角色id数组
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/roles")
	public Result deleteRole(@RequestParam Integer[] roleIds){
		roleService.deleteRole(roleIds);
		return Result.Success();
	}
	
	/**
	 * 根据角色id获取功能权限信息
	 * @param roleId 角色id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/roles/auth/{roleId}")
	public Result getRoleAuth(@PathVariable(value="roleId") Integer roleId){
		return Result.Success(roleService.getAuthByRole(roleId));
	}
	
	/**
	 * 根据角色id获取场站功能权限信息
	 * @param roleId 角色id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/roles/yard/{roleId}")
	public Result getRoleYard(@PathVariable(value="roleId") Integer roleId){
		return Result.Success(roleService.getYardAuthByRole(roleId));
	}
	
	/**
	 * 修改角色权限信息
	 * @param roleId 角色id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/roles/auth")
	public Result updateRoleAuth(Integer roleId,Integer[] authIds){
		roleService.updateAuth(roleId, authIds);
		return Result.Success();
	}
	
	/**
	 * 修改角色场站信息
	 * @param roleId 角色id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/roles/yard")
	public Result updateRoleYard(Integer roleId,Integer[] yardIds){
		roleService.updateYardAuth(roleId, yardIds);
		return Result.Success();
	}
	
}

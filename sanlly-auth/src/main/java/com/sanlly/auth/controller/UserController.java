package com.sanlly.auth.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.auth.models.input.user.EditUserRoleInput;
import com.sanlly.auth.models.input.user.SearchUserInput;
import com.sanlly.auth.models.input.user.ValidateUserInput;
import com.sanlly.auth.service.UserService;
import com.sanlly.common.models.input.user.AddUserInput;
import com.sanlly.common.models.input.user.ChangePasswordInput;
import com.sanlly.common.models.input.user.EditUserInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.user.UserInfoOutput;

/**
 * 用户控制器
 * @author 生旭鹏
 *
 */
@RestController
public class UserController {

	/**
	 * 用户接口
	 */
	@Autowired
	private UserService userService;
	
	/**
	 * 列表查询
	 * @param roleName 要搜索的用户名称
	 * @param index 页码
	 * @param size 分页大小
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/users")
	public Result userPagedList(@RequestParam(required=false) String userName,@RequestParam(required=false)  Integer companyId,@RequestParam Integer index,@RequestParam Integer size){
		SearchUserInput input=new SearchUserInput(index,size);
		input.setCompany(companyId);
		input.setUserName(userName);
		return Result.Success(userService.getUserPagedList(input));
	}
	
	/**
	 * 用户登陆账号校验
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/users/account/validate")
	public Result validateAccount(@RequestBody ValidateUserInput input){
		return Result.Success(userService.validateAccount(input));
	}
	
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/users/{userId}")
	public Result userDetail(@PathVariable("userId") Integer userId){
		return Result.Success(userService.getUser(userId));
	}
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/userses")
	public Result userDetails(@RequestParam(value = "userIds", required = true) Integer[] userIds){
		List<UserInfoOutput> users = new ArrayList<>();
		for(Integer userId:userIds) {
			users.add(userService.getUser(userId));
		}
		return Result.Success(users);
	}
	
	/**
	 * 修改用户
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/users")
	public Result updateUser(@RequestBody EditUserInput input){
		userService.editUser(input);
		return Result.Success();
	}
	
	/**
	 * 新增用户
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/users")
	public Result addUser(@RequestBody AddUserInput input){
		Integer userId=userService.addUser(input);
		return Result.Success(userId);
	}
	
	/**
	 * 根据id删除用户
	 * @param roleIds 用户id数组
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/users")
	public Result deleteUser(@RequestParam Integer[] userIds){
		userService.deleteUser(userIds);
		return Result.Success();
	}
	
	/**
	 * 获取用户角色
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/users/{userId}/roles")
	public Result userRoleList(@PathVariable("userId") Integer userId){
		return Result.Success(userService.getUserRole(userId));
	}
	
	/**
	 * 修改用户角色
	 * @param userId
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/users/{userId}/roles")
	public Result userRoleList(@PathVariable("userId") Integer userId,@RequestBody EditUserRoleInput input){
		userService.updateRole(userId, input.getRoleIds(), input.getYardRoleIds());
		return Result.Success();
	}
	
	/**
	 * 根据用户名获取公司列表
	 * @param userId
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/companys/user")
	public Result companyList(@RequestParam(value="userName") String loginName){
		return Result.Success(userService.getCompanyList(loginName));
	}
	
	@SuppressWarnings("rawtypes")
	@PutMapping("/pwd")
	public Result changePassword(@RequestBody ChangePasswordInput input) {
		userService.changePassword(input);
		return Result.Success();
	}
}

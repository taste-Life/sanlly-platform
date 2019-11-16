package com.sanlly.auth.service;

import java.util.List;

import com.sanlly.auth.models.input.user.SearchUserInput;
import com.sanlly.auth.models.input.user.ValidateUserInput;
import com.sanlly.auth.models.output.user.UserRoleOutput;
import com.sanlly.common.models.input.user.AddUserInput;
import com.sanlly.common.models.input.user.ChangePasswordInput;
import com.sanlly.common.models.input.user.EditUserInput;
import com.sanlly.common.models.input.user.LoginInput;
import com.sanlly.common.models.output.company.CompanyDetailOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;

/**
 * 用户接口
 * @author 生旭鹏
 *
 */
public interface UserService {

	/**
	 * 用户分页列表
	 * @param input
	 * @return
	 */
	PagedList<UserInfoOutput> getUserPagedList(SearchUserInput input);

	/**
	 * 新增用户
	 * @param input
	 */
	Integer addUser(AddUserInput input);

	/**
	 * 校验用户账号是否重复
	 * @param account
	 * @param userId
	 * @return
	 */
	Boolean validateAccount(ValidateUserInput input);
	
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	UserInfoOutput getUser(Integer userId);
	
	/**
	 * 修改用户信息
	 * @param input
	 */
	void editUser(EditUserInput input);
	
	/**
	 * 删除用户
	 * @param userIds
	 */
	void deleteUser(Integer[] userIds);
	
	/**
	 * 获取用户角色信息
	 * @param userId
	 * @return
	 */
	UserRoleOutput getUserRole(Integer userId);
	
	/**
	 * 修改用户角色
	 * @param userId
	 * @param roleIds 功能角色
	 * @param yardRoleIds 数据角色
	 */
	void updateRole(Integer userId,Integer[] roleIds,Integer[] yardRoleIds);
	
	/**
	 * 用户登陆
	 * @param input
	 * @return
	 */
	UserInfoOutput login(LoginInput input);

	/**
	 * 根据登录名获取公司列表
	 * @param loginName
	 * @return
	 */
	List<CompanyDetailOutput> getCompanyList(String loginName);
	
	/**
	 * 用户修改密码
	 * @param userId
	 * @param oldPassword
	 * @param newPassword
	 */
	void changePassword(ChangePasswordInput input);
}

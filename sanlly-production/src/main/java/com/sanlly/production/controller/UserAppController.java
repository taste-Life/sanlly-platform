package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.app.user.ChangePwdInput;
import com.sanlly.production.models.input.app.user.UserEditInput;
import com.sanlly.production.service.app.UserAppService;

@RestController	
public class UserAppController {

	@Autowired
	private UserAppService service;
	
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/users/{userId}")
	public Result getUser(@PathVariable(value = "userId") Integer userId) {
	
		return Result.Success(service.getUser(userId));
	}
	
	/**
	 * 用户修改密码
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/changePwd")
	public Result changePassword(ChangePwdInput input) {
		Result rlt=service.changePassword(input);
		if(rlt!=null) {
			return rlt;
		}
		else {
			return Result.Error(null);
		}
	}
	
	/**
	 * 修改用户信息
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/updateUsers")
	public Result updateUsers(UserEditInput input) {
		service.updateUser(input);
		return Result.Success();
	}
	
	/**
	 * 版本更新
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/versions")
	public Result versions() {
		return Result.Success(service.getLatestVersion());
	}
	
}

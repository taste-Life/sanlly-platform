package com.sanlly.purchase.service;

import com.sanlly.common.models.input.user.AddUserInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.purchase.config.FeignClientConfig;
import com.sanlly.purchase.models.input.ValidateUserInput;
import com.sanlly.purchase.service.fallback.AuthFeignFallback;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;



@FeignClient(name = "auth",configuration=FeignClientConfig.class,fallback=AuthFeignFallback.class)
public interface AuthFigenClient {
	/**
	 * 供应商注册添加用户
	 * @Description:   
	 * @param param
	 * @return
	 */
	@PostMapping("/users")
	Result userAdd(@RequestBody AddUserInput input);
	
	/**
	 * 用户登陆账号校验
	 * @param input
	 * @return
	 */
	@PutMapping("/users/account/validate")
	public Result<Boolean> validateAccount(@RequestBody ValidateUserInput input);

	/**
	 * 根据id取得用户信息
	 * @param userId
	 * @return
	 */
	@GetMapping("/users/{userId}")
	Result<UserInfoOutput> userDetail(@PathVariable("userId") Integer userId);
	/**
	 * 根据id取得用户信息
	 * @param userIds
	 * @return
	 */
	@GetMapping("/userses")
	Result<List<UserInfoOutput>> userDetails(@RequestParam(value = "userIds", required = true) Integer[] userIds);
}

package com.sanlly.production.service;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sanlly.common.models.input.user.ChangePasswordInput;
import com.sanlly.common.models.input.user.EditUserInput;
import com.sanlly.common.models.input.user.LoginInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.company.CompanyDetailOutput;
import com.sanlly.common.models.output.user.LoginOutput;
import com.sanlly.common.models.output.user.SessionOutput;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.production.config.FeignClientConfig;
import com.sanlly.production.service.fallback.AuthFallback;


@FeignClient(name = "auth",configuration=FeignClientConfig.class,fallback = AuthFallback.class)
public interface AuthService {
	@GetMapping("/test/get")
    Result<String> getRolePermission(@RequestParam("name") String name);
	
	@GetMapping("/user/current")
	Result<SessionOutput> getCurrentUser();
	
	@GetMapping("/companys/user")
	Result<List<CompanyDetailOutput>> getCompanyList(@RequestParam("userName") String userName);
	
	@PostMapping("/login")
	Result<LoginOutput> login(@RequestBody LoginInput input);
	
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	@GetMapping("/users/{userId}")
	Result<UserInfoOutput> getUserDetail(@PathVariable("userId") Integer userId);
	
	@SuppressWarnings("rawtypes")
	@PostMapping("/logout")
	Result logout();
	
	@SuppressWarnings("rawtypes")
	@PutMapping("/pwd")
	Result changePwd(@RequestBody ChangePasswordInput input);
	
	@SuppressWarnings("rawtypes")
	@PutMapping("/users")
	Result updateUser(@RequestBody EditUserInput input);
}

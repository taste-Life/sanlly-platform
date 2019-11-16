package com.sanlly.finance.service.feign;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sanlly.common.models.input.user.SearchUserInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.finance.service.fallback.AuthFallback;

/**
 * 权限 fegin调用
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月16日  
 *
 */
@FeignClient(name = "auth",fallback=AuthFallback.class)
public interface AuthFeignClient {
	
	/**
	 * 根据用户ID 获取用户信息
	 * @Description:（方法功能描述） 
	 * @param userId
	 * @return（展示方法参数和返回值）
	 */
	@GetMapping("/users/{userId}")
	Result<UserInfoOutput> getUserDetail(@PathVariable("userId") Integer userId);
	
	/**
	 * 用户集合查询
	 * 
	 * @Description:
	 * @param userName
	 * @param companyId
	 * @return
	 */
	@PostMapping("/userexternal/users")
	List<UserInfoOutput> userList(@RequestBody SearchUserInput input);
}

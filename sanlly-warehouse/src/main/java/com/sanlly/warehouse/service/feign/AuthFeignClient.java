package com.sanlly.warehouse.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.warehouse.config.FeignClientConfig;
import com.sanlly.warehouse.service.fallback.AuthFallback;

/**
 * 请求权限服务客户端
 * 
 * @author lishzh
 *
 */
@FeignClient(name = "auth", configuration = FeignClientConfig.class, fallback = AuthFallback.class)
public interface AuthFeignClient {

	/**
	 * 根据用户id获取用户信息
	 * 
	 * @param userId
	 * @return
	 */
	@GetMapping("/users/{userId}")
	Result<UserInfoOutput> getUserInfo(@PathVariable("userId") Integer userId);
	
	/**
	 * 列表查询
	 * @param userName 要搜索的用户名称
	 * @param companyId 公司Id
	 * @param index 页码
	 * @param size 分页大小
	 * @return
	 */
	@GetMapping("/users")
	Result<PagedList<UserInfoOutput>> userPagedList(@RequestParam(value="userName",required=false) String userName,@RequestParam(value="companyId",required=false) Integer companyId,@RequestParam("index") Integer index,@RequestParam("size") Integer size);

	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	@GetMapping("/users/{userId}")
	public Result<UserInfoOutput> userDetail(@PathVariable("userId") Integer userId);
	
}

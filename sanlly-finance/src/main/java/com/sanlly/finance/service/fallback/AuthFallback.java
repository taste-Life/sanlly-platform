package com.sanlly.finance.service.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sanlly.common.models.input.user.SearchUserInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.finance.service.feign.AuthFeignClient;

/**
 * 熔断实现
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author fjy
 * @date 2019年7月26日
 *
 */
@Component
public class AuthFallback implements AuthFeignClient {

	@Override
	public Result<UserInfoOutput> getUserDetail(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfoOutput> userList(SearchUserInput input) {
		// TODO Auto-generated method stub
		return null;
	}
 

 

}

package com.sanlly.warehouse.service.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sanlly.common.models.input.user.SearchUserInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.company.CompanyDetailOutput;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.warehouse.service.feign.AuthFeignClient;

/**
 * 请求权限服务失败回调
 * 
 * @author lishzh
 *
 */
@Component
public class AuthFallback implements AuthFeignClient {

	@Override
	public Result<UserInfoOutput> getUserInfo(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result userPagedList(String userName, Integer companyId, Integer index, Integer size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result userDetail(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}

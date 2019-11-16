package com.sanlly.purchase.service.fallback;

import com.sanlly.common.models.input.user.AddUserInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.purchase.models.input.ValidateUserInput;
import com.sanlly.purchase.service.AuthFigenClient;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AuthFeignFallback implements AuthFigenClient{

	@Override
	public Result userAdd(AddUserInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result validateAccount(ValidateUserInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result userDetail(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<UserInfoOutput>> userDetails(Integer[] userIds) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

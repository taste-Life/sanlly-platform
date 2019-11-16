package com.sanlly.production.service.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sanlly.common.models.input.user.ChangePasswordInput;
import com.sanlly.common.models.input.user.EditUserInput;
import com.sanlly.common.models.input.user.LoginInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.company.CompanyDetailOutput;
import com.sanlly.common.models.output.user.LoginOutput;
import com.sanlly.common.models.output.user.SessionOutput;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.production.service.AuthService;

@Component
public class AuthFallback implements AuthService{

	@Override
	public Result<String> getRolePermission(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<SessionOutput> getCurrentUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<CompanyDetailOutput>> getCompanyList(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<LoginOutput> login(LoginInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<UserInfoOutput> getUserDetail(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Result logout() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Result changePwd(ChangePasswordInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Result updateUser(EditUserInput input) {
		// TODO Auto-generated method stub
		return null;
	}


}

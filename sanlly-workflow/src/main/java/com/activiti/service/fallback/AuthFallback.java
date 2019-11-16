package com.activiti.service.fallback;

import java.util.List;

import org.springframework.stereotype.Component;
import com.activiti.service.feign.AuthFeignClient;
import com.sanlly.common.models.input.role.SearchRoleInput;
import com.sanlly.common.models.input.user.SearchUserInput;
import com.sanlly.common.models.output.role.RoleOutPut;
import com.sanlly.common.models.output.role.UserRoleOutPut;
import com.sanlly.common.models.output.user.UserInfoOutput;

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
	public List<UserInfoOutput> userList(SearchUserInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleOutPut> getRoleList(SearchRoleInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserRoleOutPut> getUserRoleList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfoOutput> getCompanyUserList(SearchUserInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfoOutput> getCompanyParentUserList(SearchUserInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfoOutput> getPurchaseAdminAuditCompanyUserList(SearchUserInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfoOutput> getPurchaseLeaderAuditCompanyUserList(SearchUserInput input) {
		// TODO Auto-generated method stub
		return null;
	}

 

}

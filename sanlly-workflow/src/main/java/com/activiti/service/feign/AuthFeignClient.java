package com.activiti.service.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.activiti.config.FeignClientConfig;
import com.activiti.service.fallback.AuthFallback;
import com.sanlly.common.models.input.role.SearchRoleInput;
import com.sanlly.common.models.input.user.SearchUserInput;
import com.sanlly.common.models.output.role.RoleOutPut;
import com.sanlly.common.models.output.role.UserRoleOutPut;
import com.sanlly.common.models.output.user.UserInfoOutput;

/**
 * 用户权限 Feign 客户端调用类
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月16日  
 *
 */
@FeignClient(name = "auth",configuration=FeignClientConfig.class,fallback=AuthFallback.class)
public interface AuthFeignClient {
	
	/**
	 * 查询业务的用户集合查询
	 * 
	 * @Description:
	 * @param userName
	 * @param companyId
	 * @return
	 */
	@PostMapping("/userexternal/users")
	List<UserInfoOutput> userList(@RequestBody SearchUserInput input);
	
	/**
	 * 查询业务的角色用户集合查询
	 * 
	 * @Description:
	 * @param userName
	 * @param companyId
	 * @return
	 */
	@PostMapping("/userexternal/role")
	List<RoleOutPut> getRoleList(@RequestBody SearchRoleInput input);
	
	/**
	 * 查询业务的用户角色集合查询
	 * 
	 * @Description:
	 * @param userName
	 * @param companyId
	 * @return
	 */
	@PostMapping("/userexternal/userRole")
	List<UserRoleOutPut> getUserRoleList();

	
	/**
	 * 用户集合  查询分公司下有审核权限的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	@PostMapping("/userexternal/getCompanyUserList")
	List<UserInfoOutput> getCompanyUserList(@RequestBody SearchUserInput input);
	
	/**
	 * 用户集合  查询总公司下有审核权限的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	@PostMapping("/userexternal/getCompanyParentUserList")
	List<UserInfoOutput> getCompanyParentUserList(@RequestBody SearchUserInput input);
	
	/**
	 * 用户集合  查询角色为采购管理员的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	@PostMapping("/userexternal/getAdminAuditCompanyUserList")
	List<UserInfoOutput> getPurchaseAdminAuditCompanyUserList(@RequestBody SearchUserInput input);
	
	

	/**
	 * 用户集合  查询角色为采购领导的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	@PostMapping("/userexternal/getLeaderAuditCompanyUserList")
	List<UserInfoOutput> getPurchaseLeaderAuditCompanyUserList(@RequestBody SearchUserInput input);
	
	
	//角色
	
	//用户角色关系集合
	
	//公司  用户 角色  部门 
	
	
}

package com.sanlly.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.auth.service.UserExternalService;
import com.sanlly.common.enums.SystemTypeEnum;
import com.sanlly.common.models.input.role.SearchRoleInput;
import com.sanlly.common.models.input.user.SearchUserInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.role.RoleOutPut;
import com.sanlly.common.models.output.role.UserRoleOutPut;
import com.sanlly.common.models.output.user.UserInfoOutput;

/**
 * 共用的用户下拉集合操作
 * 
 * @Description:
 * @author fjy
 * @date 2019年7月26日
 *
 */
@RestController
@RequestMapping(value = "/userexternal")
public class UserExternalController {

	/**
	 * 用户接口
	 */
	@Autowired
	private UserExternalService userExternalService;

	/**
	 * 用户集合查询
	 * 
	 * @Description:
	 * @param userName
	 * @param companyId
	 * @return
	 */
	@PostMapping("/users")
	public List<UserInfoOutput> userList(@RequestBody SearchUserInput input) {
		return userExternalService.getUserList(input);
	}
	
	/**
	 * 角色用户集合查询
	 * 
	 * @Description:
	 * @param userName
	 * @param companyId
	 * @return
	 */
	@PostMapping("/role")
	public List<RoleOutPut> getRoleList(@RequestBody SearchRoleInput input) {
		return userExternalService.getRoleList(input);
	}
	
	/**
	 * 用户角色集合查询
	 * 
	 * @Description:
	 * @param userName
	 * @param companyId
	 * @return
	 */
	@PostMapping("/userRole")
	public List<UserRoleOutPut> getUserRoleList() {
		return userExternalService.getUserRoleList();
	}
	
	/**
	 * 用户集合  查询分公司下有审核权限的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	@PostMapping("/getCompanyUserList")
	public List<UserInfoOutput> getCompanyUserList(@RequestBody SearchUserInput input) {
		return userExternalService.getAdminAuditUserList(input);
	}
	
	/**
	 * 用户集合  查询总公司下有审核权限的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	@PostMapping("/getCompanyParentUserList")
	public List<UserInfoOutput> getCompanyParentUserList(@RequestBody SearchUserInput input) {
		return userExternalService.getAdminAuditUserList(input);
	}
	
	/**
	 * 根据场站key获取用户列表
	 * @param yardKeys
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/user/yard")
	public Result getYardUsers(@RequestParam("yardKeys") String[] yardKeys) {
		return Result.Success(userExternalService.getUserByYardKey(yardKeys));
	}
	
	/**
	 * 根据场站key获取用户列表
	 * @param yardKeys
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/user/prod/yard")
	public Result getProdYardUsers(@RequestParam("yardKeys") String[] yardKeys) {
		return Result.Success(userExternalService.getUserByYardKey(yardKeys, SystemTypeEnum.MANAGEMENT));
	}
	
	/**
	 * 用户集合  查询分公司下有采购管理员审核权限的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	@PostMapping("/getAdminAuditCompanyUserList")
	public List<UserInfoOutput> getPurchaseAdminAuditCompanyUserList(@RequestBody SearchUserInput input) {
		return userExternalService.getPurchaseAdminAuditCompanyUserList(input);
	}
	/**
	 * 用户集合  查询分公司下有采购领导审核权限的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	@PostMapping("/getLeaderAuditCompanyUserList")
	public List<UserInfoOutput> getPurchaseLeaderAuditCompanyUserList(@RequestBody SearchUserInput input) {
		return userExternalService.getPurchaseLeaderAuditCompanyUserList(input);
	}

}

package com.sanlly.auth.service;

import java.util.List;

import com.sanlly.common.enums.SystemTypeEnum;
import com.sanlly.common.models.input.role.SearchRoleInput;
import com.sanlly.common.models.input.user.SearchUserInput;
import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.role.RoleOutPut;
import com.sanlly.common.models.output.role.UserRoleOutPut;
import com.sanlly.common.models.output.user.UserInfoOutput;

/**
 * 
* @Description: 共用的用户集合下拉操作服务接口 
* @author fjy
* @date 2019年7月26日  
*
 */
public interface UserExternalService {
	/**
	 * 用户集合
	 * @Description:   
	 * @param input
	 * @return
	 */
	List<UserInfoOutput> getUserList(SearchUserInput input);
	
	/**
	 * 角色集合
	 * @Description:   
	 * @param input
	 * @return
	 */
	List<RoleOutPut> getRoleList(SearchRoleInput input);
	
	/**
	 * 用户角色关系集合
	 * @Description:   
	 * @param input
	 * @return
	 */
	List<UserRoleOutPut> getUserRoleList();
	
	
	/**
	 * 用户集合  查询分公司下有审核权限的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	List<UserInfoOutput> getCompanyUserList(SearchUserInput input);
	
	/**
	 * 用户集合  查询总公司下有审核权限的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	List<UserInfoOutput> getCompanyParentUserList(SearchUserInput input);
	
	/**
	 * 用户集合 查询特定场站下的所有用户
	 * @param yardKeys
	 * @return
	 */
	List<SelectOutput> getUserByYardKey(String[] yardKeys);
	
	/**
	 *  用户集合 查询特定系统特定场站下的所有用户
	 * @param yardKeys
	 * @param systemType
	 * @return
	 */
	List<SelectOutput> getUserByYardKey(String[] yardKeys,SystemTypeEnum systemType);
	
	/**
	 * 用户集合  查询分公司下有采购管理员审核权限的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	List<UserInfoOutput> getPurchaseAdminAuditCompanyUserList(SearchUserInput input);

	/**
	 * 用户集合  查询分公司下有采购领导审核权限的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	List<UserInfoOutput> getPurchaseLeaderAuditCompanyUserList(SearchUserInput input);
	/**
	 * 用户集合  查询公司下有审核权限的用户
	 * @Description:   
	 * @param input
	 * @return
	 */
	List<UserInfoOutput> getAdminAuditUserList(SearchUserInput input);
}

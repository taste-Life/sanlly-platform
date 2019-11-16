package com.sanlly.auth.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.auth.dao.AuthMapper;
import com.sanlly.auth.dao.MenuMapper;
import com.sanlly.auth.dao.RoleAuthMapper;
import com.sanlly.auth.dao.RoleMapper;
import com.sanlly.auth.dao.RoleYardMapper;
import com.sanlly.auth.dao.UserMapper;
import com.sanlly.auth.dao.UserRoleMapper;
import com.sanlly.auth.dao.YardMapper;
import com.sanlly.auth.entity.Auth;
import com.sanlly.auth.entity.AuthExample;
import com.sanlly.auth.entity.Menu;
import com.sanlly.auth.entity.MenuExample;
import com.sanlly.auth.entity.Role;
import com.sanlly.auth.entity.RoleAuth;
import com.sanlly.auth.entity.RoleAuthExample;
import com.sanlly.auth.entity.RoleExample;
import com.sanlly.auth.entity.RoleYard;
import com.sanlly.auth.entity.RoleYardExample;
import com.sanlly.auth.entity.User;
import com.sanlly.auth.entity.UserExample;
import com.sanlly.auth.entity.UserRole;
import com.sanlly.auth.entity.UserRoleExample;
import com.sanlly.auth.entity.Yard;
import com.sanlly.auth.entity.YardExample;
import com.sanlly.auth.service.CompanyService;
import com.sanlly.auth.service.UserExternalService;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.SystemTypeEnum;
import com.sanlly.common.models.input.role.SearchRoleInput;
import com.sanlly.common.models.input.user.SearchUserInput;
import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.company.CompanyDetailOutput;
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
@Service
public class UserExternalServiceImpl extends BaseServiceImpl implements UserExternalService {

	@Autowired
	private UserMapper userDao;

	/**
	 * 角色数据库接口
	 */
	@Autowired
	private RoleMapper roleDao;

	/**
	 * 获取用户角色集合
	 */
	@Autowired
	private UserRoleMapper userRoleDao;

	/**
	 * 公司场站
	 */
	@Autowired
	private YardMapper yardDao;

	/**
	 * 角色场站
	 */
	@Autowired
	private RoleYardMapper roleYardDao;

	/**
	 * 权限
	 */
	@Autowired
	private AuthMapper authDao;

	/**
	 * 菜单
	 */
	@Autowired
	private MenuMapper menuDao;

	/**
	 * 角色权限
	 */
	@Autowired
	private RoleAuthMapper roleAuthDao;
	/**
	 * 公司
	 */
	@Autowired CompanyService companyService;

	/**
	 * 用户集合
	 */
	@Override
	public List<UserInfoOutput> getUserList(SearchUserInput input) {
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (input.getCompany() != null) {
			criteria.andUserCompanyEqualTo(input.getCompany());
		}
		if (StringUtils.isNotEmpty(input.getUserName())) {
			criteria.andUserNameLike("%" + input.getUserName() + "%");
		}
		// 用户类型
		if (input.getSystemType() != null && input.getSystemType() != 0) {
			criteria.andSystemTypeEqualTo(input.getSystemType());
		}

		List<User> userList = userDao.selectByExample(example);
		List<UserInfoOutput> userOutputList = userList.stream().map(a -> {
			UserInfoOutput output = new UserInfoOutput();
			output.setUserId(a.getUserId());
			output.setLoginAccount(a.getLoginAccount());
			output.setUserName(a.getUserName());
			output.setCompanyId(a.getUserCompany());
			output.setIsAdmin(a.getIsAdmin() != null && a.getIsAdmin().equals(PlatformConstants.IS_ADMIN_YES));
			return output;
		}).collect(Collectors.toList());

		return userOutputList;
	}

	/**
	 * 角色集合
	 */
	@Override
	public List<RoleOutPut> getRoleList(SearchRoleInput input) {
		RoleExample example = new RoleExample();
		RoleExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 查询条件
		if (StringUtils.isNotEmpty(input.getRoleName())) {
			criteria.andRoleNameLike("%" + input.getRoleName() + "%");
		}
		if (input.getRoleType() != null) {
			criteria.andRoleTypeEqualTo(input.getRoleType());
		}
		// 总条数
		List<Role> listRole = roleDao.selectByExample(example);
		List<RoleOutPut> list = listRole.stream().map(a -> {
			RoleOutPut output = new RoleOutPut();
			output.setRoleId(a.getRoleId());
			output.setRemark(a.getRemark());
			output.setRoleName(a.getRoleName());
			output.setRoleType(a.getRoleType());
			return output;
		}).collect(Collectors.toList());

		return list;
	}

	/**
	 * 用户角色关系集合
	 */
	@Override
	public List<UserRoleOutPut> getUserRoleList() {
		UserRoleExample example = new UserRoleExample();
		// 总条数
		List<UserRole> listUserRole = userRoleDao.selectByExample(example);
		List<UserRoleOutPut> list = listUserRole.stream().map(a -> {
			UserRoleOutPut output = new UserRoleOutPut();
			// 查询用户实体
			User user = userDao.selectByPrimaryKey(a.getUserId());
			UserInfoOutput userOutput = new UserInfoOutput();
			userOutput.setUserId(user.getUserId());
			userOutput.setLoginAccount(user.getLoginAccount());
			userOutput.setUserName(user.getUserName());
			userOutput.setEmail(user.getUserEmail());
			output.setUser(userOutput);

			// 查询角色实体
			RoleOutPut roleOutPut = new RoleOutPut();
			Role role = roleDao.selectByPrimaryKey(a.getRoleId());
			roleOutPut.setRoleId(role.getRoleId());
			roleOutPut.setRoleName(role.getRoleName());
			roleOutPut.setRemark(role.getRemark());
			roleOutPut.setRoleType(role.getRoleType());
			output.setRole(roleOutPut);

			return output;
		}).collect(Collectors.toList());

		return list;
	}

	/**
	 * 用户集合 查询分公司下有审核权限的用户
	 * 
	 * @Description:
	 * @param input
	 * @return
	 */
	@Override
	public List<UserInfoOutput> getCompanyUserList(SearchUserInput input) {
		// TODO Auto-generated method stub

		// 1根据公司Key查询所有场站
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andCompanyEqualTo(input.getCompanyKey());
		List<Yard> listYard = yardDao.selectByExample(yardExample);
		// 2根据场站查询所有角色
		RoleYardExample roleYardExample = new RoleYardExample();
		List<Integer> yardIds = listYard.stream().map(y -> y.getProdYardId()).collect(Collectors.toList());
		roleYardExample.createCriteria().andYardIdIn(yardIds);
		List<RoleYard> listRoleYard = roleYardDao.selectByExample(roleYardExample);
		// 去重
		List<Integer> roleIds = listRoleYard.stream().map(r -> r.getRoleId()).distinct().collect(Collectors.toList());

		// 3根据角色查询所有用户
		UserRoleExample userRoleExample = new UserRoleExample();
		userRoleExample.createCriteria().andRoleIdIn(roleIds);
		List<UserRole> listUserRole = userRoleDao.selectByExample(userRoleExample);
		List<Integer> userIds1 = listUserRole.stream().map(u -> u.getUserId()).distinct().collect(Collectors.toList());
		// 4找到有审核菜单的所有角色
		MenuExample menuExample = new MenuExample();
		menuExample.createCriteria().andMenuCodeEqualTo(PlatformConstants.PurcSupplierReview_MenuCode);
		List<Menu> listMenu = menuDao.selectByExample(menuExample);
		// 得到Menuid
		Menu menu = new Menu();
		if (listMenu != null && listMenu.size() > 0) {
			menu = listMenu.get(0);
		} else {
//			return null;
		}

		AuthExample authExample = new AuthExample();
		authExample.createCriteria().andMenuIdEqualTo(menu.getMenuId());
		List<Auth> listAuth = authDao.selectByExample(authExample);
		List<Integer> authIds = listAuth.stream().map(a -> a.getAuthId()).distinct().collect(Collectors.toList());

		RoleAuthExample roleAuthExample = new RoleAuthExample();
		roleAuthExample.createCriteria().andAuthIdIn(authIds);
		List<RoleAuth> listRoleAuth = roleAuthDao.selectByExample(roleAuthExample);
		List<Integer> roleIds2 = listRoleAuth.stream().map(r -> r.getRoleId()).distinct().collect(Collectors.toList());
		// 5通过角色查询出所有角色下的用户

		UserRoleExample userRoleExample2 = new UserRoleExample();
		userRoleExample2.createCriteria().andRoleIdIn(roleIds2);
		List<UserRole> listUserRole2 = userRoleDao.selectByExample(userRoleExample2);
		List<Integer> userIds2 = listUserRole2.stream().map(u -> u.getUserId()).distinct().collect(Collectors.toList());
		// 6 把3和5的用户取交集返回具有审核权限的用户
		userIds2.retainAll(userIds1);

		// 查询用户详细信息返回
		UserExample userExample = new UserExample();
		userExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUserIdIn(userIds2);
		List<User> listUser = userDao.selectByExample(userExample);
		List<UserInfoOutput> listUserOutPut = listUser.stream().map(u -> {
			UserInfoOutput userOutPut = new UserInfoOutput();
			userOutPut.setUserId(u.getUserId());
			userOutPut.setUserName(u.getUserName());
			userOutPut.setCompanyId(u.getUserCompany());
			userOutPut.setLoginAccount(u.getLoginAccount());
			userOutPut.setIsAdmin(u.getIsAdmin() == 0 ? true : false);
			return userOutPut;
		}).collect(Collectors.toList());
		return listUserOutPut;

	}

	/**
	 * 用户集合 查询总公司下有审核权限的用户
	 * 
	 * @Description:
	 * @param input
	 * @return
	 */
	@Override
	public List<UserInfoOutput> getCompanyParentUserList(SearchUserInput input) {
		// TODO Auto-generated method stub
		// 1查询role_yard中 场站id=0的总公司的用户
		RoleYardExample roleYardExample = new RoleYardExample();
		roleYardExample.createCriteria().andYardIdEqualTo(0);
		List<RoleYard> listRoleYard = roleYardDao.selectByExample(roleYardExample);
		List<Integer> roleIds = listRoleYard.stream().map(r -> r.getRoleId()).distinct().collect(Collectors.toList());
		
		UserRoleExample userRoleExample = new UserRoleExample();
		userRoleExample.createCriteria().andRoleIdIn(roleIds);
		List<UserRole> listUserRole = userRoleDao.selectByExample(userRoleExample);
		List<Integer> userIds1 = listUserRole.stream().map(u -> u.getUserId()).distinct().collect(Collectors.toList());
		

		// 2找到有审核菜单的所有角色
		MenuExample menuExample = new MenuExample();
		menuExample.createCriteria().andMenuCodeEqualTo(PlatformConstants.PurcSupplierReview_MenuCode);
		List<Menu> listMenu = menuDao.selectByExample(menuExample);
		// 得到Menuid
		Menu menu = new Menu();
		if (listMenu != null && listMenu.size() > 0) {
			menu = listMenu.get(0);
		}
		AuthExample authExample = new AuthExample();
		authExample.createCriteria().andMenuIdEqualTo(menu.getMenuId());
		List<Auth> listAuth = authDao.selectByExample(authExample);
		List<Integer> authIds = listAuth.stream().map(a -> a.getAuthId()).distinct().collect(Collectors.toList());

		RoleAuthExample roleAuthExample = new RoleAuthExample();
		roleAuthExample.createCriteria().andAuthIdIn(authIds);
		List<RoleAuth> listRoleAuth = roleAuthDao.selectByExample(roleAuthExample);
		List<Integer> roleIds2 = listRoleAuth.stream().map(r -> r.getRoleId()).distinct().collect(Collectors.toList());
		// 通过角色查询出所有角色下的用户

		UserRoleExample userRoleExample2 = new UserRoleExample();
		userRoleExample2.createCriteria().andRoleIdIn(roleIds2);
		List<UserRole> listUserRole2 = userRoleDao.selectByExample(userRoleExample2);
		List<Integer> userIds2 = listUserRole2.stream().map(u -> u.getUserId()).distinct().collect(Collectors.toList());

		userIds2.retainAll(userIds1);

		// 查询用户详细信息返回
		UserExample userExample = new UserExample();
		userExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUserIdIn(userIds2);
		List<User> listUser = userDao.selectByExample(userExample);
		List<UserInfoOutput> listUserOutPut = listUser.stream().map(u -> {
			UserInfoOutput userOutPut = new UserInfoOutput();
			userOutPut.setUserId(u.getUserId());
			userOutPut.setUserName(u.getUserName());
			userOutPut.setCompanyId(u.getUserCompany());
			userOutPut.setLoginAccount(u.getLoginAccount());
			userOutPut.setIsAdmin(u.getIsAdmin() == 0 ? true : false);
			return userOutPut;
		}).collect(Collectors.toList());
		return listUserOutPut;
	}

	@Override
	public List<SelectOutput> getUserByYardKey(String[] yardKeys) {
		if(yardKeys!=null && yardKeys.length>0) {
			YardExample example=new YardExample();
			example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyIn(Arrays.asList(yardKeys));
			List<Yard> yardList=yardDao.selectByExample(example);
			if(yardList.size()>0) {
				RoleYardExample roleYardExample = new RoleYardExample();
				roleYardExample.createCriteria().andYardIdIn(yardList.stream().map(a->a.getProdYardId()).collect(Collectors.toList()));
				List<RoleYard> roleYardList=roleYardDao.selectByExample(roleYardExample);
				if(roleYardList.size()>0) {
					UserRoleExample urExample=new UserRoleExample();
					urExample.createCriteria().andRoleIdIn(roleYardList.stream().map(a->a.getRoleId()).collect(Collectors.toList()));
					List<UserRole> urList=userRoleDao.selectByExample(urExample);
					if(urList.size()>0) {
						UserExample uExample=new UserExample();
						uExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUserIdIn(urList.stream().map(a->a.getUserId()).collect(Collectors.toList()));
						List<User> userList=userDao.selectByExample(uExample);
						return userList.stream().map(a->{
							SelectOutput item=new SelectOutput();
							item.setValue(a.getUserId().toString());
							item.setLabel(a.getUserName());
							item.setLabelEn(a.getUserName());
							return item;
						}).collect(Collectors.toList());
					}
				}
			}
			
		}
		
		return new ArrayList<>();
	}
	
	@Override
	public List<SelectOutput> getUserByYardKey(String[] yardKeys, SystemTypeEnum systemType) {
		if(yardKeys!=null && yardKeys.length>0) {
			YardExample example=new YardExample();
			example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyIn(Arrays.asList(yardKeys));
			List<Yard> yardList=yardDao.selectByExample(example);
			if(yardList.size()>0) {
				RoleYardExample roleYardExample = new RoleYardExample();
				roleYardExample.createCriteria().andYardIdIn(yardList.stream().map(a->a.getProdYardId()).collect(Collectors.toList()));
				List<RoleYard> roleYardList=roleYardDao.selectByExample(roleYardExample);
				if(roleYardList.size()>0) {
					UserRoleExample urExample=new UserRoleExample();
					urExample.createCriteria().andRoleIdIn(roleYardList.stream().map(a->a.getRoleId()).collect(Collectors.toList()));
					List<UserRole> urList=userRoleDao.selectByExample(urExample);
					if(urList.size()>0) {
						UserExample uExample=new UserExample();
						uExample.createCriteria()
						.andSystemTypeEqualTo(systemType.getCode())
						.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andUserIdIn(urList.stream().map(a->a.getUserId()).collect(Collectors.toList()));
						List<User> userList=userDao.selectByExample(uExample);
						return userList.stream().map(a->{
							SelectOutput item=new SelectOutput();
							item.setValue(a.getUserId().toString());
							item.setLabel(a.getUserName());
							item.setLabelEn(a.getUserName());
							return item;
						}).collect(Collectors.toList());
					}
				}
			}
			
		}
		
		return new ArrayList<>();
	}
	


	/**
	 * 用户集合 查询分公司下有审核权限的用户
	 * 
	 * @Description:
	 * @param input
	 * @return
	 */
	@Override
	public List<UserInfoOutput> getPurchaseAdminAuditCompanyUserList(SearchUserInput input) {
		// 5通过角色查询出所有角色下的用户

		UserRoleExample userRoleExample2 = new UserRoleExample();
		userRoleExample2.createCriteria().andRoleIdEqualTo(input.getRoleId());
		List<UserRole> listUserRole2 = userRoleDao.selectByExample(userRoleExample2);
		List<Integer> userIds2 = listUserRole2.stream().map(u -> u.getUserId()).distinct().collect(Collectors.toList());
		// 6 把3和5的用户取交集返回具有审核权限的用户
//		userIds2.retainAll(userIds1);

		// 查询用户详细信息返回
		CompanyDetailOutput output = companyService.getCompanyByKey(input.getCompanyKey());
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		if(output!=null) {
			criteria.andUserCompanyEqualTo(output.getCompanyId());
		}
		
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUserIdIn(userIds2);
		List<User> listUser = userDao.selectByExample(userExample);
		List<UserInfoOutput> listUserOutPut = listUser.stream().map(u -> {
			UserInfoOutput userOutPut = new UserInfoOutput();
			userOutPut.setUserId(u.getUserId());
			userOutPut.setUserName(u.getUserName());
			userOutPut.setCompanyId(u.getUserCompany());
			userOutPut.setLoginAccount(u.getLoginAccount());
			userOutPut.setIsAdmin(u.getIsAdmin() == 0 ? true : false);
			return userOutPut;
		}).collect(Collectors.toList());
		return listUserOutPut;

	}

	@Override
	public List<UserInfoOutput> getPurchaseLeaderAuditCompanyUserList(SearchUserInput input) {
		// 5通过角色查询出所有角色下的用户

		UserRoleExample userRoleExample2 = new UserRoleExample();
		userRoleExample2.createCriteria().andRoleIdEqualTo(input.getRoleId());
		List<UserRole> listUserRole2 = userRoleDao.selectByExample(userRoleExample2);
		List<Integer> userIds2 = listUserRole2.stream().map(u -> u.getUserId()).distinct().collect(Collectors.toList());
		// 6 把3和5的用户取交集返回具有审核权限的用户
//		userIds2.retainAll(userIds1);
		// 查询用户详细信息返回
		CompanyDetailOutput output = companyService.getCompanyByKey(input.getCompanyKey());
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		if(output!=null) {
			criteria.andUserCompanyEqualTo(output.getCompanyId());
		}
		
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUserIdIn(userIds2);
		List<User> listUser = userDao.selectByExample(userExample);
		List<UserInfoOutput> listUserOutPut = listUser.stream().map(u -> {
			UserInfoOutput userOutPut = new UserInfoOutput();
			userOutPut.setUserId(u.getUserId());
			userOutPut.setUserName(u.getUserName());
			userOutPut.setCompanyId(u.getUserCompany());
			userOutPut.setLoginAccount(u.getLoginAccount());
			userOutPut.setIsAdmin(u.getIsAdmin() == 0 ? true : false);
			return userOutPut;
		}).collect(Collectors.toList());
		return listUserOutPut;
	}
	
	/**
	 * 用户集合 查询总公司角色下的全部用户
	 * @author mx
	 * @Description:
	 * @param input
	 * @return
	 */
	@Override
	public List<UserInfoOutput> getAdminAuditUserList(SearchUserInput input) {
		// 5通过角色查询出所有角色下的用户

		UserRoleExample userRoleExample2 = new UserRoleExample();
		userRoleExample2.createCriteria().andRoleIdEqualTo(input.getRoleId());
		List<UserRole> listUserRole2 = userRoleDao.selectByExample(userRoleExample2);
		List<Integer> userIds2 = listUserRole2.stream().map(u -> u.getUserId()).distinct().collect(Collectors.toList());
		// 6 把3和5的用户取交集返回具有审核权限的用户
//		userIds2.retainAll(userIds1);


		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUserIdIn(userIds2);
		List<User> listUser = userDao.selectByExample(userExample);
		List<UserInfoOutput> listUserOutPut = listUser.stream().map(u -> {
			UserInfoOutput userOutPut = new UserInfoOutput();
			userOutPut.setUserId(u.getUserId());
			userOutPut.setUserName(u.getUserName());
			userOutPut.setCompanyId(u.getUserCompany());
			userOutPut.setLoginAccount(u.getLoginAccount());
			userOutPut.setIsAdmin(u.getIsAdmin() == 0 ? true : false);
			return userOutPut;
		}).collect(Collectors.toList());
		return listUserOutPut;

	}

}

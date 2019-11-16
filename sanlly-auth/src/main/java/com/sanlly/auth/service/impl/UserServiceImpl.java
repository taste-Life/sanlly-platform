package com.sanlly.auth.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.auth.dao.AuthMapper;
import com.sanlly.auth.dao.CompanyMapper;
import com.sanlly.auth.dao.MenuMapper;
import com.sanlly.auth.dao.RoleAuthMapper;
import com.sanlly.auth.dao.RoleMapper;
import com.sanlly.auth.dao.RoleYardMapper;
import com.sanlly.auth.dao.UserMapper;
import com.sanlly.auth.dao.UserRoleMapper;
import com.sanlly.auth.dao.YardMapper;
import com.sanlly.auth.entity.Auth;
import com.sanlly.auth.entity.AuthExample;
import com.sanlly.auth.entity.Company;
import com.sanlly.auth.entity.CompanyExample;
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
import com.sanlly.auth.models.input.user.SearchUserInput;
import com.sanlly.auth.models.input.user.ValidateUserInput;
import com.sanlly.auth.models.output.role.RoleDetailOutput;
import com.sanlly.auth.models.output.user.UserRoleOutput;
import com.sanlly.auth.service.UserService;
import com.sanlly.auth.service.feign.WorkflowFeignClient;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.SystemTypeEnum;
import com.sanlly.common.models.exception.AuthorizationException;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.input.activiti.ActGroupInput;
import com.sanlly.common.models.input.activiti.ActUserAndGroupInput;
import com.sanlly.common.models.input.activiti.ActUserInput;
import com.sanlly.common.models.input.user.AddUserInput;
import com.sanlly.common.models.input.user.ChangePasswordInput;
import com.sanlly.common.models.input.user.EditUserInput;
import com.sanlly.common.models.input.user.LoginInput;
import com.sanlly.common.models.output.auth.AuthDetailOutput;
import com.sanlly.common.models.output.company.CompanyDetailOutput;
import com.sanlly.common.models.output.menu.MenuDetailOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.models.output.yard.YardDetailOutput;
import com.sanlly.common.utils.MD5Util;

/**
 * 用户接口实现
 * 
 * @author 生旭鹏
 *
 */
@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService {

	@Autowired
	private RoleMapper roleDao;

	@Autowired
	private UserMapper userDao;
	
	@Autowired
	private UserRoleMapper userRoleDao;
	
	@Autowired
	private RoleYardMapper roleYardDao;
	
	@Autowired
	private AuthMapper authDao;
	
	@Autowired
	private RoleAuthMapper roleAuthDao;
	
	@Autowired
	private CompanyMapper companyDao;
	
	@Autowired
	private MenuMapper menuDao;
	
	@Autowired
	private YardMapper yardDao;
	
	/**
	 * 流程用户同步接口
	 */
	@Autowired
	private WorkflowFeignClient workflowFeignClient;

	@Override
	public PagedList<UserInfoOutput> getUserPagedList(SearchUserInput input) {
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andSystemTypeEqualTo(SystemTypeEnum.MANAGEMENT.getCode()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (input.getCompany() != null) {
			criteria.andUserCompanyEqualTo(input.getCompany());
		}
		if (StringUtils.isNotEmpty(input.getUserName())) {
			criteria.andUserNameLike("%" + input.getUserName() + "%");
		}
		int totalCount = (int) userDao.countByExample(example);
		PagedList<UserInfoOutput> pagedList = new PagedList<UserInfoOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause("create_time desc");
		List<User> userList = userDao.selectByExample(example);
		List<UserInfoOutput> userOutputList = userList.stream().map(a -> {
			UserInfoOutput output = new UserInfoOutput();
			output.setUserId(a.getUserId());
			output.setUserName(a.getUserName());
			output.setLoginAccount(a.getLoginAccount());
			output.setCompanyId(a.getUserCompany());
			output.setIsAdmin(a.getIsAdmin()!=null && a.getIsAdmin().equals(PlatformConstants.IS_ADMIN_YES));
			return output;
		}).collect(Collectors.toList());
		pagedList.setDataList(userOutputList);
		return pagedList;
	}

	@Override
	@Transactional
	public Integer addUser(AddUserInput input) {
		User user = new User();
		user.setUserName(input.getUserName());
		user.setLoginAccount(input.getLoginAccount());
		if (StringUtils.isNotEmpty(input.getLoginPassword())) {
			user.setLoginPassword(MD5Util.getMD5(input.getLoginPassword()));
		} else {
			user.setLoginPassword(MD5Util.getMD5(PlatformConstants.DEFAULT_PASSWORD));
		}
		user.setUserSex(input.getUserSex());
		user.setUserEmail(input.getEmail());
		user.setUserMobile(input.getMobile());
		user.setUserCompany(input.getCompanyId());
		if(input.getSystemType()==null) {
			user.setSystemType(SystemTypeEnum.MANAGEMENT.getCode());
		}
		else {
			user.setSystemType(input.getSystemType().getCode());
		}
		user.setIsDel(PlatformConstants.ISDEL_NO);
		user.setIsAdmin(PlatformConstants.IS_ADMIN_NO);
		user.setCreateTime(new Date());
		user.setCreateUser(getCurrentUserId());
		userDao.insert(user);
		Integer userId=user.getUserId();
		/*****流程相关 start*****/
		ActUserInput param=new ActUserInput();
		param.setId(userId);
		param.setAccount(input.getLoginAccount());
		param.setName(input.getUserName());
		param.setEmail(input.getEmail());
		workflowFeignClient.userAddFromWF(param);
		return userId;
	}

	@Override
	public UserInfoOutput getUser(Integer userId) {
		User user = userDao.selectByPrimaryKey(userId);
		if (user.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			UserInfoOutput output = new UserInfoOutput();
			output.setUserId(user.getUserId());
			output.setUserName(user.getUserName());
			output.setEmail(user.getUserEmail());
			output.setMobile(user.getUserMobile());
			output.setUserSex(user.getUserSex());
			output.setCompanyId(user.getUserCompany());
			output.setIsAdmin(user.getIsAdmin()!=null && user.getIsAdmin().equals(PlatformConstants.IS_ADMIN_YES));
			output.setLoginAccount(user.getLoginAccount());
			return output;
		}
		return null;
	}

	@Override
	@Transactional
	public void editUser(EditUserInput input) {
		User user = userDao.selectByPrimaryKey(input.getUserId());
		if (user.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			if (StringUtils.isNotEmpty(input.getUserName()))
				user.setUserName(input.getUserName());
			if (StringUtils.isNotEmpty(input.getEmail()))
				user.setUserEmail(input.getEmail());
			if (StringUtils.isNotEmpty(input.getMobile()))
				user.setUserMobile(input.getMobile());
			if (input.getUserSex() != null)
				user.setUserSex(input.getUserSex());
			if (input.getCompanyId() != null)
				user.setUserCompany(input.getCompanyId());
			user.setUpdateTime(new Date());
			user.setUpdateUser(getCurrentUserId());
			userDao.updateByPrimaryKey(user);
			
			/*****流程相关 start*****/
			ActUserInput param=new ActUserInput();
			param.setId(user.getUserId());
			param.setAccount(user.getLoginAccount());
			param.setName(user.getUserName());
			param.setEmail(user.getUserEmail());
			 
			workflowFeignClient.userUpdateFromWF(param);
			/*****流程相关 end*****/
			return;
		}
		
		throw new InvalidException("无效的用户");
	}

	@Override
	@Transactional
	public void deleteUser(Integer[] userIds) {
		UserExample example=new UserExample();
		example.createCriteria().andUserIdIn(Arrays.asList(userIds));
		User user=new User();
		user.setIsDel(PlatformConstants.ISDEL_YES);
		user.setUpdateTime(new Date());
		user.setUpdateUser(getCurrentUserId());
		//批量删除
		userDao.updateByExampleSelective(user, example);
		
		/*****流程相关 start*****/
		
		UserExample accountExample=new UserExample();
		accountExample.createCriteria().andUserIdIn(Arrays.asList(userIds));
		List<User> listUsers=userDao.selectByExample(accountExample);
		ActUserAndGroupInput augiInput=new ActUserAndGroupInput();
		List<ActUserInput> list=new ArrayList<ActUserInput>();
		for (int i = 0; i < listUsers.size(); i++) {
			ActUserInput actUserInput=new ActUserInput();
			actUserInput.setId(listUsers.get(i).getUserId());
			actUserInput.setAccount(listUsers.get(i).getLoginAccount());
			list.add(actUserInput);
		}
		augiInput.setUserList(list);
		workflowFeignClient.deleteActivitiUser(augiInput);
		/*****流程相关 end*****/
	}

	@Override
	public UserRoleOutput getUserRole(Integer userId) {
		UserRoleOutput output=new UserRoleOutput();
		output.setUserId(userId);
		//查询当前用户下的角色
		UserRoleExample example=new UserRoleExample();
		example.createCriteria().andUserIdEqualTo(userId);
		List<UserRole> userRoleList=userRoleDao.selectByExample(example);
		output.setRoleIds(userRoleList.stream().map(a->a.getRoleId()).toArray(Integer[]::new));
		//查询系统现有的角色
		RoleExample roleExample=new RoleExample();
		roleExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Role> roleList=roleDao.selectByExample(roleExample);
		output.setRoleList(roleList.stream().map(a->{
			RoleDetailOutput item=new RoleDetailOutput();
			item.setRoleId(a.getRoleId());
			item.setRoleName(a.getRoleName());
			item.setRoleType(a.getRoleType());
			//数据角色判断是否总部级
			if(a.getRoleType()!=null && a.getRoleType().equals(1)) {
				RoleYardExample exp=new RoleYardExample();
				exp.createCriteria().andRoleIdEqualTo(a.getRoleId());
				List<RoleYard> ryList=roleYardDao.selectByExample(exp);
				if(ryList.size()>0 && ryList.get(0).getYardId().equals(0)) {
					item.setRemark("1");
				}
			}
			return item;
		}).collect(Collectors.toList()));
		return output;
	}

	/**
	 * 修改用户的角色
	 */
	@Override
	@Transactional
	public void updateRole(Integer userId, Integer[] roleIds, Integer[] yardRoleIds) {
		UserRoleExample example=new UserRoleExample();
		example.createCriteria().andUserIdEqualTo(userId);
		userRoleDao.deleteByExample(example);
		if(roleIds!=null) {
			for(Integer roleId:roleIds) {
				UserRole ur=new UserRole();
				ur.setUserId(userId);
				ur.setRoleId(roleId);
				userRoleDao.insert(ur);
			}
		}
		if(yardRoleIds!=null) {
			for(Integer roleId:yardRoleIds) {
				UserRole ur=new UserRole();
				ur.setUserId(userId);
				ur.setRoleId(roleId);
				userRoleDao.insert(ur);
			}
		}
		/*****流程相关 start*****/
		
		UserRoleExample exampleGroup=new UserRoleExample();
		exampleGroup.createCriteria().andUserIdEqualTo(userId);
		List<UserRole> listUserRoles=userRoleDao.selectByExample(exampleGroup);
		ActUserAndGroupInput augiInput=new ActUserAndGroupInput();
		
		User user=userDao.selectByPrimaryKey(userId);

		ActUserInput userInfo=new ActUserInput();
		userInfo.setId(userId);
		userInfo.setAccount(user.getLoginAccount());
		augiInput.setUserInfo(userInfo);
		 List<ActGroupInput> list=new ArrayList<ActGroupInput>();
		for (int i = 0; i < listUserRoles.size(); i++) {
			ActGroupInput actGroupInput=new ActGroupInput();
			actGroupInput.setGroupId(listUserRoles.get(i).getRoleId());
			Role role=roleDao.selectByPrimaryKey(listUserRoles.get(i).getRoleId());
			actGroupInput.setGroupName(role.getRoleName());
			list.add(actGroupInput);
		}
		augiInput.setGroupList(list);
		workflowFeignClient.updateActivitiUserGroup(augiInput);
		/*****流程相关 end*****/
	}

	/**
	 * 用户登陆
	 */
	@Override
	public UserInfoOutput login(LoginInput input) {
		UserExample userExample=new UserExample();
		UserExample.Criteria criteria=userExample.createCriteria();
		criteria
		.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
		.andLoginAccountEqualTo(input.getLoginName())
		.andLoginPasswordEqualTo(MD5Util.getMD5(input.getLoginPassword()));
		if(input.getSystemType()!=null && input.getSystemType().equals(SystemTypeEnum.SUPPLIER.getCode())) {
			criteria.andSystemTypeEqualTo(input.getSystemType());
		}
		List<User> userList=userDao.selectByExample(userExample);
		if(userList.size()>0 && userList.stream().anyMatch(a->a.getLoginAccount().equals(input.getLoginName()))) {
			User user=userList.stream().filter(a->a.getLoginAccount().equals(input.getLoginName())).findFirst().get();
			UserInfoOutput output=new UserInfoOutput();
			output.setUserId(user.getUserId());
			output.setLoginAccount(input.getLoginName());
			output.setUserName(user.getUserName());
			output.setMobile(user.getUserMobile());
			output.setEmail(user.getUserEmail());
			output.setUserSex(user.getUserSex());
			//是否超级管理员
			output.setIsAdmin(user.getIsAdmin()!=null && user.getIsAdmin().equals(PlatformConstants.IS_ADMIN_YES));
			output.setCompanyId(user.getUserCompany());
			output.setIsHeadCompany(false);
			//其他系统登陆，不需要查询权限
			if(input.getSystemType()!=null && input.getSystemType().equals(SystemTypeEnum.SUPPLIER.getCode())) {
				return output;
			}
			Company company=companyDao.selectByPrimaryKey(input.getCompanyId());
			if(company.getIsDel()!=null && company.getIsDel().equals(PlatformConstants.ISDEL_YES)) {
				throw new AuthorizationException("errorCompany");
			}
			UserRoleExample urExample=new UserRoleExample();
			urExample.createCriteria().andUserIdEqualTo(user.getUserId());
			List<UserRole> urList=userRoleDao.selectByExample(urExample);
			if(urList.size()==0) {
				throw new AuthorizationException("unauthorized");
			}
			//数据权限
			List<CompanyDetailOutput> companyList=new ArrayList<>();
			List<YardDetailOutput> yardList=new ArrayList<>();
			Boolean isAdmin=false;
			for(UserRole userRole:urList) {
				RoleYardExample ryExample=new RoleYardExample();
				ryExample.createCriteria().andRoleIdEqualTo(userRole.getRoleId());
				List<RoleYard> roleYardList=roleYardDao.selectByExample(ryExample);
				if(roleYardList.size()==0) {
					continue;
				}
				isAdmin=roleYardList.get(0).getYardId().equals(0);
				if(isAdmin) {
					break;
				}
				else {
					for(RoleYard roleYard:roleYardList) {
						if(!yardList.stream().anyMatch(a->a.getYardId().equals(roleYard.getYardId()))) {
							Yard yard=yardDao.selectByPrimaryKey(roleYard.getYardId());
							if(yard!=null && yard.getIsDel()!=null && yard.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
								YardDetailOutput ydetail=new YardDetailOutput();
								ydetail.setYardId(roleYard.getYardId());
								ydetail.setYardName(yard.getYardName());
								ydetail.setYardNameEn(yard.getYardNameEn());
								ydetail.setYardKey(yard.getKey());
								ydetail.setCompanyKey(yard.getCompany());
								yardList.add(ydetail);
							}
						}
					}
				}
			}
//			isAdmin=isAdmin && company.getIsHead()!=null && company.getIsHead().equals(PlatformConstants.IS_ADMIN_YES);
			//总部管理员可查看所有公司及所有场站
			if(isAdmin) {
				//允许是总部登陆
				output.setIsHeadCompany(true);
				//查询所有公司
				CompanyExample companyExample=new CompanyExample();
				companyExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				companyList.clear();
				companyList.addAll(companyDao.selectByExample(companyExample).stream()
						.map(a->{
							CompanyDetailOutput item=new CompanyDetailOutput();
							item.setCompanyId(a.getProdCompanyId());
							item.setCompanyKey(a.getKey());
							item.setCompanyName(a.getCompanyName());
							item.setCompanyNameEn(a.getCompanyNameEn());
							return item;
						}).collect(Collectors.toList()));
				//查询所有场站
				YardExample yardExample=new YardExample();
				yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				yardList.clear();
				yardList.addAll(yardDao.selectByExample(yardExample).stream()
						.map(a->{
							YardDetailOutput item=new YardDetailOutput();
							item.setYardId(a.getProdYardId());
							item.setYardKey(a.getKey());
							item.setYardName(a.getYardName());
							item.setYardNameEn(a.getYardNameEn());
							item.setCompanyKey(a.getCompany());
							return item;
						}).collect(Collectors.toList()));
			}
			else {
				for(YardDetailOutput yardDetail:yardList) {
					if(!companyList.stream().anyMatch(a->a.getCompanyKey().equals(yardDetail.getCompanyKey()))) {
						CompanyExample cexample=new CompanyExample();
						cexample.createCriteria().andKeyEqualTo(yardDetail.getCompanyKey());
						Company comp=companyDao.selectByExample(cexample).get(0);
						
						CompanyDetailOutput item=new CompanyDetailOutput();
						item.setCompanyId(comp.getProdCompanyId());
						item.setCompanyKey(comp.getKey());
						item.setCompanyName(comp.getCompanyName());
						item.setCompanyNameEn(comp.getCompanyNameEn());
						companyList.add(item);
					}
				}
				//非总部管理员需判断登陆选择的公司及场站是否在权限范围内
				if(!companyList.stream().anyMatch(a->a.getCompanyId().equals(input.getCompanyId()))) {
					throw new AuthorizationException("invalidCompany");
				}
				if(!yardList.stream().anyMatch(a->a.getYardId().equals(input.getYardId()))) {
					throw new AuthorizationException("invalidYard");
				}
			}
			
			output.setCompanyList(companyList);
			output.setYardList(yardList);
			
			//功能权限
			if(urList.size()>0) {
				RoleAuthExample raExample=new RoleAuthExample();
				raExample.createCriteria().andRoleIdIn(urList.stream().map(a->a.getRoleId()).collect(Collectors.toList()));
				List<RoleAuth> raList=roleAuthDao.selectByExample(raExample);
				if(raList.size()>0) {
					AuthExample authExample=new AuthExample();
					authExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andAuthIdIn(raList.stream().map(a->a.getAuthId()).collect(Collectors.toList()));
					List<Auth> authList=authDao.selectByExample(authExample);
					List<AuthDetailOutput> authOutputList=authList.stream().map(a->{
						AuthDetailOutput item=new AuthDetailOutput();
						item.setAuthId(a.getAuthId());
						item.setAuthCode(a.getAuthCode());
						item.setAuthName(a.getAuthName());
						item.setMenuId(a.getMenuId());
						return item;
					}).collect(Collectors.toList());
					//权限列表
					output.setAuthList(authOutputList);
					
					//查询所有菜单
					MenuExample menuExample=new MenuExample();
					menuExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
					List<Menu> allMenuList=menuDao.selectByExample(menuExample);
					List<Integer> authMenuIdList=authList.stream().map(a->a.getMenuId()).collect(Collectors.toList());
					List<Menu> menuList=allMenuList.stream().filter(a->authMenuIdList.contains(a.getMenuId()))
							.collect(Collectors.toList());
					for(Menu m:getParentMenus(menuList,allMenuList)) {
						if(!menuList.stream().anyMatch(a->a.getMenuId().equals(m.getMenuId()))) { 
							menuList.add(m);
						}
					}
					//菜单组装
					List<MenuDetailOutput> menuOutputList=menuList.stream()
							.map(record->{
								MenuDetailOutput menuOutput=new MenuDetailOutput();
								menuOutput.setMenuId(record.getMenuId());
								menuOutput.setMenuCode(record.getMenuCode());
								menuOutput.setMenuName(record.getMenuName());
								menuOutput.setMenuNameEn(record.getMenuNameEn());
								menuOutput.setMenuParentId(record.getMenuParent());
								menuOutput.setMenuIcon(record.getMenuIcon());
								menuOutput.setMenuOrder(record.getMenuOrder()==null?99:record.getMenuOrder());
								menuOutput.setAuthList(authList.stream()
										.filter(a->a.getMenuId().equals(record.getMenuId()))
										.map(a->{
											AuthDetailOutput authOut=new AuthDetailOutput();
											authOut.setAuthId(a.getAuthId());
											authOut.setAuthName(a.getAuthName());
											authOut.setMenuId(a.getMenuId());
											return authOut;
										}).collect(Collectors.toList()));
								return menuOutput;
							}).collect(Collectors.toList());
					output.setAllMenuList(menuOutputList);
					List<MenuDetailOutput> newMenuOutputList=reOrderMenu(menuOutputList,0);
					output.setMenuList(newMenuOutputList);
					return output;
				}
			}
			return output;
			
		}
		throw new AuthorizationException("invalid");
	}
	
	/**
	 * 获取父级菜单
	 * @param list
	 * @param allMenuList
	 * @return
	 */
	private List<Menu> getParentMenus(List<Menu> list,List<Menu> allMenuList){
		List<Menu> newList=new ArrayList<Menu>();
		for(Menu menu:list) {
			if(menu.getMenuParent().equals(0)) {
				continue;
			}
			List<Menu> parentMenuList=allMenuList.stream().filter(a->a.getMenuId().equals(menu.getMenuParent())).collect(Collectors.toList());
			for(Menu parent:parentMenuList) {
				if(!list.stream().anyMatch(a->a.getMenuId().equals(parent.getMenuId()))) { 
					newList.add(parent);
				}
			}
			if(newList.size()>0) {
				newList.addAll(getParentMenus(newList,allMenuList));
			}
		}
		return newList;
	}
	/**
	 *    按照上下级重新排序菜单
	 * @param source
	 * @param parentId 父级菜单id
	 * @return
	 */
	private List<MenuDetailOutput> reOrderMenu(List<MenuDetailOutput> source,Integer parentId){
		List<MenuDetailOutput> outputList=source.stream()
				.filter(a->a.getMenuParentId().equals(parentId)).sorted((a,b)->a.getMenuOrder()-b.getMenuOrder()).collect(Collectors.toList());
		for(MenuDetailOutput item:outputList) {
			List<MenuDetailOutput> subList=reOrderMenu(source,item.getMenuId());
			if(subList.size()>0) {
				item.setSubMenuList(subList);
			}
		}
		return outputList;
	}

	/**
	 * 用户验证账号
	 */
	@Override
	public Boolean validateAccount(ValidateUserInput input) {
		UserExample example = new UserExample();
		example.createCriteria()
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				//.andLoginAccountEqualTo(input.getLoginAccount())
				.andUserIdEqualTo(input.getUserId());
		return userDao.countByExample(example)==0;
	}

	/**
	 * 获取公司列表
	 */
	@Override
	public List<CompanyDetailOutput> getCompanyList(String loginName) {
		UserExample example = new UserExample();
		example.createCriteria()
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andLoginAccountEqualTo(loginName);
		List<User> userList=userDao.selectByExample(example);
		
		List<CompanyDetailOutput> resultList=new ArrayList<>();
		if(userList.size()>0) {
			User user=userList.get(0);
			UserRoleExample urExample=new UserRoleExample();
			urExample.createCriteria().andUserIdEqualTo(user.getUserId());
			List<UserRole> urList=userRoleDao.selectByExample(urExample);
			if(urList.size()>0) {
				RoleYardExample ryExample=new RoleYardExample();
				ryExample.createCriteria().andRoleIdIn(urList.stream().map(a->a.getRoleId()).collect(Collectors.toList()));
				List<RoleYard> ryList=roleYardDao.selectByExample(ryExample);
				if(ryList.size()>0) {
					YardExample yardExample=new YardExample();
					yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andProdYardIdIn(ryList.stream().map(a->a.getYardId()).collect(Collectors.toList()));
					
					List<Yard> yardList=yardDao.selectByExample(yardExample);
					if(yardList.size()>0) {
						CompanyExample companyExample=new CompanyExample();
							companyExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
							.andKeyIn(yardList.stream().map(a->a.getCompany()).collect(Collectors.toList()));
						List<Company> companyList=companyDao.selectByExample(companyExample);
						for(Company company:companyList) {
							CompanyDetailOutput item=new CompanyDetailOutput();
							item.setCompanyKey(company.getKey());
							item.setCompanyName(company.getCompanyName());
							item.setCompanyNameEn(company.getCompanyNameEn());
							//所属场站
							item.setYardList(yardList.stream().filter(a->a.getCompany().equals(company.getKey()))
							.map(a->{
								YardDetailOutput yardOutput=new YardDetailOutput();
								yardOutput.setYardId(a.getProdYardId());
								yardOutput.setYardKey(a.getKey());
								yardOutput.setYardName(a.getYardName());
								yardOutput.setYardNameEn(a.getYardNameEn());
								return yardOutput;
							}).toArray(YardDetailOutput[]::new));
							resultList.add(item);
						}
					}
					
				}
			}
		}
		return resultList;
	}

	/**
	 * 用户修改密码
	 */
	@Override
	public void changePassword(ChangePasswordInput input) {
		if(StringUtils.isEmpty(input.getOldPassword()) || StringUtils.isEmpty(input.getNewPassword())) {
			throw new InvalidException("empty_password");
		}
		if(input.getOldPassword().equals(input.getNewPassword())) {
			throw new InvalidException("same_password");
		}
		User user=userDao.selectByPrimaryKey(input.getUserId());
		if(user==null) {
			throw new InvalidException("unknown_user");
		}
		if(user.getIsDel()==null) {
			throw new InvalidException("unknown_user");
		}
		if(!user.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			throw new InvalidException("unknown_user");
		}
		if(!user.getLoginPassword().equals(MD5Util.getMD5(input.getOldPassword()))) {
			throw new InvalidException("password_error");
		}
		user.setLoginPassword(MD5Util.getMD5(input.getNewPassword()));
		user.setUpdateTime(new Date());
		user.setUpdateUser(getCurrentUserId());
		userDao.updateByPrimaryKey(user);
	}
}

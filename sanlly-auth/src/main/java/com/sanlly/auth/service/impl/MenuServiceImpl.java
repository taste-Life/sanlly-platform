package com.sanlly.auth.service.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.auth.dao.AuthMapper;
import com.sanlly.auth.dao.MenuMapper;
import com.sanlly.auth.dao.RoleAuthMapper;
import com.sanlly.auth.entity.Auth;
import com.sanlly.auth.entity.AuthExample;
import com.sanlly.auth.entity.Menu;
import com.sanlly.auth.entity.MenuExample;
import com.sanlly.auth.entity.RoleAuthExample;
import com.sanlly.auth.models.input.auth.AddAuthInput;
import com.sanlly.auth.models.input.auth.EditAuthInput;
import com.sanlly.auth.models.input.menu.AddMenuInput;
import com.sanlly.auth.models.input.menu.EditMenuInput;
import com.sanlly.auth.models.input.menu.SearchMenuInput;
import com.sanlly.auth.service.MenuService;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.output.auth.AuthDetailOutput;
import com.sanlly.common.models.output.menu.MenuDetailOutput;
import com.sanlly.common.models.output.pagination.PagedList;

@Service
public class MenuServiceImpl extends BaseServiceImpl implements MenuService{
	
	@Autowired
	private MenuMapper menuDao;
	
	@Autowired
	private AuthMapper authDao;
	
	@Autowired
	private RoleAuthMapper roleAuthDao;

	@Override
	public PagedList<MenuDetailOutput> getMenuPagedList(SearchMenuInput input) {
		MenuExample example=new MenuExample();
		MenuExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if(StringUtils.isNotEmpty(input.getMenuName())) {
			criteria.andMenuNameLike("%"+input.getMenuName()+"%");
			MenuExample.Criteria criteria2=example.createCriteria();
			criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			criteria2.andMenuNameEnLike("%"+input.getMenuName()+"%");
			example.or(criteria2);
		}
		//总条数
		int totalItemCount=(int)menuDao.countByExample(example);
		PagedList<MenuDetailOutput> pagedList=new PagedList<MenuDetailOutput>(input.getPageIndex(),input.getPageSize(),totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause("create_time desc");
		List<Menu> menuList=menuDao.selectByExample(example);
		List<MenuDetailOutput> outputList=menuList.stream().map(menu->{
			MenuDetailOutput output=new MenuDetailOutput();
			output.setMenuId(menu.getMenuId());
			output.setMenuCode(menu.getMenuCode());
			output.setMenuName(menu.getMenuName());
			output.setMenuNameEn(menu.getMenuNameEn());
			output.setMenuIcon(menu.getMenuIcon());
			output.setMenuOrder(menu.getMenuOrder());
			output.setMenuParentId(menu.getMenuParent());
			MenuExample menuChildExample=new MenuExample();
			menuChildExample.createCriteria().andMenuParentEqualTo(menu.getMenuId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			output.setHasChildren(menuDao.countByExample(menuChildExample)>0);
			return output;
		}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;
	}

	@Override
	@Transactional
	public void addMenu(AddMenuInput input) {
		Menu menu=new Menu();
		menu.setMenuName(input.getMenuName());
		menu.setMenuNameEn(input.getMenuNameEn());
		menu.setMenuCode(input.getMenuCode());
		menu.setMenuIcon(input.getMenuIcon());
		menu.setMenuOrder(input.getMenuOrder()==null?99:input.getMenuOrder());
		menu.setMenuParent(input.getMenuParentId());
		menu.setIsDel(PlatformConstants.ISDEL_NO);
		menu.setCreateTime(new Date());
		menu.setCreateUser(getCurrentUserId());
		menuDao.insert(menu);
		if(input.getMenuParentId()!=null && !input.getMenuParentId().equals(0)) {
			AuthExample authExample=new AuthExample();
			authExample.createCriteria().andMenuIdEqualTo(input.getMenuParentId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<Auth> authList=authDao.selectByExample(authExample);
			if(authList.size()>0) {
				deleteAuth(authList.stream().map(a->a.getAuthId()).toArray(Integer[]::new));
			}
		}
		if(input.getList()!=null && input.getList().equals(1)) {
			AddAuthInput authInput=new AddAuthInput();
			authInput.setAuthCode(input.getMenuCode()+".list");
			authInput.setAuthName("列表");
			authInput.setMenuId(menu.getMenuId());
			addAuth(authInput);
		}
		if(input.getAdd()!=null && input.getAdd().equals(1)) {
			AddAuthInput authInput=new AddAuthInput();
			authInput.setAuthCode(input.getMenuCode()+".add");
			authInput.setAuthName("新增");
			authInput.setMenuId(menu.getMenuId());
			addAuth(authInput);
		}
		if(input.getEdit()!=null && input.getEdit().equals(1)) {
			AddAuthInput authInput=new AddAuthInput();
			authInput.setAuthCode(input.getMenuCode()+".edit");
			authInput.setAuthName("修改");
			authInput.setMenuId(menu.getMenuId());
			addAuth(authInput);
		}
		if(input.getDel()!=null && input.getDel().equals(1)) {
			AddAuthInput authInput=new AddAuthInput();
			authInput.setAuthCode(input.getMenuCode()+".delete");
			authInput.setAuthName("删除");
			authInput.setMenuId(menu.getMenuId());
			addAuth(authInput);
		}
	}

	@Override
	public void editMenu(EditMenuInput input) {
		Menu menu=menuDao.selectByPrimaryKey(input.getMenuId());
		menu.setMenuName(input.getMenuName());
		menu.setMenuNameEn(input.getMenuNameEn());
		menu.setMenuIcon(input.getMenuIcon());
		menu.setMenuOrder(input.getMenuOrder()==null?99:input.getMenuOrder());
		menu.setMenuParent(input.getMenuParentId());
		menu.setUpdateTime(new Date());
		menu.setUpdateUser(getCurrentUserId());
		menuDao.updateByPrimaryKey(menu);
	}

	@Override
	public MenuDetailOutput getMenu(Integer menuId) {
		Menu menu=menuDao.selectByPrimaryKey(menuId);
		if(menu.getIsDel()!=null && menu.getIsDel().equals(PlatformConstants.ISDEL_YES)) {
			throw new InvalidException("无效的请求");
		}
		MenuDetailOutput output=new MenuDetailOutput();
		output.setMenuId(menuId);
		output.setMenuCode(menu.getMenuCode());
		output.setMenuName(menu.getMenuName());
		output.setMenuNameEn(menu.getMenuNameEn());
		output.setMenuIcon(menu.getMenuIcon());
		output.setMenuOrder(menu.getMenuOrder());
		output.setMenuParentId(menu.getMenuParent());
		return output;
	}

	@Override
	@Transactional
	public void deleteMenu(Integer[] menuIds) {
		MenuExample example=new MenuExample();
		example.createCriteria().andMenuIdIn(Arrays.asList(menuIds));
		Menu record=new Menu();
		record.setIsDel(PlatformConstants.ISDEL_YES);
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		menuDao.updateByExampleSelective(record, example);
		//删除对应权限表
		AuthExample authExample=new AuthExample();
		authExample.createCriteria().andMenuIdIn(Arrays.asList(menuIds));
		List<Auth> deleteAuthList=authDao.selectByExample(authExample);
		Auth auth=new Auth();
		auth.setIsDel(PlatformConstants.ISDEL_YES);
		auth.setUpdateTime(new Date());
		auth.setUpdateUser(getCurrentUserId());
		authDao.updateByExampleSelective(auth, authExample);
		//删除权限角色关系
		if(deleteAuthList.size()>0) {
			List<Integer> deleteAuthIdList=deleteAuthList.stream()
					.map(a->a.getAuthId()).collect(Collectors.toList());
			RoleAuthExample roleAuthExample=new RoleAuthExample();
			roleAuthExample.createCriteria().andAuthIdIn(deleteAuthIdList);
			roleAuthDao.deleteByExample(roleAuthExample);
		}
		
	}

	@Override
	public List<MenuDetailOutput> getMenuList(SearchMenuInput input) {
		MenuExample example=new MenuExample();
		MenuExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if(StringUtils.isNotEmpty(input.getMenuName())) {
			criteria.andMenuNameLike("%"+input.getMenuName()+"%");
			MenuExample.Criteria criteria2=example.createCriteria();
			criteria2.andMenuNameEnLike("%"+input.getMenuName()+"%");
			example.or(criteria2);
		}
		List<Menu> menuList=menuDao.selectByExample(example);
		List<MenuDetailOutput> outputList=menuList.stream().map(menu->{
			MenuDetailOutput output=new MenuDetailOutput();
			output.setMenuId(menu.getMenuId());
			output.setMenuCode(menu.getMenuCode());
			output.setMenuName(menu.getMenuName());
			output.setMenuNameEn(menu.getMenuNameEn());
			output.setMenuIcon(menu.getMenuIcon());
			output.setMenuOrder(menu.getMenuOrder());
			output.setMenuParentId(menu.getMenuParent());
			//判断是否包含有子级菜单
			MenuExample menuChildExample=new MenuExample();
			menuChildExample.createCriteria().andMenuParentEqualTo(menu.getMenuId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			output.setHasChildren(menuDao.countByExample(menuChildExample)>0);
			return output;
		}).collect(Collectors.toList());
		return outputList;
	}

	/**
	 * 获取权限列表
	 */
	@Override
	public List<AuthDetailOutput> getAuthList(Integer menuId) {
		//构造查询条件
		AuthExample example=new AuthExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andMenuIdEqualTo(menuId);
		return authDao.selectByExample(example).stream().map(auth->{
			AuthDetailOutput output=new AuthDetailOutput();
			output.setAuthId(auth.getAuthId());
			output.setAuthCode(auth.getAuthCode());
			output.setAuthName(auth.getAuthName());
			output.setMenuId(auth.getMenuId());
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * 新增权限
	 */
	@Override
	public void addAuth(AddAuthInput input) {
		Auth auth=new Auth();
		auth.setAuthCode(input.getAuthCode());
		auth.setAuthName(input.getAuthName());
		auth.setMenuId(input.getMenuId());
		auth.setIsDel(PlatformConstants.ISDEL_NO);
		auth.setCreateTime(new Date());
		auth.setCreateUser(getCurrentUserId());
		authDao.insert(auth);
	}

	/**
	 * 修改权限
	 */
	@Override
	public void updateAuth(EditAuthInput input) {
		Auth auth=authDao.selectByPrimaryKey(input.getAuthId());
		if(auth.getIsDel()!=null && auth.getIsDel().equals(PlatformConstants.ISDEL_YES)) {
			throw new InvalidException();
		}
		auth.setAuthCode(input.getAuthCode());
		auth.setAuthName(input.getAuthName());
		auth.setUpdateTime(new Date());
		auth.setUpdateUser(getCurrentUserId());
		authDao.updateByPrimaryKey(auth);
	}

	/**
	 * 删除权限
	 */
	@Override
	@Transactional
	public void deleteAuth(Integer[] authIds) {
		Auth auth=new Auth();
		auth.setIsDel(PlatformConstants.ISDEL_YES);
		AuthExample example=new AuthExample();
		example.createCriteria().andAuthIdIn(Arrays.asList(authIds));
		//删除权限
		authDao.updateByExampleSelective(auth, example);
		//删除角色权限对应关系
		RoleAuthExample raExample=new RoleAuthExample();
		raExample.createCriteria().andAuthIdIn(Arrays.asList(authIds));
		roleAuthDao.deleteByExample(raExample);
	}

	/**
	 * 获取权限
	 */
	@Override
	public AuthDetailOutput getAuth(Integer authId) {
		Auth auth=authDao.selectByPrimaryKey(authId);
		AuthDetailOutput output=new AuthDetailOutput();
		output.setAuthId(auth.getAuthId());
		output.setAuthCode(auth.getAuthCode());
		output.setAuthName(auth.getAuthName());
		output.setMenuId(auth.getMenuId());
		return output;
	}

}

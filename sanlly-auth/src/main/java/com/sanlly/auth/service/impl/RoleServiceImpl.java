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
import com.sanlly.auth.entity.Yard;
import com.sanlly.auth.entity.YardExample;
import com.sanlly.auth.models.input.role.AddRoleInput;
import com.sanlly.auth.models.input.role.EditRoleInput;
import com.sanlly.auth.models.input.role.SearchRoleInput;
import com.sanlly.auth.models.output.role.CompanyOutput;
import com.sanlly.auth.models.output.role.RoleAuthOutput;
import com.sanlly.auth.models.output.role.RoleDetailOutput;
import com.sanlly.auth.models.output.role.RoleYardOutput;
import com.sanlly.auth.models.output.role.YardOutput;
import com.sanlly.auth.service.RoleService;
import com.sanlly.auth.service.feign.WorkflowFeignClient;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.activiti.ActGroupInput;
import com.sanlly.common.models.input.activiti.ActUserAndGroupInput;
import com.sanlly.common.models.output.auth.AuthDetailOutput;
import com.sanlly.common.models.output.menu.MenuDetailOutput;
import com.sanlly.common.models.output.pagination.PagedList;

/**
 * 角色接口实现
 * @author 生旭鹏
 *
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl implements RoleService{

	/**
	 * 角色数据库接口
	 */
	@Autowired
	private RoleMapper roleDao;
	
	@Autowired
	private RoleAuthMapper roleAuthDao;
	
	@Autowired
	private RoleYardMapper roleYardDao;
	
	@Autowired
	private AuthMapper authDao;
	
	@Autowired
	private CompanyMapper companyDao;
	
	@Autowired
	private YardMapper yardDao;
	
	@Autowired
	private MenuMapper menuDao;
	
	/**
	 * 流程用户同步接口
	 */
	@Autowired
	private WorkflowFeignClient workflowFeignClient;
	
	/**
	 * 分页查询角色
	 */
	@Override
	public PagedList<RoleDetailOutput> getRolePagedList(SearchRoleInput input) {
		RoleExample example=new RoleExample();
		RoleExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		//查询条件
		if(StringUtils.isNotEmpty(input.getRoleName())){
			criteria.andRoleNameLike("%"+input.getRoleName()+"%");
		}
		if(input.getRoleType()!=null) {
			criteria.andRoleTypeEqualTo(input.getRoleType());
		}
		//总条数
		Integer totalItemCount=(int)roleDao.countByExample(example);
		PagedList<RoleDetailOutput> pagedList=new PagedList<RoleDetailOutput>(input.getPageIndex(),input.getPageSize(),totalItemCount);
		//分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause("create_time desc");
		List<Role> roleList=roleDao.selectByExample(example);
		//构造返回数据
		List<RoleDetailOutput> dataList=new ArrayList<RoleDetailOutput>();
		for(Role role:roleList){
			RoleDetailOutput output=new RoleDetailOutput();
			output.setRoleId(role.getRoleId());
			output.setRoleName(role.getRoleName());
			output.setRoleType(role.getRoleType());
			output.setRemark(role.getRemark());
			dataList.add(output);
		}
		//将分页数据放入结果中
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}

	/**
	 * 新增角色
	 */
	@Override
	@Transactional
	public void addRole(AddRoleInput input) {
		Role role=new Role();
		role.setRoleName(input.getRoleName());
		role.setRemark(input.getRemark());
		role.setRoleType(input.getRoleType());
		role.setIsDel(PlatformConstants.ISDEL_NO);
		role.setCreateTime(new Date());
		role.setCreateUser(getCurrentUserId());
		roleDao.insert(role);
		
		/*****流程相关 start*****/
		ActGroupInput param=new ActGroupInput();
		param.setGroupId(role.getRoleId());
		param.setGroupName(role.getRoleName());
		workflowFeignClient.groupAddFromWF(param);
		/*****流程相关 end*****/
		//throw new UnAuthorizationException("请求异常");
	}

	/**
	 * 获取角色信息
	 */
	@Override
	public RoleDetailOutput getRole(EditRoleInput input) {
		Role role=roleDao.selectByPrimaryKey(input.getRoleId());
		RoleDetailOutput output=new RoleDetailOutput();
		output.setRoleId(role.getRoleId());
		output.setRoleName(role.getRoleName());
		output.setRemark(role.getRemark());
		return output;
	}

	/**
	 * 修改角色
	 */
	@Override
	@Transactional
	public void updateRole(EditRoleInput input) {
		Role role=roleDao.selectByPrimaryKey(input.getRoleId());
		role.setRoleName(input.getRoleName());
		role.setRemark(input.getRemark());
		role.setUpdateTime(new Date());
		role.setUpdateUser(getCurrentUserId());
		roleDao.updateByPrimaryKey(role);
		
		/*****流程相关 start*****/
		ActGroupInput param=new ActGroupInput();
		param.setGroupId(role.getRoleId());
		param.setGroupName(role.getRoleName());
		workflowFeignClient.groupUpdateFromWF(param);
		/*****流程相关 end*****/
	}

	/**
	 * 删除角色
	 */
	@Override
	@Transactional
	public void deleteRole(Integer[] roleIds) {
		RoleExample example=new RoleExample();
		example.createCriteria().andRoleIdIn(Arrays.asList(roleIds));
		Role role=new Role();
		role.setIsDel(PlatformConstants.ISDEL_YES);
		role.setUpdateTime(new Date());
		role.setUpdateUser(getCurrentUserId());
		roleDao.updateByExampleSelective(role, example);
		
		/*****流程相关 start*****/
		ActUserAndGroupInput input=new ActUserAndGroupInput();
		
		List<ActGroupInput> list=new ArrayList<ActGroupInput>();
		
		RoleExample exampleRoles=new RoleExample();
		exampleRoles.createCriteria().andRoleIdIn(Arrays.asList(roleIds));
		
		List<Role> roleList=roleDao.selectByExample(exampleRoles);
		for (int i = 0; i < roleList.size(); i++) {
			ActGroupInput param=new ActGroupInput();
			param.setGroupId(roleList.get(i).getRoleId());
			param.setGroupName(roleList.get(i).getRoleName());
			list.add(param);
		}
		input.setGroupList(list);
		
		workflowFeignClient.groupDeleteFromWF(input);
		/*****流程相关 end*****/
	}

	@Override
	@Transactional
	public void updateAuth(Integer roleId, Integer[] authIds) {
		RoleAuthExample example=new RoleAuthExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		roleAuthDao.deleteByExample(example);
		if(authIds!=null) {
			for(Integer authId:authIds) {
				RoleAuth record=new RoleAuth();
				record.setAuthId(authId);
				record.setRoleId(roleId);
				roleAuthDao.insert(record);
			}
		}
	}
	
	/**
	 * 修改角色拥有的场站
	 */
	@Override
	@Transactional
	public void updateYardAuth(Integer roleId, Integer[] yardIds) {
		RoleYardExample example=new RoleYardExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		roleYardDao.deleteByExample(example);
		if(yardIds!=null) {
			for(Integer yardId:yardIds) {
				RoleYard record=new RoleYard();
				record.setYardId(yardId);
				record.setRoleId(roleId);
				roleYardDao.insert(record);
			}
		}
	}

	/**
	 * 根据角色获取权限
	 */
	@Override
	public RoleAuthOutput getAuthByRole(Integer roleId) {
		//查询权限设置
		RoleAuthExample example=new RoleAuthExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		List<RoleAuth> roleAuthList=roleAuthDao.selectByExample(example);
		RoleAuthOutput output=new RoleAuthOutput();
		output.setRoleId(roleId);
		output.setAuthIds(roleAuthList.stream().map(a->a.getAuthId()).toArray(Integer[]::new));
		//查询所有权限
		AuthExample authExample=new AuthExample();
		authExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Auth> authList=authDao.selectByExample(authExample);
		//查询所有菜单
		MenuExample menuExample=new MenuExample();
		menuExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Menu> menuList=menuDao.selectByExample(menuExample);
		//菜单组装
		List<MenuDetailOutput> menuOutputList=menuList.stream()
				.map(record->{
					MenuDetailOutput menuOutput=new MenuDetailOutput();
					menuOutput.setMenuId(record.getMenuId());
					menuOutput.setMenuName(record.getMenuName());
					menuOutput.setMenuParentId(record.getMenuParent());
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
		List<MenuDetailOutput> newMenuOutputList=reOrderMenu(menuOutputList,0);
		output.setMenuList(newMenuOutputList);
		return output;
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
	 * 根据角色获取场站权限
	 */
	@Override
	public RoleYardOutput getYardAuthByRole(Integer roleId) {
		RoleYardOutput output=new RoleYardOutput();
		output.setRoleId(roleId);
		//公司查询
		CompanyExample companyExample=new CompanyExample();
		companyExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Company> companyList=companyDao.selectByExample(companyExample);
		//场站查询
		YardExample yardExample=new YardExample();
		yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Yard> yardList=yardDao.selectByExample(yardExample);
		//数据组装
		List<CompanyOutput> companyOutputList=new ArrayList<>();
		for(Company company:companyList) {
			CompanyOutput companyOutput=new CompanyOutput();
			companyOutput.setCompanyId(company.getProdCompanyId());
			companyOutput.setCompanyName(company.getCompanyName());
			companyOutput.setIsHead(company.getIsHead()!=null && company.getIsHead().equals(1));
			List<YardOutput> yardOutputList=yardList.stream()
				.filter(m->m.getCompany().equals(company.getKey()))
				.map(record->{
					YardOutput yardDetail=new YardOutput();
					yardDetail.setYardId(record.getProdYardId());
					yardDetail.setYardName(record.getYardName());
					yardDetail.setCompanyId(company.getProdCompanyId());
					return yardDetail;
				}).collect(Collectors.toList());
			companyOutput.setYardList(yardOutputList);
			companyOutputList.add(companyOutput);
		}
		output.setCompanyList(companyOutputList);
		//查询场站设置
		RoleYardExample roleYardExample=new RoleYardExample();
		roleYardExample.createCriteria().andRoleIdEqualTo(roleId);
		List<RoleYard> roleYardList=roleYardDao.selectByExample(roleYardExample);
		if(roleYardList.size()>0) {
			if(roleYardList.get(0).getYardId().equals(0)) {
				output.setCurrentCompanyId(0);
			}
			else {
				Yard yard=yardDao.selectByPrimaryKey(roleYardList.get(0).getYardId());
				if(yard!=null) {
					CompanyExample companyExample2=new CompanyExample();
					companyExample2.createCriteria().andKeyEqualTo(yard.getCompany());
					List<Company> comp=companyDao.selectByExample(companyExample2);
					if(comp.size()>0) {
						output.setCurrentCompanyId(comp.get(0).getProdCompanyId());
					}
				}
				
			}
			
		}
		output.setYardIds(roleYardList.stream().map(a->a.getYardId()).toArray(Integer[]::new));
		return output;
	}

	

}

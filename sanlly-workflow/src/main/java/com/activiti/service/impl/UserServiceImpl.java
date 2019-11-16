package com.activiti.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.activiti.engine.identity.UserQuery;
import org.springframework.stereotype.Service;

import com.activiti.service.UserService;
import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.input.activiti.ActGroupInput;
import com.sanlly.common.models.input.activiti.ActUserAndGroupInput;
import com.sanlly.common.models.input.activiti.ActUserInput;
import com.sanlly.common.models.input.user.AddUserInput;

/**
 * @version: v1.0
 * @Description: 用户Service实现类
 * @author: wupzh
 * @date: 2019年6月20日
 * @update fjy
 */
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private IdentityService identityService;

	@Override
	public Map getById(JSONObject param) {
		Map<String, Object> map = new HashMap<>();
		User user = identityService.createUserQuery().userId(param.getString("id")).singleResult();
		map.put("id", user.getId());
		map.put("firstName", user.getFirstName());
		map.put("lastName", user.getLastName());
		map.put("email", user.getEmail());
		map.put("password", user.getEmail());
		return map;
	}

	@Override
	public List search(JSONObject param) {
		// TODO 查询条件，多个查询条件并集问题
		List<Map<String, Object>> list = new ArrayList<>();
		UserQuery userQuery = identityService.createUserQuery();
		if (param.get("name") != null) {
			userQuery = userQuery.userFullNameLike("name");
		}
		List<User> userList = userQuery.list();
		if (userList != null && userList.size() > 0) {
			for (User user : userList) {
				Map<String, Object> map = new HashMap<>();
				map.put("id", user.getId());
				map.put("firstName", user.getFirstName());
				map.put("lastName", user.getLastName());
				map.put("email", user.getEmail());
				map.put("password", user.getEmail());
				list.add(map);
			}
		}
		return list;
	}

	@Override
	public void add(JSONObject param) {
		User user = identityService.newUser(param.getString("id"));
		user.setFirstName(param.getString("firstName"));
		user.setLastName(param.getString("lastName"));
		user.setEmail(param.getString("email"));
		user.setPassword(param.getString("password"));
		identityService.saveUser(user);
	}

	@Override
	public void update(JSONObject param) {
		User user = identityService.createUserQuery().userId(param.get("id").toString()).singleResult();
		user.setFirstName(param.getString("firstName"));
		user.setLastName(param.getString("lastName"));
		user.setEmail(param.getString("email"));
		user.setPassword(param.getString("password"));
		identityService.saveUser(user);
	}

	@Override
	public void delete(JSONObject param) {
		identityService.deleteUser(param.getString("id"));
	}

	/**
	 * 添加Activiti Identify的用户于组关系
	 * 
	 * @param roleIds 角色ID集合
	 * @param userId  用户ID
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void addMembershipToIdentify(ActUserAndGroupInput param) {
		String account = param.getUserInfo()==null ? "" :param.getUserInfo().getAccount();
		for (ActGroupInput role : param.getGroupList()) {
			identityService.createMembership(account, role.getGroupId().toString());
		}
	}

	@Override
	public void updateMembershipToIdentify(ActUserAndGroupInput param) {
//		Integer userId = param.getUserInfo().getId();
		
		String account = param.getUserInfo()==null ? "" :param.getUserInfo().getAccount();
		// 删除用户的membership
		List<Group> activitiGroups = identityService.createGroupQuery().groupMember(account).list();
		for (Group group : activitiGroups) {
			identityService.deleteMembership(account, group.getId());
		}
		// 添加membership
		addMembershipToIdentify(param);

	}
	/**
	 * 删除activiti 用户和组的关系
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void deleteMembershipToIdentify(ActUserAndGroupInput param) {
		String account = param.getUserInfo()==null ? "" :param.getUserInfo().getAccount();
 
		if(param.getUserInfo() ==null || account==null || account.equals("")) {
			 
			for (int i = 0; i < param.getUserList().size(); i++) {
				String uid=param.getUserList().get(i).getAccount().toString();
				// 删除用户的membership
				List<Group> activitiGroups = identityService.createGroupQuery().groupMember(uid).list();
				for (Group group : activitiGroups) {
					identityService.deleteMembership(uid, group.getId());
				}
			}
		}else {
			// 同步删除Activiti User
			// 删除用户的membership
			List<Group> activitiGroups = identityService.createGroupQuery().groupMember(account).list();
			for (Group group : activitiGroups) {
				identityService.deleteMembership(account, group.getId());
			}
		}
	}

	@Override
	public void delete(ActUserAndGroupInput param) {
//		Integer userId = param.getUserInfo().getId();
		String account = param.getUserInfo()==null ? "" :param.getUserInfo().getAccount();
		 
		if(param.getUserInfo()==null || account==null || account.equals("")) {
			 
			for (int i = 0; i < param.getUserList().size(); i++) {
				account=param.getUserList().get(i).getAccount().toString();
				identityService.deleteUser(account);
			}
		}else {
			identityService.deleteUser(account);
		}
		
	}

	@Override
	public void add(ActUserInput param) {
		// TODO Auto-generated method stub
		User user = identityService.newUser(param.getAccount());
		user.setFirstName(param.getName());
		user.setLastName("");
		user.setEmail(param.getEmail());
//		user.setPassword(param.getString("password"));
		identityService.saveUser(user);
	}

	@Override
	public void update(ActUserInput param) {
		// TODO Auto-generated method stub
		User user = identityService.createUserQuery().userId(param.getAccount()).singleResult();
		user.setFirstName(param.getName());
//		user.setLastName("");
		user.setEmail(param.getEmail());
		identityService.saveUser(user);
	}
}

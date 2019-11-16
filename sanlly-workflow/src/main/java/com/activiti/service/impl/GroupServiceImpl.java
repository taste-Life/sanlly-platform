package com.activiti.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.GroupQuery;
import org.springframework.stereotype.Service;

import com.activiti.service.GroupService;
import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.input.activiti.ActGroupInput;
import com.sanlly.common.models.input.activiti.ActUserAndGroupInput;

/**
 * @version: v1.0
 * @Description: 用户组Service实现类
 * @author: wupzh
 * @date: 2019年6月20日
 */
@Service
public class GroupServiceImpl implements GroupService {
	@Resource
	private IdentityService identityService;

	@Override
	public Map getById(JSONObject param) {
		Map<String, Object> map = new HashMap<>();
		Group group = identityService.createGroupQuery().groupId(param.getString("id")).singleResult();
		map.put("id", group.getId());
		map.put("name", group.getName());
		map.put("type", group.getType());
		return map;
	}

	@Override
	public List search(JSONObject param) {
		// TODO 查询条件，多个查询条件并集问题
		List<Map<String, Object>> list = new ArrayList<>();
		GroupQuery groupQuery = identityService.createGroupQuery();
		if (param.get("name") != null) {
			groupQuery = groupQuery.groupNameLike(param.getString("name"));
		}
		List<Group> groupList = groupQuery.list();
		if (groupList != null && groupList.size() > 0) {
			for (Group group : groupList) {
				Map<String, Object> map = new HashMap<>();
				map.put("id", group.getId());
				map.put("name", group.getName());
				map.put("type", group.getType());
				list.add(map);
			}
		}
		return list;
	}

	@Override
	public void add(JSONObject param) {
		Group group = identityService.newGroup(param.getString("id"));
		if (group == null) {
			group = identityService.newGroup(param.getString("id"));
			group.setName(param.getString("name"));
			identityService.saveGroup(group);
		}

	}

	@Override
	public void add(ActGroupInput param) {
		Group group = identityService.newGroup(param.getGroupId().toString());
//        if(group==null) {
//        	group = identityService.newGroup(param.getGroupId().toString());
		group.setName(param.getGroupName());
		identityService.saveGroup(group);
//        }

	}

	@Override
	public void update(ActGroupInput param) {
		Group group = identityService.createGroupQuery().groupId(param.getGroupId().toString()).singleResult();
		if (group == null) {
			group = identityService.newGroup(param.getGroupId().toString());
			group.setName(param.getGroupName());
			identityService.saveGroup(group);
		} else {
			group.setName(param.getGroupName());
			identityService.saveGroup(group);
		}
	}

	/**
	 * 批量删除用户组
	 */
	@Override
	public void delete(ActUserAndGroupInput param) {

		for (int i = 0; i < param.getGroupList().size(); i++) {
			String gid = param.getGroupList().get(i).getGroupId().toString();
			identityService.deleteGroup(gid);
		}
	}
}

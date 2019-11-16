package com.sanlly.common.models.input.activiti;

import java.util.ArrayList;
import java.util.List;

public class ActUserAndGroupInput {

	private ActUserInput userInfo;

	private List<ActGroupInput> groupList = new ArrayList<ActGroupInput>();

	private List<ActUserInput> userList = new ArrayList<ActUserInput>();

	public ActUserInput getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(ActUserInput userInfo) {
		this.userInfo = userInfo;
	}

	public List<ActGroupInput> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<ActGroupInput> groupList) {
		this.groupList = groupList;
	}

	public List<ActUserInput> getUserList() {
		return userList;
	}

	public void setUserList(List<ActUserInput> userList) {
		this.userList = userList;
	}
	
	

}

package com.activiti.entity;

import java.io.Serializable;

public class SubmitModel implements Serializable {
	public String userId;
	public String userName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}

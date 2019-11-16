package com.sanlly.common.models.input.activiti;

import java.util.ArrayList;
import java.util.List;

public class ActUserInput {
	
	private Integer id;
	private String account;
	private String name;
	private String email;
	
	//每个用户所属的所有角色
	private List<ActGroupInput> list=new ArrayList<ActGroupInput>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<ActGroupInput> getList() {
		return list;
	}

	public void setList(List<ActGroupInput> list) {
		this.list = list;
	}
	
 

	
}

package com.activiti.models.input;

import com.sanlly.common.models.input.PageInput;

public class SearchModelInput extends PageInput {

	/**
	 * 流程分类
	 */
	private String category;
	/**
	 * 模型名称
	 */
	private String name;
	
	//用户账号
	private String loginAccount;
	//启动流程id
	private String processInstanceId;


	public SearchModelInput(){
		 
	}
	
	public SearchModelInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}
	
	
}

package com.sanlly.production.models.input.message;

import com.sanlly.common.models.input.PageInput;

/**
 * 消息规则列表查询参数实体
 * @author wangxzh
 *
 */
public class SearchMessageInput extends PageInput{
	//规则名称
	private String ruleName;
	//用箱人
	private String containerUser;
	
	public SearchMessageInput(){
		 
	}
	
	public SearchMessageInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}
	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

}

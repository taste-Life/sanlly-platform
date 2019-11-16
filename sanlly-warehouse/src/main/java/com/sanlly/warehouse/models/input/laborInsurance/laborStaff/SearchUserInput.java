package com.sanlly.warehouse.models.input.laborInsurance.laborStaff;

import com.sanlly.common.models.input.PageInput;

/**
 * 用户搜索
 * @author zhh
 * 2019年8月22日 上午9:42:36
 */
public class SearchUserInput extends PageInput{

	public SearchUserInput(){
		 
	}
	
	public SearchUserInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}
	
	//公司
	private Integer company;
	
	private String userName;
	

	public Integer getCompany() {
		return company;
	}

	public void setCompany(Integer company) {
		this.company = company;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}

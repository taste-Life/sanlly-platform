package com.sanlly.production.models.input.edi;

import com.sanlly.common.models.input.PageInput;

/**
 * 自动报价搜索条件
 * @author RexSheng
 * 2019年10月22日 下午1:51:30
 */
public class AutoSendSearchInput extends PageInput{

	private String company;

	private String containerUser;
	
	private String containerCategory;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}
	
	
	
	
	
}

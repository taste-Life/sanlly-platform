package com.sanlly.production.models.input.edi;

import com.sanlly.common.models.input.PageInput;

/**
 * 自动进入EDI池，搜索条件
 * @author RexSheng
 * 2019年10月22日 下午3:35:33
 */
public class AutoIntoPoolSearchInput extends PageInput{

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

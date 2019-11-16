package com.sanlly.production.models.input.edi;

import com.sanlly.common.models.input.PageInput;

/**
 * 公司-用箱人配置EDi信息搜索条件
 * @author RexSheng
 * 2019年10月23日 下午6:58:08
 */
public class CompanyContainerUserSearchInput extends PageInput{

	private String company;
	
	private String containerUser;

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
	
	
}

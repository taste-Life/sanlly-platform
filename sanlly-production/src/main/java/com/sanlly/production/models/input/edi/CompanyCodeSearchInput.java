package com.sanlly.production.models.input.edi;

import com.sanlly.common.models.input.PageInput;

/**
 * 公司与代码对应关系搜索条件
 * @author RexSheng
 * 2019年10月25日 上午11:25:03
 */
public class CompanyCodeSearchInput extends PageInput {

	private String company;
	
	private String yard;
	
	private String containerUser;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}
	
		
}

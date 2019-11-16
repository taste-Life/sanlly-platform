package com.sanlly.production.models.input.rate;

import com.sanlly.common.models.input.PageInput;

/**
 * 工时费率列表查询参数实体
 * @author wangxzh
 *
 */
public class SearchMHRateInput extends PageInput {

	private String company;

	private String containerUser;

	public SearchMHRateInput() {

	}

	public SearchMHRateInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
	}

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

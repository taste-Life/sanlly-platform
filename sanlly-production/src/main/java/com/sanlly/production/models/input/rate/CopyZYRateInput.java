package com.sanlly.production.models.input.rate;

/**
 * 中远费率复制参数接收实体
 * @author wangxzh
 *
 */
public class CopyZYRateInput {

	private String oldCompany;

	private String newCompany;

	private String containerCategory;

	public String getOldCompany() {
		return oldCompany;
	}

	public void setOldCompany(String oldCompany) {
		this.oldCompany = oldCompany;
	}

	public String getNewCompany() {
		return newCompany;
	}

	public void setNewCompany(String newCompany) {
		this.newCompany = newCompany;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

}

package com.sanlly.production.models.input.rate;

import com.sanlly.common.models.input.PageInput;

/**
 * 中远列表查询参数实体
 * @author wangxzh
 *
 */
public class SearchZYRateInput extends PageInput {

	private String company;

	private String containerCategory;

	private String rateCode;

	private String partsDetails;

	private String repair;

	public SearchZYRateInput() {

	}

	public SearchZYRateInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getRateCode() {
		return rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public String getPartsDetails() {
		return partsDetails;
	}

	public void setPartsDetails(String partsDetails) {
		this.partsDetails = partsDetails;
	}

	public String getRepair() {
		return repair;
	}

	public void setRepair(String repair) {
		this.repair = repair;
	}

}

package com.sanlly.production.models.input.rate;

/**
 * 标准费率列表查询参数实体
 * 
 * @author wangxzh
 *
 */
public class SearchRateInput {
	// 部件大类
	private String partsType;
	// 部件明细
	private String partsDetails;
	// 维修代码
	private String repair;
	// 箱类别
	private String containerCategory;

	public String getPartsType() {
		return partsType;
	}

	public void setPartsType(String partsType) {
		this.partsType = partsType;
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

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

}

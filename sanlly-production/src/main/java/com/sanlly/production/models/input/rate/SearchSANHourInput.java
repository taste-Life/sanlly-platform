package com.sanlly.production.models.input.rate;

import com.sanlly.common.models.input.PageInput;

/**
 * 派工工时列表查询参数实体
 * @author wangxzh
 *
 */
public class SearchSANHourInput extends PageInput {

	private String containerCategory;

	private String partsType;

	private String partsDetails;

	private String repair;

	private String materialCode;

	public SearchSANHourInput() {

	}

	public SearchSANHourInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

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

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

}

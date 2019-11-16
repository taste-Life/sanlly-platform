package com.sanlly.production.models.input.rate;

import com.sanlly.common.models.input.PageInput;

/**
 * 成本费率列表查询参数实体
 * 
 * @author wangxzh
 *
 */
public class SearchCostRateInput extends PageInput {
	// 箱类别
	private String containerCategory;
	// 部件大类
	private String partsType;
	// 部件明细
	private String partsDetails;
	// 修理代码
	private String repair;
	// 材质代码
	private String materialCode;
	// 分页开始数
	private Integer beginNumber;
	// 分页结束数
	private Integer endNumber;

	public SearchCostRateInput() {

	}

	public SearchCostRateInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
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

	public Integer getBeginNumber() {
		return beginNumber;
	}

	public void setBeginNumber(Integer beginNumber) {
		this.beginNumber = beginNumber;
	}

	public Integer getEndNumber() {
		return endNumber;
	}

	public void setEndNumber(Integer endNumber) {
		this.endNumber = endNumber;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

}

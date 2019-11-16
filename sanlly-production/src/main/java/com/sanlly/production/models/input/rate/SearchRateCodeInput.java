package com.sanlly.production.models.input.rate;

import com.sanlly.common.models.input.PageInput;

/**
 * 代码对应列表查询参数接收实体
 * 
 * @Package com.sanlly.production.models.input.rate 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月27日 上午11:16:10 
 * @version V1.0   
 */
public class SearchRateCodeInput extends PageInput {
	// 箱类别
	private String containerCategory;
	// 部件明细
	private String partsDetails;
	// 维修代码
	private String repair;

	public SearchRateCodeInput() {

	}

	public SearchRateCodeInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
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

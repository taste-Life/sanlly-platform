package com.sanlly.production.models.input.containerTesting;

import com.sanlly.common.models.input.PageInput;

/**
 * 限制条件列表查询参数
 * 
 * @Package com.sanlly.production.models.input.containerTesting 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月2日 上午10:34:07 
 * @version V1.0   
 */
public class SearchAuditRateInput extends PageInput {
	// 箱类别
	private String containerCategory;
	// 部件明细
	private String partsDetails;
	// 维修代码
	private String repair;

	public SearchAuditRateInput() {

	}

	public SearchAuditRateInput(Integer pageIndex, Integer pageSize) {
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

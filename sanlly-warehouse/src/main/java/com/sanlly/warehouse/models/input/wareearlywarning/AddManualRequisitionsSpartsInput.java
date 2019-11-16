package com.sanlly.warehouse.models.input.wareearlywarning;

import java.util.Date;

/**
 * 
 * Description: 手动添加采购需求
 * 
 * @ClassName: AddManualPurchaseRequisitionsInput
 * @date 2019年7月25日
 *
 * @author jlx
 */
public class AddManualRequisitionsSpartsInput {

	// 备件key
	private String spareParts;
	// 申请数量
	private Double applyNum;
	// 备注
	private String remark;

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}


	public Double getApplyNum() {
		return applyNum;
	}

	public void setApplyNum(Double applyNum) {
		this.applyNum = applyNum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}

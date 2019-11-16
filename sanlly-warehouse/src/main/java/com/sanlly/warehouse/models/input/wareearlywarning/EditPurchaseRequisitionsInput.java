package com.sanlly.warehouse.models.input.wareearlywarning;

/**
 * 
* Description: 编辑采购需求
* @ClassName: EditPurchaseRequisitionsInput
* @date 2019年7月25日
*
* @author jlx
 */
public class EditPurchaseRequisitionsInput {
	// id
	private Integer warePurchaseRequisitionsId;
	// 备件key
	private String spareParts;
	// 仓库key
	private String warehouse;
	// 申请数量
	private Double applyNum;
	// 要求到货日期
	private String requireArriveTime;
	// 备注
	private String remark;

	public Integer getWarePurchaseRequisitionsId() {
		return warePurchaseRequisitionsId;
	}

	public void setWarePurchaseRequisitionsId(Integer warePurchaseRequisitionsId) {
		this.warePurchaseRequisitionsId = warePurchaseRequisitionsId;
	}

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}

	

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public Double getApplyNum() {
		return applyNum;
	}

	public void setApplyNum(Double applyNum) {
		this.applyNum = applyNum;
	}

	public String getRequireArriveTime() {
		return requireArriveTime;
	}

	public void setRequireArriveTime(String requireArriveTime) {
		this.requireArriveTime = requireArriveTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}

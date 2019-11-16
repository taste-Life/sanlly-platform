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
public class AddManualPurchaseRequisitionsInput {

	// 备件key
	private String spareParts;
	// 仓库key
	private String warehouse;
	// 申请数量
	private Double applyNum;
	// 要求到货日期
	private Date requireArriveTime;
	// 采购模式
	private String purchasingPattern;
	// 备注
	private String remark;

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

	public Date getRequireArriveTime() {
		return requireArriveTime;
	}

	public void setRequireArriveTime(Date requireArriveTime) {
		this.requireArriveTime = requireArriveTime;
	}

	

	public String getPurchasingPattern() {
		return purchasingPattern;
	}

	public void setPurchasingPattern(String purchasingPattern) {
		this.purchasingPattern = purchasingPattern;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

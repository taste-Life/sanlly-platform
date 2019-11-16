package com.sanlly.purchase.models.input.demand;

import com.fasterxml.jackson.annotation.JsonFormat;

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
public class AddManualRequisitionsWareInput {

	// 仓库key
	private String warehouse;
	// 要求到货日期
	@JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
	private Date requireArriveTime;
	private AddManualRequisitionsSpartsInput[] stockinDetail;
	// 备注
	private String remark;

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public Date getRequireArriveTime() {
		return requireArriveTime;
	}

	public void setRequireArriveTime(Date requireArriveTime) {
		this.requireArriveTime = requireArriveTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public AddManualRequisitionsSpartsInput[] getStockinDetail() {
		return stockinDetail;
	}

	public void setStockinDetail(AddManualRequisitionsSpartsInput[] stockinDetail) {
		this.stockinDetail = stockinDetail;
	}

}

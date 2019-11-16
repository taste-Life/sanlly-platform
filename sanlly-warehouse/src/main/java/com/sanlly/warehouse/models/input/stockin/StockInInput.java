package com.sanlly.warehouse.models.input.stockin;

/**
 * 入库input
 * 
 * @author lishzh
 *
 */
public class StockInInput extends AddStockinInput {

	private String isStockSbs;// 是否传SBS

	private String auditStatus;// 审核状态

	public String getIsStockSbs() {
		return isStockSbs;
	}

	public void setIsStockSbs(String isStockSbs) {
		this.isStockSbs = isStockSbs;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

}

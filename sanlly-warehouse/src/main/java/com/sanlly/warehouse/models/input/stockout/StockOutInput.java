package com.sanlly.warehouse.models.input.stockout;

/**
 * 出库input
 * 
 * @author lishzh
 *
 */
public class StockOutInput extends AddStockoutInput {

	private String status;// 确认状态

	private String auditStatus;// 审核状态

	private String isStockSbs;// 是否传SBS

	private String stockoutStatus;// 出库状态

	public String getIsStockSbs() {
		return isStockSbs;
	}

	public void setIsStockSbs(String isStockSbs) {
		this.isStockSbs = isStockSbs;
	}

	public String getStockoutStatus() {
		return stockoutStatus;
	}

	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

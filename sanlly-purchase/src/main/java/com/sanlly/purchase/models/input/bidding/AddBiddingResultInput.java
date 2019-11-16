package com.sanlly.purchase.models.input.bidding;

/**
 * 
* @Package com.sanlly.purchase.models.input.bidding 
* @Description: 选择中标供应商 
* @author jlx   
* @date 2019年8月27日 上午11:45:12 
* @version V1.0   
 */
public class AddBiddingResultInput {

	private Integer purcMatterTenderPurchaseId;
	// 中标供应商报价id
	private Integer purcSupplierTenderId;
    // 发票类型
    private String invoiceType;
    // 招标结果
    private String tenderStatus;
    // 原因 
    private String reason;
    
    
	public Integer getPurcMatterTenderPurchaseId() {
		return purcMatterTenderPurchaseId;
	}
	public void setPurcMatterTenderPurchaseId(Integer purcMatterTenderPurchaseId) {
		this.purcMatterTenderPurchaseId = purcMatterTenderPurchaseId;
	}
	public Integer getPurcSupplierTenderId() {
		return purcSupplierTenderId;
	}
	public void setPurcSupplierTenderId(Integer purcSupplierTenderId) {
		this.purcSupplierTenderId = purcSupplierTenderId;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getTenderStatus() {
		return tenderStatus;
	}
	public void setTenderStatus(String tenderStatus) {
		this.tenderStatus = tenderStatus;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}

package com.sanlly.purchase.models.input.mattertender;

import java.util.List;

import com.sanlly.purchase.models.output.mattertender.MatterTenderProductOutput;

/**
 * 
* @Package com.sanlly.purchase.models.input.mattertender 
* @Description: 招标结果录入 
* @author jlx   
* @date 2019年8月20日 下午7:14:27 
* @version V1.0   
 */
public class AddMatterTenderResultInput {
	// 采购id
	private Integer purcMatterTenderPurchaseId;
    // 发票类型
    private String invoiceType;
    // 招标结果
    private String tenderStatus;
    // 原因 
    private String reason;
	// 采纳供应商
    private String supplier;
    // 招标备件
    private List<MatterTenderProductOutput> tenderProductOutputList;
    
    
	public Integer getPurcMatterTenderPurchaseId() {
		return purcMatterTenderPurchaseId;
	}
	public void setPurcMatterTenderPurchaseId(Integer purcMatterTenderPurchaseId) {
		this.purcMatterTenderPurchaseId = purcMatterTenderPurchaseId;
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
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public List<MatterTenderProductOutput> getTenderProductOutputList() {
		return tenderProductOutputList;
	}
	public void setTenderProductOutputList(List<MatterTenderProductOutput> tenderProductOutputList) {
		this.tenderProductOutputList = tenderProductOutputList;
	}
    
}

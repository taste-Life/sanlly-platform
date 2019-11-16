package com.sanlly.purchase.models.input.demand;

import com.sanlly.purchase.models.output.MatterDemand.MatterDemandOutput;

import java.util.List;

/**
 * 
* @Package com.sanlly.purchase.models.input.demand 
* @Description: 添加直接采购 
* @author jlx   
* @date 2019年8月19日 下午4:12:44 
* @version V1.0   
 */
public class AddMatterTemporaryPurchaseInput {
	private Integer purcMatterTemporaryPurchaseId;
	// 采购模式
    private String tenderType;
    // 发票类型
    private String invoiceType;
	// 供应商
    private String supplier;
    private  String supplierName;
    private  String settlementCycle;
    private  String currency;
    // 备注
    private String remark;
    // 采购商品ID列表
    private List<MatterDemandOutput> matterDemandList;

	public String getSettlementCycle() {
		return settlementCycle;
	}

	public void setSettlementCycle(String settlementCycle) {
		this.settlementCycle = settlementCycle;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Integer getPurcMatterTemporaryPurchaseId() {
		return purcMatterTemporaryPurchaseId;
	}
	public void setPurcMatterTemporaryPurchaseId(Integer purcMatterTemporaryPurchaseId) {
		this.purcMatterTemporaryPurchaseId = purcMatterTemporaryPurchaseId;
	}
	public String getTenderType() {
		return tenderType;
	}
	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}
	
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public List<MatterDemandOutput> getMatterDemandList() {
		return matterDemandList;
	}
	public void setMatterDemandList(List<MatterDemandOutput> matterDemandList) {
		this.matterDemandList = matterDemandList;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	} 
    
}

package com.sanlly.purchase.models.input.demand;

import java.util.List;

/**
 * 
* Description: 直接采购
* @ClassName: AddMatterPurchase
* @date 2019年8月8日
*
* @author jlx
 */
public class AddMatterPurchaseInput {
	
    // 采购单位
    private String purchaseCompany;
	// 供应商
    private String supplier;
    // 仓库
    private String warehouse;
    // 采购模式
    private String tenderType;
    // 发票类型
    private String invoice;
    // 备注
    private String remark;
    // 采购商品
    private List<AddMatterDemandInput> productList;
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getTenderType() {
		return tenderType;
	}
	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public List<AddMatterDemandInput> getProductList() {
		return productList;
	}
	public void setProductList(List<AddMatterDemandInput> productList) {
		this.productList = productList;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
    
}

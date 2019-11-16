package com.sanlly.purchase.models.input.matterinvoice;

import com.sanlly.common.models.input.PageInput;

/**
 * 
* @Package com.sanlly.purchase.models.input.matterinvoice 
* @Description: 发票分页查询输入类 
* @author jlx   
* @date 2019年9月9日 下午1:06:22 
* @version V1.0   
 */
public class SearchMatterInvoiceInput  extends PageInput {

	// 供应商
	private String supplier;
	// 付款单位
	private String purchaseCompany;
	// 发票号
	private String invoiceNo;
	

    
    public SearchMatterInvoiceInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
    }	
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}	
	
}

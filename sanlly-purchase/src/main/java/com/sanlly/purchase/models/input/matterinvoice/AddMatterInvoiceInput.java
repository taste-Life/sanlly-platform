package com.sanlly.purchase.models.input.matterinvoice;

import java.math.BigDecimal;

/**
 * 
* @Package com.sanlly.purchase.models.input.matterdeliver 
* @Description: 添加发票 
* @author jlx   
* @date 2019年9月7日 上午11:35:34 
* @version V1.0   
 */
public class AddMatterInvoiceInput {
	
	// 供应商
	private String supplier;
	// 发票类型
	private String invoice;
	// 发票号
	private String invoiceNo;	
	// 发货单id
	private Integer[] purcPurchaseDeliveryIds;
	// 含税总金额
	private BigDecimal total;
	// 不含税金额
	private BigDecimal noTaxAmount;
	// 税金
	private BigDecimal taxFee;	
	// 付款单位
	private String purchaseCompany;
	private String purchaseCompanyLang;
	
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Integer[] getPurcPurchaseDeliveryIds() {
		return purcPurchaseDeliveryIds;
	}
	public void setPurcPurchaseDeliveryIds(Integer[] purcPurchaseDeliveryIds) {
		this.purcPurchaseDeliveryIds = purcPurchaseDeliveryIds;
	}
	
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public BigDecimal getNoTaxAmount() {
		return noTaxAmount;
	}
	public void setNoTaxAmount(BigDecimal noTaxAmount) {
		this.noTaxAmount = noTaxAmount;
	}
	public BigDecimal getTaxFee() {
		return taxFee;
	}
	public void setTaxFee(BigDecimal taxFee) {
		this.taxFee = taxFee;
	}
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public String getPurchaseCompanyLang() {
		return purchaseCompanyLang;
	}
	public void setPurchaseCompanyLang(String purchaseCompanyLang) {
		this.purchaseCompanyLang = purchaseCompanyLang;
	}
	
	
}

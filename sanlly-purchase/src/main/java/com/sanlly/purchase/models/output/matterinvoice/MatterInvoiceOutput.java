package com.sanlly.purchase.models.output.matterinvoice;

import java.math.BigDecimal;
import java.util.List;

import com.sanlly.purchase.models.output.matterdeliver.MatterDeliveryOutput;

/**
 * 
* @Package com.sanlly.purchase.models.output.matterinvoice 
* @Description: 发票分页显示输出类 
* @author jlx   
* @date 2019年9月9日 下午1:12:08 
* @version V1.0   
 */
public class MatterInvoiceOutput {
	private Integer purcPurchaseBillId;
	// 供应商
    private String supplier;
    private String supplierLangLang;
	// 发票号
    private String invoiceNo;
	// 发票类型
    private String invoice;
    private String invoiceLangLang;
	// 含税金额
    private BigDecimal taxAmount;
	// 税金
    private BigDecimal taxFee;
	// 不含税金额
    private BigDecimal noTaxAmount;
	// 付款单位
    private String purchaseCompany;
    private String purchaseCompanyLangLang;
    // 送货单
    List<MatterDeliveryOutput> deliveryOutputs;
	public Integer getPurcPurchaseBillId() {
		return purcPurchaseBillId;
	}
	public void setPurcPurchaseBillId(Integer purcPurchaseBillId) {
		this.purcPurchaseBillId = purcPurchaseBillId;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getSupplierLangLang() {
		return supplierLangLang;
	}
	public void setSupplierLangLang(String supplierLangLang) {
		this.supplierLangLang = supplierLangLang;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}
	public BigDecimal getTaxFee() {
		return taxFee;
	}
	public void setTaxFee(BigDecimal taxFee) {
		this.taxFee = taxFee;
	}
	public BigDecimal getNoTaxAmount() {
		return noTaxAmount;
	}
	public void setNoTaxAmount(BigDecimal noTaxAmount) {
		this.noTaxAmount = noTaxAmount;
	}
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public String getPurchaseCompanyLangLang() {
		return purchaseCompanyLangLang;
	}
	public void setPurchaseCompanyLangLang(String purchaseCompanyLangLang) {
		this.purchaseCompanyLangLang = purchaseCompanyLangLang;
	}
	public List<MatterDeliveryOutput> getDeliveryOutputs() {
		return deliveryOutputs;
	}
	public void setDeliveryOutputs(List<MatterDeliveryOutput> deliveryOutputs) {
		this.deliveryOutputs = deliveryOutputs;
	}
	public String getInvoiceLangLang() {
		return invoiceLangLang;
	}
	public void setInvoiceLangLang(String invoiceLangLang) {
		this.invoiceLangLang = invoiceLangLang;
	}
    
}

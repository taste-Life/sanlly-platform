package com.sanlly.purchase.models.output.matterorder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PurchaseOrderOutput {
    private Integer purcPurchaseOrderId;
    // 订单编号
    private String orderNo;
	// 采购项目编号
	private String tenderId;
	// 采购单位
	private String purchaseCompany;
	private String purchaseCompanyLangLang;
	// 采购仓库
	private String purchaseWare;
	private String purchaseWareLangLang;
	// 采购模式
	private String purchaseType;
	private String purchaseTypeLangLang;
	// 采购人
	private Integer purchaseUserId;
	private String strPurchaseUser;
	// 联系方式
	private String contact;
	// 供应商
	private String supplier;
	private String supplierLangLang;
	// 采购时间
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
	private Date purchaseTime;
	// 收货地址
	private String reciverAddress;
	// 单价
	private BigDecimal total;
	// 订单状态
	private String orderStatus;
	private String orderStatusLangLang;
	// 发票类型
    private String invoice;
    private String invoiceLangLang;
	// 备注
	private String comments;
	// 商品详情
	List<PurchaseOrderDetailOutput> details;
	public Integer getPurcPurchaseOrderId() {
		return purcPurchaseOrderId;
	}
	public void setPurcPurchaseOrderId(Integer purcPurchaseOrderId) {
		this.purcPurchaseOrderId = purcPurchaseOrderId;
	}
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getTenderId() {
		return tenderId;
	}
	public void setTenderId(String tenderId) {
		this.tenderId = tenderId;
	}
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public String getPurchaseWare() {
		return purchaseWare;
	}
	public void setPurchaseWare(String purchaseWare) {
		this.purchaseWare = purchaseWare;
	}
	public String getPurchaseType() {
		return purchaseType;
	}
	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
	}
	public Integer getPurchaseUserId() {
		return purchaseUserId;
	}
	public void setPurchaseUserId(Integer purchaseUserId) {
		this.purchaseUserId = purchaseUserId;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public Date getPurchaseTime() {
		return purchaseTime;
	}
	public void setPurchaseTime(Date purchaseTime) {
		this.purchaseTime = purchaseTime;
	}
	public String getReciverAddress() {
		return reciverAddress;
	}
	public void setReciverAddress(String reciverAddress) {
		this.reciverAddress = reciverAddress;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public List<PurchaseOrderDetailOutput> getDetails() {
		return details;
	}
	public void setDetails(List<PurchaseOrderDetailOutput> details) {
		this.details = details;
	}
	public String getPurchaseCompanyLangLang() {
		return purchaseCompanyLangLang;
	}
	public void setPurchaseCompanyLangLang(String purchaseCompanyLangLang) {
		this.purchaseCompanyLangLang = purchaseCompanyLangLang;
	}
	public String getPurchaseWareLangLang() {
		return purchaseWareLangLang;
	}
	public void setPurchaseWareLangLang(String purchaseWareLangLang) {
		this.purchaseWareLangLang = purchaseWareLangLang;
	}
	public String getPurchaseTypeLangLang() {
		return purchaseTypeLangLang;
	}
	public void setPurchaseTypeLangLang(String purchaseTypeLangLang) {
		this.purchaseTypeLangLang = purchaseTypeLangLang;
	}
	public String getStrPurchaseUser() {
		return strPurchaseUser;
	}
	public void setStrPurchaseUser(String strPurchaseUser) {
		this.strPurchaseUser = strPurchaseUser;
	}
	public String getSupplierLangLang() {
		return supplierLangLang;
	}
	public void setSupplierLangLang(String supplierLangLang) {
		this.supplierLangLang = supplierLangLang;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatusLangLang() {
		return orderStatusLangLang;
	}
	public void setOrderStatusLangLang(String orderStatusLangLang) {
		this.orderStatusLangLang = orderStatusLangLang;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getInvoiceLangLang() {
		return invoiceLangLang;
	}
	public void setInvoiceLangLang(String invoiceLangLang) {
		this.invoiceLangLang = invoiceLangLang;
	}
	
	
}

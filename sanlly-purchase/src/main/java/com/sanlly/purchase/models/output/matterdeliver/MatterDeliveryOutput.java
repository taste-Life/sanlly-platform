package com.sanlly.purchase.models.output.matterdeliver;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
* @Package com.sanlly.purchase.models.output.matterdeliver 
* @Description: 送货单输出类 
* @author jlx   
* @date 2019年9月5日 下午1:46:40 
* @version V1.0   
 */
public class MatterDeliveryOutput {
	// id
	private Integer purcPurchaseDeliveryId;
	// 送货单号
	private String deliveryNum;
	// 发票类型
    private String invoice;
    private String invoiceLangLang;
    private Double invoicePoint;
	// 采购单位	
    private String purchaseCompany;
    private String purchaseCompanyLangLang;
	// 采购仓库	
    private String purchaseWare;
	// 采购模式
    private String purchaseType;
    private String purchaseTypeLangLang;
	// 采购人
    private Integer purchaseUserId;
    private Integer strPurchaseUser;
	// 联系方式
    private String contact;
	// 订单id
    private Integer purcPurchaseOrder;
	// 供应商
    private String supplier;
    private String supplierLangLang;
	// 供货方式
    private String supplyType;
    private String supplyTypeLangLang;
	// 物流公司
    private String logisticsCompany;
	// 物流单号
    private String logisticsNum;
	// 收货状态
    private String reciveStatus;
    private String reciveStatusLangLang;
	// 收货地址
	private String reciveAddress;
	// 运费
	private BigDecimal freight; 
	// 关税
	private BigDecimal tariff;  
	// 送货验收总金额
	private BigDecimal total; 
	// 送货验收总金额
	private BigDecimal noTaxAmount;  
	// 送货验收总金额
	private BigDecimal taxFee;   
	// 币种
	private String currency;    
	// 发票号
	private BigDecimal invoiceNo;   
	// 是否已对账
    private String isVerifyAccount;
    private String isVerifyAccountLangLang;
	// 采购时间
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date purchaseTime;
	// 送货单创建时间
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date createTime;
	// 备注
	private String comments;
    private List<MatterDeliveryDetailOutput> details;
    private  BigDecimal totalMoney;

	public BigDecimal getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(BigDecimal totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Integer getPurcPurchaseDeliveryId() {
		return purcPurchaseDeliveryId;
	}
	public void setPurcPurchaseDeliveryId(Integer purcPurchaseDeliveryId) {
		this.purcPurchaseDeliveryId = purcPurchaseDeliveryId;
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
	public String getPurchaseType() {
		return purchaseType;
	}
	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
	}
	public String getPurchaseTypeLangLang() {
		return purchaseTypeLangLang;
	}
	public void setPurchaseTypeLangLang(String purchaseTypeLangLang) {
		this.purchaseTypeLangLang = purchaseTypeLangLang;
	}
	public Integer getPurchaseUserId() {
		return purchaseUserId;
	}
	public void setPurchaseUserId(Integer purchaseUserId) {
		this.purchaseUserId = purchaseUserId;
	}
	public Integer getStrPurchaseUser() {
		return strPurchaseUser;
	}
	public void setStrPurchaseUser(Integer strPurchaseUser) {
		this.strPurchaseUser = strPurchaseUser;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Integer getPurcPurchaseOrder() {
		return purcPurchaseOrder;
	}
	public void setPurcPurchaseOrder(Integer purcPurchaseOrder) {
		this.purcPurchaseOrder = purcPurchaseOrder;
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
	public String getSupplyType() {
		return supplyType;
	}
	public void setSupplyType(String supplyType) {
		this.supplyType = supplyType;
	}
	public String getSupplyTypeLangLang() {
		return supplyTypeLangLang;
	}
	public void setSupplyTypeLangLang(String supplyTypeLangLang) {
		this.supplyTypeLangLang = supplyTypeLangLang;
	}
	public String getLogisticsCompany() {
		return logisticsCompany;
	}
	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}
	public String getLogisticsNum() {
		return logisticsNum;
	}
	public void setLogisticsNum(String logisticsNum) {
		this.logisticsNum = logisticsNum;
	}
	public String getReciveStatus() {
		return reciveStatus;
	}
	public void setReciveStatus(String reciveStatus) {
		this.reciveStatus = reciveStatus;
	}
	public String getReciveStatusLangLang() {
		return reciveStatusLangLang;
	}
	public void setReciveStatusLangLang(String reciveStatusLangLang) {
		this.reciveStatusLangLang = reciveStatusLangLang;
	}
	public String getIsVerifyAccount() {
		return isVerifyAccount;
	}
	public void setIsVerifyAccount(String isVerifyAccount) {
		this.isVerifyAccount = isVerifyAccount;
	}
	public String getIsVerifyAccountLangLang() {
		return isVerifyAccountLangLang;
	}
	public void setIsVerifyAccountLangLang(String isVerifyAccountLangLang) {
		this.isVerifyAccountLangLang = isVerifyAccountLangLang;
	}
	public Date getPurchaseTime() {
		return purchaseTime;
	}
	public void setPurchaseTime(Date purchaseTime) {
		this.purchaseTime = purchaseTime;
	}
	public String getDeliveryNum() {
		return deliveryNum;
	}
	public void setDeliveryNum(String deliveryNum) {
		this.deliveryNum = deliveryNum;
	}
	public String getReciveAddress() {
		return reciveAddress;
	}
	public void setReciveAddress(String reciveAddress) {
		this.reciveAddress = reciveAddress;
	}
	public BigDecimal getFreight() {
		return freight;
	}
	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}
	public BigDecimal getTariff() {
		return tariff;
	}
	public void setTariff(BigDecimal tariff) {
		this.tariff = tariff;
	}
	public List<MatterDeliveryDetailOutput> getDetails() {
		return details;
	}
	public void setDetails(List<MatterDeliveryDetailOutput> details) {
		this.details = details;
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
	public BigDecimal getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(BigDecimal invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Double getInvoicePoint() {
		return invoicePoint;
	}
	public void setInvoicePoint(Double invoicePoint) {
		this.invoicePoint = invoicePoint;
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getPurchaseWare() {
		return purchaseWare;
	}
	public void setPurchaseWare(String purchaseWare) {
		this.purchaseWare = purchaseWare;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
    
    
}

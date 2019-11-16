package com.sanlly.purchase.models.output.period;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
* @Package com.sanlly.purchase.models.output.period 
* @Description: 周期性定价列表输出 
* @author jlx   
* @date 2019年8月23日 下午5:18:11 
* @version V1.0   
 */
public class PeriodProductOutput {
	
	private Integer purcPeriodProductId;
	// 需求编号
    private String demandNo;
	// 招标项目编号
    private String tenderId;
	// 采购id 
    private Integer tenderPurchaseId;
	// 备件key
    private String product;
    private String productLangLang;
	// 备件号
    private String productNum;
    // 大类
    private String genaralType;
    private String genaralTypeLangLang;
    // 二级分类
    private String secondType;
    private String secondTypeLangLang;
	// 采购单位
    private String purchaseCompany;
    private String purchaseCompanyLangLang;
	// 仓库
    private String warehouse;
    private String warehouseLangLang;
	// 单位
    private String productUnit;
    private String productUnitLangLang;
	// 规格
    private String productSpecial;
	// 型号
    private String productModel;
	// 单价
    private BigDecimal productPrice;
	// 发票类型
    private String invoice;
    private String invoiceLangLang;
	// 供应商
    private String supplier;
    private String supplierLangLang;
	// 招标类型
    private String tenderType;
    private String tenderTypeLangLang;
	// 供货截止时间
    @JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;
    // 备注
    private String comments;
	// 单价变更时间
    @JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date priceChangeTime;
	// 单价变更人
    private Integer priceChangePerson;
    private String strPriceChangePerson;
	public Integer getPurcPeriodProductId() {
		return purcPeriodProductId;
	}
	public void setPurcPeriodProductId(Integer purcPeriodProductId) {
		this.purcPeriodProductId = purcPeriodProductId;
	}
	public String getDemandNo() {
		return demandNo;
	}
	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
	}	
	public String getTenderId() {
		return tenderId;
	}
	public void setTenderId(String tenderId) {
		this.tenderId = tenderId;
	}
	public Integer getTenderPurchaseId() {
		return tenderPurchaseId;
	}
	public void setTenderPurchaseId(Integer tenderPurchaseId) {
		this.tenderPurchaseId = tenderPurchaseId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getProductLangLang() {
		return productLangLang;
	}
	public void setProductLangLang(String productLangLang) {
		this.productLangLang = productLangLang;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	
	public String getGenaralType() {
		return genaralType;
	}
	public void setGenaralType(String genaralType) {
		this.genaralType = genaralType;
	}
	public String getGenaralTypeLangLang() {
		return genaralTypeLangLang;
	}
	public void setGenaralTypeLangLang(String genaralTypeLangLang) {
		this.genaralTypeLangLang = genaralTypeLangLang;
	}
	public String getSecondType() {
		return secondType;
	}
	public void setSecondType(String secondType) {
		this.secondType = secondType;
	}
	public String getSecondTypeLangLang() {
		return secondTypeLangLang;
	}
	public void setSecondTypeLangLang(String secondTypeLangLang) {
		this.secondTypeLangLang = secondTypeLangLang;
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
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getWarehouseLangLang() {
		return warehouseLangLang;
	}
	public void setWarehouseLangLang(String warehouseLangLang) {
		this.warehouseLangLang = warehouseLangLang;
	}
	public String getProductUnit() {
		return productUnit;
	}
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}
	
	public String getProductSpecial() {
		return productSpecial;
	}
	public void setProductSpecial(String productSpecial) {
		this.productSpecial = productSpecial;
	}
	public String getProductModel() {
		return productModel;
	}
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}
	public String getProductUnitLangLang() {
		return productUnitLangLang;
	}
	public void setProductUnitLangLang(String productUnitLangLang) {
		this.productUnitLangLang = productUnitLangLang;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
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
	public String getTenderType() {
		return tenderType;
	}
	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}
	public String getTenderTypeLangLang() {
		return tenderTypeLangLang;
	}
	public void setTenderTypeLangLang(String tenderTypeLangLang) {
		this.tenderTypeLangLang = tenderTypeLangLang;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getPriceChangeTime() {
		return priceChangeTime;
	}
	public void setPriceChangeTime(Date priceChangeTime) {
		this.priceChangeTime = priceChangeTime;
	}
	public Integer getPriceChangePerson() {
		return priceChangePerson;
	}
	public void setPriceChangePerson(Integer priceChangePerson) {
		this.priceChangePerson = priceChangePerson;
	}
	public String getStrPriceChangePerson() {
		return strPriceChangePerson;
	}
	public void setStrPriceChangePerson(String strPriceChangePerson) {
		this.strPriceChangePerson = strPriceChangePerson;
	}
    
    
    
}

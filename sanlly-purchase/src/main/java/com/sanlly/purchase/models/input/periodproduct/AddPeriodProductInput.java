package com.sanlly.purchase.models.input.periodproduct;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @Package com.sanlly.purchase.models.input.periodproduct 
* @Description: 添加周期性定价备件 
* @author jlx   
* @date 2019年8月20日 下午7:50:50 
* @version V1.0   
 */
public class AddPeriodProductInput {
	// 需求编号
	private String demandNo;
	// 采购id
    private Integer tenderPurchaseId;
    // 备件key
    private String product;
    // 备件号
    private String productNum;
    // 采购单位
    private String purchaseCompany;
    // 单位
    private String productUnit;
    // 单价
    private BigDecimal productPrice;
    // 备注
    private String comments;
    // 发票类型
    private String invoice;
    // 仓库
    private String warehouse;
    // 供应商
    private String supplier;
    // 招标类型
    private String tenderType;
    // 供货截止时间
    private Date endTime;
    // 单价变更时间
    private Date priceChangeTime;
    // 单价变更人
    private Integer priceChangePerson;
	public String getDemandNo() {
		return demandNo;
	}
	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
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
	
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}	
	
	public String getProductUnit() {
		return productUnit;
	}
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getTenderType() {
		return tenderType;
	}
	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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
    
    
}

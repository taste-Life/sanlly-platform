package com.sanlly.purchase.models.output.matterinquiry;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @Package com.sanlly.purchase.models.output.matterbidding 
* @Description: 供应商报价商品详细信息
* @author jlx   
* @date 2019年8月27日 上午11:10:35 
* @version V1.0   
 */
public class MatterPeriodSupplierTenderOutput {
	
	private Integer purcSupplierTenderProductId;
	// 供应商报价记录id
    private Integer supplierTenderId;
	// 报价
    private BigDecimal price;
    // 不含税价格
    private BigDecimal noTaxPrice;
    // 到货时间
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date arriveTime;
	//发票类型
	private  String invoice;
	private  String invoiceLangLang;
	// 税点
	private Double invoicePoint;
	//招标商品id
	private Integer purcMatterTenderProductId;
	// 供应商
    private String supplier;
    private String supplierLangLang;
	// 结算信用期
    private String settlementCycle;
    private String settlementCycleLangLang;
	// 评价等级
    private String grade;
    private String gradeLangLang;
	// 当前排名
    private Integer rank;
    // 是否推荐
    private String isRecommend;
    
	public Integer getPurcSupplierTenderProductId() {
		return purcSupplierTenderProductId;
	}
	public void setPurcSupplierTenderProductId(Integer purcSupplierTenderProductId) {
		this.purcSupplierTenderProductId = purcSupplierTenderProductId;
	}
	public Integer getSupplierTenderId() {
		return supplierTenderId;
	}
	public void setSupplierTenderId(Integer supplierTenderId) {
		this.supplierTenderId = supplierTenderId;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
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
	public Integer getPurcMatterTenderProductId() {
		return purcMatterTenderProductId;
	}
	public void setPurcMatterTenderProductId(Integer purcMatterTenderProductId) {
		this.purcMatterTenderProductId = purcMatterTenderProductId;
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
	public String getSettlementCycle() {
		return settlementCycle;
	}
	public void setSettlementCycle(String settlementCycle) {
		this.settlementCycle = settlementCycle;
	}
	public String getSettlementCycleLangLang() {
		return settlementCycleLangLang;
	}
	public void setSettlementCycleLangLang(String settlementCycleLangLang) {
		this.settlementCycleLangLang = settlementCycleLangLang;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGradeLangLang() {
		return gradeLangLang;
	}
	public void setGradeLangLang(String gradeLangLang) {
		this.gradeLangLang = gradeLangLang;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getIsRecommend() {
		return isRecommend;
	}
	public void setIsRecommend(String isRecommend) {
		this.isRecommend = isRecommend;
	}
	public Double getInvoicePoint() {
		return invoicePoint;
	}
	public void setInvoicePoint(Double invoicePoint) {
		this.invoicePoint = invoicePoint;
	}
	public BigDecimal getNoTaxPrice() {
		return noTaxPrice;
	}
	public void setNoTaxPrice(BigDecimal noTaxPrice) {
		this.noTaxPrice = noTaxPrice;
	}
    
    
	
}

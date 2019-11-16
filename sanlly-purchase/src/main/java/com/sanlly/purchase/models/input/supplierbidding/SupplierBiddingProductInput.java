package com.sanlly.purchase.models.input.supplierbidding;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @version V1.0   
 */
public class SupplierBiddingProductInput {

    private Integer purcMatterTenderProductId;
	// 需求编号
	private String demandNo;
    // 备件
    private String product;
    private String productLangLang;
    // 备件号
    private String sparePartsNo;
    // 大类
    private String genaralType;
    private String genaralTypeLangLang;
    // 二级分类
    private String secondType;
    private String secondTypeLangLang;
    // 数量
    private Double productCount;
	// 规格
    private String productSpecial;
	// 型号
    private String productModel;
    // 单位
    private String sparePartsUnit;
    private String sparePartsUnitLangLang;
    // 要求到货日期
    @JsonFormat(locale="zh", timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date deliveryTime;
    // 供货截止时间
    @JsonFormat(locale="zh", timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date endTime;
    // 上次采购价格
    private BigDecimal lastPrice;
    // 价格
    private BigDecimal price;
    // 权重
    private Double weight;
    // 备注
    private String comments;
	// 备注
	private String remark;
	// 要求到货日期
	@JsonFormat(locale="zh", timezone="GMT+8",pattern = "yyyy-MM-dd")
	private Date arriveTime;
	//竞价商品记录主键
	private Integer purcSupplierTenderProductId;
	//发票类型
	private  String invoice;
	private  String invoiceLang;

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getInvoiceLang() {
		return invoiceLang;
	}

	public void setInvoiceLang(String invoiceLang) {
		this.invoiceLang = invoiceLang;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public Integer getPurcSupplierTenderProductId() {
		return purcSupplierTenderProductId;
	}

	public void setPurcSupplierTenderProductId(Integer purcSupplierTenderProductId) {
		this.purcSupplierTenderProductId = purcSupplierTenderProductId;
	}

	public Date getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}

	public Integer getPurcMatterTenderProductId() {
		return purcMatterTenderProductId;
	}
	public void setPurcMatterTenderProductId(Integer purcMatterTenderProductId) {
		this.purcMatterTenderProductId = purcMatterTenderProductId;
	}
	public String getDemandNo() {
		return demandNo;
	}
	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
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
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
	public Double getProductCount() {
		return productCount;
	}
	public void setProductCount(Double productCount) {
		this.productCount = productCount;
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
	public String getSparePartsUnit() {
		return sparePartsUnit;
	}
	public void setSparePartsUnit(String sparePartsUnit) {
		this.sparePartsUnit = sparePartsUnit;
	}
	public String getSparePartsUnitLangLang() {
		return sparePartsUnitLangLang;
	}
	public void setSparePartsUnitLangLang(String sparePartsUnitLangLang) {
		this.sparePartsUnitLangLang = sparePartsUnitLangLang;
	}
	public Date getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public BigDecimal getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(BigDecimal lastPrice) {
		this.lastPrice = lastPrice;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
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
	
    
}

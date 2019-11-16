package com.sanlly.purchase.models.output.matterdeliver;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;

public class MatterDeliveryDetailOutput {
    private Integer purcPurchaseDeliveryDetailId;
	// 需求编号
    private String demandNo;
	// 送货单id
    private Integer purcPurchaseDelivery;
	// 备件
    private String product;
    private String productLangLang;
	// 备件号
    private String sparePartsNo;
	// 备件大类
    private String sparePartsCategoriesLangLang;
	// 二级分类
    private String sparePartsCategoriesDetailsLangLang;
	// 单价
    private BigDecimal unitPrice;
	// 入库单据
    private BigDecimal entryPrice;
	// 规格
    private String specification;
	// 型号
    private String model;

    @ApiModelProperty(value = "仓库类型",name = "warehouseType")
    private String warehouseType;
    // 单位
    private String sparePartsUnitLangLang;
	// 要求到货日期
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date requiredDeliveryDate;
	// 送货数量
    private Double deliveryCount;
	// 验收数量
    private Double reciveCount;
	// 送货含税总金额
    private BigDecimal deliverySumAmount;
	// 验收含税总金额
    private BigDecimal reciveSumAmount;
	// 验收不含税总金额
    private BigDecimal reciveNoTaxAmount;
	// 验收税金总额
    private BigDecimal reciveTaxFee;
	// 备注
    private String comments;
	// 实际到货时间
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date actualArrivalDate;
	// 收货地址
	private String reciveAddress;
	private  BigDecimal totalMoney;

	public BigDecimal getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(BigDecimal totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Integer getPurcPurchaseDeliveryDetailId() {
		return purcPurchaseDeliveryDetailId;
	}
	public void setPurcPurchaseDeliveryDetailId(Integer purcPurchaseDeliveryDetailId) {
		this.purcPurchaseDeliveryDetailId = purcPurchaseDeliveryDetailId;
	}
	public String getDemandNo() {
		return demandNo;
	}
	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
	}
	public Integer getPurcPurchaseDelivery() {
		return purcPurchaseDelivery;
	}
	public void setPurcPurchaseDelivery(Integer purcPurchaseDelivery) {
		this.purcPurchaseDelivery = purcPurchaseDelivery;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Date getRequiredDeliveryDate() {
		return requiredDeliveryDate;
	}
	public void setRequiredDeliveryDate(Date requiredDeliveryDate) {
		this.requiredDeliveryDate = requiredDeliveryDate;
	}
	public Double getDeliveryCount() {
		return deliveryCount;
	}
	public void setDeliveryCount(Double deliveryCount) {
		this.deliveryCount = deliveryCount;
	}
	public Double getReciveCount() {
		return reciveCount;
	}
	public void setReciveCount(Double reciveCount) {
		this.reciveCount = reciveCount;
	}
	public BigDecimal getReciveSumAmount() {
		return reciveSumAmount;
	}
	public void setReciveSumAmount(BigDecimal reciveSumAmount) {
		this.reciveSumAmount = reciveSumAmount;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getActualArrivalDate() {
		return actualArrivalDate;
	}
	public void setActualArrivalDate(Date actualArrivalDate) {
		this.actualArrivalDate = actualArrivalDate;
	}
	public String getProductLangLang() {
		return productLangLang;
	}
	public void setProductLangLang(String productLangLang) {
		this.productLangLang = productLangLang;
	}
	public String getSparePartsCategoriesLangLang() {
		return sparePartsCategoriesLangLang;
	}
	public void setSparePartsCategoriesLangLang(String sparePartsCategoriesLangLang) {
		this.sparePartsCategoriesLangLang = sparePartsCategoriesLangLang;
	}
	public String getSparePartsCategoriesDetailsLangLang() {
		return sparePartsCategoriesDetailsLangLang;
	}
	public void setSparePartsCategoriesDetailsLangLang(String sparePartsCategoriesDetailsLangLang) {
		this.sparePartsCategoriesDetailsLangLang = sparePartsCategoriesDetailsLangLang;
	}
	public String getSparePartsUnitLangLang() {
		return sparePartsUnitLangLang;
	}
	public void setSparePartsUnitLangLang(String sparePartsUnitLangLang) {
		this.sparePartsUnitLangLang = sparePartsUnitLangLang;
	}
	public String getReciveAddress() {
		return reciveAddress;
	}
	public void setReciveAddress(String reciveAddress) {
		this.reciveAddress = reciveAddress;
	}
	public BigDecimal getDeliverySumAmount() {
		return deliverySumAmount;
	}
	public void setDeliverySumAmount(BigDecimal deliverySumAmount) {
		this.deliverySumAmount = deliverySumAmount;
	}
	public BigDecimal getEntryPrice() {
		return entryPrice;
	}
	public void setEntryPrice(BigDecimal entryPrice) {
		this.entryPrice = entryPrice;
	}
	public BigDecimal getReciveNoTaxAmount() {
		return reciveNoTaxAmount;
	}
	public void setReciveNoTaxAmount(BigDecimal reciveNoTaxAmount) {
		this.reciveNoTaxAmount = reciveNoTaxAmount;
	}
	public BigDecimal getReciveTaxFee() {
		return reciveTaxFee;
	}
	public void setReciveTaxFee(BigDecimal reciveTaxFee) {
		this.reciveTaxFee = reciveTaxFee;
	}
	public String getWarehouseType() {
		return warehouseType;
	}
	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}
    
    
}

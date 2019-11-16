package com.sanlly.purchase.models.output.dailydeliver;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DailyDeliveryDetailOutput {
    private Integer purcPurchaseDeliveryDetailId;
	// 需求编号
    private String demandNo;
	// 送货单id
    private Integer purcPurchaseDelivery;
	// 备件
    private String product;
	// 单价
    private BigDecimal unitPrice;
	// 规格
    private String specification;
	// 型号
    private String model;
    // 品牌
    private String brand;
    // 单位
    private String sparePartsUnit;
	// 要求到货日期
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date requiredDeliveryDate;
	// 送货数量
    private Double deliveryCount;
	// 验收数量
    private Double reciveCount;
	// 送货总金额
    private BigDecimal deliverySumAmount;
	// 验收总金额
    private BigDecimal reciveSumAmount;
	// 备注
    private String comments;
	// 实际到货时间
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date actualArrivalDate;
	// 收货地址
	private String reciveAddress;
	
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSparePartsUnit() {
		return sparePartsUnit;
	}
	public void setSparePartsUnit(String sparePartsUnit) {
		this.sparePartsUnit = sparePartsUnit;
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
	public BigDecimal getDeliverySumAmount() {
		return deliverySumAmount;
	}
	public void setDeliverySumAmount(BigDecimal deliverySumAmount) {
		this.deliverySumAmount = deliverySumAmount;
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
	public String getReciveAddress() {
		return reciveAddress;
	}
	public void setReciveAddress(String reciveAddress) {
		this.reciveAddress = reciveAddress;
	}
	
	
    
}

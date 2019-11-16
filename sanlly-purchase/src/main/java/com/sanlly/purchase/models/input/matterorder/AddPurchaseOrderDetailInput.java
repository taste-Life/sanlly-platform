package com.sanlly.purchase.models.input.matterorder;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @Package com.sanlly.purchase.models.input.purchaseorder 
* @Description: 生成订单明细输入项 
* @author jlx   
* @date 2019年9月4日 上午10:43:30 
* @version V1.0   
 */
public class AddPurchaseOrderDetailInput {
	// 需求编号
	private String demandNo;
	// 采购订单id
    private Integer purcPurchaseOrder;
	// 需求添加日期
    private Date demandTime;
	// 备件
    private String product;
	// 备件号
    private String sparePartsNo;
	// 订单数量
    private Double orderNum;
	// 已送货数量
    private Double deliverNum;
	// 要求到货日期
    private Date requiredDeliveryDate;
	// 单价
    private BigDecimal unitPrice;
	// 规格
    private String specification;
	// 型号
    private String model;
	// 备注
    private String comments;
    //品牌
	private  String brand;
	// 单位
	private String sparePartsUnit;
//发票类型
	private  String invoice;

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getSparePartsUnit() {
		return sparePartsUnit;
	}

	public void setSparePartsUnit(String sparePartsUnit) {
		this.sparePartsUnit = sparePartsUnit;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDemandNo() {
		return demandNo;
	}
	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
	}
	public Integer getPurcPurchaseOrder() {
		return purcPurchaseOrder;
	}
	public void setPurcPurchaseOrder(Integer purcPurchaseOrder) {
		this.purcPurchaseOrder = purcPurchaseOrder;
	}
	public Date getDemandTime() {
		return demandTime;
	}
	public void setDemandTime(Date demandTime) {
		this.demandTime = demandTime;
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
	public Double getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Double orderNum) {
		this.orderNum = orderNum;
	}
	public Double getDeliverNum() {
		return deliverNum;
	}
	public void setDeliverNum(Double deliverNum) {
		this.deliverNum = deliverNum;
	}
	public Date getRequiredDeliveryDate() {
		return requiredDeliveryDate;
	}
	public void setRequiredDeliveryDate(Date requiredDeliveryDate) {
		this.requiredDeliveryDate = requiredDeliveryDate;
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
    
    
}

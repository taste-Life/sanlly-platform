package com.sanlly.purchase.models.input.supplierbidding;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description: TODO
 * @ClassName: SupplierDailyBiddingProductInput
 * @Version 1.0
 * @Author mqz
 */
public class SupplierDailyBiddingProductInput {
    private Integer purcMatterTenderProductId;
    // 需求编号
    private String demandNo;
    // 品牌
    private String productBrand;
    // 商品名称
    private String productNum;

    // 数量
    private Double productCount;
    // 规格
    private String productSpecial;
    // 型号
    private String productModel;
    //发票类型
    private String invoice;
    private String invoiceLang;

    // 要求到货日期
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date deliveryTime;
    // 供货截止时间
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;
    // 上次采购价格
    private BigDecimal lastPrice;
    // 价格
    private BigDecimal price;
    // 权重
    private Double weight;
    // 备注
    private String comments;
    //送货地址
    private String warehouseAddress;
    // 要求到货日期
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date arriveTime;
    //商品单位
    private String sparePartsUnit;
    //竞价商品记录主键
    private Integer purcSupplierTenderProductId;

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

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit;
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

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
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

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }
}

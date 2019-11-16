package com.sanlly.purchase.models.output.dailydemand;

import java.math.BigDecimal;

/**
 *
 */
public class DailyPurchaseProductOutput {
    //需求编号
    private String demandNo;
    //商品名称
    private String productNum;
    // 备件号
    private String productBrand;
    private String productName;
    // 规格
    private String productSpecial;
    // 型号
    private String productModel;
    // 单位
    private String sparePartsUnitLangLang;
    // 数量
    private Double productCount;
    // 单价
    private BigDecimal price;
    // 上次采购价格
    private BigDecimal lastPrice;
    // 总金额
    private BigDecimal totalPrice;
    // 备注
    private String comments;
    //商品单位
    private String sparePartsUnit;
    //送货地址
    private String address;
    private String warehouseAddress;

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit;
    }

    public String getDemandNo() {
        return demandNo;
    }

    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public String getSparePartsUnitLangLang() {
        return sparePartsUnitLangLang;
    }

    public void setSparePartsUnitLangLang(String sparePartsUnitLangLang) {
        this.sparePartsUnitLangLang = sparePartsUnitLangLang;
    }

    public Double getProductCount() {
        return productCount;
    }

    public void setProductCount(Double productCount) {
        this.productCount = productCount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


}

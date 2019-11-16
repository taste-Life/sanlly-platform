package com.sanlly.purchase.models.output.dailytender;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description: TODO
 * @ClassName: DailyTenderProductOutput
 * @Date: 2019/8/26 9:29
 * @Version 1.0
 * @Author mqz
 */
public class DailyTenderProductOutput {
    private Integer purcMatterTenderProductId;
    // 需求编号
    private String demandNo;
    // 备件
    private String productNum;
    private String productLangLang;

    // 数量
    private Double productCount;
    // 规格
    private String productSpecial;
    // 型号
    private String productModel;
    // 单位
    private String productBrand;
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
    //送货地址
  private  String warehouseAddress;
    //商品单位
    private String sparePartsUnit;

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
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

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductLangLang() {
        return productLangLang;
    }

    public void setProductLangLang(String productLangLang) {
        this.productLangLang = productLangLang;
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

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
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
}

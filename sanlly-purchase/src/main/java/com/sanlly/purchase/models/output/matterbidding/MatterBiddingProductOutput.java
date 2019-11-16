package com.sanlly.purchase.models.output.matterbidding;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author jlx   
 * @version V1.0   
 * @Package com.sanlly.purchase.models.input.mattertender 
 * @Description: 招标采购分页展示-采购备件明细
 * @date 2019年8月19日 下午4:56:19 
 */
public class MatterBiddingProductOutput {

    private Integer purcMatterTenderProductId;
    // 需求编号
    private String demandNo;
    // 采购仓库
    private String warehouse;
    private String warehouseLangLang;
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
    // 采购仓库
    private String warehouseAddress;
    //发票类型
    private String invoice;
    private String invoiceLangLang;
    // 周期性定价中标供应商
    private String selectSupplier;
    private String selectSupplierLangLang;
    //周期性定价是否中标
    private String statusLang;
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatusLang() {
        return statusLang;
    }

    public void setStatusLang(String statusLang) {
        this.statusLang = statusLang;
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

    public String getSelectSupplier() {
        return selectSupplier;
    }

    public void setSelectSupplier(String selectSupplier) {
        this.selectSupplier = selectSupplier;
    }

    public String getSelectSupplierLangLang() {
        return selectSupplierLangLang;
    }

    public void setSelectSupplierLangLang(String selectSupplierLangLang) {
        this.selectSupplierLangLang = selectSupplierLangLang;
    }


}

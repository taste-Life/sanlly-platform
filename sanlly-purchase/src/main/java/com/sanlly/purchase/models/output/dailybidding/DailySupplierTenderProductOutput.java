package com.sanlly.purchase.models.output.dailybidding;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @version V1.0   
 * @Description: 供应商报价商品详细信息
 * @date 2019年8月27日 上午11:10:35 
 */
public class DailySupplierTenderProductOutput {
    //主键
    private Integer purcSupplierTenderProductId;
    // 供应商报价记录id
    private Integer supplierTenderId;
    // 报价
    private BigDecimal price;
    // 到货时间
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date arriveTime;
    // 商品名称
    private String productNum;
    //品牌
    private String productBrand;
    // 规格
    private String productSpecial;
    // 型号
    private String productModel;
    // 数量
    private Double productCount;
    // 权重
    private Double weight;
    // 当前排名
    private Integer rank;
    // 备注
    private String remark;
    private String comments;
    //送货地址
    private String warehouseAddress;
    //商品单位
    private String sparePartsUnit;
    //需求编号
    private String demandNo;
    //发票类型
    private String invoice;
    private String invoiceLangLang;
    //招标商品id
    private Integer purcMatterTenderProductId;

    public Integer getPurcMatterTenderProductId() {
        return purcMatterTenderProductId;
    }

    public void setPurcMatterTenderProductId(Integer purcMatterTenderProductId) {
        this.purcMatterTenderProductId = purcMatterTenderProductId;
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

    public String getDemandNo() {
        return demandNo;
    }

    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo;
    }

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }


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

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
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

    public Double getProductCount() {
        return productCount;
    }

    public void setProductCount(Double productCount) {
        this.productCount = productCount;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}

package com.sanlly.warehouse.models.output.purchaseOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * ClassName: PurchaseOrderDetailOutput
 * Description: 采购订单详细输出类
 * date: 2019/8/27 9:32
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("采购订单详细输出类")
public class PurchaseOrderDetailOutput {

    @ApiModelProperty(name = "warePurchaseOrderDetailId",value = "采购订单详细Id")
    private Integer warePurchaseOrderDetailId;

    @ApiModelProperty(name = "warePurchaseOrderId",value = "采购订单id")
    private Integer warePurchaseOrderId;

    @ApiModelProperty(name = "stockoutStatus",value = "出库状态")
    private String stockoutStatus;
    private String stockoutStatusLangLang;

    @ApiModelProperty(name = "stockinStatus",value = "入库状态")
    private String stockinStatus;
    private String stockinStatusLangLang;

    @ApiModelProperty(name = "spareParts",value = "备件")
    private String spareParts;
    private String sparePartsLangLang;

    @ApiModelProperty(value = "备件大类",name = "sparePartsCategoriesLang")
    private String sparePartsCategoriesLangLang;
    private String sparePartsCategories;

    @ApiModelProperty(name = "sparePartsNo",value = "备件号")
    private String sparePartsNo;

    @ApiModelProperty(name = "num",value = "数量")
    private Double num;

    @ApiModelProperty(name = "surplusNum",value = "剩余数量")
    private Double surplusNum;

    @ApiModelProperty(name = "freight",value = "运费")
    private BigDecimal freight;

    @ApiModelProperty(name = "price",value = "单价")
    private BigDecimal price;

    @ApiModelProperty(name = "totalAmount",value = "总价")
    private BigDecimal totalAmount;

    @ApiModelProperty(name = "company",value = "所属公司")
    private String company;
    private String companyLangLang;

    @ApiModelProperty(name = "outWarehouse",value = "出库仓库")
    private String outWarehouse;
    private String outWarehouseLangLang;

    @ApiModelProperty(name = "isFinish",value = "是否完毕")
    private String isFinish;
    private String isFinishLangLang;

    @ApiModelProperty(name = "remark",value = "备注")
    private String remark;

    public Integer getWarePurchaseOrderDetailId() {
        return warePurchaseOrderDetailId;
    }

    public void setWarePurchaseOrderDetailId(Integer warePurchaseOrderDetailId) {
        this.warePurchaseOrderDetailId = warePurchaseOrderDetailId;
    }

    public Integer getWarePurchaseOrderId() {
        return warePurchaseOrderId;
    }

    public void setWarePurchaseOrderId(Integer warePurchaseOrderId) {
        this.warePurchaseOrderId = warePurchaseOrderId;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOutWarehouse() {
        return outWarehouse;
    }

    public void setOutWarehouse(String outWarehouse) {
        this.outWarehouse = outWarehouse;
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStockoutStatusLangLang() {
        return stockoutStatusLangLang;
    }

    public void setStockoutStatusLangLang(String stockoutStatusLangLang) {
        this.stockoutStatusLangLang = stockoutStatusLangLang;
    }

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
    }

    public String getCompanyLangLang() {
        return companyLangLang;
    }

    public void setCompanyLangLang(String companyLangLang) {
        this.companyLangLang = companyLangLang;
    }

    public String getOutWarehouseLangLang() {
        return outWarehouseLangLang;
    }

    public void setOutWarehouseLangLang(String outWarehouseLangLang) {
        this.outWarehouseLangLang = outWarehouseLangLang;
    }

    public String getIsFinishLangLang() {
        return isFinishLangLang;
    }

    public void setIsFinishLangLang(String isFinishLangLang) {
        this.isFinishLangLang = isFinishLangLang;
    }

    public String getSparePartsCategoriesLangLang() {
        return sparePartsCategoriesLangLang;
    }

    public void setSparePartsCategoriesLangLang(String sparePartsCategoriesLangLang) {
        this.sparePartsCategoriesLangLang = sparePartsCategoriesLangLang;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public Double getSurplusNum() {
        return surplusNum;
    }

    public void setSurplusNum(Double surplusNum) {
        this.surplusNum = surplusNum;
    }

    public String getStockinStatus() {
        return stockinStatus;
    }

    public void setStockinStatus(String stockinStatus) {
        this.stockinStatus = stockinStatus;
    }

    public String getStockinStatusLangLang() {
        return stockinStatusLangLang;
    }

    public void setStockinStatusLangLang(String stockinStatusLangLang) {
        this.stockinStatusLangLang = stockinStatusLangLang;
    }
}

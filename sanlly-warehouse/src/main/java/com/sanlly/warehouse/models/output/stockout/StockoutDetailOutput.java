package com.sanlly.warehouse.models.output.stockout;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * ClassName: StockoutDetailOutput
 * Description: 出库详细输出类
 * date: 2019/8/6 16:58
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("出库详细输出类")
public class StockoutDetailOutput {

    @ApiModelProperty(name = "wareStockoutOrderDetailId",value = "出库详细ID")
    private Integer wareStockoutOrderDetailId;

    @ApiModelProperty(name = "wareStockoutId",value = "出库单ID")
    private Integer wareStockoutId;

    @ApiModelProperty(name = "defaultWarehouseTypeLangLang",value = "默认仓库类型国际化")
    private String defaultWarehouseTypeLangLang;

    @ApiModelProperty(name = "defaultWarehouseType",value = "默认仓库类型")
    private String defaultWarehouseType;

    @ApiModelProperty(name = "warehouseTypeLangLang",value = "所属仓库国际化")
    private String warehouseTypeLangLang;

    @ApiModelProperty(name = "warehouseType",value = "所属仓库")
    private String warehouseType;

    @ApiModelProperty(name = "stockoutStatusLangLang",value = "出库状态国际化")
    private String stockoutStatusLangLang;

    @ApiModelProperty(name = "stockoutStatus",value = "出库状态")
    private String stockoutStatus;

    @ApiModelProperty(name = "sparePartsCategoriesLangLang",value = "备件大类国际化")
    private String sparePartsCategoriesLangLang;

    @ApiModelProperty(name = "sparePartsCategories",value = "备件大类")
    private String sparePartsCategories;

    @ApiModelProperty(name = "stockoutNum",value = "出库数量")
    private Double stockoutNum;

    @ApiModelProperty(name = "prodNum",value = "领料数量")
    private Double prodNum;

    @ApiModelProperty(name = "stockoutSurplusNum",value = "剩余出库数量")
    private Double stockoutSurplusNum;

    @ApiModelProperty(value = "本次出库数量",name = "outNum")
    private Double outNum;

    @ApiModelProperty(name = "sparePartsBatch",value = "备件批次号")
    private String sparePartsBatch;

    @ApiModelProperty(name = "sparePartsNo",value = "备件号")
    private String sparePartsNo;

    @ApiModelProperty(name = "sparePartsLangLang",value = "备件国际化")
    private String sparePartsLangLang;

    @ApiModelProperty(name = "spareParts",value = "备件")
    private String spareParts;

    @ApiModelProperty(name = "stockNum",value = "库存数量")
    private Double stockNum;

    @ApiModelProperty(name = "storageLocation",value = "库位")
    private String storageLocation;

    @ApiModelProperty(name = "unitPrice",value = "单价")
    private BigDecimal unitPrice;

    @ApiModelProperty(name = "length",value = "长度")
    private Double length;

    @ApiModelProperty(name = "width",value = "宽度")
    private Double width;

    @ApiModelProperty(name = "stockArea",value = "库存面积")
    private Double stockArea;

    @ApiModelProperty(name = "stockoutArea",value = "出库面积")
    private Double stockoutArea;

    @ApiModelProperty(name = "stockoutSurplusArea",value = "剩余出库面积")
    private Double stockoutSurplusArea;

    @ApiModelProperty(name = "outArea",value = "本次出库面积")
    private Double outArea;

    @ApiModelProperty(name = "totalAmount",value = "总金额")
    private BigDecimal totalAmount;

    @ApiModelProperty(name = "useUser",value = "使用人")
    private String useUser;

    @ApiModelProperty(name = "yardLangLang",value = "场站国际化")
    private String yardLangLang;

    @ApiModelProperty(name = "yard",value = "场站")
    private String yard;

    @ApiModelProperty(name = "returnNum",value = "退库数量")
    private Double returnNum;

    @ApiModelProperty(name = "containerNo",value = "箱号")
    private String containerNo;

    @ApiModelProperty(name = "referralDetailId",value = "领料单明细ID")
    private String referralDetailId;

    public Double getProdNum() {
        return prodNum;
    }

    public void setProdNum(Double prodNum) {
        this.prodNum = prodNum;
    }

    public String getReferralDetailId() {
        return referralDetailId;
    }

    public void setReferralDetailId(String referralDetailId) {
        this.referralDetailId = referralDetailId;
    }

    public Double getReturnNum() {
        return returnNum;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public void setReturnNum(Double returnNum) {
        this.returnNum = returnNum;
    }

    public Integer getWareStockoutOrderDetailId() {
        return wareStockoutOrderDetailId;
    }

    public void setWareStockoutOrderDetailId(Integer wareStockoutOrderDetailId) {
        this.wareStockoutOrderDetailId = wareStockoutOrderDetailId;
    }

    public Integer getWareStockoutId() {
        return wareStockoutId;
    }

    public void setWareStockoutId(Integer wareStockoutId) {
        this.wareStockoutId = wareStockoutId;
    }

    public String getDefaultWarehouseTypeLangLang() {
        return defaultWarehouseTypeLangLang;
    }

    public void setDefaultWarehouseTypeLangLang(String defaultWarehouseTypeLangLang) {
        this.defaultWarehouseTypeLangLang = defaultWarehouseTypeLangLang;
    }

    public String getDefaultWarehouseType() {
        return defaultWarehouseType;
    }

    public void setDefaultWarehouseType(String defaultWarehouseType) {
        this.defaultWarehouseType = defaultWarehouseType;
    }

    public String getWarehouseTypeLangLang() {
        return warehouseTypeLangLang;
    }

    public void setWarehouseTypeLangLang(String warehouseTypeLangLang) {
        this.warehouseTypeLangLang = warehouseTypeLangLang;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getStockoutStatusLangLang() {
        return stockoutStatusLangLang;
    }

    public void setStockoutStatusLangLang(String stockoutStatusLangLang) {
        this.stockoutStatusLangLang = stockoutStatusLangLang;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus;
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

    public Double getStockoutNum() {
        return stockoutNum;
    }

    public void setStockoutNum(Double stockoutNum) {
        this.stockoutNum = stockoutNum;
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getStockoutArea() {
        return stockoutArea;
    }

    public void setStockoutArea(Double stockoutArea) {
        this.stockoutArea = stockoutArea;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getUseUser() {
        return useUser;
    }

    public void setUseUser(String useUser) {
        this.useUser = useUser;
    }

    public String getYardLangLang() {
        return yardLangLang;
    }

    public void setYardLangLang(String yardLangLang) {
        this.yardLangLang = yardLangLang;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public Double getStockNum() {
        return stockNum;
    }

    public void setStockNum(Double stockNum) {
        this.stockNum = stockNum;
    }

    public Double getOutNum() {
        return outNum;
    }

    public void setOutNum(Double outNum) {
        this.outNum = outNum;
    }

    public Double getOutArea() {
        return outArea;
    }

    public void setOutArea(Double outArea) {
        this.outArea = outArea;
    }

    public Double getStockArea() {
        return stockArea;
    }

    public void setStockArea(Double stockArea) {
        this.stockArea = stockArea;
    }

    public Double getStockoutSurplusNum() {
        return stockoutSurplusNum;
    }

    public void setStockoutSurplusNum(Double stockoutSurplusNum) {
        this.stockoutSurplusNum = stockoutSurplusNum;
    }

    public Double getStockoutSurplusArea() {
        return stockoutSurplusArea;
    }

    public void setStockoutSurplusArea(Double stockoutSurplusArea) {
        this.stockoutSurplusArea = stockoutSurplusArea;
    }
}

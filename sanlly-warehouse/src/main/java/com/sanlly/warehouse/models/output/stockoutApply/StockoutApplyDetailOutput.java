package com.sanlly.warehouse.models.output.stockoutApply;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * ClassName: StockoutApplyDetailOutput
 * Description: 出库申请明细输出类
 * date: 2019/8/16 13:05
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("出库申请明细输出类")
public class StockoutApplyDetailOutput {

    @ApiModelProperty(name = "wareStockoutOrderDetailId",value = "出库申请单明细Id")
    private Integer wareStockoutOrderDetailId;

    @ApiModelProperty(name = "wareStockoutApplyId",value = "出库申请单id")
    private Integer wareStockoutApplyId;

    @ApiModelProperty(name = "defaultWarehouseType",value = "默认仓库类型")
    private String defaultWarehouseType;
    private String defaultWarehouseTypeLangLang;

    @ApiModelProperty(name = "stockoutStatus",value = "出库状态")
    private String stockoutStatus;
    private String stockoutStatusLangLang;

    @ApiModelProperty(name = "stockoutNum",value = "出库数量")
    private Double stockoutNum;

    @ApiModelProperty(name = "stockNum",value = "库存数量")
    private Double stockNum;

    @ApiModelProperty(name = "sparePartsBatch",value = "备件批次")
    private String sparePartsBatch;

    @ApiModelProperty(value = "库位",name = "storageLocation")
    private String storageLocation;

    @ApiModelProperty(name = "spareParts",value = "备件")
    private String spareParts;
    private String sparePartsLangLang;

    @ApiModelProperty(value = "备件大类",name = "sparePartsCategoriesLang")
    private String sparePartsCategoriesLangLang;
    private String sparePartsCategories;

    @ApiModelProperty(value = "仓库类型",name = "warehouseTypeLang")
    private String warehouseTypeLangLang;
    private String warehouseType;

    @ApiModelProperty(value = "备件号",name = "sparePartsNo")
    private String sparePartsNo;

    @ApiModelProperty(name = "length",value = "长度")
    private Double length;

    @ApiModelProperty(name = "width",value = "宽度")
    private Double width;

    @ApiModelProperty(name = "stockoutArea",value = "出库面积")
    private Double stockoutArea;

    @ApiModelProperty(name = "totalAmount",value = "总金额")
    private BigDecimal totalAmount;

    @ApiModelProperty(name = "useUser",value = "使用人")
    private String useUser;

    @ApiModelProperty(name = "stockoutSurplusNum",value = "剩余出库数量")
    private Double stockoutSurplusNum;

    @ApiModelProperty(name = "outNum",value = "本次出库数量")
    private Double outNum;

    @ApiModelProperty(name = "yard",value = "场站")
    private String yard;
    private String yardLangLang;
    
    @ApiModelProperty(name = "containerNo",value = "箱号")
    private String containerNo;

    
    public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public Integer getWareStockoutOrderDetailId() {
        return wareStockoutOrderDetailId;
    }

    public void setWareStockoutOrderDetailId(Integer wareStockoutOrderDetailId) {
        this.wareStockoutOrderDetailId = wareStockoutOrderDetailId;
    }

    public Double getStockoutSurplusNum() {
        return stockoutSurplusNum;
    }

    public Double getOutNum() {
        return outNum;
    }

    public void setOutNum(Double outNum) {
        this.outNum = outNum;
    }

    public void setStockoutSurplusNum(Double stockoutSurplusNum) {
        this.stockoutSurplusNum = stockoutSurplusNum;
    }

    public Integer getWareStockoutApplyId() {
        return wareStockoutApplyId;
    }

    public void setWareStockoutApplyId(Integer wareStockoutApplyId) {
        this.wareStockoutApplyId = wareStockoutApplyId;
    }

    public String getDefaultWarehouseType() {
        return defaultWarehouseType;
    }

    public void setDefaultWarehouseType(String defaultWarehouseType) {
        this.defaultWarehouseType = defaultWarehouseType;
    }

    public String getDefaultWarehouseTypeLangLang() {
        return defaultWarehouseTypeLangLang;
    }

    public void setDefaultWarehouseTypeLangLang(String defaultWarehouseTypeLangLang) {
        this.defaultWarehouseTypeLangLang = defaultWarehouseTypeLangLang;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus;
    }

    public String getStockoutStatusLangLang() {
        return stockoutStatusLangLang;
    }

    public void setStockoutStatusLangLang(String stockoutStatusLangLang) {
        this.stockoutStatusLangLang = stockoutStatusLangLang;
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

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
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

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getYardLangLang() {
        return yardLangLang;
    }

    public void setYardLangLang(String yardLangLang) {
        this.yardLangLang = yardLangLang;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
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

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public Double getStockNum() {
        return stockNum;
    }

    public void setStockNum(Double stockNum) {
        this.stockNum = stockNum;
    }


}

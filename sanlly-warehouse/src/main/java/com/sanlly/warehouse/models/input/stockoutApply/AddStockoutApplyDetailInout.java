package com.sanlly.warehouse.models.input.stockoutApply;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * ClassName: AddStockoutApplyDetailInout
 * Description: 新增出库申请详情输入类
 * date: 2019/8/16 13:14
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("新增出库申请详情输入类")
public class AddStockoutApplyDetailInout {

    @ApiModelProperty(name = "defaultWarehouseType",value = "默认仓库类型")
    private String defaultWarehouseType;

    @ApiModelProperty(name = "stockoutNum",value = "出库数量")
    private Double stockoutNum;

    @ApiModelProperty(name = "sparePartsBatch",value = "备件批次")
    private String sparePartsBatch;

    @ApiModelProperty(name = "spareParts",value = "备件")
    private String spareParts;

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

    @ApiModelProperty(name = "yard",value = "场站")
    private String yard;

    public String getDefaultWarehouseType() {
        return defaultWarehouseType;
    }

    public void setDefaultWarehouseType(String defaultWarehouseType) {
        this.defaultWarehouseType = defaultWarehouseType;
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
}

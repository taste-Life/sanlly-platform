package com.sanlly.warehouse.models.input.stockout;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: AddStockoutDetailInput
 * Description: 新增出库单明细输入类
 * date: 2019/8/6 14:53
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("新增出库单明细输入类")
public class AddStockoutDetailAppInput {

    @ApiModelProperty(value = "默认仓库类型",name = "defaultWarehouseType")
    private String defaultWarehouseType;

    @ApiModelProperty(value = "出库数量",name = "stockoutNum")
    private Double stockoutNum;

    @ApiModelProperty(value = "备件批次号",name = "sparePartsBatch")
    private String sparePartsBatch;

    @ApiModelProperty(value = "备件key",name = "spareParts")
    private String spareParts;

    @ApiModelProperty(value = "使用人",name = "useUser")
    private String useUser;

    @ApiModelProperty(value = "场站",name = "yard")
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

    @Override
    public String toString() {
        return "AddStockoutDetailInput{" +
                "defaultWarehouseType='" + defaultWarehouseType + '\'' +
                ", stockoutNum=" + stockoutNum +
                ", sparePartsBatch='" + sparePartsBatch + '\'' +
                ", spareParts='" + spareParts + '\'' +
                ", useUser='" + useUser + '\'' +
                ", yard='" + yard + '\'' +
                '}';
    }
}

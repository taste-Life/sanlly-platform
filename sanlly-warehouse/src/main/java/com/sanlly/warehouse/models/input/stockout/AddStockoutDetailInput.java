package com.sanlly.warehouse.models.input.stockout;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * ClassName: AddStockoutDetailInput
 * Description: 新增出库单明细输入类
 * date: 2019/8/6 14:53
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("新增出库单明细输入类")
public class AddStockoutDetailInput {

    @ApiModelProperty(value = "默认仓库类型",name = "defaultWarehouseType")
    private String defaultWarehouseType;

    @ApiModelProperty(value = "出库数量",name = "stockoutNum")
    private Double stockoutNum;

    @ApiModelProperty(value = "领料数量",name = "prodNum")
    private Double prodNum;

    @ApiModelProperty(value = "出库面积",name = "stockoutArea")
    private Double stockoutArea;

    @ApiModelProperty(value = "出库长度",name = "stockoutLength")
    private Double stockoutLength;

    @ApiModelProperty(value = "备件批次号",name = "sparePartsBatch")
    private String sparePartsBatch;

    @ApiModelProperty(value = "备件key",name = "spareParts")
    private String spareParts;

    @ApiModelProperty(value = "使用人",name = "useUser")
    private Integer useUser;

    @ApiModelProperty(value = "场站",name = "yard")
    private String yard;

    @ApiModelProperty(value = "箱号",name = "containerNo")
    private String containerNo;

    @ApiModelProperty(value = "领料单明细ID",name = "referralDetailId")
    private String referralDetailId;
    
    private String stockoutStatus;//出库状态

    public Double getProdNum() {
        return prodNum;
    }

    public void setProdNum(Double prodNum) {
        this.prodNum = prodNum;
    }

    public Double getStockoutLength() {
        return stockoutLength;
    }

    public void setStockoutLength(Double stockoutLength) {
        this.stockoutLength = stockoutLength;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public String getReferralDetailId() {
        return referralDetailId;
    }

    public void setReferralDetailId(String referralDetailId) {
        this.referralDetailId = referralDetailId;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public String getStockoutStatus() {
		return stockoutStatus;
	}

	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}

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

    public Integer getUseUser() {
        return useUser;
    }

    public void setUseUser(Integer useUser) {
        this.useUser = useUser;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public Double getStockoutArea() {
        return stockoutArea;
    }

    public void setStockoutArea(Double stockoutArea) {
        this.stockoutArea = stockoutArea;
    }

    @Override
    public String toString() {
        return "AddStockoutDetailInput{" +
                "defaultWarehouseType='" + defaultWarehouseType + '\'' +
                ", stockoutNum=" + stockoutNum +
                ", stockoutArea=" + stockoutArea +
                ", sparePartsBatch='" + sparePartsBatch + '\'' +
                ", spareParts='" + spareParts + '\'' +
                ", useUser='" + useUser + '\'' +
                ", yard='" + yard + '\'' +
                ", containerNo='" + containerNo + '\'' +
                ", stockoutStatus='" + stockoutStatus + '\'' +
                '}';
    }
}

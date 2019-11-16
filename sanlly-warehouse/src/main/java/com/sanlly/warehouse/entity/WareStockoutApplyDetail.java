package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareStockoutApplyDetail {
    private Integer wareStockoutOrderDetailId;

    private Integer wareStockoutApplyId;

    private String defaultWarehouseType;

    private String stockoutStatus;

    private Double stockoutNum;

    private String sparePartsBatch;

    private String spareParts;

    private Double length;

    private Double width;

    private Double stockoutArea;

    private BigDecimal totalAmount;

    private String useUser;

    private String yard;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Double stockoutSurplusArea;

    private Double stockoutSurplusNum;

    private String containerNo;

    public Integer getWareStockoutOrderDetailId() {
        return wareStockoutOrderDetailId;
    }

    public void setWareStockoutOrderDetailId(Integer wareStockoutOrderDetailId) {
        this.wareStockoutOrderDetailId = wareStockoutOrderDetailId;
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
        this.defaultWarehouseType = defaultWarehouseType == null ? null : defaultWarehouseType.trim();
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus == null ? null : stockoutStatus.trim();
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
        this.sparePartsBatch = sparePartsBatch == null ? null : sparePartsBatch.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
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
        this.useUser = useUser == null ? null : useUser.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Double getStockoutSurplusArea() {
        return stockoutSurplusArea;
    }

    public void setStockoutSurplusArea(Double stockoutSurplusArea) {
        this.stockoutSurplusArea = stockoutSurplusArea;
    }

    public Double getStockoutSurplusNum() {
        return stockoutSurplusNum;
    }

    public void setStockoutSurplusNum(Double stockoutSurplusNum) {
        this.stockoutSurplusNum = stockoutSurplusNum;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }
}
package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareEntrustedProcessingMaterial {
    private Integer wareEntrustedProcessingMaterialId;

    private String entrustedProcessingNo;

    private String spareParts;

    private String warehouseType;

    private String warehouse;

    private String company;

    private String stockoutStatus;

    private BigDecimal price;

    private Double processingNum;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareEntrustedProcessingMaterialId() {
        return wareEntrustedProcessingMaterialId;
    }

    public void setWareEntrustedProcessingMaterialId(Integer wareEntrustedProcessingMaterialId) {
        this.wareEntrustedProcessingMaterialId = wareEntrustedProcessingMaterialId;
    }

    public String getEntrustedProcessingNo() {
        return entrustedProcessingNo;
    }

    public void setEntrustedProcessingNo(String entrustedProcessingNo) {
        this.entrustedProcessingNo = entrustedProcessingNo == null ? null : entrustedProcessingNo.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType == null ? null : warehouseType.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus == null ? null : stockoutStatus.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getProcessingNum() {
        return processingNum;
    }

    public void setProcessingNum(Double processingNum) {
        this.processingNum = processingNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}
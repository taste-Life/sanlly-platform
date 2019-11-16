package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RepairReportDetail {
    private Integer wareReportDetailId;

    private Integer wareRepairReportId;

    private String spareParts;

    private Double num;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String warehouse;

    private String warehouseType;

    private String sparePartsBatch;

    private String outStatus;

    private BigDecimal price;

    public Integer getWareReportDetailId() {
        return wareReportDetailId;
    }

    public void setWareReportDetailId(Integer wareReportDetailId) {
        this.wareReportDetailId = wareReportDetailId;
    }

    public Integer getWareRepairReportId() {
        return wareRepairReportId;
    }

    public void setWareRepairReportId(Integer wareRepairReportId) {
        this.wareRepairReportId = wareRepairReportId;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType == null ? null : warehouseType.trim();
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch == null ? null : sparePartsBatch.trim();
    }

    public String getOutStatus() {
        return outStatus;
    }

    public void setOutStatus(String outStatus) {
        this.outStatus = outStatus == null ? null : outStatus.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
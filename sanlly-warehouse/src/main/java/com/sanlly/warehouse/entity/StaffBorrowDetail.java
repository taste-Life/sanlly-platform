package com.sanlly.warehouse.entity;

import java.util.Date;

public class StaffBorrowDetail {
    private Integer wareStaffBorrowDetailId;

    private Integer wareStaffBorrow;

    private String sparePartsCategories;

    private String containerNo;

    private String spareParts;

    private String warehouseType;

    private String storageLocation;

    private Double borrowNum;

    private Double returnNum;

    private String billStatus;

    private Double upperContainerNum;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String sparePartsBatch;

    private String warehouse;

    private String sparePartsOriginalBatch;

    public Integer getWareStaffBorrowDetailId() {
        return wareStaffBorrowDetailId;
    }

    public void setWareStaffBorrowDetailId(Integer wareStaffBorrowDetailId) {
        this.wareStaffBorrowDetailId = wareStaffBorrowDetailId;
    }

    public Integer getWareStaffBorrow() {
        return wareStaffBorrow;
    }

    public void setWareStaffBorrow(Integer wareStaffBorrow) {
        this.wareStaffBorrow = wareStaffBorrow;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories == null ? null : sparePartsCategories.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
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

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation == null ? null : storageLocation.trim();
    }

    public Double getBorrowNum() {
        return borrowNum;
    }

    public void setBorrowNum(Double borrowNum) {
        this.borrowNum = borrowNum;
    }

    public Double getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Double returnNum) {
        this.returnNum = returnNum;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public Double getUpperContainerNum() {
        return upperContainerNum;
    }

    public void setUpperContainerNum(Double upperContainerNum) {
        this.upperContainerNum = upperContainerNum;
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

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch == null ? null : sparePartsBatch.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getSparePartsOriginalBatch() {
        return sparePartsOriginalBatch;
    }

    public void setSparePartsOriginalBatch(String sparePartsOriginalBatch) {
        this.sparePartsOriginalBatch = sparePartsOriginalBatch == null ? null : sparePartsOriginalBatch.trim();
    }
}
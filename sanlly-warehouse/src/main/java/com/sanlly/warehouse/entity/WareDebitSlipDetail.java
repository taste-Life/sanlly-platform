package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareDebitSlipDetail {
    private Integer wareDebitSlipDetailId;

    private Integer wareDebitSlip;

    private String sparePartsCategories;

    private String spareParts;

    private String warehouseType;

    private Double borrowNum;

    private Double returnNum;

    private Double upperContainerNum;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareDebitSlipDetailId() {
        return wareDebitSlipDetailId;
    }

    public void setWareDebitSlipDetailId(Integer wareDebitSlipDetailId) {
        this.wareDebitSlipDetailId = wareDebitSlipDetailId;
    }

    public Integer getWareDebitSlip() {
        return wareDebitSlip;
    }

    public void setWareDebitSlip(Integer wareDebitSlip) {
        this.wareDebitSlip = wareDebitSlip;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories == null ? null : sparePartsCategories.trim();
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
}
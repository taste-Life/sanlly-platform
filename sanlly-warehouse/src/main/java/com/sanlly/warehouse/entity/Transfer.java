package com.sanlly.warehouse.entity;

import java.util.Date;

public class Transfer {
    private Integer wareTransferId;

    private String transferSlipNo;

    private String billType;

    private String sparePartsCategories;

    private String outWarehouse;

    private String company;

    private String outWarehouseType;

    private String billStatus;

    private String inWarehouse;

    private String inWarehouseType;

    private String auditStatus;

    private String reasonsRejection;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer category;

    private String remark;

    public Integer getWareTransferId() {
        return wareTransferId;
    }

    public void setWareTransferId(Integer wareTransferId) {
        this.wareTransferId = wareTransferId;
    }

    public String getTransferSlipNo() {
        return transferSlipNo;
    }

    public void setTransferSlipNo(String transferSlipNo) {
        this.transferSlipNo = transferSlipNo == null ? null : transferSlipNo.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories == null ? null : sparePartsCategories.trim();
    }

    public String getOutWarehouse() {
        return outWarehouse;
    }

    public void setOutWarehouse(String outWarehouse) {
        this.outWarehouse = outWarehouse == null ? null : outWarehouse.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getOutWarehouseType() {
        return outWarehouseType;
    }

    public void setOutWarehouseType(String outWarehouseType) {
        this.outWarehouseType = outWarehouseType == null ? null : outWarehouseType.trim();
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public String getInWarehouse() {
        return inWarehouse;
    }

    public void setInWarehouse(String inWarehouse) {
        this.inWarehouse = inWarehouse == null ? null : inWarehouse.trim();
    }

    public String getInWarehouseType() {
        return inWarehouseType;
    }

    public void setInWarehouseType(String inWarehouseType) {
        this.inWarehouseType = inWarehouseType == null ? null : inWarehouseType.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getReasonsRejection() {
        return reasonsRejection;
    }

    public void setReasonsRejection(String reasonsRejection) {
        this.reasonsRejection = reasonsRejection == null ? null : reasonsRejection.trim();
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

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
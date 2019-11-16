package com.sanlly.warehouse.entity;

import java.util.Date;

public class WarePurchaseRequisitions {
    private Integer warePurchaseRequisitionsId;

    private String purchaseRequisitionsNo;

    private String spareParts;

    private String warehouse;

    private String purchasingPattern;

    private String warehouseType;

    private Double applyNum;

    private String auditStatus;

    private String reasonsRejection;

    private String type;

    private Integer isDel;

    private String remark;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Date requireArriveTime;

    public Integer getWarePurchaseRequisitionsId() {
        return warePurchaseRequisitionsId;
    }

    public void setWarePurchaseRequisitionsId(Integer warePurchaseRequisitionsId) {
        this.warePurchaseRequisitionsId = warePurchaseRequisitionsId;
    }

    public String getPurchaseRequisitionsNo() {
        return purchaseRequisitionsNo;
    }

    public void setPurchaseRequisitionsNo(String purchaseRequisitionsNo) {
        this.purchaseRequisitionsNo = purchaseRequisitionsNo == null ? null : purchaseRequisitionsNo.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getPurchasingPattern() {
        return purchasingPattern;
    }

    public void setPurchasingPattern(String purchasingPattern) {
        this.purchasingPattern = purchasingPattern == null ? null : purchasingPattern.trim();
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType == null ? null : warehouseType.trim();
    }

    public Double getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(Double applyNum) {
        this.applyNum = applyNum;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Date getRequireArriveTime() {
        return requireArriveTime;
    }

    public void setRequireArriveTime(Date requireArriveTime) {
        this.requireArriveTime = requireArriveTime;
    }
}
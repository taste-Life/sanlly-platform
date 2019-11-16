package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareSellProgramme {
    private Integer wareSellProgrammeId;

    private String advanceWarehouseReceiptNo;

    private String sellProgrammeNo;

    private String applyType;

    private String company;

    private String applyDepartment;

    private String buyer;

    private Integer applyUser;

    private BigDecimal totalAmount;

    private String stockoutStatus;

    private String applyDetails;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String status;

    private String isStockSbs;

    private String buyerUser;

    public Integer getWareSellProgrammeId() {
        return wareSellProgrammeId;
    }

    public void setWareSellProgrammeId(Integer wareSellProgrammeId) {
        this.wareSellProgrammeId = wareSellProgrammeId;
    }

    public String getAdvanceWarehouseReceiptNo() {
        return advanceWarehouseReceiptNo;
    }

    public void setAdvanceWarehouseReceiptNo(String advanceWarehouseReceiptNo) {
        this.advanceWarehouseReceiptNo = advanceWarehouseReceiptNo == null ? null : advanceWarehouseReceiptNo.trim();
    }

    public String getSellProgrammeNo() {
        return sellProgrammeNo;
    }

    public void setSellProgrammeNo(String sellProgrammeNo) {
        this.sellProgrammeNo = sellProgrammeNo == null ? null : sellProgrammeNo.trim();
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getApplyDepartment() {
        return applyDepartment;
    }

    public void setApplyDepartment(String applyDepartment) {
        this.applyDepartment = applyDepartment == null ? null : applyDepartment.trim();
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    public Integer getApplyUser() {
        return applyUser;
    }

    public void setApplyUser(Integer applyUser) {
        this.applyUser = applyUser;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus == null ? null : stockoutStatus.trim();
    }

    public String getApplyDetails() {
        return applyDetails;
    }

    public void setApplyDetails(String applyDetails) {
        this.applyDetails = applyDetails == null ? null : applyDetails.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsStockSbs() {
        return isStockSbs;
    }

    public void setIsStockSbs(String isStockSbs) {
        this.isStockSbs = isStockSbs == null ? null : isStockSbs.trim();
    }

    public String getBuyerUser() {
        return buyerUser;
    }

    public void setBuyerUser(String buyerUser) {
        this.buyerUser = buyerUser == null ? null : buyerUser.trim();
    }
}
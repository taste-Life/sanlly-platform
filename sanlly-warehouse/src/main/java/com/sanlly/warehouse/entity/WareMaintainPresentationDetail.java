package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareMaintainPresentationDetail {
    private Integer wareMaintainPresentationDetailId;

    private Integer wareMaintainPresentation;

    private String spareParts;

    private BigDecimal processingCharges;

    private Double sparePartsNum;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String invoiceType;

    public Integer getWareMaintainPresentationDetailId() {
        return wareMaintainPresentationDetailId;
    }

    public void setWareMaintainPresentationDetailId(Integer wareMaintainPresentationDetailId) {
        this.wareMaintainPresentationDetailId = wareMaintainPresentationDetailId;
    }

    public Integer getWareMaintainPresentation() {
        return wareMaintainPresentation;
    }

    public void setWareMaintainPresentation(Integer wareMaintainPresentation) {
        this.wareMaintainPresentation = wareMaintainPresentation;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public BigDecimal getProcessingCharges() {
        return processingCharges;
    }

    public void setProcessingCharges(BigDecimal processingCharges) {
        this.processingCharges = processingCharges;
    }

    public Double getSparePartsNum() {
        return sparePartsNum;
    }

    public void setSparePartsNum(Double sparePartsNum) {
        this.sparePartsNum = sparePartsNum;
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

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }
}
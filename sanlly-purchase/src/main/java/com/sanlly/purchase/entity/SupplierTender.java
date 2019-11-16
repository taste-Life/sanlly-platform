package com.sanlly.purchase.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SupplierTender {
    private Integer purcSupplierTenderId;

    private Integer tenderPurchaseId;

    private String supplier;

    private String tenderType;

    private String tenderId;

    private Integer rank;

    private BigDecimal total;

    private Integer inquiryNum;

    private Integer biddingNum;

    private String status;

    private String remark;

    private Integer createUser;

    private Date createTime;

    private Date updateTime;

    private Integer updateUser;

    private String isWin;

    public Integer getPurcSupplierTenderId() {
        return purcSupplierTenderId;
    }

    public void setPurcSupplierTenderId(Integer purcSupplierTenderId) {
        this.purcSupplierTenderId = purcSupplierTenderId;
    }

    public Integer getTenderPurchaseId() {
        return tenderPurchaseId;
    }

    public void setTenderPurchaseId(Integer tenderPurchaseId) {
        this.tenderPurchaseId = tenderPurchaseId;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getTenderType() {
        return tenderType;
    }

    public void setTenderType(String tenderType) {
        this.tenderType = tenderType == null ? null : tenderType.trim();
    }

    public String getTenderId() {
        return tenderId;
    }

    public void setTenderId(String tenderId) {
        this.tenderId = tenderId == null ? null : tenderId.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getInquiryNum() {
        return inquiryNum;
    }

    public void setInquiryNum(Integer inquiryNum) {
        this.inquiryNum = inquiryNum;
    }

    public Integer getBiddingNum() {
        return biddingNum;
    }

    public void setBiddingNum(Integer biddingNum) {
        this.biddingNum = biddingNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getIsWin() {
        return isWin;
    }

    public void setIsWin(String isWin) {
        this.isWin = isWin == null ? null : isWin.trim();
    }
}
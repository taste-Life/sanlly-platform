package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BorrowRepayDetail {
    private Integer borrowRepayDetailId;

    private Integer borrowRepayId;

    private String spareParts;

    private String sparePartsBatch;

    private Integer borrowLendDetailId;

    private Double repayNum;

    private BigDecimal repayPrice;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getBorrowRepayDetailId() {
        return borrowRepayDetailId;
    }

    public void setBorrowRepayDetailId(Integer borrowRepayDetailId) {
        this.borrowRepayDetailId = borrowRepayDetailId;
    }

    public Integer getBorrowRepayId() {
        return borrowRepayId;
    }

    public void setBorrowRepayId(Integer borrowRepayId) {
        this.borrowRepayId = borrowRepayId;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch == null ? null : sparePartsBatch.trim();
    }

    public Integer getBorrowLendDetailId() {
        return borrowLendDetailId;
    }

    public void setBorrowLendDetailId(Integer borrowLendDetailId) {
        this.borrowLendDetailId = borrowLendDetailId;
    }

    public Double getRepayNum() {
        return repayNum;
    }

    public void setRepayNum(Double repayNum) {
        this.repayNum = repayNum;
    }

    public BigDecimal getRepayPrice() {
        return repayPrice;
    }

    public void setRepayPrice(BigDecimal repayPrice) {
        this.repayPrice = repayPrice;
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
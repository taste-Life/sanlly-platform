package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class LendSaleDetail {
    private Integer lendSaleDetailId;

    private Integer lendSaleId;

    private String spareParts;

    private String sparePartsBatch;

    private Integer borrowLendDetailId;

    private BigDecimal salePrice;

    private Double saleNum;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getLendSaleDetailId() {
        return lendSaleDetailId;
    }

    public void setLendSaleDetailId(Integer lendSaleDetailId) {
        this.lendSaleDetailId = lendSaleDetailId;
    }

    public Integer getLendSaleId() {
        return lendSaleId;
    }

    public void setLendSaleId(Integer lendSaleId) {
        this.lendSaleId = lendSaleId;
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

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Double getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Double saleNum) {
        this.saleNum = saleNum;
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
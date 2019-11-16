package com.sanlly.warehouse.entity;

import java.util.Date;

public class BorrowRepay {
    private Integer borrowRepayId;

    private Integer isDel;

    private String remark;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String billStatus;

    private Integer borrowLendId;

    public Integer getBorrowRepayId() {
        return borrowRepayId;
    }

    public void setBorrowRepayId(Integer borrowRepayId) {
        this.borrowRepayId = borrowRepayId;
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

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public Integer getBorrowLendId() {
        return borrowLendId;
    }

    public void setBorrowLendId(Integer borrowLendId) {
        this.borrowLendId = borrowLendId;
    }
}
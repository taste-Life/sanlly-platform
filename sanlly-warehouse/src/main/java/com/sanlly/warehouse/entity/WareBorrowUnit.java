package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareBorrowUnit {
    private Integer wareBorrowUnitId;

    private String key;

    private String borrowUnitEn;

    private String borrowUnitName;

    private String code;

    private String costCenter;

    private String isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareBorrowUnitId() {
        return wareBorrowUnitId;
    }

    public void setWareBorrowUnitId(Integer wareBorrowUnitId) {
        this.wareBorrowUnitId = wareBorrowUnitId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getBorrowUnitEn() {
        return borrowUnitEn;
    }

    public void setBorrowUnitEn(String borrowUnitEn) {
        this.borrowUnitEn = borrowUnitEn == null ? null : borrowUnitEn.trim();
    }

    public String getBorrowUnitName() {
        return borrowUnitName;
    }

    public void setBorrowUnitName(String borrowUnitName) {
        this.borrowUnitName = borrowUnitName == null ? null : borrowUnitName.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter == null ? null : costCenter.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
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
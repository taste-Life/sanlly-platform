package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareReturnSlipDetail {
    private Integer wareReturnSlipDetailId;

    private Integer wareReturnSlipId;

    private String sparePartsBatch;

    private String spareParts;

    private Double entryNum;

    private Integer isDel;

    private Double returnNum;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareReturnSlipDetailId() {
        return wareReturnSlipDetailId;
    }

    public void setWareReturnSlipDetailId(Integer wareReturnSlipDetailId) {
        this.wareReturnSlipDetailId = wareReturnSlipDetailId;
    }

    public Integer getWareReturnSlipId() {
        return wareReturnSlipId;
    }

    public void setWareReturnSlipId(Integer wareReturnSlipId) {
        this.wareReturnSlipId = wareReturnSlipId;
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch == null ? null : sparePartsBatch.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public Double getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(Double entryNum) {
        this.entryNum = entryNum;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Double getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Double returnNum) {
        this.returnNum = returnNum;
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
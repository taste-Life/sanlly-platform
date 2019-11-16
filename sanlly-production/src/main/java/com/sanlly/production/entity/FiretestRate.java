package com.sanlly.production.entity;

import java.util.Date;

public class FiretestRate {
    private Integer prodFiretestRateId;

    private String yard;

    private String containerUser;

    private String containerSize;

    private String costType;

    private Long firetestRate;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdFiretestRateId() {
        return prodFiretestRateId;
    }

    public void setProdFiretestRateId(Integer prodFiretestRateId) {
        this.prodFiretestRateId = prodFiretestRateId;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(String containerSize) {
        this.containerSize = containerSize == null ? null : containerSize.trim();
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType == null ? null : costType.trim();
    }

    public Long getFiretestRate() {
        return firetestRate;
    }

    public void setFiretestRate(Long firetestRate) {
        this.firetestRate = firetestRate;
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
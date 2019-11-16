package com.sanlly.production.entity;

import java.util.Date;

public class PtiRate {
    private Integer prodPtiRateId;

    private String yard;

    private Integer containerUser;

    private String containerSize;

    private String ptiType;

    private Long ptiRate;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdPtiRateId() {
        return prodPtiRateId;
    }

    public void setProdPtiRateId(Integer prodPtiRateId) {
        this.prodPtiRateId = prodPtiRateId;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public Integer getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(Integer containerUser) {
        this.containerUser = containerUser;
    }

    public String getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(String containerSize) {
        this.containerSize = containerSize == null ? null : containerSize.trim();
    }

    public String getPtiType() {
        return ptiType;
    }

    public void setPtiType(String ptiType) {
        this.ptiType = ptiType == null ? null : ptiType.trim();
    }

    public Long getPtiRate() {
        return ptiRate;
    }

    public void setPtiRate(Long ptiRate) {
        this.ptiRate = ptiRate;
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
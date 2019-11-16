package com.sanlly.production.entity;

import java.util.Date;

public class OutContainer {
    private Integer prodOutContainerId;

    private String container;

    private String containerNo;

    private String batchNumber;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String oldZone;

    public Integer getProdOutContainerId() {
        return prodOutContainerId;
    }

    public void setProdOutContainerId(Integer prodOutContainerId) {
        this.prodOutContainerId = prodOutContainerId;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container == null ? null : container.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
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

    public String getOldZone() {
        return oldZone;
    }

    public void setOldZone(String oldZone) {
        this.oldZone = oldZone == null ? null : oldZone.trim();
    }
}
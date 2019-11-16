package com.sanlly.production.entity;

import java.util.Date;

public class Container {
    private String prodContainerId;

    private String containerNo;

    private String size;

    private String containerCategory;

    private String containerType;

    private String containerAge;

    private String containerTare;

    private String containerLoad;

    private String containerVolume;

    private String unitType;

    private String rightAngle;

    private String isLabel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public String getProdContainerId() {
        return prodContainerId;
    }

    public void setProdContainerId(String prodContainerId) {
        this.prodContainerId = prodContainerId == null ? null : prodContainerId.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType == null ? null : containerType.trim();
    }

    public String getContainerAge() {
        return containerAge;
    }

    public void setContainerAge(String containerAge) {
        this.containerAge = containerAge == null ? null : containerAge.trim();
    }

    public String getContainerTare() {
        return containerTare;
    }

    public void setContainerTare(String containerTare) {
        this.containerTare = containerTare == null ? null : containerTare.trim();
    }

    public String getContainerLoad() {
        return containerLoad;
    }

    public void setContainerLoad(String containerLoad) {
        this.containerLoad = containerLoad == null ? null : containerLoad.trim();
    }

    public String getContainerVolume() {
        return containerVolume;
    }

    public void setContainerVolume(String containerVolume) {
        this.containerVolume = containerVolume == null ? null : containerVolume.trim();
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType == null ? null : unitType.trim();
    }

    public String getRightAngle() {
        return rightAngle;
    }

    public void setRightAngle(String rightAngle) {
        this.rightAngle = rightAngle == null ? null : rightAngle.trim();
    }

    public String getIsLabel() {
        return isLabel;
    }

    public void setIsLabel(String isLabel) {
        this.isLabel = isLabel == null ? null : isLabel.trim();
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
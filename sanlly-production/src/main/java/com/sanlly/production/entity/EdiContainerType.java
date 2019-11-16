package com.sanlly.production.entity;

import java.util.Date;

public class EdiContainerType {
    private Integer prodEdiContainerTypeId;

    private String size;

    private String containerType;

    private String iso95;

    private String sizeIso95;

    private String typeIso95;

    private String maxGross;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdEdiContainerTypeId() {
        return prodEdiContainerTypeId;
    }

    public void setProdEdiContainerTypeId(Integer prodEdiContainerTypeId) {
        this.prodEdiContainerTypeId = prodEdiContainerTypeId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType == null ? null : containerType.trim();
    }

    public String getIso95() {
        return iso95;
    }

    public void setIso95(String iso95) {
        this.iso95 = iso95 == null ? null : iso95.trim();
    }

    public String getSizeIso95() {
        return sizeIso95;
    }

    public void setSizeIso95(String sizeIso95) {
        this.sizeIso95 = sizeIso95 == null ? null : sizeIso95.trim();
    }

    public String getTypeIso95() {
        return typeIso95;
    }

    public void setTypeIso95(String typeIso95) {
        this.typeIso95 = typeIso95 == null ? null : typeIso95.trim();
    }

    public String getMaxGross() {
        return maxGross;
    }

    public void setMaxGross(String maxGross) {
        this.maxGross = maxGross == null ? null : maxGross.trim();
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
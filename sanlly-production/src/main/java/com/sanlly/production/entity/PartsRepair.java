package com.sanlly.production.entity;

import java.util.Date;

public class PartsRepair {
    private Integer prodPartsRepairId;

    private String key;

    private String containerCategory;

    private String type;

    private String partsRepairCode;

    private String partsRepairName;

    private String partsRepairNameEn;

    private Integer useNumber;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdPartsRepairId() {
        return prodPartsRepairId;
    }

    public void setProdPartsRepairId(Integer prodPartsRepairId) {
        this.prodPartsRepairId = prodPartsRepairId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPartsRepairCode() {
        return partsRepairCode;
    }

    public void setPartsRepairCode(String partsRepairCode) {
        this.partsRepairCode = partsRepairCode == null ? null : partsRepairCode.trim();
    }

    public String getPartsRepairName() {
        return partsRepairName;
    }

    public void setPartsRepairName(String partsRepairName) {
        this.partsRepairName = partsRepairName == null ? null : partsRepairName.trim();
    }

    public String getPartsRepairNameEn() {
        return partsRepairNameEn;
    }

    public void setPartsRepairNameEn(String partsRepairNameEn) {
        this.partsRepairNameEn = partsRepairNameEn == null ? null : partsRepairNameEn.trim();
    }

    public Integer getUseNumber() {
        return useNumber;
    }

    public void setUseNumber(Integer useNumber) {
        this.useNumber = useNumber;
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
package com.sanlly.production.entity;

import java.util.Date;

public class CommonRepair {
    private Integer prodCommonRepairId;

    private String commonRepairCode;

    private String commonRepairName;

    private String positionCode;

    private String partsDetailsCode;

    private String repairCode;

    private String partsRepairCode;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdCommonRepairId() {
        return prodCommonRepairId;
    }

    public void setProdCommonRepairId(Integer prodCommonRepairId) {
        this.prodCommonRepairId = prodCommonRepairId;
    }

    public String getCommonRepairCode() {
        return commonRepairCode;
    }

    public void setCommonRepairCode(String commonRepairCode) {
        this.commonRepairCode = commonRepairCode == null ? null : commonRepairCode.trim();
    }

    public String getCommonRepairName() {
        return commonRepairName;
    }

    public void setCommonRepairName(String commonRepairName) {
        this.commonRepairName = commonRepairName == null ? null : commonRepairName.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
    }

    public String getPartsDetailsCode() {
        return partsDetailsCode;
    }

    public void setPartsDetailsCode(String partsDetailsCode) {
        this.partsDetailsCode = partsDetailsCode == null ? null : partsDetailsCode.trim();
    }

    public String getRepairCode() {
        return repairCode;
    }

    public void setRepairCode(String repairCode) {
        this.repairCode = repairCode == null ? null : repairCode.trim();
    }

    public String getPartsRepairCode() {
        return partsRepairCode;
    }

    public void setPartsRepairCode(String partsRepairCode) {
        this.partsRepairCode = partsRepairCode == null ? null : partsRepairCode.trim();
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
package com.sanlly.production.entity;

import java.util.Date;

public class UnitMaintenance {
    private Integer prodUnitMaintenanceId;

    private String unit;

    private String unitCompany;

    private String unitType;

    private Integer entireRepairTime;

    private Integer winderRepairTime;

    private Integer compressorRepairTime;

    private Integer controlRepairTime;

    private Integer baseRepairTime;

    private Date beginMaintenance;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdUnitMaintenanceId() {
        return prodUnitMaintenanceId;
    }

    public void setProdUnitMaintenanceId(Integer prodUnitMaintenanceId) {
        this.prodUnitMaintenanceId = prodUnitMaintenanceId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getUnitCompany() {
        return unitCompany;
    }

    public void setUnitCompany(String unitCompany) {
        this.unitCompany = unitCompany == null ? null : unitCompany.trim();
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType == null ? null : unitType.trim();
    }

    public Integer getEntireRepairTime() {
        return entireRepairTime;
    }

    public void setEntireRepairTime(Integer entireRepairTime) {
        this.entireRepairTime = entireRepairTime;
    }

    public Integer getWinderRepairTime() {
        return winderRepairTime;
    }

    public void setWinderRepairTime(Integer winderRepairTime) {
        this.winderRepairTime = winderRepairTime;
    }

    public Integer getCompressorRepairTime() {
        return compressorRepairTime;
    }

    public void setCompressorRepairTime(Integer compressorRepairTime) {
        this.compressorRepairTime = compressorRepairTime;
    }

    public Integer getControlRepairTime() {
        return controlRepairTime;
    }

    public void setControlRepairTime(Integer controlRepairTime) {
        this.controlRepairTime = controlRepairTime;
    }

    public Integer getBaseRepairTime() {
        return baseRepairTime;
    }

    public void setBaseRepairTime(Integer baseRepairTime) {
        this.baseRepairTime = baseRepairTime;
    }

    public Date getBeginMaintenance() {
        return beginMaintenance;
    }

    public void setBeginMaintenance(Date beginMaintenance) {
        this.beginMaintenance = beginMaintenance;
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
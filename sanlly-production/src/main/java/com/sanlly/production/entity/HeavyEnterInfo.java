package com.sanlly.production.entity;

import java.util.Date;

public class HeavyEnterInfo {
    private Integer prodHeavyEnterId;

    private String courseId;

    private String containerNo;

    private String containerUser;

    private String isExport;

    private String vesVos;

    private Date sailingDate;

    private Date shipmentDate;

    private String location;

    private String exitYard;

    private Date entryTime;

    private Double settingTemp;

    private Double settingHumidity;

    private Double vent;

    private String state;

    private String dock;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String company;

    public Integer getProdHeavyEnterId() {
        return prodHeavyEnterId;
    }

    public void setProdHeavyEnterId(Integer prodHeavyEnterId) {
        this.prodHeavyEnterId = prodHeavyEnterId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getIsExport() {
        return isExport;
    }

    public void setIsExport(String isExport) {
        this.isExport = isExport == null ? null : isExport.trim();
    }

    public String getVesVos() {
        return vesVos;
    }

    public void setVesVos(String vesVos) {
        this.vesVos = vesVos == null ? null : vesVos.trim();
    }

    public Date getSailingDate() {
        return sailingDate;
    }

    public void setSailingDate(Date sailingDate) {
        this.sailingDate = sailingDate;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getExitYard() {
        return exitYard;
    }

    public void setExitYard(String exitYard) {
        this.exitYard = exitYard == null ? null : exitYard.trim();
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Double getSettingTemp() {
        return settingTemp;
    }

    public void setSettingTemp(Double settingTemp) {
        this.settingTemp = settingTemp;
    }

    public Double getSettingHumidity() {
        return settingHumidity;
    }

    public void setSettingHumidity(Double settingHumidity) {
        this.settingHumidity = settingHumidity;
    }

    public Double getVent() {
        return vent;
    }

    public void setVent(Double vent) {
        this.vent = vent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getDock() {
        return dock;
    }

    public void setDock(String dock) {
        this.dock = dock == null ? null : dock.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}
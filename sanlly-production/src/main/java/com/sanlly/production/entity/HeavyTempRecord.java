package com.sanlly.production.entity;

import java.util.Date;

public class HeavyTempRecord {
    private Integer prodHeavyTempRecordId;

    private Integer heavyEnterId;

    private Double supplyTemp;

    private Double returnTemp;

    private String recordingPeroid;

    private String tab;

    private String exceprion;

    private String remark;

    private String photo;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdHeavyTempRecordId() {
        return prodHeavyTempRecordId;
    }

    public void setProdHeavyTempRecordId(Integer prodHeavyTempRecordId) {
        this.prodHeavyTempRecordId = prodHeavyTempRecordId;
    }

    public Integer getHeavyEnterId() {
        return heavyEnterId;
    }

    public void setHeavyEnterId(Integer heavyEnterId) {
        this.heavyEnterId = heavyEnterId;
    }

    public Double getSupplyTemp() {
        return supplyTemp;
    }

    public void setSupplyTemp(Double supplyTemp) {
        this.supplyTemp = supplyTemp;
    }

    public Double getReturnTemp() {
        return returnTemp;
    }

    public void setReturnTemp(Double returnTemp) {
        this.returnTemp = returnTemp;
    }

    public String getRecordingPeroid() {
        return recordingPeroid;
    }

    public void setRecordingPeroid(String recordingPeroid) {
        this.recordingPeroid = recordingPeroid == null ? null : recordingPeroid.trim();
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab == null ? null : tab.trim();
    }

    public String getExceprion() {
        return exceprion;
    }

    public void setExceprion(String exceprion) {
        this.exceprion = exceprion == null ? null : exceprion.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
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
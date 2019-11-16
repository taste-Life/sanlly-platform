package com.sanlly.production.entity;

import java.util.Date;

public class MaintenanceSite {
    private Integer prodMaintenanceSiteId;

    private String key;

    private String company;

    private String maintenanceSite;

    private String maintenanceSiteEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdMaintenanceSiteId() {
        return prodMaintenanceSiteId;
    }

    public void setProdMaintenanceSiteId(Integer prodMaintenanceSiteId) {
        this.prodMaintenanceSiteId = prodMaintenanceSiteId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getMaintenanceSite() {
        return maintenanceSite;
    }

    public void setMaintenanceSite(String maintenanceSite) {
        this.maintenanceSite = maintenanceSite == null ? null : maintenanceSite.trim();
    }

    public String getMaintenanceSiteEn() {
        return maintenanceSiteEn;
    }

    public void setMaintenanceSiteEn(String maintenanceSiteEn) {
        this.maintenanceSiteEn = maintenanceSiteEn == null ? null : maintenanceSiteEn.trim();
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

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}
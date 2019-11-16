package com.sanlly.production.models.output.location;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/11/7
 * @description
 */
public class LocationOutput {

    private Integer prodLocationId;

    private String key;

    private String locationName;

    private String locationNameEn;

    private String dock;

    private String dockNameLang;

    private Integer isValid;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdLocationId() {
        return prodLocationId;
    }

    public void setProdLocationId(Integer prodLocationId) {
        this.prodLocationId = prodLocationId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationNameEn() {
        return locationNameEn;
    }

    public void setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
    }

    public String getDock() {
        return dock;
    }

    public void setDock(String dock) {
        this.dock = dock;
    }

    public String getDockNameLang() {
        return dockNameLang;
    }

    public void setDockNameLang(String dockNameLang) {
        this.dockNameLang = dockNameLang;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
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

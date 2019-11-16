package com.sanlly.production.models.output.yardZone;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/11/4
 * @description
 */
public class YardZoneOutput {
    private Integer prodYardZoneId;

    private String key;

    private String yard;

    private String yardNameLang;

    private String zoneType;

    private String zoneTypeNameLang;

    private String zoneCode;

    private Integer user;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdYardZoneId() {
        return prodYardZoneId;
    }

    public void setProdYardZoneId(Integer prodYardZoneId) {
        this.prodYardZoneId = prodYardZoneId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getYardNameLang() {
        return yardNameLang;
    }

    public void setYardNameLang(String yardNameLang) {
        this.yardNameLang = yardNameLang;
    }

    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public String getZoneTypeNameLang() {
        return zoneTypeNameLang;
    }

    public void setZoneTypeNameLang(String zoneTypeNameLang) {
        this.zoneTypeNameLang = zoneTypeNameLang;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
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

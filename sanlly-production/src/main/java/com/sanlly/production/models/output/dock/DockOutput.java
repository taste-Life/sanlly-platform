package com.sanlly.production.models.output.dock;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
public class DockOutput {
    private Integer prodDockId;

    private String key;

    private String keyNameLang;

    private String dockCode;

    private String dockName;

    private String dockNameEn;

    private String company;

    private String companyNameLang;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdDockId() {
        return prodDockId;
    }

    public void setProdDockId(Integer prodDockId) {
        this.prodDockId = prodDockId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDockCode() {
        return dockCode;
    }

    public void setDockCode(String dockCode) {
        this.dockCode = dockCode;
    }

    public String getDockName() {
        return dockName;
    }

    public void setDockName(String dockName) {
        this.dockName = dockName;
    }

    public String getDockNameEn() {
        return dockNameEn;
    }

    public void setDockNameEn(String dockNameEn) {
        this.dockNameEn = dockNameEn;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyNameLang() {
        return companyNameLang;
    }

    public void setCompanyNameLang(String companyNameLang) {
        this.companyNameLang = companyNameLang;
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

    public String getKeyNameLang() {
        return keyNameLang;
    }

    public void setKeyNameLang(String keyNameLang) {
        this.keyNameLang = keyNameLang;
    }
}

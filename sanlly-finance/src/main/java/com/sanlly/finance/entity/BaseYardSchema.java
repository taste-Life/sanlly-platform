package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BaseYardSchema {
    private Integer id;

    private String yard;

    private String wbschema;

    private BigDecimal wbscale;

    private String wxschema;

    private BigDecimal wxscale;

    private String companyKey;

    private String remarks;

    private String isEnabled;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getWbschema() {
        return wbschema;
    }

    public void setWbschema(String wbschema) {
        this.wbschema = wbschema == null ? null : wbschema.trim();
    }

    public BigDecimal getWbscale() {
        return wbscale;
    }

    public void setWbscale(BigDecimal wbscale) {
        this.wbscale = wbscale;
    }

    public String getWxschema() {
        return wxschema;
    }

    public void setWxschema(String wxschema) {
        this.wxschema = wxschema == null ? null : wxschema.trim();
    }

    public BigDecimal getWxscale() {
        return wxscale;
    }

    public void setWxscale(BigDecimal wxscale) {
        this.wxscale = wxscale;
    }

    public String getCompanyKey() {
        return companyKey;
    }

    public void setCompanyKey(String companyKey) {
        this.companyKey = companyKey == null ? null : companyKey.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
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
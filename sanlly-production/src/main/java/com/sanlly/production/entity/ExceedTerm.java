package com.sanlly.production.entity;

import java.util.Date;

public class ExceedTerm {
    private Integer prodExceedTermId;

    private String company;

    private Integer links;

    private Integer exceedTermTime;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdExceedTermId() {
        return prodExceedTermId;
    }

    public void setProdExceedTermId(Integer prodExceedTermId) {
        this.prodExceedTermId = prodExceedTermId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Integer getLinks() {
        return links;
    }

    public void setLinks(Integer links) {
        this.links = links;
    }

    public Integer getExceedTermTime() {
        return exceedTermTime;
    }

    public void setExceedTermTime(Integer exceedTermTime) {
        this.exceedTermTime = exceedTermTime;
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
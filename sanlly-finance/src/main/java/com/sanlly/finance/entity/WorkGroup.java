package com.sanlly.finance.entity;

import java.util.Date;

public class WorkGroup {
    private Integer prodWorkGroupId;

    private String code;

    private String company;

    private String yard;

    private String prodDept;

    private String workGroupType;

    private Integer user;

    private String type;

    private String location;

    private Integer workHourTop;

    private Integer workHourBottom;

    private String title;

    private Integer isValid;

    private Integer isDel;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    public Integer getProdWorkGroupId() {
        return prodWorkGroupId;
    }

    public void setProdWorkGroupId(Integer prodWorkGroupId) {
        this.prodWorkGroupId = prodWorkGroupId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getProdDept() {
        return prodDept;
    }

    public void setProdDept(String prodDept) {
        this.prodDept = prodDept == null ? null : prodDept.trim();
    }

    public String getWorkGroupType() {
        return workGroupType;
    }

    public void setWorkGroupType(String workGroupType) {
        this.workGroupType = workGroupType == null ? null : workGroupType.trim();
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getWorkHourTop() {
        return workHourTop;
    }

    public void setWorkHourTop(Integer workHourTop) {
        this.workHourTop = workHourTop;
    }

    public Integer getWorkHourBottom() {
        return workHourBottom;
    }

    public void setWorkHourBottom(Integer workHourBottom) {
        this.workHourBottom = workHourBottom;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
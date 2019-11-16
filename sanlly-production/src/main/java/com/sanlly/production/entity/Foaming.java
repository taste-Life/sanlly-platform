package com.sanlly.production.entity;

import java.util.Date;

public class Foaming {
    private Integer prodFoamingId;

    private String course;

    private String containerNo;

    private String state;

    private Date foamingTime;

    private Integer foamingUser;

    private String remarks;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String photo;

    public Integer getProdFoamingId() {
        return prodFoamingId;
    }

    public void setProdFoamingId(Integer prodFoamingId) {
        this.prodFoamingId = prodFoamingId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getFoamingTime() {
        return foamingTime;
    }

    public void setFoamingTime(Date foamingTime) {
        this.foamingTime = foamingTime;
    }

    public Integer getFoamingUser() {
        return foamingUser;
    }

    public void setFoamingUser(Integer foamingUser) {
        this.foamingUser = foamingUser;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
}
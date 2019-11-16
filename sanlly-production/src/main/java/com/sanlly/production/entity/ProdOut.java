package com.sanlly.production.entity;

import java.util.Date;

public class ProdOut {
    private Integer prodOutId;

    private String course;

    private String containerNo;

    private Integer outUser;

    private Date outTime;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String outPhoto;

    public Integer getProdOutId() {
        return prodOutId;
    }

    public void setProdOutId(Integer prodOutId) {
        this.prodOutId = prodOutId;
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

    public Integer getOutUser() {
        return outUser;
    }

    public void setOutUser(Integer outUser) {
        this.outUser = outUser;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
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

    public String getOutPhoto() {
        return outPhoto;
    }

    public void setOutPhoto(String outPhoto) {
        this.outPhoto = outPhoto == null ? null : outPhoto.trim();
    }
}
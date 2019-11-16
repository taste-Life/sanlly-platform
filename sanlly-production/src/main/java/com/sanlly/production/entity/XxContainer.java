package com.sanlly.production.entity;

import java.util.Date;

public class XxContainer {
    private Integer prodXxContainerId;

    private String course;

    private String container;

    private String containerNo;

    private String isXx;

    private String xxState;

    private String ptiResult;

    private String ptiLastResult;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdXxContainerId() {
        return prodXxContainerId;
    }

    public void setProdXxContainerId(Integer prodXxContainerId) {
        this.prodXxContainerId = prodXxContainerId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container == null ? null : container.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getIsXx() {
        return isXx;
    }

    public void setIsXx(String isXx) {
        this.isXx = isXx == null ? null : isXx.trim();
    }

    public String getXxState() {
        return xxState;
    }

    public void setXxState(String xxState) {
        this.xxState = xxState == null ? null : xxState.trim();
    }

    public String getPtiResult() {
        return ptiResult;
    }

    public void setPtiResult(String ptiResult) {
        this.ptiResult = ptiResult == null ? null : ptiResult.trim();
    }

    public String getPtiLastResult() {
        return ptiLastResult;
    }

    public void setPtiLastResult(String ptiLastResult) {
        this.ptiLastResult = ptiLastResult == null ? null : ptiLastResult.trim();
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
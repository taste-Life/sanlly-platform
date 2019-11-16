package com.sanlly.production.entity;

import java.util.Date;

public class SurrenderPlanDetail {
    private Integer prodSurrenderPlanDetailId;

    private Integer prodSurrenderPlanId;

    private String containerNo;

    private String size;

    private String containerType;

    private String yard;

    private Date courseTime;

    private String billType;

    private Double dpp;

    private Date startTime;

    private String isCourse;

    private String remarks;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdSurrenderPlanDetailId() {
        return prodSurrenderPlanDetailId;
    }

    public void setProdSurrenderPlanDetailId(Integer prodSurrenderPlanDetailId) {
        this.prodSurrenderPlanDetailId = prodSurrenderPlanDetailId;
    }

    public Integer getProdSurrenderPlanId() {
        return prodSurrenderPlanId;
    }

    public void setProdSurrenderPlanId(Integer prodSurrenderPlanId) {
        this.prodSurrenderPlanId = prodSurrenderPlanId;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType == null ? null : containerType.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public Date getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Date courseTime) {
        this.courseTime = courseTime;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public Double getDpp() {
        return dpp;
    }

    public void setDpp(Double dpp) {
        this.dpp = dpp;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getIsCourse() {
        return isCourse;
    }

    public void setIsCourse(String isCourse) {
        this.isCourse = isCourse == null ? null : isCourse.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
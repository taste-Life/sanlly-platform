package com.sanlly.production.entity;

import java.util.Date;

public class BadContainerAllocation {
    private Integer prodBadContainerAllocationId;

    private String outCourse;

    private String inCourse;

    private String allocationNo;

    private String course;

    private String containerNo;

    private String exitYard;

    private String entryYard;

    private String containerUser;

    private String fleet;

    private String plateNo;

    private Long cost;

    private Date allocationTime;

    private String state;

    private String reason;

    private String remark;

    private Long costCenter;

    private String allocationType;

    private String directiveIssuer;

    private Date directiveTime;

    private String identifyPeople;

    private Date identifyTime;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isDel;

    public Integer getProdBadContainerAllocationId() {
        return prodBadContainerAllocationId;
    }

    public void setProdBadContainerAllocationId(Integer prodBadContainerAllocationId) {
        this.prodBadContainerAllocationId = prodBadContainerAllocationId;
    }

    public String getOutCourse() {
        return outCourse;
    }

    public void setOutCourse(String outCourse) {
        this.outCourse = outCourse == null ? null : outCourse.trim();
    }

    public String getInCourse() {
        return inCourse;
    }

    public void setInCourse(String inCourse) {
        this.inCourse = inCourse == null ? null : inCourse.trim();
    }

    public String getAllocationNo() {
        return allocationNo;
    }

    public void setAllocationNo(String allocationNo) {
        this.allocationNo = allocationNo == null ? null : allocationNo.trim();
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

    public String getExitYard() {
        return exitYard;
    }

    public void setExitYard(String exitYard) {
        this.exitYard = exitYard == null ? null : exitYard.trim();
    }

    public String getEntryYard() {
        return entryYard;
    }

    public void setEntryYard(String entryYard) {
        this.entryYard = entryYard == null ? null : entryYard.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getFleet() {
        return fleet;
    }

    public void setFleet(String fleet) {
        this.fleet = fleet == null ? null : fleet.trim();
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo == null ? null : plateNo.trim();
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Date getAllocationTime() {
        return allocationTime;
    }

    public void setAllocationTime(Date allocationTime) {
        this.allocationTime = allocationTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(Long costCenter) {
        this.costCenter = costCenter;
    }

    public String getAllocationType() {
        return allocationType;
    }

    public void setAllocationType(String allocationType) {
        this.allocationType = allocationType == null ? null : allocationType.trim();
    }

    public String getDirectiveIssuer() {
        return directiveIssuer;
    }

    public void setDirectiveIssuer(String directiveIssuer) {
        this.directiveIssuer = directiveIssuer == null ? null : directiveIssuer.trim();
    }

    public Date getDirectiveTime() {
        return directiveTime;
    }

    public void setDirectiveTime(Date directiveTime) {
        this.directiveTime = directiveTime;
    }

    public String getIdentifyPeople() {
        return identifyPeople;
    }

    public void setIdentifyPeople(String identifyPeople) {
        this.identifyPeople = identifyPeople == null ? null : identifyPeople.trim();
    }

    public Date getIdentifyTime() {
        return identifyTime;
    }

    public void setIdentifyTime(Date identifyTime) {
        this.identifyTime = identifyTime;
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

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}
package com.sanlly.production.entity;

import java.util.Date;

public class ContainerCleaning {
    private Integer prodContainerCleaningId;

    private String courseId;

    private String sourceType;

    private String cleaningPattern;

    private Integer teamId;

    private Date cleaningTime;

    private String cleaningState;

    private String isSpecial;

    private String offFlavorType;

    private Integer auditUser;

    private Date auditTime;

    private String testingRemarks;

    private String remarks;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdContainerCleaningId() {
        return prodContainerCleaningId;
    }

    public void setProdContainerCleaningId(Integer prodContainerCleaningId) {
        this.prodContainerCleaningId = prodContainerCleaningId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    public String getCleaningPattern() {
        return cleaningPattern;
    }

    public void setCleaningPattern(String cleaningPattern) {
        this.cleaningPattern = cleaningPattern == null ? null : cleaningPattern.trim();
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Date getCleaningTime() {
        return cleaningTime;
    }

    public void setCleaningTime(Date cleaningTime) {
        this.cleaningTime = cleaningTime;
    }

    public String getCleaningState() {
        return cleaningState;
    }

    public void setCleaningState(String cleaningState) {
        this.cleaningState = cleaningState == null ? null : cleaningState.trim();
    }

    public String getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(String isSpecial) {
        this.isSpecial = isSpecial == null ? null : isSpecial.trim();
    }

    public String getOffFlavorType() {
        return offFlavorType;
    }

    public void setOffFlavorType(String offFlavorType) {
        this.offFlavorType = offFlavorType == null ? null : offFlavorType.trim();
    }

    public Integer getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(Integer auditUser) {
        this.auditUser = auditUser;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getTestingRemarks() {
        return testingRemarks;
    }

    public void setTestingRemarks(String testingRemarks) {
        this.testingRemarks = testingRemarks == null ? null : testingRemarks.trim();
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
}
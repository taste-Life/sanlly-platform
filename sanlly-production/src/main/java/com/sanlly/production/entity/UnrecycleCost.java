package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UnrecycleCost {
    private Integer prodUnrecycleCostId;

    private String course;

    private String containerNo;

    private Date courseTime;

    private String size;

    private String containerType;

    private String containerCategory;

    private String yard;

    private String containerUser;

    private BigDecimal stockoutCost;

    private String unrecycleReason;

    private Integer auditUser;

    private Date auditTime;

    private String auditState;

    private String valuationState;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    public Integer getProdUnrecycleCostId() {
        return prodUnrecycleCostId;
    }

    public void setProdUnrecycleCostId(Integer prodUnrecycleCostId) {
        this.prodUnrecycleCostId = prodUnrecycleCostId;
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

    public Date getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Date courseTime) {
        this.courseTime = courseTime;
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

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public BigDecimal getStockoutCost() {
        return stockoutCost;
    }

    public void setStockoutCost(BigDecimal stockoutCost) {
        this.stockoutCost = stockoutCost;
    }

    public String getUnrecycleReason() {
        return unrecycleReason;
    }

    public void setUnrecycleReason(String unrecycleReason) {
        this.unrecycleReason = unrecycleReason == null ? null : unrecycleReason.trim();
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

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState == null ? null : auditState.trim();
    }

    public String getValuationState() {
        return valuationState;
    }

    public void setValuationState(String valuationState) {
        this.valuationState = valuationState == null ? null : valuationState.trim();
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
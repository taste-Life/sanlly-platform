package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareLaborReceiveDetail {
    private Integer wareLaborReceiveDetailId;

    private Integer wareLaborReceive;

    private Integer user;

    private String spareParts;

    private String model;

    private Double applicantNum;

    private BigDecimal price;

    private BigDecimal totalAmount;

    private String stockoutStatus;

    private Date lastAssignDate;

    private Date nextAssignDate;

    private String isLaborApply;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareLaborReceiveDetailId() {
        return wareLaborReceiveDetailId;
    }

    public void setWareLaborReceiveDetailId(Integer wareLaborReceiveDetailId) {
        this.wareLaborReceiveDetailId = wareLaborReceiveDetailId;
    }

    public Integer getWareLaborReceive() {
        return wareLaborReceive;
    }

    public void setWareLaborReceive(Integer wareLaborReceive) {
        this.wareLaborReceive = wareLaborReceive;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Double getApplicantNum() {
        return applicantNum;
    }

    public void setApplicantNum(Double applicantNum) {
        this.applicantNum = applicantNum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus == null ? null : stockoutStatus.trim();
    }

    public Date getLastAssignDate() {
        return lastAssignDate;
    }

    public void setLastAssignDate(Date lastAssignDate) {
        this.lastAssignDate = lastAssignDate;
    }

    public Date getNextAssignDate() {
        return nextAssignDate;
    }

    public void setNextAssignDate(Date nextAssignDate) {
        this.nextAssignDate = nextAssignDate;
    }

    public String getIsLaborApply() {
        return isLaborApply;
    }

    public void setIsLaborApply(String isLaborApply) {
        this.isLaborApply = isLaborApply == null ? null : isLaborApply.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
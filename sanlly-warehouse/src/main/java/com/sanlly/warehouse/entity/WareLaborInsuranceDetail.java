package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareLaborInsuranceDetail {
    private Integer wareLaborInsuranceDetailId;

    private String wareLaborInsurance;

    private String spareParts;

    private Double firstNum;

    private Integer cycleTerm;

    private Integer firstTerm;

    private Double cycleNum;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareLaborInsuranceDetailId() {
        return wareLaborInsuranceDetailId;
    }

    public void setWareLaborInsuranceDetailId(Integer wareLaborInsuranceDetailId) {
        this.wareLaborInsuranceDetailId = wareLaborInsuranceDetailId;
    }

    public String getWareLaborInsurance() {
        return wareLaborInsurance;
    }

    public void setWareLaborInsurance(String wareLaborInsurance) {
        this.wareLaborInsurance = wareLaborInsurance == null ? null : wareLaborInsurance.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public Double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Double firstNum) {
        this.firstNum = firstNum;
    }

    public Integer getCycleTerm() {
        return cycleTerm;
    }

    public void setCycleTerm(Integer cycleTerm) {
        this.cycleTerm = cycleTerm;
    }

    public Integer getFirstTerm() {
        return firstTerm;
    }

    public void setFirstTerm(Integer firstTerm) {
        this.firstTerm = firstTerm;
    }

    public Double getCycleNum() {
        return cycleNum;
    }

    public void setCycleNum(Double cycleNum) {
        this.cycleNum = cycleNum;
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
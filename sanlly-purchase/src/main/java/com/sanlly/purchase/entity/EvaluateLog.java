package com.sanlly.purchase.entity;

import java.util.Date;

public class EvaluateLog {
    private Integer purcEvaluateLogId;

    private String supplier;

    private Double baseScore;

    private Double creditScore;

    private Double qualificationScore;

    private Double evaluateScore;

    private Double priceScore;

    private Double timelyScore;

    private Double qualityScore;

    private Double serviceScore;

    private String grade;

    private String remark;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getPurcEvaluateLogId() {
        return purcEvaluateLogId;
    }

    public void setPurcEvaluateLogId(Integer purcEvaluateLogId) {
        this.purcEvaluateLogId = purcEvaluateLogId;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public Double getBaseScore() {
        return baseScore;
    }

    public void setBaseScore(Double baseScore) {
        this.baseScore = baseScore;
    }

    public Double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Double creditScore) {
        this.creditScore = creditScore;
    }

    public Double getQualificationScore() {
        return qualificationScore;
    }

    public void setQualificationScore(Double qualificationScore) {
        this.qualificationScore = qualificationScore;
    }

    public Double getEvaluateScore() {
        return evaluateScore;
    }

    public void setEvaluateScore(Double evaluateScore) {
        this.evaluateScore = evaluateScore;
    }

    public Double getPriceScore() {
        return priceScore;
    }

    public void setPriceScore(Double priceScore) {
        this.priceScore = priceScore;
    }

    public Double getTimelyScore() {
        return timelyScore;
    }

    public void setTimelyScore(Double timelyScore) {
        this.timelyScore = timelyScore;
    }

    public Double getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(Double qualityScore) {
        this.qualityScore = qualityScore;
    }

    public Double getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Double serviceScore) {
        this.serviceScore = serviceScore;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
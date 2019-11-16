package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AuditQuotedPrice {
    private Integer prodAuditQuotedPriceId;

    private Integer auditId;

    private String testingUserGrade;

    private BigDecimal beginMoney;

    private BigDecimal endMoney;

    private String valuationState;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdAuditQuotedPriceId() {
        return prodAuditQuotedPriceId;
    }

    public void setProdAuditQuotedPriceId(Integer prodAuditQuotedPriceId) {
        this.prodAuditQuotedPriceId = prodAuditQuotedPriceId;
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public String getTestingUserGrade() {
        return testingUserGrade;
    }

    public void setTestingUserGrade(String testingUserGrade) {
        this.testingUserGrade = testingUserGrade == null ? null : testingUserGrade.trim();
    }

    public BigDecimal getBeginMoney() {
        return beginMoney;
    }

    public void setBeginMoney(BigDecimal beginMoney) {
        this.beginMoney = beginMoney;
    }

    public BigDecimal getEndMoney() {
        return endMoney;
    }

    public void setEndMoney(BigDecimal endMoney) {
        this.endMoney = endMoney;
    }

    public String getValuationState() {
        return valuationState;
    }

    public void setValuationState(String valuationState) {
        this.valuationState = valuationState == null ? null : valuationState.trim();
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
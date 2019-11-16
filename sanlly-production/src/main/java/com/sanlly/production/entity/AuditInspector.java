package com.sanlly.production.entity;

import java.util.Date;

public class AuditInspector {
    private Integer prodAuditInspectorId;

    private Integer auditId;

    private String testingUserGrade;

    private String testingUser;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdAuditInspectorId() {
        return prodAuditInspectorId;
    }

    public void setProdAuditInspectorId(Integer prodAuditInspectorId) {
        this.prodAuditInspectorId = prodAuditInspectorId;
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

    public String getTestingUser() {
        return testingUser;
    }

    public void setTestingUser(String testingUser) {
        this.testingUser = testingUser == null ? null : testingUser.trim();
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
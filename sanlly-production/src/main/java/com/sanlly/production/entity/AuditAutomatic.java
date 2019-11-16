package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AuditAutomatic {
    private Integer prodAuditAutomaticId;

    private String company;

    private String containerUser;

    private String containerCategory;

    private String isAuditEnable;

    private String isReferraEnable;

    private BigDecimal referraMoney;

    private String isRestrict;

    private String isInspector;

    private String isQuoted;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdAuditAutomaticId() {
        return prodAuditAutomaticId;
    }

    public void setProdAuditAutomaticId(Integer prodAuditAutomaticId) {
        this.prodAuditAutomaticId = prodAuditAutomaticId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getIsAuditEnable() {
        return isAuditEnable;
    }

    public void setIsAuditEnable(String isAuditEnable) {
        this.isAuditEnable = isAuditEnable == null ? null : isAuditEnable.trim();
    }

    public String getIsReferraEnable() {
        return isReferraEnable;
    }

    public void setIsReferraEnable(String isReferraEnable) {
        this.isReferraEnable = isReferraEnable == null ? null : isReferraEnable.trim();
    }

    public BigDecimal getReferraMoney() {
        return referraMoney;
    }

    public void setReferraMoney(BigDecimal referraMoney) {
        this.referraMoney = referraMoney;
    }

    public String getIsRestrict() {
        return isRestrict;
    }

    public void setIsRestrict(String isRestrict) {
        this.isRestrict = isRestrict == null ? null : isRestrict.trim();
    }

    public String getIsInspector() {
        return isInspector;
    }

    public void setIsInspector(String isInspector) {
        this.isInspector = isInspector == null ? null : isInspector.trim();
    }

    public String getIsQuoted() {
        return isQuoted;
    }

    public void setIsQuoted(String isQuoted) {
        this.isQuoted = isQuoted == null ? null : isQuoted.trim();
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
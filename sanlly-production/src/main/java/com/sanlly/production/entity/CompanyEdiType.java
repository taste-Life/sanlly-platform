package com.sanlly.production.entity;

import java.util.Date;

public class CompanyEdiType {
    private Integer prodCompanyEdiTypeId;

    private String company;

    private String containerUser;

    private String containerCategory;

    private String ediType;

    private String isUnityQuote;

    private Integer editFileFormat;

    private String estimateFormat;

    private String sendType;

    private String ediMethod;

    private String ediFileTemplate;

    private String sendEmail;

    private Integer isEnabled;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdCompanyEdiTypeId() {
        return prodCompanyEdiTypeId;
    }

    public void setProdCompanyEdiTypeId(Integer prodCompanyEdiTypeId) {
        this.prodCompanyEdiTypeId = prodCompanyEdiTypeId;
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

    public String getEdiType() {
        return ediType;
    }

    public void setEdiType(String ediType) {
        this.ediType = ediType == null ? null : ediType.trim();
    }

    public String getIsUnityQuote() {
        return isUnityQuote;
    }

    public void setIsUnityQuote(String isUnityQuote) {
        this.isUnityQuote = isUnityQuote == null ? null : isUnityQuote.trim();
    }

    public Integer getEditFileFormat() {
        return editFileFormat;
    }

    public void setEditFileFormat(Integer editFileFormat) {
        this.editFileFormat = editFileFormat;
    }

    public String getEstimateFormat() {
        return estimateFormat;
    }

    public void setEstimateFormat(String estimateFormat) {
        this.estimateFormat = estimateFormat == null ? null : estimateFormat.trim();
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType == null ? null : sendType.trim();
    }

    public String getEdiMethod() {
        return ediMethod;
    }

    public void setEdiMethod(String ediMethod) {
        this.ediMethod = ediMethod == null ? null : ediMethod.trim();
    }

    public String getEdiFileTemplate() {
        return ediFileTemplate;
    }

    public void setEdiFileTemplate(String ediFileTemplate) {
        this.ediFileTemplate = ediFileTemplate == null ? null : ediFileTemplate.trim();
    }

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail == null ? null : sendEmail.trim();
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
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
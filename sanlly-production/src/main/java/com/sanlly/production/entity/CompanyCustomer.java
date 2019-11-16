package com.sanlly.production.entity;

import java.util.Date;

public class CompanyCustomer {
    private Integer prodEdiTypeId;

    private String company;

    private String containerUser;

    private String ftpReceiveAddress;

    private Integer ftpReceivePort;

    private String ftpReceiveDirectory;

    private String ftpSendAccount;

    private String ftpSendPwd;

    private String sendEmailAddress;

    private String sendSmtpContent;

    private Integer sendSmtpPort;

    private String emailUser;

    private String emailPwd;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdEdiTypeId() {
        return prodEdiTypeId;
    }

    public void setProdEdiTypeId(Integer prodEdiTypeId) {
        this.prodEdiTypeId = prodEdiTypeId;
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

    public String getFtpReceiveAddress() {
        return ftpReceiveAddress;
    }

    public void setFtpReceiveAddress(String ftpReceiveAddress) {
        this.ftpReceiveAddress = ftpReceiveAddress == null ? null : ftpReceiveAddress.trim();
    }

    public Integer getFtpReceivePort() {
        return ftpReceivePort;
    }

    public void setFtpReceivePort(Integer ftpReceivePort) {
        this.ftpReceivePort = ftpReceivePort;
    }

    public String getFtpReceiveDirectory() {
        return ftpReceiveDirectory;
    }

    public void setFtpReceiveDirectory(String ftpReceiveDirectory) {
        this.ftpReceiveDirectory = ftpReceiveDirectory == null ? null : ftpReceiveDirectory.trim();
    }

    public String getFtpSendAccount() {
        return ftpSendAccount;
    }

    public void setFtpSendAccount(String ftpSendAccount) {
        this.ftpSendAccount = ftpSendAccount == null ? null : ftpSendAccount.trim();
    }

    public String getFtpSendPwd() {
        return ftpSendPwd;
    }

    public void setFtpSendPwd(String ftpSendPwd) {
        this.ftpSendPwd = ftpSendPwd == null ? null : ftpSendPwd.trim();
    }

    public String getSendEmailAddress() {
        return sendEmailAddress;
    }

    public void setSendEmailAddress(String sendEmailAddress) {
        this.sendEmailAddress = sendEmailAddress == null ? null : sendEmailAddress.trim();
    }

    public String getSendSmtpContent() {
        return sendSmtpContent;
    }

    public void setSendSmtpContent(String sendSmtpContent) {
        this.sendSmtpContent = sendSmtpContent == null ? null : sendSmtpContent.trim();
    }

    public Integer getSendSmtpPort() {
        return sendSmtpPort;
    }

    public void setSendSmtpPort(Integer sendSmtpPort) {
        this.sendSmtpPort = sendSmtpPort;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser == null ? null : emailUser.trim();
    }

    public String getEmailPwd() {
        return emailPwd;
    }

    public void setEmailPwd(String emailPwd) {
        this.emailPwd = emailPwd == null ? null : emailPwd.trim();
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
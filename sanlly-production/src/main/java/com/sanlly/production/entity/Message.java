package com.sanlly.production.entity;

import java.util.Date;

public class Message {
    private Integer prodMessageId;

    private String messageNotifier;

    private String company;

    private String yard;

    private String containerUser;

    private String containerNo;

    private String informMethod;

    private String informType;

    private String email;

    private String informTitle;

    private String informContent;

    private Integer isHaveInform;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdMessageId() {
        return prodMessageId;
    }

    public void setProdMessageId(Integer prodMessageId) {
        this.prodMessageId = prodMessageId;
    }

    public String getMessageNotifier() {
        return messageNotifier;
    }

    public void setMessageNotifier(String messageNotifier) {
        this.messageNotifier = messageNotifier == null ? null : messageNotifier.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
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

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getInformMethod() {
        return informMethod;
    }

    public void setInformMethod(String informMethod) {
        this.informMethod = informMethod == null ? null : informMethod.trim();
    }

    public String getInformType() {
        return informType;
    }

    public void setInformType(String informType) {
        this.informType = informType == null ? null : informType.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getInformTitle() {
        return informTitle;
    }

    public void setInformTitle(String informTitle) {
        this.informTitle = informTitle == null ? null : informTitle.trim();
    }

    public String getInformContent() {
        return informContent;
    }

    public void setInformContent(String informContent) {
        this.informContent = informContent == null ? null : informContent.trim();
    }

    public Integer getIsHaveInform() {
        return isHaveInform;
    }

    public void setIsHaveInform(Integer isHaveInform) {
        this.isHaveInform = isHaveInform;
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
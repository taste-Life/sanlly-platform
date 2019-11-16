package com.sanlly.production.entity;

import java.util.Date;

public class AutomationPriority {
    private Integer prodAutomationPriorityId;

    private String company;

    private String firstPriority;

    private String secondPriority;

    private String thirdPriority;

    private String fourthPriority;

    private String fifthPriority;

    private Integer isValid;

    private Integer isDel;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    public Integer getProdAutomationPriorityId() {
        return prodAutomationPriorityId;
    }

    public void setProdAutomationPriorityId(Integer prodAutomationPriorityId) {
        this.prodAutomationPriorityId = prodAutomationPriorityId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getFirstPriority() {
        return firstPriority;
    }

    public void setFirstPriority(String firstPriority) {
        this.firstPriority = firstPriority == null ? null : firstPriority.trim();
    }

    public String getSecondPriority() {
        return secondPriority;
    }

    public void setSecondPriority(String secondPriority) {
        this.secondPriority = secondPriority == null ? null : secondPriority.trim();
    }

    public String getThirdPriority() {
        return thirdPriority;
    }

    public void setThirdPriority(String thirdPriority) {
        this.thirdPriority = thirdPriority == null ? null : thirdPriority.trim();
    }

    public String getFourthPriority() {
        return fourthPriority;
    }

    public void setFourthPriority(String fourthPriority) {
        this.fourthPriority = fourthPriority == null ? null : fourthPriority.trim();
    }

    public String getFifthPriority() {
        return fifthPriority;
    }

    public void setFifthPriority(String fifthPriority) {
        this.fifthPriority = fifthPriority == null ? null : fifthPriority.trim();
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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
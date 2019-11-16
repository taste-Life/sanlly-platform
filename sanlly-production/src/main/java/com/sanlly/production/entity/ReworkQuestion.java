package com.sanlly.production.entity;

import java.util.Date;

public class ReworkQuestion {
    private Integer prodReworkQuestionId;

    private String key;

    private String containerCategory;

    private String reworkQuestion;

    private String reworkQuestionEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdReworkQuestionId() {
        return prodReworkQuestionId;
    }

    public void setProdReworkQuestionId(Integer prodReworkQuestionId) {
        this.prodReworkQuestionId = prodReworkQuestionId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getReworkQuestion() {
        return reworkQuestion;
    }

    public void setReworkQuestion(String reworkQuestion) {
        this.reworkQuestion = reworkQuestion == null ? null : reworkQuestion.trim();
    }

    public String getReworkQuestionEn() {
        return reworkQuestionEn;
    }

    public void setReworkQuestionEn(String reworkQuestionEn) {
        this.reworkQuestionEn = reworkQuestionEn == null ? null : reworkQuestionEn.trim();
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

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}
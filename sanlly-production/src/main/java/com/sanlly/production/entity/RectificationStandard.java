package com.sanlly.production.entity;

import java.util.Date;

public class RectificationStandard {
    private Integer prodRectStandardId;

    private String key;

    private String reworkQuestion;

    private String standardContentName;

    private String standardContentEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdRectStandardId() {
        return prodRectStandardId;
    }

    public void setProdRectStandardId(Integer prodRectStandardId) {
        this.prodRectStandardId = prodRectStandardId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getReworkQuestion() {
        return reworkQuestion;
    }

    public void setReworkQuestion(String reworkQuestion) {
        this.reworkQuestion = reworkQuestion == null ? null : reworkQuestion.trim();
    }

    public String getStandardContentName() {
        return standardContentName;
    }

    public void setStandardContentName(String standardContentName) {
        this.standardContentName = standardContentName == null ? null : standardContentName.trim();
    }

    public String getStandardContentEn() {
        return standardContentEn;
    }

    public void setStandardContentEn(String standardContentEn) {
        this.standardContentEn = standardContentEn == null ? null : standardContentEn.trim();
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
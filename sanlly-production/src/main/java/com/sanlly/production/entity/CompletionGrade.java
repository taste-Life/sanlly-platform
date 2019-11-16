package com.sanlly.production.entity;

import java.util.Date;

public class CompletionGrade {
    private Integer prodCompletionGradeId;

    private String key;

    private String yard;

    private String completionGradeName;

    private String completionGradeNameEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdCompletionGradeId() {
        return prodCompletionGradeId;
    }

    public void setProdCompletionGradeId(Integer prodCompletionGradeId) {
        this.prodCompletionGradeId = prodCompletionGradeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getCompletionGradeName() {
        return completionGradeName;
    }

    public void setCompletionGradeName(String completionGradeName) {
        this.completionGradeName = completionGradeName == null ? null : completionGradeName.trim();
    }

    public String getCompletionGradeNameEn() {
        return completionGradeNameEn;
    }

    public void setCompletionGradeNameEn(String completionGradeNameEn) {
        this.completionGradeNameEn = completionGradeNameEn == null ? null : completionGradeNameEn.trim();
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
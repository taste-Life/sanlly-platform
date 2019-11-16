package com.sanlly.production.models.output.reworkquestion;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/10/31
 * @description
 */
public class ReworkQuestionOutput {

    private Integer prodReworkQuestionId;

    private String key;

    private String keyNameLang;

    public String getKeyNameLang() {
        return keyNameLang;
    }

    public void setKeyNameLang(String keyNameLang) {
        this.keyNameLang = keyNameLang;
    }

    private String containerCategory;

    public String getContainerCategoryNameLang() {
        return containerCategoryNameLang;
    }

    public void setContainerCategoryNameLang(String containerCategoryNameLang) {
        this.containerCategoryNameLang = containerCategoryNameLang;
    }

    private String containerCategoryNameLang;

    private String reworkQuestion;

    private String reworkQuestionEn;

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
        this.key = key;
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory;
    }

    public String getReworkQuestion() {
        return reworkQuestion;
    }

    public void setReworkQuestion(String reworkQuestion) {
        this.reworkQuestion = reworkQuestion;
    }

    public String getReworkQuestionEn() {
        return reworkQuestionEn;
    }

    public void setReworkQuestionEn(String reworkQuestionEn) {
        this.reworkQuestionEn = reworkQuestionEn;
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

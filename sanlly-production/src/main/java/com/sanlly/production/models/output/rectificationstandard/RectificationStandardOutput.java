package com.sanlly.production.models.output.rectificationstandard;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/10/30
 * @description
 */
public class RectificationStandardOutput {
    private Integer prodRectStandardId;

    private String key;

    private String reworkQuestion;

    private String reworkQuestionNameLang;

    private String standardContentName;

    private String standardContentEn;

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
        this.key = key;
    }

    public String getReworkQuestion() {
        return reworkQuestion;
    }

    public void setReworkQuestion(String reworkQuestion) {
        this.reworkQuestion = reworkQuestion;
    }

    public String getReworkQuestionNameLang() {
        return reworkQuestionNameLang;
    }

    public void setReworkQuestionNameLang(String reworkQuestionNameLang) {
        this.reworkQuestionNameLang = reworkQuestionNameLang;
    }

    public String getStandardContentName() {
        return standardContentName;
    }

    public void setStandardContentName(String standardContentName) {
        this.standardContentName = standardContentName;
    }

    public String getStandardContentEn() {
        return standardContentEn;
    }

    public void setStandardContentEn(String standardContentEn) {
        this.standardContentEn = standardContentEn;
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

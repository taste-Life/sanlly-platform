package com.sanlly.production.entity;

import java.util.Date;

public class QualityRework {
    private Integer prodQualityReworkId;

    private String course;

    private String referralEntryId;

    private String state;

    private String isTechnology;

    private String reworkQuestion;

    private String questionDescribe;

    private String rectificationStandard;

    private String backCause;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String backPhoto;

    public Integer getProdQualityReworkId() {
        return prodQualityReworkId;
    }

    public void setProdQualityReworkId(Integer prodQualityReworkId) {
        this.prodQualityReworkId = prodQualityReworkId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getReferralEntryId() {
        return referralEntryId;
    }

    public void setReferralEntryId(String referralEntryId) {
        this.referralEntryId = referralEntryId == null ? null : referralEntryId.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getIsTechnology() {
        return isTechnology;
    }

    public void setIsTechnology(String isTechnology) {
        this.isTechnology = isTechnology == null ? null : isTechnology.trim();
    }

    public String getReworkQuestion() {
        return reworkQuestion;
    }

    public void setReworkQuestion(String reworkQuestion) {
        this.reworkQuestion = reworkQuestion == null ? null : reworkQuestion.trim();
    }

    public String getQuestionDescribe() {
        return questionDescribe;
    }

    public void setQuestionDescribe(String questionDescribe) {
        this.questionDescribe = questionDescribe == null ? null : questionDescribe.trim();
    }

    public String getRectificationStandard() {
        return rectificationStandard;
    }

    public void setRectificationStandard(String rectificationStandard) {
        this.rectificationStandard = rectificationStandard == null ? null : rectificationStandard.trim();
    }

    public String getBackCause() {
        return backCause;
    }

    public void setBackCause(String backCause) {
        this.backCause = backCause == null ? null : backCause.trim();
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

    public String getBackPhoto() {
        return backPhoto;
    }

    public void setBackPhoto(String backPhoto) {
        this.backPhoto = backPhoto == null ? null : backPhoto.trim();
    }
}
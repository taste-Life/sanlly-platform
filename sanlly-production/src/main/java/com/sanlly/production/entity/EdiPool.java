package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EdiPool {
    private Integer prodEdiPoolId;

    private String course;

    private String containerNo;

    private String ediType;

    private String evaluateNo;

    private Integer exportNumber;

    private String containerCategory;

    private String state;

    private Date sendTime;

    private BigDecimal cwFee;

    private BigDecimal dppFee;

    private String clientCode;

    private String westimAdvice;

    private Integer ediVersion;

    private String condition;

    private String gateinAdvice;

    private Date gateoutImpordate;

    private String gateoutAdvice;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String gateinRefference;

    private String westimAuthamt;

    public Integer getProdEdiPoolId() {
        return prodEdiPoolId;
    }

    public void setProdEdiPoolId(Integer prodEdiPoolId) {
        this.prodEdiPoolId = prodEdiPoolId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getEdiType() {
        return ediType;
    }

    public void setEdiType(String ediType) {
        this.ediType = ediType == null ? null : ediType.trim();
    }

    public String getEvaluateNo() {
        return evaluateNo;
    }

    public void setEvaluateNo(String evaluateNo) {
        this.evaluateNo = evaluateNo == null ? null : evaluateNo.trim();
    }

    public Integer getExportNumber() {
        return exportNumber;
    }

    public void setExportNumber(Integer exportNumber) {
        this.exportNumber = exportNumber;
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public BigDecimal getCwFee() {
        return cwFee;
    }

    public void setCwFee(BigDecimal cwFee) {
        this.cwFee = cwFee;
    }

    public BigDecimal getDppFee() {
        return dppFee;
    }

    public void setDppFee(BigDecimal dppFee) {
        this.dppFee = dppFee;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode == null ? null : clientCode.trim();
    }

    public String getWestimAdvice() {
        return westimAdvice;
    }

    public void setWestimAdvice(String westimAdvice) {
        this.westimAdvice = westimAdvice == null ? null : westimAdvice.trim();
    }

    public Integer getEdiVersion() {
        return ediVersion;
    }

    public void setEdiVersion(Integer ediVersion) {
        this.ediVersion = ediVersion;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition == null ? null : condition.trim();
    }

    public String getGateinAdvice() {
        return gateinAdvice;
    }

    public void setGateinAdvice(String gateinAdvice) {
        this.gateinAdvice = gateinAdvice == null ? null : gateinAdvice.trim();
    }

    public Date getGateoutImpordate() {
        return gateoutImpordate;
    }

    public void setGateoutImpordate(Date gateoutImpordate) {
        this.gateoutImpordate = gateoutImpordate;
    }

    public String getGateoutAdvice() {
        return gateoutAdvice;
    }

    public void setGateoutAdvice(String gateoutAdvice) {
        this.gateoutAdvice = gateoutAdvice == null ? null : gateoutAdvice.trim();
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

    public String getGateinRefference() {
        return gateinRefference;
    }

    public void setGateinRefference(String gateinRefference) {
        this.gateinRefference = gateinRefference == null ? null : gateinRefference.trim();
    }

    public String getWestimAuthamt() {
        return westimAuthamt;
    }

    public void setWestimAuthamt(String westimAuthamt) {
        this.westimAuthamt = westimAuthamt == null ? null : westimAuthamt.trim();
    }
}
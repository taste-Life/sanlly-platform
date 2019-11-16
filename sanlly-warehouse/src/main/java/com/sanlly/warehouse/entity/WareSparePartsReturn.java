package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareSparePartsReturn {
    private Integer wareSparePartsReturnId;

    private String no;

    private String noType;

    private String sparePartsReturnType;

    private String company;

    private String site;

    private String returnYard;

    private String returnWarehouse;

    private String spareParts;

    private String sparePartsBatch;

    private Double returnNum;

    private Double surplusNum;

    private String returnGo;

    private String goDescribe;

    private Integer acceptUser;

    private Date acceptDate;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareSparePartsReturnId() {
        return wareSparePartsReturnId;
    }

    public void setWareSparePartsReturnId(Integer wareSparePartsReturnId) {
        this.wareSparePartsReturnId = wareSparePartsReturnId;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getNoType() {
        return noType;
    }

    public void setNoType(String noType) {
        this.noType = noType == null ? null : noType.trim();
    }

    public String getSparePartsReturnType() {
        return sparePartsReturnType;
    }

    public void setSparePartsReturnType(String sparePartsReturnType) {
        this.sparePartsReturnType = sparePartsReturnType == null ? null : sparePartsReturnType.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getReturnYard() {
        return returnYard;
    }

    public void setReturnYard(String returnYard) {
        this.returnYard = returnYard == null ? null : returnYard.trim();
    }

    public String getReturnWarehouse() {
        return returnWarehouse;
    }

    public void setReturnWarehouse(String returnWarehouse) {
        this.returnWarehouse = returnWarehouse == null ? null : returnWarehouse.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch == null ? null : sparePartsBatch.trim();
    }

    public Double getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Double returnNum) {
        this.returnNum = returnNum;
    }

    public Double getSurplusNum() {
        return surplusNum;
    }

    public void setSurplusNum(Double surplusNum) {
        this.surplusNum = surplusNum;
    }

    public String getReturnGo() {
        return returnGo;
    }

    public void setReturnGo(String returnGo) {
        this.returnGo = returnGo == null ? null : returnGo.trim();
    }

    public String getGoDescribe() {
        return goDescribe;
    }

    public void setGoDescribe(String goDescribe) {
        this.goDescribe = goDescribe == null ? null : goDescribe.trim();
    }

    public Integer getAcceptUser() {
        return acceptUser;
    }

    public void setAcceptUser(Integer acceptUser) {
        this.acceptUser = acceptUser;
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getReasonsRejection() {
        return reasonsRejection;
    }

    public void setReasonsRejection(String reasonsRejection) {
        this.reasonsRejection = reasonsRejection == null ? null : reasonsRejection.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
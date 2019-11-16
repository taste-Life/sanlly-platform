package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareAssetApply {
    private Integer wareAssetApplyId;

    private String assetApplyNo;

    private String no;

    private String company;

    private String applyType;

    private String applyDepartment;

    private Integer applyUser;

    private Date applyDate;

    private Integer oldUser;

    private Integer newUser;

    private String newDepartment;

    private String oldDepartment;

    private String scrapReson;

    private Integer assetManageId;

    private Double applyNum;

    private String remark;

    private String auditStatus;

    private String reasonsRejection;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareAssetApplyId() {
        return wareAssetApplyId;
    }

    public void setWareAssetApplyId(Integer wareAssetApplyId) {
        this.wareAssetApplyId = wareAssetApplyId;
    }

    public String getAssetApplyNo() {
        return assetApplyNo;
    }

    public void setAssetApplyNo(String assetApplyNo) {
        this.assetApplyNo = assetApplyNo == null ? null : assetApplyNo.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }

    public String getApplyDepartment() {
        return applyDepartment;
    }

    public void setApplyDepartment(String applyDepartment) {
        this.applyDepartment = applyDepartment == null ? null : applyDepartment.trim();
    }

    public Integer getApplyUser() {
        return applyUser;
    }

    public void setApplyUser(Integer applyUser) {
        this.applyUser = applyUser;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Integer getOldUser() {
        return oldUser;
    }

    public void setOldUser(Integer oldUser) {
        this.oldUser = oldUser;
    }

    public Integer getNewUser() {
        return newUser;
    }

    public void setNewUser(Integer newUser) {
        this.newUser = newUser;
    }

    public String getNewDepartment() {
        return newDepartment;
    }

    public void setNewDepartment(String newDepartment) {
        this.newDepartment = newDepartment == null ? null : newDepartment.trim();
    }

    public String getOldDepartment() {
        return oldDepartment;
    }

    public void setOldDepartment(String oldDepartment) {
        this.oldDepartment = oldDepartment == null ? null : oldDepartment.trim();
    }

    public String getScrapReson() {
        return scrapReson;
    }

    public void setScrapReson(String scrapReson) {
        this.scrapReson = scrapReson == null ? null : scrapReson.trim();
    }

    public Integer getAssetManageId() {
        return assetManageId;
    }

    public void setAssetManageId(Integer assetManageId) {
        this.assetManageId = assetManageId;
    }

    public Double getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(Double applyNum) {
        this.applyNum = applyNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareToolApplyDetail {
    private Integer wareToolApplyDetailId;

    private Integer wareToolApplyId;

    private String spareParts;

    private Integer userId;

    private Integer liablePerson;

    private Integer newLiablePerson;

    private String inDepartments;

    private String useDepartments;

    private String useType;

    private String distributeStatus;

    private Double sparePartsNum;

    private Double scrapNum;

    private Date distributeDate;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Double outedNum;

    private String stockoutStatus;

    private Integer wareToolManageId;

    public Integer getWareToolApplyDetailId() {
        return wareToolApplyDetailId;
    }

    public void setWareToolApplyDetailId(Integer wareToolApplyDetailId) {
        this.wareToolApplyDetailId = wareToolApplyDetailId;
    }

    public Integer getWareToolApplyId() {
        return wareToolApplyId;
    }

    public void setWareToolApplyId(Integer wareToolApplyId) {
        this.wareToolApplyId = wareToolApplyId;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLiablePerson() {
        return liablePerson;
    }

    public void setLiablePerson(Integer liablePerson) {
        this.liablePerson = liablePerson;
    }

    public Integer getNewLiablePerson() {
        return newLiablePerson;
    }

    public void setNewLiablePerson(Integer newLiablePerson) {
        this.newLiablePerson = newLiablePerson;
    }

    public String getInDepartments() {
        return inDepartments;
    }

    public void setInDepartments(String inDepartments) {
        this.inDepartments = inDepartments == null ? null : inDepartments.trim();
    }

    public String getUseDepartments() {
        return useDepartments;
    }

    public void setUseDepartments(String useDepartments) {
        this.useDepartments = useDepartments == null ? null : useDepartments.trim();
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType == null ? null : useType.trim();
    }

    public String getDistributeStatus() {
        return distributeStatus;
    }

    public void setDistributeStatus(String distributeStatus) {
        this.distributeStatus = distributeStatus == null ? null : distributeStatus.trim();
    }

    public Double getSparePartsNum() {
        return sparePartsNum;
    }

    public void setSparePartsNum(Double sparePartsNum) {
        this.sparePartsNum = sparePartsNum;
    }

    public Double getScrapNum() {
        return scrapNum;
    }

    public void setScrapNum(Double scrapNum) {
        this.scrapNum = scrapNum;
    }

    public Date getDistributeDate() {
        return distributeDate;
    }

    public void setDistributeDate(Date distributeDate) {
        this.distributeDate = distributeDate;
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

    public Double getOutedNum() {
        return outedNum;
    }

    public void setOutedNum(Double outedNum) {
        this.outedNum = outedNum;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus == null ? null : stockoutStatus.trim();
    }

    public Integer getWareToolManageId() {
        return wareToolManageId;
    }

    public void setWareToolManageId(Integer wareToolManageId) {
        this.wareToolManageId = wareToolManageId;
    }
}
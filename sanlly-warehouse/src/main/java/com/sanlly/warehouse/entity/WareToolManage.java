package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareToolManage {
    private Integer wareToolManageId;

    private String department;

    private String company;

    private String type;

    private String spareParts;

    private String sparePartsBatch;

    private Double num;

    private Integer liablePerson;

    private Date distributeDate;

    private String distributeStatus;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer useUser;

    private String toolStatus;

    private String transferRecord;

    public Integer getWareToolManageId() {
        return wareToolManageId;
    }

    public void setWareToolManageId(Integer wareToolManageId) {
        this.wareToolManageId = wareToolManageId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Integer getLiablePerson() {
        return liablePerson;
    }

    public void setLiablePerson(Integer liablePerson) {
        this.liablePerson = liablePerson;
    }

    public Date getDistributeDate() {
        return distributeDate;
    }

    public void setDistributeDate(Date distributeDate) {
        this.distributeDate = distributeDate;
    }

    public String getDistributeStatus() {
        return distributeStatus;
    }

    public void setDistributeStatus(String distributeStatus) {
        this.distributeStatus = distributeStatus == null ? null : distributeStatus.trim();
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

    public Integer getUseUser() {
        return useUser;
    }

    public void setUseUser(Integer useUser) {
        this.useUser = useUser;
    }

    public String getToolStatus() {
        return toolStatus;
    }

    public void setToolStatus(String toolStatus) {
        this.toolStatus = toolStatus == null ? null : toolStatus.trim();
    }

    public String getTransferRecord() {
        return transferRecord;
    }

    public void setTransferRecord(String transferRecord) {
        this.transferRecord = transferRecord == null ? null : transferRecord.trim();
    }
}
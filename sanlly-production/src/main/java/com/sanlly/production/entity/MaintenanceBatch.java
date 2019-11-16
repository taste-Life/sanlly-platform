package com.sanlly.production.entity;

import java.util.Date;

public class MaintenanceBatch {
    private Integer prodMaintenanceBatchId;

    private String code;

    private String noType;

    private String startNo;

    private String endNo;

    private Long workingHoursCost;

    private Long materialCost;

    private String description;

    private String descriptionEn;

    private String isDel;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    public Integer getProdMaintenanceBatchId() {
        return prodMaintenanceBatchId;
    }

    public void setProdMaintenanceBatchId(Integer prodMaintenanceBatchId) {
        this.prodMaintenanceBatchId = prodMaintenanceBatchId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getNoType() {
        return noType;
    }

    public void setNoType(String noType) {
        this.noType = noType == null ? null : noType.trim();
    }

    public String getStartNo() {
        return startNo;
    }

    public void setStartNo(String startNo) {
        this.startNo = startNo == null ? null : startNo.trim();
    }

    public String getEndNo() {
        return endNo;
    }

    public void setEndNo(String endNo) {
        this.endNo = endNo == null ? null : endNo.trim();
    }

    public Long getWorkingHoursCost() {
        return workingHoursCost;
    }

    public void setWorkingHoursCost(Long workingHoursCost) {
        this.workingHoursCost = workingHoursCost;
    }

    public Long getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(Long materialCost) {
        this.materialCost = materialCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn == null ? null : descriptionEn.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
package com.sanlly.production.entity;

import java.util.Date;

public class Rate {
    private String prodRateId;

    private String standardRate;

    private String containerCategory;

    private String calculationType;

    private String rateCode;

    private String containerUser;

    private String company;

    private String partsType;

    private String partsDetails;

    private String partsDetailsName;

    private String partsDetailsNameEn;

    private String repair;

    private String material;

    private String containerUserDescribe;

    private String rateName;

    private String rateNameEn;

    private String isContainerUserRate;

    private String isRepeatPrompts;

    private String isMustPhoto;

    private String isGz;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public String getProdRateId() {
        return prodRateId;
    }

    public void setProdRateId(String prodRateId) {
        this.prodRateId = prodRateId == null ? null : prodRateId.trim();
    }

    public String getStandardRate() {
        return standardRate;
    }

    public void setStandardRate(String standardRate) {
        this.standardRate = standardRate == null ? null : standardRate.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(String calculationType) {
        this.calculationType = calculationType == null ? null : calculationType.trim();
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode == null ? null : rateCode.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getPartsType() {
        return partsType;
    }

    public void setPartsType(String partsType) {
        this.partsType = partsType == null ? null : partsType.trim();
    }

    public String getPartsDetails() {
        return partsDetails;
    }

    public void setPartsDetails(String partsDetails) {
        this.partsDetails = partsDetails == null ? null : partsDetails.trim();
    }

    public String getPartsDetailsName() {
        return partsDetailsName;
    }

    public void setPartsDetailsName(String partsDetailsName) {
        this.partsDetailsName = partsDetailsName == null ? null : partsDetailsName.trim();
    }

    public String getPartsDetailsNameEn() {
        return partsDetailsNameEn;
    }

    public void setPartsDetailsNameEn(String partsDetailsNameEn) {
        this.partsDetailsNameEn = partsDetailsNameEn == null ? null : partsDetailsNameEn.trim();
    }

    public String getRepair() {
        return repair;
    }

    public void setRepair(String repair) {
        this.repair = repair == null ? null : repair.trim();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getContainerUserDescribe() {
        return containerUserDescribe;
    }

    public void setContainerUserDescribe(String containerUserDescribe) {
        this.containerUserDescribe = containerUserDescribe == null ? null : containerUserDescribe.trim();
    }

    public String getRateName() {
        return rateName;
    }

    public void setRateName(String rateName) {
        this.rateName = rateName == null ? null : rateName.trim();
    }

    public String getRateNameEn() {
        return rateNameEn;
    }

    public void setRateNameEn(String rateNameEn) {
        this.rateNameEn = rateNameEn == null ? null : rateNameEn.trim();
    }

    public String getIsContainerUserRate() {
        return isContainerUserRate;
    }

    public void setIsContainerUserRate(String isContainerUserRate) {
        this.isContainerUserRate = isContainerUserRate == null ? null : isContainerUserRate.trim();
    }

    public String getIsRepeatPrompts() {
        return isRepeatPrompts;
    }

    public void setIsRepeatPrompts(String isRepeatPrompts) {
        this.isRepeatPrompts = isRepeatPrompts == null ? null : isRepeatPrompts.trim();
    }

    public String getIsMustPhoto() {
        return isMustPhoto;
    }

    public void setIsMustPhoto(String isMustPhoto) {
        this.isMustPhoto = isMustPhoto == null ? null : isMustPhoto.trim();
    }

    public String getIsGz() {
        return isGz;
    }

    public void setIsGz(String isGz) {
        this.isGz = isGz == null ? null : isGz.trim();
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
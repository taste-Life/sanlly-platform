package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ZyRate {
    private String prodZyRateId;

    private String company;

    private String containerCategory;

    private String cosRateCode;

    private String cosPartsCode;

    private String cosRepairCode;

    private Double length;

    private Double width;

    private Integer quantity;

    private String calculationType;

    private Double manHour;

    private BigDecimal materialCost;

    private String partsTypeCode;

    private String partsDetailsCode;

    private String repairCode;

    private String materialCode;

    private String size;

    private String containerType;

    private String positionCode;

    private String isRepeatPrompts;

    private String isMustPhoto;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public String getProdZyRateId() {
        return prodZyRateId;
    }

    public void setProdZyRateId(String prodZyRateId) {
        this.prodZyRateId = prodZyRateId == null ? null : prodZyRateId.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getCosRateCode() {
        return cosRateCode;
    }

    public void setCosRateCode(String cosRateCode) {
        this.cosRateCode = cosRateCode == null ? null : cosRateCode.trim();
    }

    public String getCosPartsCode() {
        return cosPartsCode;
    }

    public void setCosPartsCode(String cosPartsCode) {
        this.cosPartsCode = cosPartsCode == null ? null : cosPartsCode.trim();
    }

    public String getCosRepairCode() {
        return cosRepairCode;
    }

    public void setCosRepairCode(String cosRepairCode) {
        this.cosRepairCode = cosRepairCode == null ? null : cosRepairCode.trim();
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(String calculationType) {
        this.calculationType = calculationType == null ? null : calculationType.trim();
    }

    public Double getManHour() {
        return manHour;
    }

    public void setManHour(Double manHour) {
        this.manHour = manHour;
    }

    public BigDecimal getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(BigDecimal materialCost) {
        this.materialCost = materialCost;
    }

    public String getPartsTypeCode() {
        return partsTypeCode;
    }

    public void setPartsTypeCode(String partsTypeCode) {
        this.partsTypeCode = partsTypeCode == null ? null : partsTypeCode.trim();
    }

    public String getPartsDetailsCode() {
        return partsDetailsCode;
    }

    public void setPartsDetailsCode(String partsDetailsCode) {
        this.partsDetailsCode = partsDetailsCode == null ? null : partsDetailsCode.trim();
    }

    public String getRepairCode() {
        return repairCode;
    }

    public void setRepairCode(String repairCode) {
        this.repairCode = repairCode == null ? null : repairCode.trim();
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType == null ? null : containerType.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
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
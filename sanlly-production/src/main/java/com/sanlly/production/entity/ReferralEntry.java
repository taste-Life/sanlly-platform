package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ReferralEntry {
    private String prodReferralEntryId;

    private Integer serialNumber;

    private String rateId;

    private String fiveCode;

    private String course;

    private String containerCategory;

    private String isRepair;

    private String positionCode;

    private String partsTypeCode;

    private String partsDetailsCode;

    private String partsRepairCode;

    private String damageCode;

    private String repairCode;

    private String materialCode;

    private String device;

    private String sparesNumber;

    private String warehouseType;

    private BigDecimal price;

    private String isOriginal;

    private String company;

    private String warehouse;

    private Double length;

    private Double width;

    private Double quantity;

    private Double pickingQuantity;

    private Double borrowQuantity;

    private String pickingState;

    private Double manHour;

    private String qualityState;

    private String parentReferralEntry;

    private String isTechnology;

    private String reworkQuestion;

    private String rectificationStandard;

    private String qualityCause;

    private String payingParty;

    private String remarks;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String isMustPhoto;

    private String photo;

    public String getProdReferralEntryId() {
        return prodReferralEntryId;
    }

    public void setProdReferralEntryId(String prodReferralEntryId) {
        this.prodReferralEntryId = prodReferralEntryId == null ? null : prodReferralEntryId.trim();
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getRateId() {
        return rateId;
    }

    public void setRateId(String rateId) {
        this.rateId = rateId == null ? null : rateId.trim();
    }

    public String getFiveCode() {
        return fiveCode;
    }

    public void setFiveCode(String fiveCode) {
        this.fiveCode = fiveCode == null ? null : fiveCode.trim();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getIsRepair() {
        return isRepair;
    }

    public void setIsRepair(String isRepair) {
        this.isRepair = isRepair == null ? null : isRepair.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
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

    public String getPartsRepairCode() {
        return partsRepairCode;
    }

    public void setPartsRepairCode(String partsRepairCode) {
        this.partsRepairCode = partsRepairCode == null ? null : partsRepairCode.trim();
    }

    public String getDamageCode() {
        return damageCode;
    }

    public void setDamageCode(String damageCode) {
        this.damageCode = damageCode == null ? null : damageCode.trim();
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

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public String getSparesNumber() {
        return sparesNumber;
    }

    public void setSparesNumber(String sparesNumber) {
        this.sparesNumber = sparesNumber == null ? null : sparesNumber.trim();
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType == null ? null : warehouseType.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIsOriginal() {
        return isOriginal;
    }

    public void setIsOriginal(String isOriginal) {
        this.isOriginal = isOriginal == null ? null : isOriginal.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
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

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPickingQuantity() {
        return pickingQuantity;
    }

    public void setPickingQuantity(Double pickingQuantity) {
        this.pickingQuantity = pickingQuantity;
    }

    public Double getBorrowQuantity() {
        return borrowQuantity;
    }

    public void setBorrowQuantity(Double borrowQuantity) {
        this.borrowQuantity = borrowQuantity;
    }

    public String getPickingState() {
        return pickingState;
    }

    public void setPickingState(String pickingState) {
        this.pickingState = pickingState == null ? null : pickingState.trim();
    }

    public Double getManHour() {
        return manHour;
    }

    public void setManHour(Double manHour) {
        this.manHour = manHour;
    }

    public String getQualityState() {
        return qualityState;
    }

    public void setQualityState(String qualityState) {
        this.qualityState = qualityState == null ? null : qualityState.trim();
    }

    public String getParentReferralEntry() {
        return parentReferralEntry;
    }

    public void setParentReferralEntry(String parentReferralEntry) {
        this.parentReferralEntry = parentReferralEntry == null ? null : parentReferralEntry.trim();
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

    public String getRectificationStandard() {
        return rectificationStandard;
    }

    public void setRectificationStandard(String rectificationStandard) {
        this.rectificationStandard = rectificationStandard == null ? null : rectificationStandard.trim();
    }

    public String getQualityCause() {
        return qualityCause;
    }

    public void setQualityCause(String qualityCause) {
        this.qualityCause = qualityCause == null ? null : qualityCause.trim();
    }

    public String getPayingParty() {
        return payingParty;
    }

    public void setPayingParty(String payingParty) {
        this.payingParty = payingParty == null ? null : payingParty.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    public String getIsMustPhoto() {
        return isMustPhoto;
    }

    public void setIsMustPhoto(String isMustPhoto) {
        this.isMustPhoto = isMustPhoto == null ? null : isMustPhoto.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
}
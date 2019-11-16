package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CourseEntry {
    private String prodCourseEntryId;

    private Integer serialNumber;

    private String rateId;

    private String fiveCode;

    private String course;

    private String containerCategory;

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

    private Double manHour;

    private BigDecimal manHourCost;

    private BigDecimal materialCost;

    private BigDecimal thirdpartyMoney;

    private String isCharge;

    private BigDecimal sumMoney;

    private String payingParty;

    private String isMustPhoto;

    private String remarks;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String photo;

    public String getProdCourseEntryId() {
        return prodCourseEntryId;
    }

    public void setProdCourseEntryId(String prodCourseEntryId) {
        this.prodCourseEntryId = prodCourseEntryId == null ? null : prodCourseEntryId.trim();
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

    public Double getManHour() {
        return manHour;
    }

    public void setManHour(Double manHour) {
        this.manHour = manHour;
    }

    public BigDecimal getManHourCost() {
        return manHourCost;
    }

    public void setManHourCost(BigDecimal manHourCost) {
        this.manHourCost = manHourCost;
    }

    public BigDecimal getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(BigDecimal materialCost) {
        this.materialCost = materialCost;
    }

    public BigDecimal getThirdpartyMoney() {
        return thirdpartyMoney;
    }

    public void setThirdpartyMoney(BigDecimal thirdpartyMoney) {
        this.thirdpartyMoney = thirdpartyMoney;
    }

    public String getIsCharge() {
        return isCharge;
    }

    public void setIsCharge(String isCharge) {
        this.isCharge = isCharge == null ? null : isCharge.trim();
    }

    public BigDecimal getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(BigDecimal sumMoney) {
        this.sumMoney = sumMoney;
    }

    public String getPayingParty() {
        return payingParty;
    }

    public void setPayingParty(String payingParty) {
        this.payingParty = payingParty == null ? null : payingParty.trim();
    }

    public String getIsMustPhoto() {
        return isMustPhoto;
    }

    public void setIsMustPhoto(String isMustPhoto) {
        this.isMustPhoto = isMustPhoto == null ? null : isMustPhoto.trim();
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
}
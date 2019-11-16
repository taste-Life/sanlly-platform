package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PlanStock {
    private Integer prodPlanStockId;

    private String course;

    private String containerCategory;

    private String containerNo;

    private String referralNo;

    private String referralEntryId;

    private String sparesNumber;

    private String warehouseType;

    private Double length;

    private Double width;

    private Double quantity;

    private Double pickingQuantity;

    private Double borrowQuantity;

    private String pickingState;

    private String warehouse;

    private String company;

    private BigDecimal price;

    private String isOriginal;

    private String remarks;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdPlanStockId() {
        return prodPlanStockId;
    }

    public void setProdPlanStockId(Integer prodPlanStockId) {
        this.prodPlanStockId = prodPlanStockId;
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

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getReferralNo() {
        return referralNo;
    }

    public void setReferralNo(String referralNo) {
        this.referralNo = referralNo == null ? null : referralNo.trim();
    }

    public String getReferralEntryId() {
        return referralEntryId;
    }

    public void setReferralEntryId(String referralEntryId) {
        this.referralEntryId = referralEntryId == null ? null : referralEntryId.trim();
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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
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
}
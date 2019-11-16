package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RepairStore {
    private Integer wareRepairStoreId;

    private String no;

    private String containerNo;

    private String repairNo;

    private String company;

    private String repairType;

    private String customer;

    private String sparePartsCategories;

    private String unitCompany;

    private String repairDepartment;

    private String repairStatus;

    private String stockStatus;

    private String urgentLevel;

    private String site;

    private String yard;

    private String warehouse;

    private String spareParts;

    private String sparePartsBatch;

    private Double stockinNum;

    private Integer stockinUser;

    private Date stockinDate;

    private Double num;

    private Double repairNum;

    private Double wasteNum;

    private Double surplusMaintainNum;

    private Double surplusWasteNum;

    private Double stockoutMaintainNum;

    private Double wasteStockoutNum;

    private BigDecimal stockinPrice;

    private BigDecimal useSparePartsPrice;

    private BigDecimal stockoutPrice;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String sparePartsName;

    private String isOver;

    private String isOut;

    private String isIn;

    public Integer getWareRepairStoreId() {
        return wareRepairStoreId;
    }

    public void setWareRepairStoreId(Integer wareRepairStoreId) {
        this.wareRepairStoreId = wareRepairStoreId;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getRepairNo() {
        return repairNo;
    }

    public void setRepairNo(String repairNo) {
        this.repairNo = repairNo == null ? null : repairNo.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType == null ? null : repairType.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories == null ? null : sparePartsCategories.trim();
    }

    public String getUnitCompany() {
        return unitCompany;
    }

    public void setUnitCompany(String unitCompany) {
        this.unitCompany = unitCompany == null ? null : unitCompany.trim();
    }

    public String getRepairDepartment() {
        return repairDepartment;
    }

    public void setRepairDepartment(String repairDepartment) {
        this.repairDepartment = repairDepartment == null ? null : repairDepartment.trim();
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus == null ? null : repairStatus.trim();
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus == null ? null : stockStatus.trim();
    }

    public String getUrgentLevel() {
        return urgentLevel;
    }

    public void setUrgentLevel(String urgentLevel) {
        this.urgentLevel = urgentLevel == null ? null : urgentLevel.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
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

    public Double getStockinNum() {
        return stockinNum;
    }

    public void setStockinNum(Double stockinNum) {
        this.stockinNum = stockinNum;
    }

    public Integer getStockinUser() {
        return stockinUser;
    }

    public void setStockinUser(Integer stockinUser) {
        this.stockinUser = stockinUser;
    }

    public Date getStockinDate() {
        return stockinDate;
    }

    public void setStockinDate(Date stockinDate) {
        this.stockinDate = stockinDate;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Double getRepairNum() {
        return repairNum;
    }

    public void setRepairNum(Double repairNum) {
        this.repairNum = repairNum;
    }

    public Double getWasteNum() {
        return wasteNum;
    }

    public void setWasteNum(Double wasteNum) {
        this.wasteNum = wasteNum;
    }

    public Double getSurplusMaintainNum() {
        return surplusMaintainNum;
    }

    public void setSurplusMaintainNum(Double surplusMaintainNum) {
        this.surplusMaintainNum = surplusMaintainNum;
    }

    public Double getSurplusWasteNum() {
        return surplusWasteNum;
    }

    public void setSurplusWasteNum(Double surplusWasteNum) {
        this.surplusWasteNum = surplusWasteNum;
    }

    public Double getStockoutMaintainNum() {
        return stockoutMaintainNum;
    }

    public void setStockoutMaintainNum(Double stockoutMaintainNum) {
        this.stockoutMaintainNum = stockoutMaintainNum;
    }

    public Double getWasteStockoutNum() {
        return wasteStockoutNum;
    }

    public void setWasteStockoutNum(Double wasteStockoutNum) {
        this.wasteStockoutNum = wasteStockoutNum;
    }

    public BigDecimal getStockinPrice() {
        return stockinPrice;
    }

    public void setStockinPrice(BigDecimal stockinPrice) {
        this.stockinPrice = stockinPrice;
    }

    public BigDecimal getUseSparePartsPrice() {
        return useSparePartsPrice;
    }

    public void setUseSparePartsPrice(BigDecimal useSparePartsPrice) {
        this.useSparePartsPrice = useSparePartsPrice;
    }

    public BigDecimal getStockoutPrice() {
        return stockoutPrice;
    }

    public void setStockoutPrice(BigDecimal stockoutPrice) {
        this.stockoutPrice = stockoutPrice;
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

    public String getSparePartsName() {
        return sparePartsName;
    }

    public void setSparePartsName(String sparePartsName) {
        this.sparePartsName = sparePartsName == null ? null : sparePartsName.trim();
    }

    public String getIsOver() {
        return isOver;
    }

    public void setIsOver(String isOver) {
        this.isOver = isOver == null ? null : isOver.trim();
    }

    public String getIsOut() {
        return isOut;
    }

    public void setIsOut(String isOut) {
        this.isOut = isOut == null ? null : isOut.trim();
    }

    public String getIsIn() {
        return isIn;
    }

    public void setIsIn(String isIn) {
        this.isIn = isIn == null ? null : isIn.trim();
    }
}
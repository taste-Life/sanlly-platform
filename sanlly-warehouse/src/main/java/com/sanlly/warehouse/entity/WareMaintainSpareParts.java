package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareMaintainSpareParts {
    private Integer wareMaintainSparePartsId;

    private String no;

    private String containerNo;

    private String maintainNo;

    private String company;

    private String stockinType;

    private Integer client;

    private String sparePartsCategories;

    private String refrigeratorCompany;

    private String sparePartsGo;

    private String sparePartsMaintainType;

    private String sparePartsStockoutinStatus;

    private String exigenceLevel;

    private String site;

    private String yard;

    private String warehouse;

    private String spareParts;

    private String sparePartsBatch;

    private Double stockinNum;

    private Integer stockinUser;

    private Date stockinDate;

    private Double maintainNum;

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

    public Integer getWareMaintainSparePartsId() {
        return wareMaintainSparePartsId;
    }

    public void setWareMaintainSparePartsId(Integer wareMaintainSparePartsId) {
        this.wareMaintainSparePartsId = wareMaintainSparePartsId;
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

    public String getMaintainNo() {
        return maintainNo;
    }

    public void setMaintainNo(String maintainNo) {
        this.maintainNo = maintainNo == null ? null : maintainNo.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getStockinType() {
        return stockinType;
    }

    public void setStockinType(String stockinType) {
        this.stockinType = stockinType == null ? null : stockinType.trim();
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories == null ? null : sparePartsCategories.trim();
    }

    public String getRefrigeratorCompany() {
        return refrigeratorCompany;
    }

    public void setRefrigeratorCompany(String refrigeratorCompany) {
        this.refrigeratorCompany = refrigeratorCompany == null ? null : refrigeratorCompany.trim();
    }

    public String getSparePartsGo() {
        return sparePartsGo;
    }

    public void setSparePartsGo(String sparePartsGo) {
        this.sparePartsGo = sparePartsGo == null ? null : sparePartsGo.trim();
    }

    public String getSparePartsMaintainType() {
        return sparePartsMaintainType;
    }

    public void setSparePartsMaintainType(String sparePartsMaintainType) {
        this.sparePartsMaintainType = sparePartsMaintainType == null ? null : sparePartsMaintainType.trim();
    }

    public String getSparePartsStockoutinStatus() {
        return sparePartsStockoutinStatus;
    }

    public void setSparePartsStockoutinStatus(String sparePartsStockoutinStatus) {
        this.sparePartsStockoutinStatus = sparePartsStockoutinStatus == null ? null : sparePartsStockoutinStatus.trim();
    }

    public String getExigenceLevel() {
        return exigenceLevel;
    }

    public void setExigenceLevel(String exigenceLevel) {
        this.exigenceLevel = exigenceLevel == null ? null : exigenceLevel.trim();
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

    public Double getMaintainNum() {
        return maintainNum;
    }

    public void setMaintainNum(Double maintainNum) {
        this.maintainNum = maintainNum;
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
}
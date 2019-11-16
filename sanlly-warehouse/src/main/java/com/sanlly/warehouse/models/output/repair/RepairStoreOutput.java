package com.sanlly.warehouse.models.output.repair;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author lishzh
 */
public class RepairStoreOutput {

    private Integer wareRepairStoreId;

    private Integer wareRepairReportId;

    private String no;

    private String containerNo;

    private String repairNo;

    private String company;

    private String companyLangLang;

    private String repairType;

    private String repairTypeLangLang;

    private String customer;

    private String customerLangLang;

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

    private String sparePartsNo;

    private String sparePartsLangLang;

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

    private String sparePartsName;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createTime;

    private String newSerial;

    private String processingUnit;

    private BigDecimal processingChargesTax;

    private String processingInvoiceType;

    public Integer getWareRepairReportId() {
        return wareRepairReportId;
    }

    public void setWareRepairReportId(Integer wareRepairReportId) {
        this.wareRepairReportId = wareRepairReportId;
    }

    public String getNewSerial() {
        return newSerial;
    }

    public void setNewSerial(String newSerial) {
        this.newSerial = newSerial;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCompanyLangLang() {
        return companyLangLang;
    }

    public void setCompanyLangLang(String companyLangLang) {
        this.companyLangLang = companyLangLang;
    }

    public String getRepairTypeLangLang() {
        return repairTypeLangLang;
    }

    public void setRepairTypeLangLang(String repairTypeLangLang) {
        this.repairTypeLangLang = repairTypeLangLang;
    }

    public String getCustomerLangLang() {
        return customerLangLang;
    }

    public void setCustomerLangLang(String customerLangLang) {
        this.customerLangLang = customerLangLang;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
    }

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
        this.no = no;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public String getRepairNo() {
        return repairNo;
    }

    public void setRepairNo(String repairNo) {
        this.repairNo = repairNo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
    }

    public String getUnitCompany() {
        return unitCompany;
    }

    public void setUnitCompany(String unitCompany) {
        this.unitCompany = unitCompany;
    }

    public String getRepairDepartment() {
        return repairDepartment;
    }

    public void setRepairDepartment(String repairDepartment) {
        this.repairDepartment = repairDepartment;
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getUrgentLevel() {
        return urgentLevel;
    }

    public void setUrgentLevel(String urgentLevel) {
        this.urgentLevel = urgentLevel;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch;
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
        this.auditStatus = auditStatus;
    }

    public String getReasonsRejection() {
        return reasonsRejection;
    }

    public void setReasonsRejection(String reasonsRejection) {
        this.reasonsRejection = reasonsRejection;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSparePartsName() {
        return sparePartsName;
    }

    public void setSparePartsName(String sparePartsName) {
        this.sparePartsName = sparePartsName;
    }
}

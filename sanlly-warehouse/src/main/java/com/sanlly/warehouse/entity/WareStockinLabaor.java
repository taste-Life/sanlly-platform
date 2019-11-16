package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareStockinLabaor {
    private Integer wareStockinLabaorId;

    private String labaorStockinNo;

    private String no;

    private String company;

    private String billType;

    private String entryWarehouse;

    private String entryStatus;

    private String supplier;

    private BigDecimal billTotalAmount;

    private String invoiceType;

    private String logisticsCompany;

    private BigDecimal totalAmount;

    private BigDecimal tariff;

    private BigDecimal vat;

    private BigDecimal freight;

    private Double entryedNum;

    private String isStockSbs;

    private String auditStatus;

    private String reasonsRejection;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareStockinLabaorId() {
        return wareStockinLabaorId;
    }

    public void setWareStockinLabaorId(Integer wareStockinLabaorId) {
        this.wareStockinLabaorId = wareStockinLabaorId;
    }

    public String getLabaorStockinNo() {
        return labaorStockinNo;
    }

    public void setLabaorStockinNo(String labaorStockinNo) {
        this.labaorStockinNo = labaorStockinNo == null ? null : labaorStockinNo.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getEntryWarehouse() {
        return entryWarehouse;
    }

    public void setEntryWarehouse(String entryWarehouse) {
        this.entryWarehouse = entryWarehouse == null ? null : entryWarehouse.trim();
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus == null ? null : entryStatus.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public BigDecimal getBillTotalAmount() {
        return billTotalAmount;
    }

    public void setBillTotalAmount(BigDecimal billTotalAmount) {
        this.billTotalAmount = billTotalAmount;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany == null ? null : logisticsCompany.trim();
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public Double getEntryedNum() {
        return entryedNum;
    }

    public void setEntryedNum(Double entryedNum) {
        this.entryedNum = entryedNum;
    }

    public String getIsStockSbs() {
        return isStockSbs;
    }

    public void setIsStockSbs(String isStockSbs) {
        this.isStockSbs = isStockSbs == null ? null : isStockSbs.trim();
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
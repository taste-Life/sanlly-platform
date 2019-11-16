package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareShipSupplyReplace {
    private Integer wareShipSupplyReplaceId;

    private String shipSupplyReplaceNo;

    private String no;

    private String replaceCompany;

    private String shipSupplyCompany;

    private String shipSupplyCz;

    private BigDecimal shipSupplyPrice;

    private BigDecimal exchangeRate;

    private String customer;

    private String billStatus;

    private Date shipSupplyDate;

    private String voyageNumber;

    private String status;

    private String shipName;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String billType;

    public Integer getWareShipSupplyReplaceId() {
        return wareShipSupplyReplaceId;
    }

    public void setWareShipSupplyReplaceId(Integer wareShipSupplyReplaceId) {
        this.wareShipSupplyReplaceId = wareShipSupplyReplaceId;
    }

    public String getShipSupplyReplaceNo() {
        return shipSupplyReplaceNo;
    }

    public void setShipSupplyReplaceNo(String shipSupplyReplaceNo) {
        this.shipSupplyReplaceNo = shipSupplyReplaceNo == null ? null : shipSupplyReplaceNo.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getReplaceCompany() {
        return replaceCompany;
    }

    public void setReplaceCompany(String replaceCompany) {
        this.replaceCompany = replaceCompany == null ? null : replaceCompany.trim();
    }

    public String getShipSupplyCompany() {
        return shipSupplyCompany;
    }

    public void setShipSupplyCompany(String shipSupplyCompany) {
        this.shipSupplyCompany = shipSupplyCompany == null ? null : shipSupplyCompany.trim();
    }

    public String getShipSupplyCz() {
        return shipSupplyCz;
    }

    public void setShipSupplyCz(String shipSupplyCz) {
        this.shipSupplyCz = shipSupplyCz == null ? null : shipSupplyCz.trim();
    }

    public BigDecimal getShipSupplyPrice() {
        return shipSupplyPrice;
    }

    public void setShipSupplyPrice(BigDecimal shipSupplyPrice) {
        this.shipSupplyPrice = shipSupplyPrice;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public Date getShipSupplyDate() {
        return shipSupplyDate;
    }

    public void setShipSupplyDate(Date shipSupplyDate) {
        this.shipSupplyDate = shipSupplyDate;
    }

    public String getVoyageNumber() {
        return voyageNumber;
    }

    public void setVoyageNumber(String voyageNumber) {
        this.voyageNumber = voyageNumber == null ? null : voyageNumber.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
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

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }
}
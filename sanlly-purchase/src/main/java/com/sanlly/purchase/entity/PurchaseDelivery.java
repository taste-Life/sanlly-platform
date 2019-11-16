package com.sanlly.purchase.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseDelivery {
    private Integer purcPurchaseDeliveryId;

    private String tenderId;

    private String isDayPruchase;

    private String deliveryNum;

    private String purchaseCompany;

    private String purchaseWare;

    private String purchaseType;

    private String invoice;

    private Integer purchaseUserId;

    private String contact;

    private Integer purcPurchaseOrder;

    private String supplier;

    private String supplyType;

    private String logisticsCompany;

    private String logisticsNum;

    private String reciveStatus;

    private BigDecimal billtotalamount;

    private BigDecimal vat;

    private BigDecimal tariff;

    private BigDecimal freight;

    private String isVerifyAccount;

    private Date purchaseTime;

    private String reciveAddress;

    private String comments;

    private String invoiceNo;

    private String isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getPurcPurchaseDeliveryId() {
        return purcPurchaseDeliveryId;
    }

    public void setPurcPurchaseDeliveryId(Integer purcPurchaseDeliveryId) {
        this.purcPurchaseDeliveryId = purcPurchaseDeliveryId;
    }

    public String getTenderId() {
        return tenderId;
    }

    public void setTenderId(String tenderId) {
        this.tenderId = tenderId == null ? null : tenderId.trim();
    }

    public String getIsDayPruchase() {
        return isDayPruchase;
    }

    public void setIsDayPruchase(String isDayPruchase) {
        this.isDayPruchase = isDayPruchase == null ? null : isDayPruchase.trim();
    }

    public String getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(String deliveryNum) {
        this.deliveryNum = deliveryNum == null ? null : deliveryNum.trim();
    }

    public String getPurchaseCompany() {
        return purchaseCompany;
    }

    public void setPurchaseCompany(String purchaseCompany) {
        this.purchaseCompany = purchaseCompany == null ? null : purchaseCompany.trim();
    }

    public String getPurchaseWare() {
        return purchaseWare;
    }

    public void setPurchaseWare(String purchaseWare) {
        this.purchaseWare = purchaseWare == null ? null : purchaseWare.trim();
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType == null ? null : purchaseType.trim();
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    public Integer getPurchaseUserId() {
        return purchaseUserId;
    }

    public void setPurchaseUserId(Integer purchaseUserId) {
        this.purchaseUserId = purchaseUserId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public Integer getPurcPurchaseOrder() {
        return purcPurchaseOrder;
    }

    public void setPurcPurchaseOrder(Integer purcPurchaseOrder) {
        this.purcPurchaseOrder = purcPurchaseOrder;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType == null ? null : supplyType.trim();
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany == null ? null : logisticsCompany.trim();
    }

    public String getLogisticsNum() {
        return logisticsNum;
    }

    public void setLogisticsNum(String logisticsNum) {
        this.logisticsNum = logisticsNum == null ? null : logisticsNum.trim();
    }

    public String getReciveStatus() {
        return reciveStatus;
    }

    public void setReciveStatus(String reciveStatus) {
        this.reciveStatus = reciveStatus == null ? null : reciveStatus.trim();
    }

    public BigDecimal getBilltotalamount() {
        return billtotalamount;
    }

    public void setBilltotalamount(BigDecimal billtotalamount) {
        this.billtotalamount = billtotalamount;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getIsVerifyAccount() {
        return isVerifyAccount;
    }

    public void setIsVerifyAccount(String isVerifyAccount) {
        this.isVerifyAccount = isVerifyAccount == null ? null : isVerifyAccount.trim();
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public String getReciveAddress() {
        return reciveAddress;
    }

    public void setReciveAddress(String reciveAddress) {
        this.reciveAddress = reciveAddress == null ? null : reciveAddress.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
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
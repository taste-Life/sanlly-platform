package com.sanlly.purchase.models.input.dailyorder;

import java.util.Date;
import java.util.List;

/**
 * @Description: TODO
 * @ClassName: AddDailyPurchaseOrderInput
 * @Version 1.0
 * @Author mqz
 */
public class AddDailyPurchaseOrderInput {
    // 采购项目编号
    private String tenderId;
    // 发票类型
    private String invoice;
    // 采购单位
    private String purchaseCompany;
    // 采购仓库
    private String purchaseWare;
    // 采购模式
    private String purchaseType;
    // 采购人
    private Integer purchaseUserId;
    // 联系方式
    private String contact;
    // 供应商
    private String supplier;
    // 采购时间
    private Date purchaseTime;
    // 收货地址
    private String reciverAddress;
    // 备注
    private String comments;
    //商品单位
    private String sparePartsUnit;

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit;
    }

    private List<AddDailyPurchaseOrderDetailInput> details;

    public String getTenderId() {
        return tenderId;
    }

    public void setTenderId(String tenderId) {
        this.tenderId = tenderId;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getPurchaseCompany() {
        return purchaseCompany;
    }

    public void setPurchaseCompany(String purchaseCompany) {
        this.purchaseCompany = purchaseCompany;
    }

    public String getPurchaseWare() {
        return purchaseWare;
    }

    public void setPurchaseWare(String purchaseWare) {
        this.purchaseWare = purchaseWare;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
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
        this.contact = contact;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public String getReciverAddress() {
        return reciverAddress;
    }

    public void setReciverAddress(String reciverAddress) {
        this.reciverAddress = reciverAddress;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<AddDailyPurchaseOrderDetailInput> getDetails() {
        return details;
    }

    public void setDetails(List<AddDailyPurchaseOrderDetailInput> details) {
        this.details = details;
    }
}

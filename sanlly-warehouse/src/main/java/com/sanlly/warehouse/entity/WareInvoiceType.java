package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareInvoiceType {
    private Integer wareInvoiceTypeId;

    private String key;

    private String invoiceTypeNameEn;

    private String invoiceTypeName;

    private BigDecimal invoiceTaxAmount;

    private Integer isDel;

    private String remark;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareInvoiceTypeId() {
        return wareInvoiceTypeId;
    }

    public void setWareInvoiceTypeId(Integer wareInvoiceTypeId) {
        this.wareInvoiceTypeId = wareInvoiceTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getInvoiceTypeNameEn() {
        return invoiceTypeNameEn;
    }

    public void setInvoiceTypeNameEn(String invoiceTypeNameEn) {
        this.invoiceTypeNameEn = invoiceTypeNameEn == null ? null : invoiceTypeNameEn.trim();
    }

    public String getInvoiceTypeName() {
        return invoiceTypeName;
    }

    public void setInvoiceTypeName(String invoiceTypeName) {
        this.invoiceTypeName = invoiceTypeName == null ? null : invoiceTypeName.trim();
    }

    public BigDecimal getInvoiceTaxAmount() {
        return invoiceTaxAmount;
    }

    public void setInvoiceTaxAmount(BigDecimal invoiceTaxAmount) {
        this.invoiceTaxAmount = invoiceTaxAmount;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
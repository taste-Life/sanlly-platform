package com.sanlly.purchase.entity;

import java.util.Date;

public class InvoiceType {
    private Integer purcInvoiceTypeId;

    private String key;

    private String invoiceTypeName;

    private String invoiceTypeEn;

    private Double invoicePoint;

    private String isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String invoiceCategroy;

    public Integer getPurcInvoiceTypeId() {
        return purcInvoiceTypeId;
    }

    public void setPurcInvoiceTypeId(Integer purcInvoiceTypeId) {
        this.purcInvoiceTypeId = purcInvoiceTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getInvoiceTypeName() {
        return invoiceTypeName;
    }

    public void setInvoiceTypeName(String invoiceTypeName) {
        this.invoiceTypeName = invoiceTypeName == null ? null : invoiceTypeName.trim();
    }

    public String getInvoiceTypeEn() {
        return invoiceTypeEn;
    }

    public void setInvoiceTypeEn(String invoiceTypeEn) {
        this.invoiceTypeEn = invoiceTypeEn == null ? null : invoiceTypeEn.trim();
    }

    public Double getInvoicePoint() {
        return invoicePoint;
    }

    public void setInvoicePoint(Double invoicePoint) {
        this.invoicePoint = invoicePoint;
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

    public String getInvoiceCategroy() {
        return invoiceCategroy;
    }

    public void setInvoiceCategroy(String invoiceCategroy) {
        this.invoiceCategroy = invoiceCategroy == null ? null : invoiceCategroy.trim();
    }
}
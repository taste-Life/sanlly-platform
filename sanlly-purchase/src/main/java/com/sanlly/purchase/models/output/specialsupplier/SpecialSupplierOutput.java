package com.sanlly.purchase.models.output.specialsupplier;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SpecialSupplierOutput {
    //主键id
    private Integer specialSupplierId;
    //供应商名称
    private String name;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date createTime;

    private String createUser;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date updateTime;

    private String updateUser;
    //供应商英文名称
    private String nameEn;
    //供应商类型
    private String supplierType;
    private String supplierTypeLangLang;

    public String getSupplierTypeLangLang() {
        return supplierTypeLangLang;
    }

    public void setSupplierTypeLangLang(String supplierTypeLangLang) {
        this.supplierTypeLangLang = supplierTypeLangLang;
    }

    public Integer getSpecialSupplierId() {
        return specialSupplierId;
    }

    public void setSpecialSupplierId(Integer specialSupplierId) {
        this.specialSupplierId = specialSupplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }
}

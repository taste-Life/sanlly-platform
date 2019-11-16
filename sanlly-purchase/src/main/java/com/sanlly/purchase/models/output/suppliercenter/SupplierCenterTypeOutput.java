package com.sanlly.purchase.models.output.suppliercenter;

/**
 * @Description: TODO
 * @Date: 2019/9/17 10:38
 * @Version 1.0
 * @Author mqz
 */
public class SupplierCenterTypeOutput {
    //供应商key
    private  String supplier;
    //供应商类别
    private  String supplierType;
    private  String supplierTypeLangLang;

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public String getSupplierTypeLangLang() {
        return supplierTypeLangLang;
    }

    public void setSupplierTypeLangLang(String supplierTypeLangLang) {
        this.supplierTypeLangLang = supplierTypeLangLang;
    }
}

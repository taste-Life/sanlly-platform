package com.sanlly.purchase.models.output.supplierType;

/**
 * @Description: TODO
 * @ClassName: SupplierTypeBasicOutput
 * @Date: 2019/10/22 16:47
 * @Version 1.0
 * @Author mqz
 */
public class SupplierTypeBasicOutput {

    //供应商类别key
    private  String supplierType;
    //供应商类别key
    private  String supplierTypeLangLang;

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

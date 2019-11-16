package com.sanlly.purchase.models.input.supplier;

/**
 * @Description: TODO
 * @ClassName: AddBlackListInput
 * @Date: 2019/10/22 9:13
 * @Version 1.0
 * @Author mqz
 */
public class AddBlackListInput {
    //供应商名称
    String supplierName;
    //供应商英文名称
    String supplierNameEn;
    //黑名单类型
    String type;

    public String getSupplierNameEn() {
        return supplierNameEn;
    }

    public void setSupplierNameEn(String supplierNameEn) {
        this.supplierNameEn = supplierNameEn;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

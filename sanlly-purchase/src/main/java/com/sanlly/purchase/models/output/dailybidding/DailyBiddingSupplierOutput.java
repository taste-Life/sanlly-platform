package com.sanlly.purchase.models.output.dailybidding;

/**
 * @Description: TODO
 * @ClassName: DailyBiddingSupplierOutput
 * @Version 1.0
 * @Author mqz
 */
public class DailyBiddingSupplierOutput {
    // 供应商
    private String supplier;
    private String supplierLangLang;
    // 结算信用期
    private String settlementCycle;
    private String settlementCycleLangLang;
    // 评价等级
    private String grade;
    private String gradeLangLang;
    //供应商key
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSupplierLangLang() {
        return supplierLangLang;
    }

    public void setSupplierLangLang(String supplierLangLang) {
        this.supplierLangLang = supplierLangLang;
    }

    public String getSettlementCycle() {
        return settlementCycle;
    }

    public void setSettlementCycle(String settlementCycle) {
        this.settlementCycle = settlementCycle;
    }

    public String getSettlementCycleLangLang() {
        return settlementCycleLangLang;
    }

    public void setSettlementCycleLangLang(String settlementCycleLangLang) {
        this.settlementCycleLangLang = settlementCycleLangLang;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGradeLangLang() {
        return gradeLangLang;
    }

    public void setGradeLangLang(String gradeLangLang) {
        this.gradeLangLang = gradeLangLang;
    }
}

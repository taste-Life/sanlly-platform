package com.sanlly.purchase.models.input.dailydemand;

import com.sanlly.purchase.models.output.dailydemand.DailyDemandOutput;

import java.util.List;

/**
 * @Description: TODO
 * @ClassName: AddDailyPurchaseInput
 * @Date: 2019/8/26 10:00
 * @Version 1.0
 * @Author mqz
 */
public class AddDailyTemporaryPurchaseInput {
    // 采购模式
    private String tenderType;
    // 发票类型
    private String invoiceType;
    // 供应商
    private String supplier;
    private String supplierName;
    private  String comments;
    private  String settlementCycle;
    private  String currency;

    public String getSettlementCycle() {
        return settlementCycle;
    }

    public void setSettlementCycle(String settlementCycle) {
        this.settlementCycle = settlementCycle;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // 采购商品ID列表
    private List<DailyDemandOutput> matterDemandList;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getTenderType() {
        return tenderType;
    }

    public void setTenderType(String tenderType) {
        this.tenderType = tenderType;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public List<DailyDemandOutput> getMatterDemandList() {
        return matterDemandList;
    }

    public void setMatterDemandList(List<DailyDemandOutput> matterDemandList) {
        this.matterDemandList = matterDemandList;
    }
}

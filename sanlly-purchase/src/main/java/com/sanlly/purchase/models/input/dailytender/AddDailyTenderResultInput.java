package com.sanlly.purchase.models.input.dailytender;

import com.sanlly.purchase.models.output.dailytender.DailyTenderProductOutput;

import java.util.List;

/**
 * @Description: TODO
 * @ClassName: AddDailyTenderResultInput
 * @Version 1.0
 * @Author mqz
 */
public class AddDailyTenderResultInput {
    // 采购id
    private Integer purcMatterTenderPurchaseId;
    // 发票类型
    private String invoiceType;
    // 招标结果
    private String tenderStatus;
    // 原因
    private String reason;
    // 采纳供应商
    private String supplier;
    // 招标备件
    private List<DailyTenderProductOutput> tenderProductOutputList;

    public Integer getPurcMatterTenderPurchaseId() {
        return purcMatterTenderPurchaseId;
    }

    public void setPurcMatterTenderPurchaseId(Integer purcMatterTenderPurchaseId) {
        this.purcMatterTenderPurchaseId = purcMatterTenderPurchaseId;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getTenderStatus() {
        return tenderStatus;
    }

    public void setTenderStatus(String tenderStatus) {
        this.tenderStatus = tenderStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public List<DailyTenderProductOutput> getTenderProductOutputList() {
        return tenderProductOutputList;
    }

    public void setTenderProductOutputList(List<DailyTenderProductOutput> tenderProductOutputList) {
        this.tenderProductOutputList = tenderProductOutputList;
    }
}

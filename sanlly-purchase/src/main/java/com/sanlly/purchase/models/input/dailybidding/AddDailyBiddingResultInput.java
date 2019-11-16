package com.sanlly.purchase.models.input.dailybidding;

/**
 * @Description: TODO
 * @ClassName: AddDailyBiddingResultInput
 * @Date: 2019/8/26 9:17
 * @Version 1.0
 * @Author mqz
 */
public class AddDailyBiddingResultInput {
    //主键id
    private Integer purcMatterTenderPurchaseId;
    // 中标供应商报价id
    private Integer purcSupplierTenderId;
    // 发票类型
    private String invoiceType;
    // 招标结果
    private String tenderStatus;
    // 原因
    private String reason;

    public Integer getPurcMatterTenderPurchaseId() {
        return purcMatterTenderPurchaseId;
    }

    public void setPurcMatterTenderPurchaseId(Integer purcMatterTenderPurchaseId) {
        this.purcMatterTenderPurchaseId = purcMatterTenderPurchaseId;
    }

    public Integer getPurcSupplierTenderId() {
        return purcSupplierTenderId;
    }

    public void setPurcSupplierTenderId(Integer purcSupplierTenderId) {
        this.purcSupplierTenderId = purcSupplierTenderId;
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
}

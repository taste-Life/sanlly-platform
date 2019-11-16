package com.sanlly.purchase.models.input.supplierbidding;

import java.util.List;

/**
 * @Description: TODO
 * @ClassName: AddSupplierDailyBiddingInput
 * @Version 1.0
 * @Author mqz
 */
public class AddSupplierDailyBiddingInput {
    // 采购id
    private Integer purcMatterTenderPurchaseId;

    // 竞价备件列表
    private List<SupplierDailyBiddingProductInput> supplierTenderProductList;

    public Integer getPurcMatterTenderPurchaseId() {
        return purcMatterTenderPurchaseId;
    }

    public void setPurcMatterTenderPurchaseId(Integer purcMatterTenderPurchaseId) {
        this.purcMatterTenderPurchaseId = purcMatterTenderPurchaseId;
    }

    public List<SupplierDailyBiddingProductInput> getSupplierTenderProductList() {
        return supplierTenderProductList;
    }

    public void setSupplierTenderProductList(List<SupplierDailyBiddingProductInput> supplierTenderProductList) {
        this.supplierTenderProductList = supplierTenderProductList;
    }
}

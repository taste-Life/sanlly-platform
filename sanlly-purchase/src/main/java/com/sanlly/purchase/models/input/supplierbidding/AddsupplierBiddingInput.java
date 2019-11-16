package com.sanlly.purchase.models.input.supplierbidding;

import java.util.List;

/**
 * @Description: TODO
 * @ClassName: AddsupplierBiddingInput
 * @Version 1.0
 * @Author mqz
 */
public class AddsupplierBiddingInput {

    // 采购id
    private Integer purcMatterTenderPurchaseId;

    // 竞价备件列表
    private List<SupplierBiddingProductInput> supplierTenderProductList;

    public Integer getPurcMatterTenderPurchaseId() {
        return purcMatterTenderPurchaseId;
    }

    public void setPurcMatterTenderPurchaseId(Integer purcMatterTenderPurchaseId) {
        this.purcMatterTenderPurchaseId = purcMatterTenderPurchaseId;
    }

    public List<SupplierBiddingProductInput> getSupplierTenderProductList() {
        return supplierTenderProductList;
    }

    public void setSupplierTenderProductList(List<SupplierBiddingProductInput> supplierTenderProductList) {
        this.supplierTenderProductList = supplierTenderProductList;
    }
}

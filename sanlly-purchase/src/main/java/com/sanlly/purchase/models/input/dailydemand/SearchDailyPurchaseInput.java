package com.sanlly.purchase.models.input.dailydemand;

import com.sanlly.common.models.input.PageInput;

/**
 * @Description: TODO
 * @ClassName: SearchDailyPurchaseInput
 * @Date: 2019/8/26 10:01
 * @Version 1.0
 * @Author mqz
 */
public class SearchDailyPurchaseInput extends PageInput {
    // 需求编号 子表
    private String demandNo;
    // 采购单位
    private String purchaseCompany;
    // 商品名称  子表
    private String productName;
    // 供应商
    private String supplier;
    // 审核状态
    private String auditStatus;
    // 采购模式
    private String purchasingPattern;
    // 备件大类  子表
//    private String sparePartsCategories;
//    // 明细类别 子表
//    private String sparePartsCategoriesDetails;
    // 采购单创建时间起
    private String createStart;
    // 采购单创建时间止
    private String createEnd;

    public SearchDailyPurchaseInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }

    public String getDemandNo() {
        return demandNo;
    }

    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo;
    }

    public String getPurchaseCompany() {
        return purchaseCompany;
    }

    public void setPurchaseCompany(String purchaseCompany) {
        this.purchaseCompany = purchaseCompany;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getPurchasingPattern() {
        return purchasingPattern;
    }

    public void setPurchasingPattern(String purchasingPattern) {
        this.purchasingPattern = purchasingPattern;
    }

    public String getCreateStart() {
        return createStart;
    }

    public void setCreateStart(String createStart) {
        this.createStart = createStart;
    }

    public String getCreateEnd() {
        return createEnd;
    }

    public void setCreateEnd(String createEnd) {
        this.createEnd = createEnd;
    }


}

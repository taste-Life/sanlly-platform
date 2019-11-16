package com.sanlly.purchase.models.input.dailydemand;

import com.sanlly.common.models.input.PageInput;

/**
 * @Description: 采购需求检索input
 * @ClassName: SearcherDailyDemandInput
 * @Version 1.0
 * @Author mqz
 */
public class SearcherDailyDemandInput extends PageInput {
    // 采购状态
    private String isCreateOrder;
    // 采购单位
    private String purchaseCompany;
    // 商品名称
    private String productNum;
    //审核状态
    private String auditStatus;

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getIsCreateOrder() {
        return isCreateOrder;
    }

    public void setIsCreateOrder(String isCreateOrder) {
        this.isCreateOrder = isCreateOrder;
    }

    public String getPurchaseCompany() {
        return purchaseCompany;
    }

    public void setPurchaseCompany(String purchaseCompany) {
        this.purchaseCompany = purchaseCompany;
    }
}

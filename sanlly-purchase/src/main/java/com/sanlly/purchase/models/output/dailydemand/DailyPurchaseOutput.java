package com.sanlly.purchase.models.output.dailydemand;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Description: TODO
 * @ClassName: DailyPurchaseOutput
 * @Version 1.0
 * @Author mqz
 */
public class DailyPurchaseOutput {
    //主键
    private Integer purcMatterTemporaryPurchaseId;
    // 采购模式
    private String purchasingPatternLangLang;
    // 地址
    private String warehouse;
    private String warehouseAddress;
    // 供应商
    private String supplier;
    private String supplierLangLang;
    // 付款方式
    private String payMethod;
    private String payMethodLangLang;
    // 币种
    private String currencyLangLang;
    // 总金额
    private BigDecimal totalMoney;
    // 审核状态
    private String auditStatusLangLang;
    // 审核流程id
    private String processInstanceId;
    // 审核任务id
    private String taskId;
    // 发票类型
    private String invoiceLangLang;
    private String invoice;
    private String currencyl;
    private String auditStatus;
    private String purchasingPattern;
    private String purchaseCompany;
    private String purchaseCompanyLangLang;
    private String name;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getCurrencyl() {
        return currencyl;
    }

    public void setCurrencyl(String currencyl) {
        this.currencyl = currencyl;
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

    public String getPurchaseCompany() {
        return purchaseCompany;
    }

    public void setPurchaseCompany(String purchaseCompany) {
        this.purchaseCompany = purchaseCompany;
    }

    public String getPurchaseCompanyLangLang() {
        return purchaseCompanyLangLang;
    }

    public void setPurchaseCompanyLangLang(String purchaseCompanyLangLang) {
        this.purchaseCompanyLangLang = purchaseCompanyLangLang;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    // 采购备件明细
    private List<DailyPurchaseProductOutput> productList;

    public Integer getPurcMatterTemporaryPurchaseId() {
        return purcMatterTemporaryPurchaseId;
    }

    public void setPurcMatterTemporaryPurchaseId(Integer purcMatterTemporaryPurchaseId) {
        this.purcMatterTemporaryPurchaseId = purcMatterTemporaryPurchaseId;
    }

    public String getPurchasingPatternLangLang() {
        return purchasingPatternLangLang;
    }

    public void setPurchasingPatternLangLang(String purchasingPatternLangLang) {
        this.purchasingPatternLangLang = purchasingPatternLangLang;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
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

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getPayMethodLangLang() {
        return payMethodLangLang;
    }

    public void setPayMethodLangLang(String payMethodLangLang) {
        this.payMethodLangLang = payMethodLangLang;
    }

    public String getCurrencyLangLang() {
        return currencyLangLang;
    }

    public void setCurrencyLangLang(String currencyLangLang) {
        this.currencyLangLang = currencyLangLang;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getAuditStatusLangLang() {
        return auditStatusLangLang;
    }

    public void setAuditStatusLangLang(String auditStatusLangLang) {
        this.auditStatusLangLang = auditStatusLangLang;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getInvoiceLangLang() {
        return invoiceLangLang;
    }

    public void setInvoiceLangLang(String invoiceLangLang) {
        this.invoiceLangLang = invoiceLangLang;
    }

    public List<DailyPurchaseProductOutput> getProductList() {
        return productList;
    }

    public void setProductList(List<DailyPurchaseProductOutput> productList) {
        this.productList = productList;
    }
}

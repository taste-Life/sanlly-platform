package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BillPti {
    private Integer billId;

    private String billCode;

    private String billMonth;

    private String businessCategory;

    private String businessType;

    private String containerCategory;

    private String chargecode;

    private String chargeTypeKey;

    private String invoiceType;

    private String containerUser;

    private String merchantsKey;

    private String sapid;

    private String companyKey;

    private BigDecimal totalTaxAmount;

    private BigDecimal totalNotaxAmount;

    private BigDecimal realRate;

    private String realCurrencyType;

    private BigDecimal taxRate;

    private BigDecimal taxAmountUsa;

    private BigDecimal taxAmountRbm;

    private BigDecimal realTaxTotalCostUsa;

    private BigDecimal realNotaxTotalCostUsa;

    private BigDecimal realTaxTotalCostRmb;

    private BigDecimal realNotaxTotalCostRmb;

    private BigDecimal number;

    private Integer billAuditor;

    private Date billAuditorTime;

    private Integer billReturn;

    private Date billReturnTime;

    private String billReturnReason;

    private String billRemark;

    private Integer financeReturn;

    private Date financeReturnTime;

    private String financeReturnReason;

    private String financeRemark;

    private String versionNo;

    private Integer billType;

    private String billStatus;

    private String modifyBillStatus;

    private String modifyBillType;

    private String isEnabled;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private String createNode;

    private Date updateTime;

    private Integer updateUser;

    private String chargeInoutType;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    public String getBillMonth() {
        return billMonth;
    }

    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth == null ? null : billMonth.trim();
    }

    public String getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory == null ? null : businessCategory.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getChargecode() {
        return chargecode;
    }

    public void setChargecode(String chargecode) {
        this.chargecode = chargecode == null ? null : chargecode.trim();
    }

    public String getChargeTypeKey() {
        return chargeTypeKey;
    }

    public void setChargeTypeKey(String chargeTypeKey) {
        this.chargeTypeKey = chargeTypeKey == null ? null : chargeTypeKey.trim();
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getMerchantsKey() {
        return merchantsKey;
    }

    public void setMerchantsKey(String merchantsKey) {
        this.merchantsKey = merchantsKey == null ? null : merchantsKey.trim();
    }

    public String getSapid() {
        return sapid;
    }

    public void setSapid(String sapid) {
        this.sapid = sapid == null ? null : sapid.trim();
    }

    public String getCompanyKey() {
        return companyKey;
    }

    public void setCompanyKey(String companyKey) {
        this.companyKey = companyKey == null ? null : companyKey.trim();
    }

    public BigDecimal getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public BigDecimal getTotalNotaxAmount() {
        return totalNotaxAmount;
    }

    public void setTotalNotaxAmount(BigDecimal totalNotaxAmount) {
        this.totalNotaxAmount = totalNotaxAmount;
    }

    public BigDecimal getRealRate() {
        return realRate;
    }

    public void setRealRate(BigDecimal realRate) {
        this.realRate = realRate;
    }

    public String getRealCurrencyType() {
        return realCurrencyType;
    }

    public void setRealCurrencyType(String realCurrencyType) {
        this.realCurrencyType = realCurrencyType == null ? null : realCurrencyType.trim();
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getTaxAmountUsa() {
        return taxAmountUsa;
    }

    public void setTaxAmountUsa(BigDecimal taxAmountUsa) {
        this.taxAmountUsa = taxAmountUsa;
    }

    public BigDecimal getTaxAmountRbm() {
        return taxAmountRbm;
    }

    public void setTaxAmountRbm(BigDecimal taxAmountRbm) {
        this.taxAmountRbm = taxAmountRbm;
    }

    public BigDecimal getRealTaxTotalCostUsa() {
        return realTaxTotalCostUsa;
    }

    public void setRealTaxTotalCostUsa(BigDecimal realTaxTotalCostUsa) {
        this.realTaxTotalCostUsa = realTaxTotalCostUsa;
    }

    public BigDecimal getRealNotaxTotalCostUsa() {
        return realNotaxTotalCostUsa;
    }

    public void setRealNotaxTotalCostUsa(BigDecimal realNotaxTotalCostUsa) {
        this.realNotaxTotalCostUsa = realNotaxTotalCostUsa;
    }

    public BigDecimal getRealTaxTotalCostRmb() {
        return realTaxTotalCostRmb;
    }

    public void setRealTaxTotalCostRmb(BigDecimal realTaxTotalCostRmb) {
        this.realTaxTotalCostRmb = realTaxTotalCostRmb;
    }

    public BigDecimal getRealNotaxTotalCostRmb() {
        return realNotaxTotalCostRmb;
    }

    public void setRealNotaxTotalCostRmb(BigDecimal realNotaxTotalCostRmb) {
        this.realNotaxTotalCostRmb = realNotaxTotalCostRmb;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public Integer getBillAuditor() {
        return billAuditor;
    }

    public void setBillAuditor(Integer billAuditor) {
        this.billAuditor = billAuditor;
    }

    public Date getBillAuditorTime() {
        return billAuditorTime;
    }

    public void setBillAuditorTime(Date billAuditorTime) {
        this.billAuditorTime = billAuditorTime;
    }

    public Integer getBillReturn() {
        return billReturn;
    }

    public void setBillReturn(Integer billReturn) {
        this.billReturn = billReturn;
    }

    public Date getBillReturnTime() {
        return billReturnTime;
    }

    public void setBillReturnTime(Date billReturnTime) {
        this.billReturnTime = billReturnTime;
    }

    public String getBillReturnReason() {
        return billReturnReason;
    }

    public void setBillReturnReason(String billReturnReason) {
        this.billReturnReason = billReturnReason == null ? null : billReturnReason.trim();
    }

    public String getBillRemark() {
        return billRemark;
    }

    public void setBillRemark(String billRemark) {
        this.billRemark = billRemark == null ? null : billRemark.trim();
    }

    public Integer getFinanceReturn() {
        return financeReturn;
    }

    public void setFinanceReturn(Integer financeReturn) {
        this.financeReturn = financeReturn;
    }

    public Date getFinanceReturnTime() {
        return financeReturnTime;
    }

    public void setFinanceReturnTime(Date financeReturnTime) {
        this.financeReturnTime = financeReturnTime;
    }

    public String getFinanceReturnReason() {
        return financeReturnReason;
    }

    public void setFinanceReturnReason(String financeReturnReason) {
        this.financeReturnReason = financeReturnReason == null ? null : financeReturnReason.trim();
    }

    public String getFinanceRemark() {
        return financeRemark;
    }

    public void setFinanceRemark(String financeRemark) {
        this.financeRemark = financeRemark == null ? null : financeRemark.trim();
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo == null ? null : versionNo.trim();
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public String getModifyBillStatus() {
        return modifyBillStatus;
    }

    public void setModifyBillStatus(String modifyBillStatus) {
        this.modifyBillStatus = modifyBillStatus == null ? null : modifyBillStatus.trim();
    }

    public String getModifyBillType() {
        return modifyBillType;
    }

    public void setModifyBillType(String modifyBillType) {
        this.modifyBillType = modifyBillType == null ? null : modifyBillType.trim();
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getCreateNode() {
        return createNode;
    }

    public void setCreateNode(String createNode) {
        this.createNode = createNode == null ? null : createNode.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public String getChargeInoutType() {
        return chargeInoutType;
    }

    public void setChargeInoutType(String chargeInoutType) {
        this.chargeInoutType = chargeInoutType == null ? null : chargeInoutType.trim();
    }
}
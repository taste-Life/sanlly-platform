package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BillRepairDetail {
    private Integer id;

    private Integer billId;

    private String prodCourseId;

    private String prodContainerId;

    private String containerNo;

    private String yard;

    private Date replyTime;

    private Integer isBackLease;

    private String repairNumber;

    private String containerUser;

    private String chargeObject;

    private BigDecimal valuationHourNumber;

    private BigDecimal valuationManHourCost;

    private BigDecimal valuationMaterialCost;

    private BigDecimal valuationMoneyUsd;

    private BigDecimal valuationMoneyRmb;

    private BigDecimal replyTaxTotalCostUsa;

    private BigDecimal replyTaxTotalCostRmb;

    private BigDecimal replyNotaxTotalCostUsa;

    private BigDecimal replyNotaxTotalCostRmb;

    private BigDecimal realTaxTotalCostUsa;

    private BigDecimal realNotaxTotalCostUsa;

    private BigDecimal realTaxTotalCostRmb;

    private BigDecimal realNotaxTotalCostRmb;

    private BigDecimal realRate;

    private BigDecimal discountPercent;

    private BigDecimal discountPercentTmp;

    private BigDecimal reductionAmount;

    private String estCurrencyType;

    private String containerCategory;

    private Date valuationReplyOkTime;

    private BigDecimal replyHourNumber;

    private BigDecimal replyManHourCost;

    private BigDecimal replyMaterialCost;

    private String payer;

    private Integer replyFreeUser;

    private Date replyFreeTime;

    private Integer replyFreeOkUser;

    private Date replyFreeOkTime;

    private String chargeTypeKey;

    private String remarks;

    private String versionNo;

    private String isEnabled;

    private Integer isDel;

    private String freeStatus;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer billType;

    private Integer poolId;

    private String deptKey;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getProdCourseId() {
        return prodCourseId;
    }

    public void setProdCourseId(String prodCourseId) {
        this.prodCourseId = prodCourseId == null ? null : prodCourseId.trim();
    }

    public String getProdContainerId() {
        return prodContainerId;
    }

    public void setProdContainerId(String prodContainerId) {
        this.prodContainerId = prodContainerId == null ? null : prodContainerId.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public Integer getIsBackLease() {
        return isBackLease;
    }

    public void setIsBackLease(Integer isBackLease) {
        this.isBackLease = isBackLease;
    }

    public String getRepairNumber() {
        return repairNumber;
    }

    public void setRepairNumber(String repairNumber) {
        this.repairNumber = repairNumber == null ? null : repairNumber.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getChargeObject() {
        return chargeObject;
    }

    public void setChargeObject(String chargeObject) {
        this.chargeObject = chargeObject == null ? null : chargeObject.trim();
    }

    public BigDecimal getValuationHourNumber() {
        return valuationHourNumber;
    }

    public void setValuationHourNumber(BigDecimal valuationHourNumber) {
        this.valuationHourNumber = valuationHourNumber;
    }

    public BigDecimal getValuationManHourCost() {
        return valuationManHourCost;
    }

    public void setValuationManHourCost(BigDecimal valuationManHourCost) {
        this.valuationManHourCost = valuationManHourCost;
    }

    public BigDecimal getValuationMaterialCost() {
        return valuationMaterialCost;
    }

    public void setValuationMaterialCost(BigDecimal valuationMaterialCost) {
        this.valuationMaterialCost = valuationMaterialCost;
    }

    public BigDecimal getValuationMoneyUsd() {
        return valuationMoneyUsd;
    }

    public void setValuationMoneyUsd(BigDecimal valuationMoneyUsd) {
        this.valuationMoneyUsd = valuationMoneyUsd;
    }

    public BigDecimal getValuationMoneyRmb() {
        return valuationMoneyRmb;
    }

    public void setValuationMoneyRmb(BigDecimal valuationMoneyRmb) {
        this.valuationMoneyRmb = valuationMoneyRmb;
    }

    public BigDecimal getReplyTaxTotalCostUsa() {
        return replyTaxTotalCostUsa;
    }

    public void setReplyTaxTotalCostUsa(BigDecimal replyTaxTotalCostUsa) {
        this.replyTaxTotalCostUsa = replyTaxTotalCostUsa;
    }

    public BigDecimal getReplyTaxTotalCostRmb() {
        return replyTaxTotalCostRmb;
    }

    public void setReplyTaxTotalCostRmb(BigDecimal replyTaxTotalCostRmb) {
        this.replyTaxTotalCostRmb = replyTaxTotalCostRmb;
    }

    public BigDecimal getReplyNotaxTotalCostUsa() {
        return replyNotaxTotalCostUsa;
    }

    public void setReplyNotaxTotalCostUsa(BigDecimal replyNotaxTotalCostUsa) {
        this.replyNotaxTotalCostUsa = replyNotaxTotalCostUsa;
    }

    public BigDecimal getReplyNotaxTotalCostRmb() {
        return replyNotaxTotalCostRmb;
    }

    public void setReplyNotaxTotalCostRmb(BigDecimal replyNotaxTotalCostRmb) {
        this.replyNotaxTotalCostRmb = replyNotaxTotalCostRmb;
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

    public BigDecimal getRealRate() {
        return realRate;
    }

    public void setRealRate(BigDecimal realRate) {
        this.realRate = realRate;
    }

    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
    }

    public BigDecimal getDiscountPercentTmp() {
        return discountPercentTmp;
    }

    public void setDiscountPercentTmp(BigDecimal discountPercentTmp) {
        this.discountPercentTmp = discountPercentTmp;
    }

    public BigDecimal getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(BigDecimal reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    public String getEstCurrencyType() {
        return estCurrencyType;
    }

    public void setEstCurrencyType(String estCurrencyType) {
        this.estCurrencyType = estCurrencyType == null ? null : estCurrencyType.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public Date getValuationReplyOkTime() {
        return valuationReplyOkTime;
    }

    public void setValuationReplyOkTime(Date valuationReplyOkTime) {
        this.valuationReplyOkTime = valuationReplyOkTime;
    }

    public BigDecimal getReplyHourNumber() {
        return replyHourNumber;
    }

    public void setReplyHourNumber(BigDecimal replyHourNumber) {
        this.replyHourNumber = replyHourNumber;
    }

    public BigDecimal getReplyManHourCost() {
        return replyManHourCost;
    }

    public void setReplyManHourCost(BigDecimal replyManHourCost) {
        this.replyManHourCost = replyManHourCost;
    }

    public BigDecimal getReplyMaterialCost() {
        return replyMaterialCost;
    }

    public void setReplyMaterialCost(BigDecimal replyMaterialCost) {
        this.replyMaterialCost = replyMaterialCost;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer == null ? null : payer.trim();
    }

    public Integer getReplyFreeUser() {
        return replyFreeUser;
    }

    public void setReplyFreeUser(Integer replyFreeUser) {
        this.replyFreeUser = replyFreeUser;
    }

    public Date getReplyFreeTime() {
        return replyFreeTime;
    }

    public void setReplyFreeTime(Date replyFreeTime) {
        this.replyFreeTime = replyFreeTime;
    }

    public Integer getReplyFreeOkUser() {
        return replyFreeOkUser;
    }

    public void setReplyFreeOkUser(Integer replyFreeOkUser) {
        this.replyFreeOkUser = replyFreeOkUser;
    }

    public Date getReplyFreeOkTime() {
        return replyFreeOkTime;
    }

    public void setReplyFreeOkTime(Date replyFreeOkTime) {
        this.replyFreeOkTime = replyFreeOkTime;
    }

    public String getChargeTypeKey() {
        return chargeTypeKey;
    }

    public void setChargeTypeKey(String chargeTypeKey) {
        this.chargeTypeKey = chargeTypeKey == null ? null : chargeTypeKey.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo == null ? null : versionNo.trim();
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

    public String getFreeStatus() {
        return freeStatus;
    }

    public void setFreeStatus(String freeStatus) {
        this.freeStatus = freeStatus == null ? null : freeStatus.trim();
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

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public String getDeptKey() {
        return deptKey;
    }

    public void setDeptKey(String deptKey) {
        this.deptKey = deptKey == null ? null : deptKey.trim();
    }
}
package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BillPtiDetail {
    private Integer id;

    private Integer billId;

    private String prodCourseId;

    private Integer billType;

    private String containerCategory;

    private Integer prodContainerId;

    private String containerNo;

    private String companyKey;

    private String yard;

    private String containerUser;

    private String chargeObject;

    private BigDecimal ptiCost;

    private Date ptiOkDate;

    private BigDecimal oldCost;

    private String oldCurrencyType;

    private BigDecimal realRate;

    private Integer isFormula;

    private String computeFormula;

    private String chargeCurrencyType;

    private String optionValue;

    private BigDecimal realCost;

    private String deptKey;

    private String deptCode;

    private String remarks;

    private String chargeTypeKey;

    private String versionNo;

    private String isEnabled;

    private Integer isDel;

    private String freeStatus;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer poolId;

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

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public Integer getProdContainerId() {
        return prodContainerId;
    }

    public void setProdContainerId(Integer prodContainerId) {
        this.prodContainerId = prodContainerId;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getCompanyKey() {
        return companyKey;
    }

    public void setCompanyKey(String companyKey) {
        this.companyKey = companyKey == null ? null : companyKey.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
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

    public BigDecimal getPtiCost() {
        return ptiCost;
    }

    public void setPtiCost(BigDecimal ptiCost) {
        this.ptiCost = ptiCost;
    }

    public Date getPtiOkDate() {
        return ptiOkDate;
    }

    public void setPtiOkDate(Date ptiOkDate) {
        this.ptiOkDate = ptiOkDate;
    }

    public BigDecimal getOldCost() {
        return oldCost;
    }

    public void setOldCost(BigDecimal oldCost) {
        this.oldCost = oldCost;
    }

    public String getOldCurrencyType() {
        return oldCurrencyType;
    }

    public void setOldCurrencyType(String oldCurrencyType) {
        this.oldCurrencyType = oldCurrencyType == null ? null : oldCurrencyType.trim();
    }

    public BigDecimal getRealRate() {
        return realRate;
    }

    public void setRealRate(BigDecimal realRate) {
        this.realRate = realRate;
    }

    public Integer getIsFormula() {
        return isFormula;
    }

    public void setIsFormula(Integer isFormula) {
        this.isFormula = isFormula;
    }

    public String getComputeFormula() {
        return computeFormula;
    }

    public void setComputeFormula(String computeFormula) {
        this.computeFormula = computeFormula == null ? null : computeFormula.trim();
    }

    public String getChargeCurrencyType() {
        return chargeCurrencyType;
    }

    public void setChargeCurrencyType(String chargeCurrencyType) {
        this.chargeCurrencyType = chargeCurrencyType == null ? null : chargeCurrencyType.trim();
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue == null ? null : optionValue.trim();
    }

    public BigDecimal getRealCost() {
        return realCost;
    }

    public void setRealCost(BigDecimal realCost) {
        this.realCost = realCost;
    }

    public String getDeptKey() {
        return deptKey;
    }

    public void setDeptKey(String deptKey) {
        this.deptKey = deptKey == null ? null : deptKey.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getChargeTypeKey() {
        return chargeTypeKey;
    }

    public void setChargeTypeKey(String chargeTypeKey) {
        this.chargeTypeKey = chargeTypeKey == null ? null : chargeTypeKey.trim();
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

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }
}
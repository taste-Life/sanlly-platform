package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PoolPti {
    private Integer id;

    private String prodCourseId;

    private Integer prodContainerId;

    private String containerNo;

    private String yard;

    private String containerUser;

    private Integer number;

    private BigDecimal ptiCost;

    private Date ptiOkdate;

    private BigDecimal oldCost;

    private String oldCurrencyType;

    private BigDecimal currentRate;

    private String isFormula;

    private String computeFormula;

    private String chargeCurrencyType;

    private String optionValue;

    private BigDecimal realCost;

    private String deptKey;

    private String chargeInoutType;

    private String deptCode;

    private String chargeTypeKey;

    private String freeStatus;

    private Integer itemStatus;

    private String remarks;

    private String noCostDesc;

    private Integer poolType;

    private String isEnabled;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String containerCategory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdCourseId() {
        return prodCourseId;
    }

    public void setProdCourseId(String prodCourseId) {
        this.prodCourseId = prodCourseId == null ? null : prodCourseId.trim();
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getPtiCost() {
        return ptiCost;
    }

    public void setPtiCost(BigDecimal ptiCost) {
        this.ptiCost = ptiCost;
    }

    public Date getPtiOkdate() {
        return ptiOkdate;
    }

    public void setPtiOkdate(Date ptiOkdate) {
        this.ptiOkdate = ptiOkdate;
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

    public BigDecimal getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(BigDecimal currentRate) {
        this.currentRate = currentRate;
    }

    public String getIsFormula() {
        return isFormula;
    }

    public void setIsFormula(String isFormula) {
        this.isFormula = isFormula == null ? null : isFormula.trim();
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

    public String getChargeInoutType() {
        return chargeInoutType;
    }

    public void setChargeInoutType(String chargeInoutType) {
        this.chargeInoutType = chargeInoutType == null ? null : chargeInoutType.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getChargeTypeKey() {
        return chargeTypeKey;
    }

    public void setChargeTypeKey(String chargeTypeKey) {
        this.chargeTypeKey = chargeTypeKey == null ? null : chargeTypeKey.trim();
    }

    public String getFreeStatus() {
        return freeStatus;
    }

    public void setFreeStatus(String freeStatus) {
        this.freeStatus = freeStatus == null ? null : freeStatus.trim();
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getNoCostDesc() {
        return noCostDesc;
    }

    public void setNoCostDesc(String noCostDesc) {
        this.noCostDesc = noCostDesc == null ? null : noCostDesc.trim();
    }

    public Integer getPoolType() {
        return poolType;
    }

    public void setPoolType(Integer poolType) {
        this.poolType = poolType;
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

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }
}
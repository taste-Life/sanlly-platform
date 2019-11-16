package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AuditPayingChange {
    private Integer prodAuditPayingChangeId;

    private Integer payingPartyChange;

    private String initialPaying;

    private Double manHourCoefficient;

    private Double materialCoefficient;

    private Double sumCostCoefficient;

    private String calculationType;

    private String disposeType;

    private String sumCostCondition;

    private BigDecimal sumCostBase;

    private String finalPaying;

    private Integer isValid;

    private Integer isDel;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    public Integer getProdAuditPayingChangeId() {
        return prodAuditPayingChangeId;
    }

    public void setProdAuditPayingChangeId(Integer prodAuditPayingChangeId) {
        this.prodAuditPayingChangeId = prodAuditPayingChangeId;
    }

    public Integer getPayingPartyChange() {
        return payingPartyChange;
    }

    public void setPayingPartyChange(Integer payingPartyChange) {
        this.payingPartyChange = payingPartyChange;
    }

    public String getInitialPaying() {
        return initialPaying;
    }

    public void setInitialPaying(String initialPaying) {
        this.initialPaying = initialPaying == null ? null : initialPaying.trim();
    }

    public Double getManHourCoefficient() {
        return manHourCoefficient;
    }

    public void setManHourCoefficient(Double manHourCoefficient) {
        this.manHourCoefficient = manHourCoefficient;
    }

    public Double getMaterialCoefficient() {
        return materialCoefficient;
    }

    public void setMaterialCoefficient(Double materialCoefficient) {
        this.materialCoefficient = materialCoefficient;
    }

    public Double getSumCostCoefficient() {
        return sumCostCoefficient;
    }

    public void setSumCostCoefficient(Double sumCostCoefficient) {
        this.sumCostCoefficient = sumCostCoefficient;
    }

    public String getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(String calculationType) {
        this.calculationType = calculationType == null ? null : calculationType.trim();
    }

    public String getDisposeType() {
        return disposeType;
    }

    public void setDisposeType(String disposeType) {
        this.disposeType = disposeType == null ? null : disposeType.trim();
    }

    public String getSumCostCondition() {
        return sumCostCondition;
    }

    public void setSumCostCondition(String sumCostCondition) {
        this.sumCostCondition = sumCostCondition == null ? null : sumCostCondition.trim();
    }

    public BigDecimal getSumCostBase() {
        return sumCostBase;
    }

    public void setSumCostBase(BigDecimal sumCostBase) {
        this.sumCostBase = sumCostBase;
    }

    public String getFinalPaying() {
        return finalPaying;
    }

    public void setFinalPaying(String finalPaying) {
        this.finalPaying = finalPaying == null ? null : finalPaying.trim();
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
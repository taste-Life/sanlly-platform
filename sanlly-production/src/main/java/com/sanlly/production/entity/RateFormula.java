package com.sanlly.production.entity;

import java.util.Date;

public class RateFormula {
    private String prodRateFormulaId;

    private String rateId;

    private String rateCode;

    private String type;

    private String positionCode;

    private String containerType;

    private String size;

    private String algorithmType;

    private String algorithmBasis;

    private Double cardinalNumber;

    private Double startValue;

    private Double maxValue;

    private Double maxCardinalNumber;

    private Double addValue;

    private Double addCardinalNumber;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String remark;

    public String getProdRateFormulaId() {
        return prodRateFormulaId;
    }

    public void setProdRateFormulaId(String prodRateFormulaId) {
        this.prodRateFormulaId = prodRateFormulaId == null ? null : prodRateFormulaId.trim();
    }

    public String getRateId() {
        return rateId;
    }

    public void setRateId(String rateId) {
        this.rateId = rateId == null ? null : rateId.trim();
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode == null ? null : rateCode.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType == null ? null : containerType.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType == null ? null : algorithmType.trim();
    }

    public String getAlgorithmBasis() {
        return algorithmBasis;
    }

    public void setAlgorithmBasis(String algorithmBasis) {
        this.algorithmBasis = algorithmBasis == null ? null : algorithmBasis.trim();
    }

    public Double getCardinalNumber() {
        return cardinalNumber;
    }

    public void setCardinalNumber(Double cardinalNumber) {
        this.cardinalNumber = cardinalNumber;
    }

    public Double getStartValue() {
        return startValue;
    }

    public void setStartValue(Double startValue) {
        this.startValue = startValue;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Double getMaxCardinalNumber() {
        return maxCardinalNumber;
    }

    public void setMaxCardinalNumber(Double maxCardinalNumber) {
        this.maxCardinalNumber = maxCardinalNumber;
    }

    public Double getAddValue() {
        return addValue;
    }

    public void setAddValue(Double addValue) {
        this.addValue = addValue;
    }

    public Double getAddCardinalNumber() {
        return addCardinalNumber;
    }

    public void setAddCardinalNumber(Double addCardinalNumber) {
        this.addCardinalNumber = addCardinalNumber;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
package com.sanlly.production.entity;

import java.util.Date;

public class GohContainerRate {
    private Integer prodGohContainerRateId;

    private String structure;

    private String reshapeType;

    private String tierNumber;

    private String size;

    private String rateName;

    private String sparesNumber;

    private String numberExplain;

    private Double manHour;

    private String isMultiplyQuantity;

    private Double cardinalNumber;

    private String remarks;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdGohContainerRateId() {
        return prodGohContainerRateId;
    }

    public void setProdGohContainerRateId(Integer prodGohContainerRateId) {
        this.prodGohContainerRateId = prodGohContainerRateId;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure == null ? null : structure.trim();
    }

    public String getReshapeType() {
        return reshapeType;
    }

    public void setReshapeType(String reshapeType) {
        this.reshapeType = reshapeType == null ? null : reshapeType.trim();
    }

    public String getTierNumber() {
        return tierNumber;
    }

    public void setTierNumber(String tierNumber) {
        this.tierNumber = tierNumber == null ? null : tierNumber.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getRateName() {
        return rateName;
    }

    public void setRateName(String rateName) {
        this.rateName = rateName == null ? null : rateName.trim();
    }

    public String getSparesNumber() {
        return sparesNumber;
    }

    public void setSparesNumber(String sparesNumber) {
        this.sparesNumber = sparesNumber == null ? null : sparesNumber.trim();
    }

    public String getNumberExplain() {
        return numberExplain;
    }

    public void setNumberExplain(String numberExplain) {
        this.numberExplain = numberExplain == null ? null : numberExplain.trim();
    }

    public Double getManHour() {
        return manHour;
    }

    public void setManHour(Double manHour) {
        this.manHour = manHour;
    }

    public String getIsMultiplyQuantity() {
        return isMultiplyQuantity;
    }

    public void setIsMultiplyQuantity(String isMultiplyQuantity) {
        this.isMultiplyQuantity = isMultiplyQuantity == null ? null : isMultiplyQuantity.trim();
    }

    public Double getCardinalNumber() {
        return cardinalNumber;
    }

    public void setCardinalNumber(Double cardinalNumber) {
        this.cardinalNumber = cardinalNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
}
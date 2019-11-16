package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SpecialWashingRate {
    private Integer prodSpecialWashingRateId;

    private String key;

    private String company;

    private String goodsName;

    private String goodsNameEn;

    private String washingType;

    private BigDecimal fortyRate;

    private BigDecimal twentyRate;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdSpecialWashingRateId() {
        return prodSpecialWashingRateId;
    }

    public void setProdSpecialWashingRateId(Integer prodSpecialWashingRateId) {
        this.prodSpecialWashingRateId = prodSpecialWashingRateId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsNameEn() {
        return goodsNameEn;
    }

    public void setGoodsNameEn(String goodsNameEn) {
        this.goodsNameEn = goodsNameEn == null ? null : goodsNameEn.trim();
    }

    public String getWashingType() {
        return washingType;
    }

    public void setWashingType(String washingType) {
        this.washingType = washingType == null ? null : washingType.trim();
    }

    public BigDecimal getFortyRate() {
        return fortyRate;
    }

    public void setFortyRate(BigDecimal fortyRate) {
        this.fortyRate = fortyRate;
    }

    public BigDecimal getTwentyRate() {
        return twentyRate;
    }

    public void setTwentyRate(BigDecimal twentyRate) {
        this.twentyRate = twentyRate;
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

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}
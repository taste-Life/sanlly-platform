package com.sanlly.production.models.output.rate;

import java.math.BigDecimal;

public class SpecialWashingRateOutput {

    private Integer prodSpecialWashingRateId;

    private String key;

    private String companyLang;

    private String goodsName;

    private String goodsNameEn;

    private String washingTypeLang;

    private BigDecimal fortyRate;

    private BigDecimal twentyRate;

    private Integer isDel;

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

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public String getCompanyLang() {
        return companyLang;
    }

    public void setCompanyLang(String companyLang) {
        this.companyLang = companyLang;
    }

    public String getWashingTypeLang() {
        return washingTypeLang;
    }

    public void setWashingTypeLang(String washingTypeLang) {
        this.washingTypeLang = washingTypeLang;
    }
}

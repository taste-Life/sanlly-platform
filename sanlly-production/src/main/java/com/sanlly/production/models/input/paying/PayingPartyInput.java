package com.sanlly.production.models.input.paying;

import java.util.Date;

public class PayingPartyInput {

    private Integer prodPayingPartyId;

    private String key;

    private String payingPartyCode;

    private String payingPartyName;

    private String payingPartyNameEn;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdPayingPartyId() {
        return prodPayingPartyId;
    }

    public void setProdPayingPartyId(Integer prodPayingPartyId) {
        this.prodPayingPartyId = prodPayingPartyId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getPayingPartyCode() {
        return payingPartyCode;
    }

    public void setPayingPartyCode(String payingPartyCode) {
        this.payingPartyCode = payingPartyCode == null ? null : payingPartyCode.trim();
    }

    public String getPayingPartyName() {
        return payingPartyName;
    }

    public void setPayingPartyName(String payingPartyName) {
        this.payingPartyName = payingPartyName == null ? null : payingPartyName.trim();
    }

    public String getPayingPartyNameEn() {
        return payingPartyNameEn;
    }

    public void setPayingPartyNameEn(String payingPartyNameEn) {
        this.payingPartyNameEn = payingPartyNameEn == null ? null : payingPartyNameEn.trim();
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

}

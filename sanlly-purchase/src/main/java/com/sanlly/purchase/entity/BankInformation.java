package com.sanlly.purchase.entity;

import java.util.Date;

public class BankInformation {
    private Integer purcBankInformationId;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String supplier;
    //开户行
    private String openBank;
    //账号
    private String cardNo;
    //币种
    //币种
    private String currency;
    //币种
    private String currencyLangLang;
    //收款账号说明
    private String accountDesc;

    public String getCurrencyLangLang() {
        return currencyLangLang;
    }

    public void setCurrencyLangLang(String currencyLangLang) {
        this.currencyLangLang = currencyLangLang;
    }

    public Integer getPurcBankInformationId() {
        return purcBankInformationId;
    }

    public void setPurcBankInformationId(Integer purcBankInformationId) {
        this.purcBankInformationId = purcBankInformationId;
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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank == null ? null : openBank.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getAccountDesc() {
        return accountDesc;
    }

    public void setAccountDesc(String accountDesc) {
        this.accountDesc = accountDesc == null ? null : accountDesc.trim();
    }
}
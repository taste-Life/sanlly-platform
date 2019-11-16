package com.sanlly.purchase.models.output.suppliercenter;

/**
 * @Description: TODO
 * @ClassName: SupplierBankInfoOutput
 * @Date: 2019/8/1 14:45
 * @Version 1.0
 * @Author mqz
 */
public class SupplierBankInfoOutput {
    //开户行
    private String openBank;
    //银行卡号
    private String cardNo;
    //币种
    private String currency;
    private String currencyLanglang;
    //账号说明
    private String accountDesc;

    public String getCurrencyLanglang() {
        return currencyLanglang;
    }

    public void setCurrencyLanglang(String currencyLanglang) {
        this.currencyLanglang = currencyLanglang;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountDesc() {
        return accountDesc;
    }

    public void setAccountDesc(String accountDesc) {
        this.accountDesc = accountDesc;
    }
}

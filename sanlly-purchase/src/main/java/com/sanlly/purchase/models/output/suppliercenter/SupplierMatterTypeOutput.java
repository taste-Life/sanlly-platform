package com.sanlly.purchase.models.output.suppliercenter;

public class SupplierMatterTypeOutput {

    //供应材料一级大类
    private String firstSpecial;
    //供应材料二级大类
    private String secondSpecial;

    //供应材料一级大类
    private String firstSpecialLangLang;
    //供应材料二级大类
    private String secondSpecialLangLang;


    public String getFirstSpecialLangLang() {
        return firstSpecialLangLang;
    }

    public void setFirstSpecialLangLang(String firstSpecialLangLang) {
        this.firstSpecialLangLang = firstSpecialLangLang;
    }

    public String getSecondSpecialLangLang() {
        return secondSpecialLangLang;
    }

    public void setSecondSpecialLangLang(String secondSpecialLangLang) {
        this.secondSpecialLangLang = secondSpecialLangLang;
    }

    public String getFirstSpecial() {
        return firstSpecial;
    }

    public void setFirstSpecial(String firstSpecial) {
        this.firstSpecial = firstSpecial;
    }

    public String getSecondSpecial() {
        return secondSpecial;
    }

    public void setSecondSpecial(String secondSpecial) {
        this.secondSpecial = secondSpecial;
    }

}

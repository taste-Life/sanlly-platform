package com.sanlly.purchase.models.output.supplier;

/**
 * @Description: TODO
 * @ClassName: SpecialOutput
 * @Date: 2019/10/22 16:53
 * @Version 1.0
 * @Author mqz
 */
public class SpecialOutput {
    //备件大类
    private String firstSpecial;
    //备件明细类别
    private String secondSpecial;
    private String firstSpecialLangLang;
    private String secondSpecialLangLang;

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
}

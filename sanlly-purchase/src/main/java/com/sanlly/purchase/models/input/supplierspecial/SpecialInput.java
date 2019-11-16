package com.sanlly.purchase.models.input.supplierspecial;

/**
 * 供应商种类input
 *
 * @author lishzh
 */
public class SpecialInput {
    //备件大类
    private String firstSpecial;
    //备件二级类别
    private String secondSpecial;

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

package com.sanlly.production.models.input.ptitype;

/**
 * @author zhq
 * @date 2019/11/7
 * @description
 */
public class PtiTypeInputAdd {

    private String company;

    private String ptiTypeName;

    private String ptiTypeNameEn;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPtiTypeName() {
        return ptiTypeName;
    }

    public void setPtiTypeName(String ptiTypeName) {
        this.ptiTypeName = ptiTypeName;
    }

    public String getPtiTypeNameEn() {
        return ptiTypeNameEn;
    }

    public void setPtiTypeNameEn(String ptiTypeNameEn) {
        this.ptiTypeNameEn = ptiTypeNameEn;
    }
}

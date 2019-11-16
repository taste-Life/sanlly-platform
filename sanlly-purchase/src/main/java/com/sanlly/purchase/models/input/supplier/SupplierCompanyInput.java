package com.sanlly.purchase.models.input.supplier;

/**
 * @Description: TODO
 * @ClassName: SupplierCompany
 * @Date: 2019/10/18 14:32
 * @Version 1.0
 * @Author mqz
 */
public class SupplierCompanyInput {
    //公司key
    private String companyLangLang;
    //公司key
    private String company;

    public String getCompanyLangLang() {
        return companyLangLang;
    }

    public void setCompanyLangLang(String companyLangLang) {
        this.companyLangLang = companyLangLang;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

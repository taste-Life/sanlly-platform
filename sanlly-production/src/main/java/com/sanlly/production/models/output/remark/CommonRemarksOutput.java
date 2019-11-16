package com.sanlly.production.models.output.remark;

public class CommonRemarksOutput {
    private Integer prodCommonRemarksId;

    private String key;

    private String companyLang;

    private String containerCategoryLang;

    private String remarksContent;

    private String remarksContentEn;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdCommonRemarksId() {
        return prodCommonRemarksId;
    }

    public void setProdCommonRemarksId(Integer prodCommonRemarksId) {
        this.prodCommonRemarksId = prodCommonRemarksId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getCompanyLang() {
        return companyLang;
    }

    public void setCompanyLang(String companyLang) {
        this.companyLang = companyLang;
    }

    public String getContainerCategoryLang() {
        return containerCategoryLang;
    }

    public void setContainerCategoryLang(String containerCategoryLang) {
        this.containerCategoryLang = containerCategoryLang;
    }

    public String getRemarksContent() {
        return remarksContent;
    }

    public void setRemarksContent(String remarksContent) {
        this.remarksContent = remarksContent == null ? null : remarksContent.trim();
    }

    public String getRemarksContentEn() {
        return remarksContentEn;
    }

    public void setRemarksContentEn(String remarksContentEn) {
        this.remarksContentEn = remarksContentEn == null ? null : remarksContentEn.trim();
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

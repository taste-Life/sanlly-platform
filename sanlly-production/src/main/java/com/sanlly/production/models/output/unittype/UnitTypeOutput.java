package com.sanlly.production.models.output.unittype;

public class UnitTypeOutput {

    private Integer prodUnitTypeId;

    private String key;

    private String unitCompany;

    public String getUnitCompanyLangLang() {
        return unitCompanyLangLang;
    }

    public void setUnitCompanyLangLang(String unitCompanyLangLang) {
        this.unitCompanyLangLang = unitCompanyLangLang;
    }

    private String unitCompanyLangLang;

    private String unitTypeScope;

    private String unitTypeCode;

    private Integer isValid;

    private Integer isDel;

    private String createTime;

    private Integer createUser;

    private String updateTime;

    private Integer updateUser;

    public Integer getProdUnitTypeId() {
        return prodUnitTypeId;
    }

    public void setProdUnitTypeId(Integer prodUnitTypeId) {
        this.prodUnitTypeId = prodUnitTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUnitCompany() {
        return unitCompany;
    }

    public void setUnitCompany(String unitCompany) {
        this.unitCompany = unitCompany;
    }

    public String getUnitTypeScope() {
        return unitTypeScope;
    }

    public void setUnitTypeScope(String unitTypeScope) {
        this.unitTypeScope = unitTypeScope;
    }

    public String getUnitTypeCode() {
        return unitTypeCode;
    }

    public void setUnitTypeCode(String unitTypeCode) {
        this.unitTypeCode = unitTypeCode;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }
}

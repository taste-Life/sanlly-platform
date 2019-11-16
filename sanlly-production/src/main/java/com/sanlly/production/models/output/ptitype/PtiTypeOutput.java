package com.sanlly.production.models.output.ptitype;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/11/7
 * @description
 */
public class PtiTypeOutput {
    private Integer prodPtiTypeId;

    private String key;

    private String company;

    private String ptiTypeName;

    private String ptiTypeNameEn;

    private String companyNameLang;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdPtiTypeId() {
        return prodPtiTypeId;
    }

    public void setProdPtiTypeId(Integer prodPtiTypeId) {
        this.prodPtiTypeId = prodPtiTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

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

    public String getCompanyNameLang() {
        return companyNameLang;
    }

    public void setCompanyNameLang(String companyNameLang) {
        this.companyNameLang = companyNameLang;
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

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}

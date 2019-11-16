package com.sanlly.production.models.output.fieldrequired;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/11/5
 * @description
 */
public class FieldRequiredOutput {
    private Integer prodFieldRequiredId;

    private String company;

    private String companyNameLang;

    private String yard;

    private String yardNameLang;

    private String field;

    private String fieldNameLang;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdFieldRequiredId() {
        return prodFieldRequiredId;
    }

    public void setProdFieldRequiredId(Integer prodFieldRequiredId) {
        this.prodFieldRequiredId = prodFieldRequiredId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
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

    public String getCompanyNameLang() {
        return companyNameLang;
    }

    public void setCompanyNameLang(String companyNameLang) {
        this.companyNameLang = companyNameLang;
    }

    public String getYardNameLang() {
        return yardNameLang;
    }

    public void setYardNameLang(String yardNameLang) {
        this.yardNameLang = yardNameLang;
    }

    public String getFieldNameLang() {
        return fieldNameLang;
    }

    public void setFieldNameLang(String fieldNameLang) {
        this.fieldNameLang = fieldNameLang;
    }
}

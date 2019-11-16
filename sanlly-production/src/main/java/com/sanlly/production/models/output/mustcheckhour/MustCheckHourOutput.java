package com.sanlly.production.models.output.mustcheckhour;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
public class MustCheckHourOutput {
    private Integer prodMustCheckHourId;

    private String containerCategory;

    private String containerCategoryNameLang;

    private String company;

    private String companyNameLang;

    private Integer hour;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdMustCheckHourId() {
        return prodMustCheckHourId;
    }

    public void setProdMustCheckHourId(Integer prodMustCheckHourId) {
        this.prodMustCheckHourId = prodMustCheckHourId;
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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

    public String getContainerCategoryNameLang() {
        return containerCategoryNameLang;
    }

    public void setContainerCategoryNameLang(String containerCategoryNameLang) {
        this.containerCategoryNameLang = containerCategoryNameLang;
    }

    public String getCompanyNameLang() {
        return companyNameLang;
    }

    public void setCompanyNameLang(String companyNameLang) {
        this.companyNameLang = companyNameLang;
    }
}

package com.sanlly.production.models.output.qualitycontrol;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
public class QualityControlTimeOutput {
    private Integer prodQualityControlTimeId;

    private String company;

    private String companyNameLang;

    private String containerCategory;

    private String containerCategoryNameLang;

    private String qualityControlType;

    private String qualityControlTypeNameLang;

    private Integer qualityControlTime;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdQualityControlTimeId() {
        return prodQualityControlTimeId;
    }

    public void setProdQualityControlTimeId(Integer prodQualityControlTimeId) {
        this.prodQualityControlTimeId = prodQualityControlTimeId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyNameLang() {
        return companyNameLang;
    }

    public void setCompanyNameLang(String companyNameLang) {
        this.companyNameLang = companyNameLang;
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory;
    }

    public String getContainerCategoryNameLang() {
        return containerCategoryNameLang;
    }

    public void setContainerCategoryNameLang(String containerCategoryNameLang) {
        this.containerCategoryNameLang = containerCategoryNameLang;
    }

    public String getQualityControlType() {
        return qualityControlType;
    }

    public void setQualityControlType(String qualityControlType) {
        this.qualityControlType = qualityControlType;
    }

    public String getQualityControlTypeNameLang() {
        return qualityControlTypeNameLang;
    }

    public void setQualityControlTypeNameLang(String qualityControlTypeNameLang) {
        this.qualityControlTypeNameLang = qualityControlTypeNameLang;
    }

    public Integer getQualityControlTime() {
        return qualityControlTime;
    }

    public void setQualityControlTime(Integer qualityControlTime) {
        this.qualityControlTime = qualityControlTime;
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

package com.sanlly.production.models.output.cleaningnode;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/11/8
 * @description
 */
public class CleaningNodeOutput {
    private Integer prodCleaningNode;

    private String company;

    private String companyNameLang;

    private String containerUser;

    private String containerUserNameLang;

    private String cleaningType;

    private String cleaningTypeNameLang;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdCleaningNode() {
        return prodCleaningNode;
    }

    public void setProdCleaningNode(Integer prodCleaningNode) {
        this.prodCleaningNode = prodCleaningNode;
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

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser;
    }

    public String getContainerUserNameLang() {
        return containerUserNameLang;
    }

    public void setContainerUserNameLang(String containerUserNameLang) {
        this.containerUserNameLang = containerUserNameLang;
    }

    public String getCleaningType() {
        return cleaningType;
    }

    public void setCleaningType(String cleaningType) {
        this.cleaningType = cleaningType;
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

    public String getCleaningTypeNameLang() {
        return cleaningTypeNameLang;
    }

    public void setCleaningTypeNameLang(String cleaningTypeNameLang) {
        this.cleaningTypeNameLang = cleaningTypeNameLang;
    }
}

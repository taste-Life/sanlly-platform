package com.sanlly.production.models.output.cleaningpattern;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/11/8
 * @description
 */
public class CleaningPatternOutput {
    private Integer prodCleaningPatternId;

    private String company;

    private String companyNameLang;

    private String yard;

    private String yardNameLang;

    private String containerCategory;

    private String containerCategoryNameLang;

    private String cleaningPattern;

    private String cleaningPatternNameLang;

    private Integer team;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdCleaningPatternId() {
        return prodCleaningPatternId;
    }

    public void setProdCleaningPatternId(Integer prodCleaningPatternId) {
        this.prodCleaningPatternId = prodCleaningPatternId;
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

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getYardNameLang() {
        return yardNameLang;
    }

    public void setYardNameLang(String yardNameLang) {
        this.yardNameLang = yardNameLang;
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

    public String getCleaningPattern() {
        return cleaningPattern;
    }

    public void setCleaningPattern(String cleaningPattern) {
        this.cleaningPattern = cleaningPattern;
    }

    public String getCleaningPatternNameLang() {
        return cleaningPatternNameLang;
    }

    public void setCleaningPatternNameLang(String cleaningPatternNameLang) {
        this.cleaningPatternNameLang = cleaningPatternNameLang;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
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

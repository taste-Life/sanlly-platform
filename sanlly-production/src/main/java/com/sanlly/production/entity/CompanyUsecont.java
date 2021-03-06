package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CompanyUsecont {
    private Integer prodCompanyUsecontId;

    private String company;

    private String containerUser;

    private Integer containerPriority;

    private Double repairPeriod;

    private BigDecimal differenceMoney;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdCompanyUsecontId() {
        return prodCompanyUsecontId;
    }

    public void setProdCompanyUsecontId(Integer prodCompanyUsecontId) {
        this.prodCompanyUsecontId = prodCompanyUsecontId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public Integer getContainerPriority() {
        return containerPriority;
    }

    public void setContainerPriority(Integer containerPriority) {
        this.containerPriority = containerPriority;
    }

    public Double getRepairPeriod() {
        return repairPeriod;
    }

    public void setRepairPeriod(Double repairPeriod) {
        this.repairPeriod = repairPeriod;
    }

    public BigDecimal getDifferenceMoney() {
        return differenceMoney;
    }

    public void setDifferenceMoney(BigDecimal differenceMoney) {
        this.differenceMoney = differenceMoney;
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
}
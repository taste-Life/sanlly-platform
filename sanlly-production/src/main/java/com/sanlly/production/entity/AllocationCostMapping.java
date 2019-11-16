package com.sanlly.production.entity;

import java.util.Date;

public class AllocationCostMapping {
    private Integer prodAllocationCostMappingId;

    private String company;

    private String exitYard;

    private String entryYard;

    private Long cost;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer del;

    private Integer isValid;

    public Integer getProdAllocationCostMappingId() {
        return prodAllocationCostMappingId;
    }

    public void setProdAllocationCostMappingId(Integer prodAllocationCostMappingId) {
        this.prodAllocationCostMappingId = prodAllocationCostMappingId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getExitYard() {
        return exitYard;
    }

    public void setExitYard(String exitYard) {
        this.exitYard = exitYard == null ? null : exitYard.trim();
    }

    public String getEntryYard() {
        return entryYard;
    }

    public void setEntryYard(String entryYard) {
        this.entryYard = entryYard == null ? null : entryYard.trim();
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
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

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}
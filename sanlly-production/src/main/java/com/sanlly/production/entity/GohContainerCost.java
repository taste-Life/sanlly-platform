package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GohContainerCost {
    private Integer prodGohContainerCostId;

    private String reshapeType;

    private String tierNumber;

    private String size;

    private String weight;

    private BigDecimal invoiceCost;

    private String remarks;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdGohContainerCostId() {
        return prodGohContainerCostId;
    }

    public void setProdGohContainerCostId(Integer prodGohContainerCostId) {
        this.prodGohContainerCostId = prodGohContainerCostId;
    }

    public String getReshapeType() {
        return reshapeType;
    }

    public void setReshapeType(String reshapeType) {
        this.reshapeType = reshapeType == null ? null : reshapeType.trim();
    }

    public String getTierNumber() {
        return tierNumber;
    }

    public void setTierNumber(String tierNumber) {
        this.tierNumber = tierNumber == null ? null : tierNumber.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public BigDecimal getInvoiceCost() {
        return invoiceCost;
    }

    public void setInvoiceCost(BigDecimal invoiceCost) {
        this.invoiceCost = invoiceCost;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
}
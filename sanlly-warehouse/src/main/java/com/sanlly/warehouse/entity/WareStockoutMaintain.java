package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareStockoutMaintain {
    private Integer wareStockoutMaintainId;

    private String stockoutMaintainNo;

    private String maintainDepartment;

    private String maintainNo;

    private BigDecimal processingCharges;

    private BigDecimal maintainMaterialsCost;

    private String company;

    private BigDecimal maintainIncome;

    private String status;

    private Integer isDel;

    private String remark;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareStockoutMaintainId() {
        return wareStockoutMaintainId;
    }

    public void setWareStockoutMaintainId(Integer wareStockoutMaintainId) {
        this.wareStockoutMaintainId = wareStockoutMaintainId;
    }

    public String getStockoutMaintainNo() {
        return stockoutMaintainNo;
    }

    public void setStockoutMaintainNo(String stockoutMaintainNo) {
        this.stockoutMaintainNo = stockoutMaintainNo == null ? null : stockoutMaintainNo.trim();
    }

    public String getMaintainDepartment() {
        return maintainDepartment;
    }

    public void setMaintainDepartment(String maintainDepartment) {
        this.maintainDepartment = maintainDepartment == null ? null : maintainDepartment.trim();
    }

    public String getMaintainNo() {
        return maintainNo;
    }

    public void setMaintainNo(String maintainNo) {
        this.maintainNo = maintainNo == null ? null : maintainNo.trim();
    }

    public BigDecimal getProcessingCharges() {
        return processingCharges;
    }

    public void setProcessingCharges(BigDecimal processingCharges) {
        this.processingCharges = processingCharges;
    }

    public BigDecimal getMaintainMaterialsCost() {
        return maintainMaterialsCost;
    }

    public void setMaintainMaterialsCost(BigDecimal maintainMaterialsCost) {
        this.maintainMaterialsCost = maintainMaterialsCost;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public BigDecimal getMaintainIncome() {
        return maintainIncome;
    }

    public void setMaintainIncome(BigDecimal maintainIncome) {
        this.maintainIncome = maintainIncome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
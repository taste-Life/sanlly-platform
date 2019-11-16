package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CustomerDeliverDetail {
    private Integer wareCustomerDeliverDetaillId;

    private Integer wareCustomerDeliverId;

    private String spareParts;

    private String newSerial;

    private BigDecimal repairCost;

    private Integer isDel;

    private String outStatus;

    private String remark;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private BigDecimal repairOffer;

    private BigDecimal repairIncome;

    private Double num;

    public Integer getWareCustomerDeliverDetaillId() {
        return wareCustomerDeliverDetaillId;
    }

    public void setWareCustomerDeliverDetaillId(Integer wareCustomerDeliverDetaillId) {
        this.wareCustomerDeliverDetaillId = wareCustomerDeliverDetaillId;
    }

    public Integer getWareCustomerDeliverId() {
        return wareCustomerDeliverId;
    }

    public void setWareCustomerDeliverId(Integer wareCustomerDeliverId) {
        this.wareCustomerDeliverId = wareCustomerDeliverId;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getNewSerial() {
        return newSerial;
    }

    public void setNewSerial(String newSerial) {
        this.newSerial = newSerial == null ? null : newSerial.trim();
    }

    public BigDecimal getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(BigDecimal repairCost) {
        this.repairCost = repairCost;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getOutStatus() {
        return outStatus;
    }

    public void setOutStatus(String outStatus) {
        this.outStatus = outStatus == null ? null : outStatus.trim();
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

    public BigDecimal getRepairOffer() {
        return repairOffer;
    }

    public void setRepairOffer(BigDecimal repairOffer) {
        this.repairOffer = repairOffer;
    }

    public BigDecimal getRepairIncome() {
        return repairIncome;
    }

    public void setRepairIncome(BigDecimal repairIncome) {
        this.repairIncome = repairIncome;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }
}
package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareShouleSpareReturn {
    private Integer wareShouleSpareReturnId;

    private Integer stockout;

    private Integer stockoutDetail;

    private String billType;

    private String returnType;

    private String company;

    private String site;

    private String stockoutYard;

    private String stockoutWarehouse;

    private String receiveDepartments;

    private Integer receiveUser;

    private Date stockoutDate;

    private String stockoutGo;

    private String spareParts;

    private Double returnNum;

    private String returnYard;

    private String returnWarehouse;

    private String returnStatus;

    private Integer acceptUser;

    private Date acceptDate;

    private Double realityStockoutNum;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareShouleSpareReturnId() {
        return wareShouleSpareReturnId;
    }

    public void setWareShouleSpareReturnId(Integer wareShouleSpareReturnId) {
        this.wareShouleSpareReturnId = wareShouleSpareReturnId;
    }

    public Integer getStockout() {
        return stockout;
    }

    public void setStockout(Integer stockout) {
        this.stockout = stockout;
    }

    public Integer getStockoutDetail() {
        return stockoutDetail;
    }

    public void setStockoutDetail(Integer stockoutDetail) {
        this.stockoutDetail = stockoutDetail;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType == null ? null : returnType.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getStockoutYard() {
        return stockoutYard;
    }

    public void setStockoutYard(String stockoutYard) {
        this.stockoutYard = stockoutYard == null ? null : stockoutYard.trim();
    }

    public String getStockoutWarehouse() {
        return stockoutWarehouse;
    }

    public void setStockoutWarehouse(String stockoutWarehouse) {
        this.stockoutWarehouse = stockoutWarehouse == null ? null : stockoutWarehouse.trim();
    }

    public String getReceiveDepartments() {
        return receiveDepartments;
    }

    public void setReceiveDepartments(String receiveDepartments) {
        this.receiveDepartments = receiveDepartments == null ? null : receiveDepartments.trim();
    }

    public Integer getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(Integer receiveUser) {
        this.receiveUser = receiveUser;
    }

    public Date getStockoutDate() {
        return stockoutDate;
    }

    public void setStockoutDate(Date stockoutDate) {
        this.stockoutDate = stockoutDate;
    }

    public String getStockoutGo() {
        return stockoutGo;
    }

    public void setStockoutGo(String stockoutGo) {
        this.stockoutGo = stockoutGo == null ? null : stockoutGo.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public Double getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Double returnNum) {
        this.returnNum = returnNum;
    }

    public String getReturnYard() {
        return returnYard;
    }

    public void setReturnYard(String returnYard) {
        this.returnYard = returnYard == null ? null : returnYard.trim();
    }

    public String getReturnWarehouse() {
        return returnWarehouse;
    }

    public void setReturnWarehouse(String returnWarehouse) {
        this.returnWarehouse = returnWarehouse == null ? null : returnWarehouse.trim();
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus == null ? null : returnStatus.trim();
    }

    public Integer getAcceptUser() {
        return acceptUser;
    }

    public void setAcceptUser(Integer acceptUser) {
        this.acceptUser = acceptUser;
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public Double getRealityStockoutNum() {
        return realityStockoutNum;
    }

    public void setRealityStockoutNum(Double realityStockoutNum) {
        this.realityStockoutNum = realityStockoutNum;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getReasonsRejection() {
        return reasonsRejection;
    }

    public void setReasonsRejection(String reasonsRejection) {
        this.reasonsRejection = reasonsRejection == null ? null : reasonsRejection.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
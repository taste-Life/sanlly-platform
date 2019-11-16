package com.sanlly.warehouse.models.output.repair;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author lishzh
 */
public class ShouldReturnOutput {
    private Integer wareShouldReturnId;

    private Integer stockout;

    private Integer stockoutDetail;

    private String billType;

    private String returnType;

    private String company;

    private String site;

    private String outYard;

    private String outYardLangLang;

    private String outWarehouse;
    private String outWarehouseLangLang;

    private String receiveDepartment;

    private Integer receiveUser;
    private String receiveUserName;

    private Date stockoutDate;

    private String useContainerUser;

    private String stockoutGo;

    private String spareParts;

    private String sparePartsLangLang;

    private String sparePartsNo;

    private Double returnNum;

    private String returnYard;

    private String returnWarehouse;

    private String returnStatus;
    private String returnStatusLangLang;

    private Integer acceptUser;

    private Date acceptDate;

    private Double realityStockoutNum;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createTime;

    public String getReturnStatusLangLang() {
        return returnStatusLangLang;
    }

    public void setReturnStatusLangLang(String returnStatusLangLang) {
        this.returnStatusLangLang = returnStatusLangLang;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOutYardLangLang() {
        return outYardLangLang;
    }

    public void setOutYardLangLang(String outYardLangLang) {
        this.outYardLangLang = outYardLangLang;
    }

    public String getOutWarehouseLangLang() {
        return outWarehouseLangLang;
    }

    public void setOutWarehouseLangLang(String outWarehouseLangLang) {
        this.outWarehouseLangLang = outWarehouseLangLang;
    }

    public String getReceiveUserName() {
        return receiveUserName;
    }

    public void setReceiveUserName(String receiveUserName) {
        this.receiveUserName = receiveUserName;
    }

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
    }

    public Integer getWareShouldReturnId() {
        return wareShouldReturnId;
    }

    public void setWareShouldReturnId(Integer wareShouldReturnId) {
        this.wareShouldReturnId = wareShouldReturnId;
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
        this.billType = billType;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getOutYard() {
        return outYard;
    }

    public void setOutYard(String outYard) {
        this.outYard = outYard;
    }

    public String getOutWarehouse() {
        return outWarehouse;
    }

    public void setOutWarehouse(String outWarehouse) {
        this.outWarehouse = outWarehouse;
    }

    public String getReceiveDepartment() {
        return receiveDepartment;
    }

    public void setReceiveDepartment(String receiveDepartment) {
        this.receiveDepartment = receiveDepartment;
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

    public String getUseContainerUser() {
        return useContainerUser;
    }

    public void setUseContainerUser(String useContainerUser) {
        this.useContainerUser = useContainerUser;
    }

    public String getStockoutGo() {
        return stockoutGo;
    }

    public void setStockoutGo(String stockoutGo) {
        this.stockoutGo = stockoutGo;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
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
        this.returnYard = returnYard;
    }

    public String getReturnWarehouse() {
        return returnWarehouse;
    }

    public void setReturnWarehouse(String returnWarehouse) {
        this.returnWarehouse = returnWarehouse;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
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
        this.auditStatus = auditStatus;
    }

    public String getReasonsRejection() {
        return reasonsRejection;
    }

    public void setReasonsRejection(String reasonsRejection) {
        this.reasonsRejection = reasonsRejection;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

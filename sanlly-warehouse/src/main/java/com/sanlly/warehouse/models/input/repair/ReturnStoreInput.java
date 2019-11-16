package com.sanlly.warehouse.models.input.repair;

import java.util.Date;

/**
 * 退件库input
 *
 * @author lishzh
 */
public class ReturnStoreInput {

    private Integer wareReturnStoreId;

    private String no;

    private String noType;

    private String sourceType;

    private String returnType;

    private String customer;

    private String containerNo;

    private String useContainerUser;

    private String company;

    private String site;

    private String yard;

    private String returnWarehouse;

    private String spareParts;

    private String sparePartsBatch;

    private Double num;

    private Double surplusNum;

    private String repairDepartment;

    private String goDescribe;

    private Integer acceptUser;

    private Date acceptDate;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;

    public String getUseContainerUser() {
        return useContainerUser;
    }

    public void setUseContainerUser(String useContainerUser) {
        this.useContainerUser = useContainerUser;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public Integer getWareReturnStoreId() {
        return wareReturnStoreId;
    }

    public void setWareReturnStoreId(Integer wareReturnStoreId) {
        this.wareReturnStoreId = wareReturnStoreId;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNoType() {
        return noType;
    }

    public void setNoType(String noType) {
        this.noType = noType;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
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

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getReturnWarehouse() {
        return returnWarehouse;
    }

    public void setReturnWarehouse(String returnWarehouse) {
        this.returnWarehouse = returnWarehouse;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Double getSurplusNum() {
        return surplusNum;
    }

    public void setSurplusNum(Double surplusNum) {
        this.surplusNum = surplusNum;
    }

    public String getRepairDepartment() {
        return repairDepartment;
    }

    public void setRepairDepartment(String repairDepartment) {
        this.repairDepartment = repairDepartment;
    }

    public String getGoDescribe() {
        return goDescribe;
    }

    public void setGoDescribe(String goDescribe) {
        this.goDescribe = goDescribe;
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

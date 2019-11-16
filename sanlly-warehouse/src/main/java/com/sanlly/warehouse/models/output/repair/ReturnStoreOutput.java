package com.sanlly.warehouse.models.output.repair;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author lishzh
 */
public class ReturnStoreOutput {
    private Integer wareReturnStoreId;

    private String sourceType;

    private String sourceTypeLangLang;

    private String customer;

    private String customerLangLang;

    private String company;

    private String companyLangLang;

    private String spareParts;

    private String sparePartsLangLang;

    private String sparePartsNo;

    private String returnType;

    private String returnTypeLangLang;

    private Double num;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date acceptDate;

    private String remark;

    private String repairType;

    private String repairTypeLangLang;

    private String repairDepartment;

    private String repairDepartmentLangLang;

    public String getRepairDepartmentLangLang() {
        return repairDepartmentLangLang;
    }

    public void setRepairDepartmentLangLang(String repairDepartmentLangLang) {
        this.repairDepartmentLangLang = repairDepartmentLangLang;
    }

    public String getRepairDepartment() {
        return repairDepartment;
    }

    public void setRepairDepartment(String repairDepartment) {
        this.repairDepartment = repairDepartment;
    }

    public String getCustomerLangLang() {
        return customerLangLang;
    }

    public void setCustomerLangLang(String customerLangLang) {
        this.customerLangLang = customerLangLang;
    }

    public String getSourceTypeLangLang() {
        return sourceTypeLangLang;
    }

    public void setSourceTypeLangLang(String sourceTypeLangLang) {
        this.sourceTypeLangLang = sourceTypeLangLang;
    }

    public String getRepairTypeLangLang() {
        return repairTypeLangLang;
    }

    public void setRepairTypeLangLang(String repairTypeLangLang) {
        this.repairTypeLangLang = repairTypeLangLang;
    }

    public Integer getWareReturnStoreId() {
        return wareReturnStoreId;
    }

    public void setWareReturnStoreId(Integer wareReturnStoreId) {
        this.wareReturnStoreId = wareReturnStoreId;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
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

    public String getCompanyLangLang() {
        return companyLangLang;
    }

    public void setCompanyLangLang(String companyLangLang) {
        this.companyLangLang = companyLangLang;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getReturnTypeLangLang() {
        return returnTypeLangLang;
    }

    public void setReturnTypeLangLang(String returnTypeLangLang) {
        this.returnTypeLangLang = returnTypeLangLang;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }
}

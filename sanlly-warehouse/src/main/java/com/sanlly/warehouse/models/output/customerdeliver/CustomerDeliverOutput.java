package com.sanlly.warehouse.models.output.customerdeliver;

import com.sanlly.common.models.output.customerdeliver.CustomerDeliverDetailOutput;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lishzh
 */
public class CustomerDeliverOutput {

    private Integer wareCustomerDeliverId;

    private String stockoutNo;

    private String repairDepartment;

    private String repairNo;

    private BigDecimal repairIncome;

    private BigDecimal repairCost;

    private String company;

    private String companyLangLang;

    private String customer;

    private String customerLangLang;

    private BigDecimal repairProfit;

    private String outStatus;

    private String outStatusLangLang;

    private String chargeStatus;

    private String chargeStatusLangLang;

    private Integer isDel;

    private String remark;

    public String getChargeStatusLangLang() {
        return chargeStatusLangLang;
    }

    public void setChargeStatusLangLang(String chargeStatusLangLang) {
        this.chargeStatusLangLang = chargeStatusLangLang;
    }

    public String getCompanyLangLang() {
        return companyLangLang;
    }

    public void setCompanyLangLang(String companyLangLang) {
        this.companyLangLang = companyLangLang;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomerLangLang() {
        return customerLangLang;
    }

    public void setCustomerLangLang(String customerLangLang) {
        this.customerLangLang = customerLangLang;
    }

    public String getOutStatusLangLang() {
        return outStatusLangLang;
    }

    public void setOutStatusLangLang(String outStatusLangLang) {
        this.outStatusLangLang = outStatusLangLang;
    }

    private List<CustomerDeliverDetailOutput> details;

    public List<CustomerDeliverDetailOutput> getDetails() {
        return details;
    }

    public void setDetails(List<CustomerDeliverDetailOutput> details) {
        this.details = details;
    }

    public Integer getWareCustomerDeliverId() {
        return wareCustomerDeliverId;
    }

    public void setWareCustomerDeliverId(Integer wareCustomerDeliverId) {
        this.wareCustomerDeliverId = wareCustomerDeliverId;
    }

    public String getStockoutNo() {
        return stockoutNo;
    }

    public void setStockoutNo(String stockoutNo) {
        this.stockoutNo = stockoutNo;
    }

    public String getRepairDepartment() {
        return repairDepartment;
    }

    public void setRepairDepartment(String repairDepartment) {
        this.repairDepartment = repairDepartment;
    }

    public String getRepairNo() {
        return repairNo;
    }

    public void setRepairNo(String repairNo) {
        this.repairNo = repairNo;
    }

    public BigDecimal getRepairIncome() {
        return repairIncome;
    }

    public void setRepairIncome(BigDecimal repairIncome) {
        this.repairIncome = repairIncome;
    }

    public BigDecimal getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(BigDecimal repairCost) {
        this.repairCost = repairCost;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public BigDecimal getRepairProfit() {
        return repairProfit;
    }

    public void setRepairProfit(BigDecimal repairProfit) {
        this.repairProfit = repairProfit;
    }

    public String getOutStatus() {
        return outStatus;
    }

    public void setOutStatus(String outStatus) {
        this.outStatus = outStatus;
    }

    public String getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(String chargeStatus) {
        this.chargeStatus = chargeStatus;
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
        this.remark = remark;
    }
}

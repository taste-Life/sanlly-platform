package com.sanlly.warehouse.models.input.customerdeliver;

import com.sanlly.warehouse.entity.CustomerDeliverDetail;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lishzh
 */
public class CustomerDeliverInput {

    private Integer wareCustomerDeliverId;



    private String stockoutNo;

    private String customer;

    private String repairNo;

    private BigDecimal repairIncome;

    private BigDecimal repairCost;

    private String company;

    private BigDecimal repairProfit;

    private String outStatus;

    private String chargeStatus;

    private String remark;

    private List<CustomerDeliverDetailInput> details;

    public List<CustomerDeliverDetailInput> getDetails() {
        return details;
    }

    public void setDetails(List<CustomerDeliverDetailInput> details) {
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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

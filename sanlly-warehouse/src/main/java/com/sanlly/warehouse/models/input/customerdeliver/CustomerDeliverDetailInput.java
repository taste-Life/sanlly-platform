package com.sanlly.warehouse.models.input.customerdeliver;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author lishzh
 */
public class CustomerDeliverDetailInput {

    private Integer wareCustomerDeliverDetaillId;

    private Integer wareRepairStoreId;


    private Integer wareCustomerDeliverId;

    private String spareParts;

    private String newSerial;

    private BigDecimal repairCost;

    private String outStatus;

    private String remark;

    private BigDecimal repairOffer;

    private BigDecimal repairIncome;

    private Double num;

    public Integer getWareRepairStoreId() {
        return wareRepairStoreId;
    }

    public void setWareRepairStoreId(Integer wareRepairStoreId) {
        this.wareRepairStoreId = wareRepairStoreId;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

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
        this.spareParts = spareParts;
    }

    public String getNewSerial() {
        return newSerial;
    }

    public void setNewSerial(String newSerial) {
        this.newSerial = newSerial;
    }

    public BigDecimal getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(BigDecimal repairCost) {
        this.repairCost = repairCost;
    }

    public String getOutStatus() {
        return outStatus;
    }

    public void setOutStatus(String outStatus) {
        this.outStatus = outStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
}

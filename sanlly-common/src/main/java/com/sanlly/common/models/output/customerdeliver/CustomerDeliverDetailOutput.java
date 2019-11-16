package com.sanlly.common.models.output.customerdeliver;

import java.math.BigDecimal;

/**
 * @author lishzh
 */
public class CustomerDeliverDetailOutput {
    private Integer wareCustomerDeliverDetaillId;

    private Integer wareCustomerDeliverId;

    private String spareParts;

    private String sparePartsNo;

    private String sparePartsLangLang;

    private String newSerial;

    private BigDecimal repairCost;

    private String outStatus;

    private String outStatusLangLang;

    private String remark;

    private BigDecimal repairOffer;

    private BigDecimal repairIncome;

    private Double num;

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
    }

    public String getOutStatusLangLang() {
        return outStatusLangLang;
    }

    public void setOutStatusLangLang(String outStatusLangLang) {
        this.outStatusLangLang = outStatusLangLang;
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

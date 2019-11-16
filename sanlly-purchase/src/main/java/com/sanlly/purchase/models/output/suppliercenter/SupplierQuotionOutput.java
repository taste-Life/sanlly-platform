package com.sanlly.purchase.models.output.suppliercenter;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Description: 获取供应商报价情况
 * @ClassName: SupplierQuotionOutput
 * @Version 1.0
 * @Author mqz
 */
public class SupplierQuotionOutput {
    //开始时间
    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    private Date startTime;
    //结束时间
    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    private Date endTime;
    //报价次数次数
    Integer quotationNumber;
    //中标次数
    Integer successNumber;
    //中标的金额
    String transactionAmount;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getQuotationNumber() {
        return quotationNumber;
    }

    public void setQuotationNumber(Integer quotationNumber) {
        this.quotationNumber = quotationNumber;
    }

    public Integer getSuccessNumber() {
        return successNumber;
    }

    public void setSuccessNumber(Integer successNumber) {
        this.successNumber = successNumber;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}

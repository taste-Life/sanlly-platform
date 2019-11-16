package com.sanlly.purchase.models.output.supplier;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SupplierReportOutput {
	private  String supplier;
	//开始时间
	@JsonFormat(pattern = "yyyy-MM-dd",locale="zh", timezone="GMT+8")
	private Date startTime;
	//结束时间
	@JsonFormat(pattern = "yyyy-MM-dd",locale="zh", timezone="GMT+8")
	private Date endTime;
	//名称
	private String supplierName;
	//所属公司
	private String company;
	//状态
	private String status;
	//变动时间
	@JsonFormat(pattern = "yyyy-MM-dd",locale="zh", timezone="GMT+8")
	private Date changeTime;
	//参与报价次数
	private int quotationNumber;
	//成交次数
	private int successNumber;
	//交易总额
	private String transactionAmount;
	//备注
	private String remark;
	//竞价次数
    private Double biddingNum;
    //询价次数
    private  Double inquiryNum;
	//当前状态
	private  String currentStatus;
	private  String currentStatusLangLang;
	private  String statusLangLang;

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getCurrentStatusLangLang() {
		return currentStatusLangLang;
	}

	public void setCurrentStatusLangLang(String currentStatusLangLang) {
		this.currentStatusLangLang = currentStatusLangLang;
	}

	public String getStatusLangLang() {
		return statusLangLang;
	}

	public void setStatusLangLang(String statusLangLang) {
		this.statusLangLang = statusLangLang;
	}

	public Double getBiddingNum() {
		return biddingNum;
	}

	public void setBiddingNum(Double biddingNum) {
		this.biddingNum = biddingNum;
	}

	public Double getInquiryNum() {
		return inquiryNum;
	}

	public void setInquiryNum(Double inquiryNum) {
		this.inquiryNum = inquiryNum;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

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
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getChangeTime() {
		return changeTime;
	}
	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}
	public int getQuotationNumber() {
		return quotationNumber;
	}
	public void setQuotationNumber(int quotationNumber) {
		this.quotationNumber = quotationNumber;
	}
	public int getSuccessNumber() {
		return successNumber;
	}
	public void setSuccessNumber(int successNumber) {
		this.successNumber = successNumber;
	}
	public String getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
	


}

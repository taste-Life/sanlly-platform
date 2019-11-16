package com.sanlly.warehouse.models.input.returnwarehouse;

import java.util.Date;
import java.util.List;

public class AddReturnWarehouseInput {
	
    private String returnNo;

    private String stockoutNo;

    private String no;

    private String billType;

    private Date returnDate;

    private Integer operator;

    private String returnReason;

    private Double returnNum;

    private Integer auditStatus;

    private String reasonsRejection;
    
	private List<ReturnWarehouseDetailInput> details;

	public String getReturnNo() {
		return returnNo;
	}

	public void setReturnNo(String returnNo) {
		this.returnNo = returnNo;
	}

	public String getStockoutNo() {
		return stockoutNo;
	}

	public void setStockoutNo(String stockoutNo) {
		this.stockoutNo = stockoutNo;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Integer getOperator() {
		return operator;
	}

	public void setOperator(Integer operator) {
		this.operator = operator;
	}

	public String getReturnReason() {
		return returnReason;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

	public Double getReturnNum() {
		return returnNum;
	}

	public void setReturnNum(Double returnNum) {
		this.returnNum = returnNum;
	}

	public Integer getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getReasonsRejection() {
		return reasonsRejection;
	}

	public void setReasonsRejection(String reasonsRejection) {
		this.reasonsRejection = reasonsRejection;
	}

	public List<ReturnWarehouseDetailInput> getDetails() {
		return details;
	}

	public void setDetails(List<ReturnWarehouseDetailInput> details) {
		this.details = details;
	}


}

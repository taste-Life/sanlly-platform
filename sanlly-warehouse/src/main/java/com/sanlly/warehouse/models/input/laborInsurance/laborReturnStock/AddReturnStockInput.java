package com.sanlly.warehouse.models.input.laborInsurance.laborReturnStock;

import java.util.Date;
import java.util.List;
/**
 * ClassName: AddReturnStockInput
 * Description: 添加退库单输入类
 * date: 2019/9/17 10:38
 *
 * @author zhh
 * 
 */
import com.sanlly.warehouse.models.input.returnwarehouse.ReturnWarehouseDetailInput;

public class AddReturnStockInput {
	//退库单
	private String returnNo;
    //出库单号
    private String stockoutNo;
    //原单号
    private String no;
    //单据类型
    private String billType;
    //退库日期
    private Date returnDate;
    //操作人
    private Integer operator;
    //退库原因
    private String returnReason;
    //退库数量
    private Double returnNum;
    //审核状态
    private String auditStatus;

    private String reasonsRejection;
    
	private List<ReturnStockDetailInput> detailList;

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

	public List<ReturnStockDetailInput> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<ReturnStockDetailInput> detailList) {
		this.detailList = detailList;
	}

	

	


}

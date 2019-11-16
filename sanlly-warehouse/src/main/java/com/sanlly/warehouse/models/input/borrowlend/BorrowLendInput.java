package com.sanlly.warehouse.models.input.borrowlend;

import java.util.Date;
import java.util.List;

/**
 * 借入借出input
 * 
 * @author lishzh
 *
 */
public class BorrowLendInput {

	private Integer wareBorrowLendSlipId;// 主键id
	
	private Integer borrowRepayId;//还件id

	private String borrowLendNo;// 借入借出单号

	private String containerNo;// 箱号

	private String yard;// 场站

	private String company;// 所属公司

	private String borrowUnit;// 借件单位

	private Integer borrowUser;// 借件人

	private String borrowType;// 借件类型

	private String outWarehouse;// 出库仓库

	private String inWarehouse;// 入库仓库

	private String escrowWarehouse;// 代管库

	private String auditStatus;// 审核状态

	private String billStatus;// 单据状态

	private String remark;// 备注

	private String reasonsRejection;// 驳回原因
	
    private String address;//收货地址

    private String receiveUser;//收货人

    private String recipient;//收货单位

    private String concatWay;//联系方式

	List<BorrowLendDetailInput> details;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReceiveUser() {
		return receiveUser;
	}

	public void setReceiveUser(String receiveUser) {
		this.receiveUser = receiveUser;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getConcatWay() {
		return concatWay;
	}

	public void setConcatWay(String concatWay) {
		this.concatWay = concatWay;
	}

	public Integer getBorrowRepayId() {
		return borrowRepayId;
	}

	public void setBorrowRepayId(Integer borrowRepayId) {
		this.borrowRepayId = borrowRepayId;
	}

	public Integer getBorrowUser() {
		return borrowUser;
	}

	public void setBorrowUser(Integer borrowUser) {
		this.borrowUser = borrowUser;
	}

	public String getReasonsRejection() {
		return reasonsRejection;
	}

	public void setReasonsRejection(String reasonsRejection) {
		this.reasonsRejection = reasonsRejection;
	}

	public Integer getWareBorrowLendSlipId() {
		return wareBorrowLendSlipId;
	}

	public void setWareBorrowLendSlipId(Integer wareBorrowLendSlipId) {
		this.wareBorrowLendSlipId = wareBorrowLendSlipId;
	}

	public String getBorrowLendNo() {
		return borrowLendNo;
	}

	public void setBorrowLendNo(String borrowLendNo) {
		this.borrowLendNo = borrowLendNo;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBorrowUnit() {
		return borrowUnit;
	}

	public void setBorrowUnit(String borrowUnit) {
		this.borrowUnit = borrowUnit;
	}

	public String getBorrowType() {
		return borrowType;
	}

	public void setBorrowType(String borrowType) {
		this.borrowType = borrowType;
	}

	public String getOutWarehouse() {
		return outWarehouse;
	}

	public void setOutWarehouse(String outWarehouse) {
		this.outWarehouse = outWarehouse;
	}

	public String getInWarehouse() {
		return inWarehouse;
	}

	public void setInWarehouse(String inWarehouse) {
		this.inWarehouse = inWarehouse;
	}

	public String getEscrowWarehouse() {
		return escrowWarehouse;
	}

	public void setEscrowWarehouse(String escrowWarehouse) {
		this.escrowWarehouse = escrowWarehouse;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<BorrowLendDetailInput> getDetails() {
		return details;
	}

	public void setDetails(List<BorrowLendDetailInput> details) {
		this.details = details;
	}

}

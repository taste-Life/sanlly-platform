package com.sanlly.common.models.output.fixOut;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.fix 
 * @Description: TODO 领料备件列表
 * @author tianzhl   
 * @date 2019年9月7日 下午4:08:09 
 * @version V1.0   
 */
public class PickingListEntryOutput {

	private String containerNo;

	private String referralEntryId;

	private String sparesNumber;

	private Double length;

	private Double width;

	private Double quantity;

	private Double stockoutNum;

	private Double returnNum;

	private Double pickingQuantity;

	private Double borrowQuantity;

	private String pickingStateLang;

	private String remarks;
	
	private String staffBorrowType;

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getReferralEntryId() {
		return referralEntryId;
	}

	public void setReferralEntryId(String referralEntryId) {
		this.referralEntryId = referralEntryId;
	}

	public String getSparesNumber() {
		return sparesNumber;
	}

	public void setSparesNumber(String sparesNumber) {
		this.sparesNumber = sparesNumber;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getStockoutNum() {
		return stockoutNum;
	}

	public void setStockoutNum(Double stockoutNum) {
		this.stockoutNum = stockoutNum;
	}

	public Double getReturnNum() {
		return returnNum;
	}

	public void setReturnNum(Double returnNum) {
		this.returnNum = returnNum;
	}

	public Double getPickingQuantity() {
		return pickingQuantity;
	}

	public void setPickingQuantity(Double pickingQuantity) {
		this.pickingQuantity = pickingQuantity;
	}

	public Double getBorrowQuantity() {
		return borrowQuantity;
	}

	public void setBorrowQuantity(Double borrowQuantity) {
		this.borrowQuantity = borrowQuantity;
	}

	public String getPickingStateLang() {
		return pickingStateLang;
	}

	public void setPickingStateLang(String pickingStateLang) {
		this.pickingStateLang = pickingStateLang;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStaffBorrowType() {
		return staffBorrowType;
	}

	public void setStaffBorrowType(String staffBorrowType) {
		this.staffBorrowType = staffBorrowType;
	}

}

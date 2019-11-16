package com.sanlly.warehouse.models.input.borrowlend;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

/**
 * 借入借出检索input
 * 
 * @author lishzh
 *
 */
public class SearchBorrowLendInput extends PageInput {

	private Date startDate;// 起始时间

	private Date endDate;// 结束时间

	private String yard;// 场站

	private String no;// 借件单号

	private String containerNo;// 箱号

	private String status;// 单据状态

	private String sparePartsNo;// 备件号

	private String sparePartsName;// 备件名

	private String borrowUnit;// 借件单位

	public String getBorrowUnit() {
		return borrowUnit;
	}

	public void setBorrowUnit(String borrowUnit) {
		this.borrowUnit = borrowUnit;
	}

	public SearchBorrowLendInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchBorrowLendInput(Integer index, Integer size) {
		super(index, size);
		// TODO Auto-generated constructor stub
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getSparePartsName() {
		return sparePartsName;
	}

	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}

}

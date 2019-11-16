package com.sanlly.warehouse.models.input.surplusLosses;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;
/**
 * ClassName: SearchSLInput
 * Description: 查询盘盈盘亏输入类
 * date: 2019/10/30 10:51
 *
 * @author zhh
 */
public class SearchSLInput extends PageInput{
	//开始日期
	private Date startDate;
	//截止日期
	private Date endDate;
	//所属场站
	private String yard;
	//处理仓库
	private String warehouse;
	//盘盈盘亏单号
	private String surplusLossesNo;
	//备件号
	private String sparePartsNo;
	//备件名称
	private String sparePartsName;
	//单据状态
	private String billStatus;
	//类型
	private String type;
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
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getSurplusLossesNo() {
		return surplusLossesNo;
	}
	public void setSurplusLossesNo(String surplusLossesNo) {
		this.surplusLossesNo = surplusLossesNo;
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
	public String getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	public SearchSLInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchSLInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}

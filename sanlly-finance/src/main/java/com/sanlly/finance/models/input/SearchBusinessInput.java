package com.sanlly.finance.models.input;

import com.sanlly.common.models.input.PageInput;

/**
 * 商务结算检索输入类
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月8日  
*
 */
public class SearchBusinessInput extends PageInput {

	public SearchBusinessInput(){
		 
	}
	
	public SearchBusinessInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}
	private String businessId;
	//账单号
	private String billCode;
	//账单月份
	private String billMonth;
	//账单类型
	private String billType;
	//客商名称
	private String companyName;
	//收支类型
	private String chargeInoutType;
	//入账状态
	private String inBillStatus;
	//审核开始日期
	private String startDate;
	//审核结束日期
	private String endDate;
	public String getBillCode() {
		return billCode;
	}

	
	
	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getBillMonth() {
		return billMonth;
	}

	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
 

	public String getChargeInoutType() {
		return chargeInoutType;
	}

	public void setChargeInoutType(String chargeInoutType) {
		this.chargeInoutType = chargeInoutType;
	}

	public String getInBillStatus() {
		return inBillStatus;
	}

	public void setInBillStatus(String inBillStatus) {
		this.inBillStatus = inBillStatus;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
	

}

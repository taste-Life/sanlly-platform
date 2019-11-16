package com.sanlly.finance.models.input;

import com.sanlly.common.models.input.PageInput;

/**
 * 基础信息查询输入类 通用类
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年8月20日 上午11:35:00 
* @version V1.0   
 */
public class SearchBaseInput  extends PageInput{
	
	public SearchBaseInput(){
		 
	}
	
	public SearchBaseInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}
	//主表id
	private Integer pid;
	//名称
	private String name;
	//编号
	private String code;
	//账单月份
	private String billMonth;
	//箱号
	private String containerNo;
	//账单状态
	private String billStatus;
	//场站
	private String yard;
	//账单状态
	private Integer billType;
	//成本 收入 账单类型
	private String chargeInoutType;
	
	// 收费对象 同用箱人
	private String chargeObject;
	//公司名称key
	private String companyKey;
	//公司名称
	private String companyName;
	//班组名称
	private String workGroupName;
	
	//0 班组 1外包商
    private Integer rateType;
    //费用池类型
    private Integer poolType;
    //外包商
    private String outSourcer;
    //业务大类
    private String businessCategory;
    //业务大类 分类
    private String businessType;
    //费用key
    private String chargeKey;
	 
	
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getBillMonth() {
		return billMonth;
	}

	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public Integer getBillType() {
		return billType;
	}

	public void setBillType(Integer billType) {
		this.billType = billType;
	}

	 

	public String getChargeObject() {
		return chargeObject;
	}

	public void setChargeObject(String chargeObject) {
		this.chargeObject = chargeObject;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWorkGroupName() {
		return workGroupName;
	}

	public void setWorkGroupName(String workGroupName) {
		this.workGroupName = workGroupName;
	}

	public Integer getRateType() {
		return rateType;
	}

	public void setRateType(Integer rateType) {
		this.rateType = rateType;
	}

	public Integer getPoolType() {
		return poolType;
	}

	public void setPoolType(Integer poolType) {
		this.poolType = poolType;
	}

	public String getOutSourcer() {
		return outSourcer;
	}

	public void setOutSourcer(String outSourcer) {
		this.outSourcer = outSourcer;
	}

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getChargeInoutType() {
		return chargeInoutType;
	}

	public void setChargeInoutType(String chargeInoutType) {
		this.chargeInoutType = chargeInoutType;
	}

	public String getBusinessCategory() {
		return businessCategory;
	}

	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}

	public String getChargeKey() {
		return chargeKey;
	}

	public void setChargeKey(String chargeKey) {
		this.chargeKey = chargeKey;
	}


	
	
	
	
}

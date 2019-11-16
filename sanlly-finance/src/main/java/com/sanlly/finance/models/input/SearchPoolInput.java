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
public class SearchPoolInput  extends PageInput{
	
	public SearchPoolInput(){
		 
	}
	
	public SearchPoolInput(Integer pageIndex,Integer pageSize){
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
	
	//收费对象
	private Integer containerUserId;
	//公司名称
	private String companyName;
	//班组名称
	private String workGroupName;
	 
	
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

	public Integer getContainerUserId() {
		return containerUserId;
	}

	public void setContainerUserId(Integer containerUserId) {
		this.containerUserId = containerUserId;
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


	
	
	
	
}

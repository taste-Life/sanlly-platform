package com.sanlly.purchase.models.input.mattertender;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

/**
 * 
* @Package com.sanlly.purchase.models.input.mattertender 
* @Description: 招标采购分页查询条件
* @author jlx   
* @date 2019年8月19日 下午4:31:46 
* @version V1.0   
 */
public class SearchMatterTenderInput  extends PageInput{	

	// 招标发布时间起
	private Date tenderCreateTimeStart; 
	// 招标发布时间止
	private Date tenderCreateTimeEnd;
	// 采购单位
	private String purchaseCompany;
	// 招标方式
	private String tenderMethod;
	// 招标状态
	private String tenderStatus;
	// 招标项目名称
	private String tenderName;
	// 是否周期性定价
    private String isPeriod;
    // 仓库
//    private String warehouse;
	
    public SearchMatterTenderInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}

	public Date getTenderCreateTimeStart() {
		return tenderCreateTimeStart;
	}

	public void setTenderCreateTimeStart(Date tenderCreateTimeStart) {
		this.tenderCreateTimeStart = tenderCreateTimeStart;
	}

	public Date getTenderCreateTimeEnd() {
		return tenderCreateTimeEnd;
	}

	public void setTenderCreateTimeEnd(Date tenderCreateTimeEnd) {
		this.tenderCreateTimeEnd = tenderCreateTimeEnd;
	}

	public String getPurchaseCompany() {
		return purchaseCompany;
	}

	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}

	public String getTenderMethod() {
		return tenderMethod;
	}

	public void setTenderMethod(String tenderMethod) {
		this.tenderMethod = tenderMethod;
	}

	public String getTenderStatus() {
		return tenderStatus;
	}

	public void setTenderStatus(String tenderStatus) {
		this.tenderStatus = tenderStatus;
	}

	public String getTenderName() {
		return tenderName;
	}

	public void setTenderName(String tenderName) {
		this.tenderName = tenderName;
	}

	public String getIsPeriod() {
		return isPeriod;
	}

	public void setIsPeriod(String isPeriod) {
		this.isPeriod = isPeriod;
	}

//	public String getWarehouse() {
//		return warehouse;
//	}
//
//	public void setWarehouse(String warehouse) {
//		this.warehouse = warehouse;
//	}   
    
}

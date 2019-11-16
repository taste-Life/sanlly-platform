package com.sanlly.purchase.models.input.mattertender;

import java.util.Date;
import java.util.List;

import com.sanlly.purchase.models.input.MultiSelectInput;
import com.sanlly.purchase.models.output.MatterDemand.MatterDemandOutput;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;

/**
 * 
* @Package com.sanlly.purchase.models.input.mattertender 
* @Description: 招标发布内容添加 
* @author jlx   
* @date 2019年8月19日 下午4:56:19 
* @version V1.0   
 */
public class AddMatterTenderInput {

	// 项目名称
	private String tenderName;
	// 招标项目编号
    private String tenderId;
	// 招标类型
    private String tenderType;
	// 采购单位
    private String purchaseCompany;
	// 采购员
    private Integer buyerId;
	// 联系方式
    private String contactType;
	// 招标内容
    private String tenderContent;
	// 投标人资格条件
    private String tenderCondition;
	// 初审时间
    private Date firstInstanceTime;
	// 招标方式
    private String tenderMethod;
	// 供货开始时间
    private Date supplyTime;
	// 供货结束时间
    private Date supplyEndTime;
	// 是否周期性定价
    private String isPeriod;
	// 投标截止时间
    private Date tenderEndTime;
	// 温馨提示
    private String reminder;
    // 发票类型
    private String invoice;
    // 招标仓库
    private List<MultiSelectInput>  warehouseInputs;
    // 招标备件列表
    private List<MatterDemandOutput> matterDemandList;
    // 邀请供应商
    private String[] purcSupplierIds;
    
	public String getTenderName() {
		return tenderName;
	}
	public void setTenderName(String tenderName) {
		this.tenderName = tenderName;
	}
	public String getTenderId() {
		return tenderId;
	}
	public void setTenderId(String tenderId) {
		this.tenderId = tenderId;
	}
	public String getTenderType() {
		return tenderType;
	}
	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public String getTenderContent() {
		return tenderContent;
	}
	public void setTenderContent(String tenderContent) {
		this.tenderContent = tenderContent;
	}
	public String getTenderCondition() {
		return tenderCondition;
	}
	public void setTenderCondition(String tenderCondition) {
		this.tenderCondition = tenderCondition;
	}
	public Date getFirstInstanceTime() {
		return firstInstanceTime;
	}
	public void setFirstInstanceTime(Date firstInstanceTime) {
		this.firstInstanceTime = firstInstanceTime;
	}
	public String getTenderMethod() {
		return tenderMethod;
	}
	public void setTenderMethod(String tenderMethod) {
		this.tenderMethod = tenderMethod;
	}
	public Date getSupplyTime() {
		return supplyTime;
	}
	public void setSupplyTime(Date supplyTime) {
		this.supplyTime = supplyTime;
	}
	public Date getSupplyEndTime() {
		return supplyEndTime;
	}
	public void setSupplyEndTime(Date supplyEndTime) {
		this.supplyEndTime = supplyEndTime;
	}
	public String getIsPeriod() {
		return isPeriod;
	}
	public void setIsPeriod(String isPeriod) {
		this.isPeriod = isPeriod;
	}
	public Date getTenderEndTime() {
		return tenderEndTime;
	}
	public void setTenderEndTime(Date tenderEndTime) {
		this.tenderEndTime = tenderEndTime;
	}
	public String getReminder() {
		return reminder;
	}
	public void setReminder(String reminder) {
		this.reminder = reminder;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	
	public List<MultiSelectInput> getWarehouseInputs() {
		return warehouseInputs;
	}
	public void setWarehouseInputs(List<MultiSelectInput> warehouseInputs) {
		this.warehouseInputs = warehouseInputs;
	}
	public List<MatterDemandOutput> getMatterDemandList() {
		return matterDemandList;
	}
	public void setMatterDemandList(List<MatterDemandOutput> matterDemandList) {
		this.matterDemandList = matterDemandList;
	}
	public String[] getPurcSupplierIds() {
		return purcSupplierIds;
	}
	public void setPurcSupplierIds(String[] purcSupplierIds) {
		this.purcSupplierIds = purcSupplierIds;
	}
	
	
}

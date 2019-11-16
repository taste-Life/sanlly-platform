package com.sanlly.warehouse.models.output.purchaserequisitions;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
* Description: 采购需求列表输出
* @ClassName: WarePurchaseRequisitionsListOutput
* @date 2019年7月26日
*
* @author jlx
 */
public class WarePurchaseRequisitionsListOutput {
	
	private Integer warePurchaseRequisitionsId;
	// 采购需求单号
	private String purchaseRequisitionsNo;
    // 备件大类
    private String sparePartsCategoriesLangLang;
    //备件明细类别
    private String sparePartsCategoriesDetailsLangLang;
    private String sparePartsCategoriesDetails;
	// 备件号
	private String sparePartsNo;
	// 备件key
	private String spareParts;
	private String sparePartsLangLang;
	// 仓库key
    private String warehouse;
    private String warehouseLangLang;
	// 仓库类型
	private String warehouseTypeLangLang;
	// 现有库存
	private Double surplusNum;
	// 安全库存
	private Double safeStockNum;
	// 申请数量
	private Double applyNum;
	// 上一年度入库总量
	private Double entryNumLastYear;
	// 审核状态
    private String auditStatus;
    private String auditStatusLangLang;
    // 采购生成类型
    private String requisitionsTypeLangLang;
    private String remark;
    // 要求到货日期
    @JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date requireArriveTime;
    // 采购模式
    private String purchasingPattern;
    private String purchasingPatternLangLang;
	public Integer getWarePurchaseRequisitionsId() {
		return warePurchaseRequisitionsId;
	}
	public void setWarePurchaseRequisitionsId(Integer warePurchaseRequisitionsId) {
		this.warePurchaseRequisitionsId = warePurchaseRequisitionsId;
	}
	public String getPurchaseRequisitionsNo() {
		return purchaseRequisitionsNo;
	}
	public void setPurchaseRequisitionsNo(String purchaseRequisitionsNo) {
		this.purchaseRequisitionsNo = purchaseRequisitionsNo;
	}
	public String getSparePartsCategoriesLangLang() {
		return sparePartsCategoriesLangLang;
	}
	public void setSparePartsCategoriesLangLang(String sparePartsCategoriesLangLang) {
		this.sparePartsCategoriesLangLang = sparePartsCategoriesLangLang;
	}
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
	public String getSpareParts() {
		return spareParts;
	}
	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}
	public String getSparePartsLangLang() {
		return sparePartsLangLang;
	}
	public void setSparePartsLangLang(String sparePartsLangLang) {
		this.sparePartsLangLang = sparePartsLangLang;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getWarehouseLangLang() {
		return warehouseLangLang;
	}
	public void setWarehouseLangLang(String warehouseLangLang) {
		this.warehouseLangLang = warehouseLangLang;
	}
	public String getWarehouseTypeLangLang() {
		return warehouseTypeLangLang;
	}
	public void setWarehouseTypeLangLang(String warehouseTypeLangLang) {
		this.warehouseTypeLangLang = warehouseTypeLangLang;
	}
	public Double getSurplusNum() {
		return surplusNum;
	}
	public void setSurplusNum(Double surplusNum) {
		this.surplusNum = surplusNum;
	}
	public Double getSafeStockNum() {
		return safeStockNum;
	}
	public void setSafeStockNum(Double safeStockNum) {
		this.safeStockNum = safeStockNum;
	}
	public Double getApplyNum() {
		return applyNum;
	}
	public void setApplyNum(Double applyNum) {
		this.applyNum = applyNum;
	}
	public Double getEntryNumLastYear() {
		return entryNumLastYear;
	}
	public void setEntryNumLastYear(Double entryNumLastYear) {
		this.entryNumLastYear = entryNumLastYear;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatusLangLang() {
		return auditStatusLangLang;
	}
	public void setAuditStatusLangLang(String auditStatusLangLang) {
		this.auditStatusLangLang = auditStatusLangLang;
	}
	public String getRequisitionsTypeLangLang() {
		return requisitionsTypeLangLang;
	}
	public void setRequisitionsTypeLangLang(String requisitionsTypeLangLang) {
		this.requisitionsTypeLangLang = requisitionsTypeLangLang;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getRequireArriveTime() {
		return requireArriveTime;
	}
	public void setRequireArriveTime(Date requireArriveTime) {
		this.requireArriveTime = requireArriveTime;
	}
	public String getPurchasingPattern() {
		return purchasingPattern;
	}
	public void setPurchasingPattern(String purchasingPattern) {
		this.purchasingPattern = purchasingPattern;
	}
	public String getPurchasingPatternLangLang() {
		return purchasingPatternLangLang;
	}
	public void setPurchasingPatternLangLang(String purchasingPatternLangLang) {
		this.purchasingPatternLangLang = purchasingPatternLangLang;
	}
	public String getSparePartsCategoriesDetailsLangLang() {
		return sparePartsCategoriesDetailsLangLang;
	}
	public void setSparePartsCategoriesDetailsLangLang(String sparePartsCategoriesDetailsLangLang) {
		this.sparePartsCategoriesDetailsLangLang = sparePartsCategoriesDetailsLangLang;
	}
	public String getSparePartsCategoriesDetails() {
		return sparePartsCategoriesDetails;
	}
	public void setSparePartsCategoriesDetails(String sparePartsCategoriesDetails) {
		this.sparePartsCategoriesDetails = sparePartsCategoriesDetails;
	}
    
       	
}

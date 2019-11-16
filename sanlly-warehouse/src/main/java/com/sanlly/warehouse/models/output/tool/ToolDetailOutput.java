package com.sanlly.warehouse.models.output.tool;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 工具管理明细output
 * 
 * @author lishzh
 *
 */
public class ToolDetailOutput {

	private Integer wareToolApplyDetailId;

	private String spareParts;// 备件key

	private String sparePartsNo;// 备件号

	private String sparePartsLangLang;// 备件名

	private Integer userId;// 使用人id

	private String useUser;// 使用人

	private Integer liablePerson;// 责任人id

	private String liableUser;// 责任人

	private Integer newLiablePerson;// 新责任人id

	private String newLiableUser;// 新责任人

	private String inDepartments;// 调入部门

	private String useDepartment;// 使用部门

	private String useDepartmentLangLang;// 使用部门

	private String useType;// 使用类型

	private String useTypeLangLang;// 使用类型

	private String distributeStatus;// 派发状态

	private String distributeStatusLangLang;// 派发状态

	private Double sparePartsNum;// 新工具申请数量

	private Double scrapNum;// 报废数量

	private String stockoutStatus;// 出库状态key

	private String stockoutStatusLangLang;// 出库状态

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date distributeDate;// 派发时间

	private Double surplusNum;// 库存剩余数量

	private Integer wareToolManageId;// 工具管理id

	private String sparePartsBatch;// 工具编号(批次号)

	private Double num;// 现有数量

	private String toolStatus;// 工具状态

	private Integer scrapedNum;// 已报废的数量

	private Double outedNum; // 已出库数量

	private String transferRecord;// 调拨记录

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date scrapDate;// 报废时间
	
	private Double stock; // 已出库数量

	public Double getStock() {
		return stock;
	}

	public void setStock(Double stock) {
		this.stock = stock;
	}

	public Date getScrapDate() {
		return scrapDate;
	}

	public void setScrapDate(Date scrapDate) {
		this.scrapDate = scrapDate;
	}

	public String getTransferRecord() {
		return transferRecord;
	}

	public void setTransferRecord(String transferRecord) {
		this.transferRecord = transferRecord;
	}

	public Double getOutedNum() {
		return outedNum;
	}

	public void setOutedNum(Double outedNum) {
		this.outedNum = outedNum;
	}

	public Integer getWareToolApplyDetailId() {
		return wareToolApplyDetailId;
	}

	public void setWareToolApplyDetailId(Integer wareToolApplyDetailId) {
		this.wareToolApplyDetailId = wareToolApplyDetailId;
	}

	public Integer getScrapedNum() {
		return scrapedNum;
	}

	public void setScrapedNum(Integer scrapedNum) {
		this.scrapedNum = scrapedNum;
	}

	public String getDistributeStatusLangLang() {
		return distributeStatusLangLang;
	}

	public void setDistributeStatusLangLang(String distributeStatusLangLang) {
		this.distributeStatusLangLang = distributeStatusLangLang;
	}

	public String getLiableUser() {
		return liableUser;
	}

	public String getNewLiableUser() {
		return newLiableUser;
	}

	public Integer getWareToolManageId() {
		return wareToolManageId;
	}

	public void setWareToolManageId(Integer wareToolManageId) {
		this.wareToolManageId = wareToolManageId;
	}

	public String getSparePartsBatch() {
		return sparePartsBatch;
	}

	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}

	public Double getNum() {
		return num;
	}

	public void setNum(Double num) {
		this.num = num;
	}

	public String getToolStatus() {
		return toolStatus;
	}

	public void setToolStatus(String toolStatus) {
		this.toolStatus = toolStatus;
	}

	public void setLiableUser(String liableUser) {
		this.liableUser = liableUser;
	}

	public void setNewLiableUser(String newLiableUser) {
		this.newLiableUser = newLiableUser;
	}

	public Double getSurplusNum() {
		return surplusNum;
	}

	public void setSurplusNum(Double surplusNum) {
		this.surplusNum = surplusNum;
	}

	public String getStockoutStatus() {
		return stockoutStatus;
	}

	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}

	public String getStockoutStatusLangLang() {
		return stockoutStatusLangLang;
	}

	public void setStockoutStatusLangLang(String stockoutStatusLangLang) {
		this.stockoutStatusLangLang = stockoutStatusLangLang;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUseUser() {
		return useUser;
	}

	public void setUseUser(String useUser) {
		this.useUser = useUser;
	}

	public Integer getLiablePerson() {
		return liablePerson;
	}

	public void setLiablePerson(Integer liablePerson) {
		this.liablePerson = liablePerson;
	}

	public Integer getNewLiablePerson() {
		return newLiablePerson;
	}

	public void setNewLiablePerson(Integer newLiablePerson) {
		this.newLiablePerson = newLiablePerson;
	}

	public String getInDepartments() {
		return inDepartments;
	}

	public void setInDepartments(String inDepartments) {
		this.inDepartments = inDepartments;
	}

	public String getUseDepartment() {
		return useDepartment;
	}

	public void setUseDepartment(String useDepartment) {
		this.useDepartment = useDepartment;
	}

	public String getUseDepartmentLangLang() {
		return useDepartmentLangLang;
	}

	public void setUseDepartmentLangLang(String useDepartmentLangLang) {
		this.useDepartmentLangLang = useDepartmentLangLang;
	}

	public String getUseType() {
		return useType;
	}

	public void setUseType(String useType) {
		this.useType = useType;
	}

	public String getUseTypeLangLang() {
		return useTypeLangLang;
	}

	public void setUseTypeLangLang(String useTypeLangLang) {
		this.useTypeLangLang = useTypeLangLang;
	}

	public String getDistributeStatus() {
		return distributeStatus;
	}

	public void setDistributeStatus(String distributeStatus) {
		this.distributeStatus = distributeStatus;
	}

	public Double getSparePartsNum() {
		return sparePartsNum;
	}

	public void setSparePartsNum(Double sparePartsNum) {
		this.sparePartsNum = sparePartsNum;
	}

	public Double getScrapNum() {
		return scrapNum;
	}

	public void setScrapNum(Double scrapNum) {
		this.scrapNum = scrapNum;
	}

	public Date getDistributeDate() {
		return distributeDate;
	}

	public void setDistributeDate(Date distributeDate) {
		this.distributeDate = distributeDate;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

}

package com.sanlly.warehouse.models.output.laborInsurance.laborStockOut;

import java.util.List;

/**
 * ClassName: LaborStockoutOutput
 * Description: 劳保出库输出类
 * date: 2019/9/5 13:40
 *
 * @author zhh
 */
public class LaborStockoutOutput {
	//出库单id
    private Integer wareStockoutLabaorId;
    //出库单号
    private String labaorStockoutNo;
    //源单号
    private String no;
    //所属公司
    private String companyLangLang;
    private String company;
    //所属仓库
    private String warehouseLangLang;
    private String warehouse;
    //单据类型
    private String billTypeLangLang;
    private String billType;
    //出库状态
    private String stockoutStatusLangLang;
    private String stockoutStatus;
    //领用部门
    private String receiveDepartmentLangLang;
    private String receiveDepartment;
    //领用人
    private Integer receiveUser;
    private String receiveUserName;
    //申请人
    private Integer applicantUser;
    private String applicantUserName;
    //申请时间
    private String applicantDate;
    //确认状态
    private String statusLangLang;
    private String status;
    //是否传SBS
    private String isStockSbsLangLang;
    private String isStockSbs;
    //审核状态
    private String auditStatusLangLang;
    private String auditStatus;
    //驳回原因
    private String reasonsRejection;
    //出库单详细 集合
    private List<LaborStockoutDetailOutput> detailList;
	public Integer getWareStockoutLabaorId() {
		return wareStockoutLabaorId;
	}
	public void setWareStockoutLabaorId(Integer wareStockoutLabaorId) {
		this.wareStockoutLabaorId = wareStockoutLabaorId;
	}
	public String getLabaorStockoutNo() {
		return labaorStockoutNo;
	}
	public void setLabaorStockoutNo(String labaorStockoutNo) {
		this.labaorStockoutNo = labaorStockoutNo;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getCompanyLangLang() {
		return companyLangLang;
	}
	public void setCompanyLangLang(String companyLangLang) {
		this.companyLangLang = companyLangLang;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getWarehouseLangLang() {
		return warehouseLangLang;
	}
	public void setWarehouseLangLang(String warehouseLangLang) {
		this.warehouseLangLang = warehouseLangLang;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getBillTypeLangLang() {
		return billTypeLangLang;
	}
	public void setBillTypeLangLang(String billTypeLangLang) {
		this.billTypeLangLang = billTypeLangLang;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getStockoutStatusLangLang() {
		return stockoutStatusLangLang;
	}
	public void setStockoutStatusLangLang(String stockoutStatusLangLang) {
		this.stockoutStatusLangLang = stockoutStatusLangLang;
	}
	public String getStockoutStatus() {
		return stockoutStatus;
	}
	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}
	public String getReceiveDepartmentLangLang() {
		return receiveDepartmentLangLang;
	}
	public void setReceiveDepartmentLangLang(String receiveDepartmentLangLang) {
		this.receiveDepartmentLangLang = receiveDepartmentLangLang;
	}
	public String getReceiveDepartment() {
		return receiveDepartment;
	}
	public void setReceiveDepartment(String receiveDepartment) {
		this.receiveDepartment = receiveDepartment;
	}
	
	public Integer getReceiveUser() {
		return receiveUser;
	}
	public void setReceiveUser(Integer receiveUser) {
		this.receiveUser = receiveUser;
	}
	public Integer getApplicantUser() {
		return applicantUser;
	}
	public void setApplicantUser(Integer applicantUser) {
		this.applicantUser = applicantUser;
	}
	public String getApplicantUserName() {
		return applicantUserName;
	}
	public void setApplicantUserName(String applicantUserName) {
		this.applicantUserName = applicantUserName;
	}
	public String getApplicantDate() {
		return applicantDate;
	}
	public void setApplicantDate(String applicantDate) {
		this.applicantDate = applicantDate;
	}
	public String getReceiveUserName() {
		return receiveUserName;
	}
	public void setReceiveUserName(String receiveUserName) {
		this.receiveUserName = receiveUserName;
	}
	public String getStatusLangLang() {
		return statusLangLang;
	}
	public void setStatusLangLang(String statusLangLang) {
		this.statusLangLang = statusLangLang;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIsStockSbsLangLang() {
		return isStockSbsLangLang;
	}
	public void setIsStockSbsLangLang(String isStockSbsLangLang) {
		this.isStockSbsLangLang = isStockSbsLangLang;
	}
	public String getIsStockSbs() {
		return isStockSbs;
	}
	public void setIsStockSbs(String isStockSbs) {
		this.isStockSbs = isStockSbs;
	}
	public String getAuditStatusLangLang() {
		return auditStatusLangLang;
	}
	public void setAuditStatusLangLang(String auditStatusLangLang) {
		this.auditStatusLangLang = auditStatusLangLang;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getReasonsRejection() {
		return reasonsRejection;
	}
	public void setReasonsRejection(String reasonsRejection) {
		this.reasonsRejection = reasonsRejection;
	}
	public List<LaborStockoutDetailOutput> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<LaborStockoutDetailOutput> detailList) {
		this.detailList = detailList;
	}
    

}

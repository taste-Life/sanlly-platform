package com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/**
 * ClassName: LaborReceiveOutput
 * Description: 劳保申请信息输出类
 * date: 2019/8/16 13:51
 *
 * @author zhh
 */
public class LaborReceiveOutput {
	//申请单id
	private Integer wareLaborReceiveId;
    //预出库单号
    private String advanceWarehouseReceiptNo;
    //申请部门
    private String applicantDepartment;
    //部门lang
    private String applicantDepartmentLangLang;
    //所属公司
    private String company;
    //国际化所属公司
    private String companyLangLang;
    //申请人姓名
    private String applicantUserName;
    //申请人id
    private Integer applicantUser;
    //申请类型
    private String applicantType;
    //国际化申请类型
    private String applicantTypeLangLang;
    //单据金额
    private BigDecimal billAmount;
    //出库状态
    private String stockoutStatus;
    //国际化出库状态
    private String stockoutStatusLangLang;
    //审核状态
    private String auditStatus;
    //国际化审核状态
    private String auditStatusLangLang;
    //申请时间
    private String applicantDate;
    //备注
    private String remark;
    //申请明细
    private List<LaborReceiveDetailOutput> detailList;
    
	public Integer getWareLaborReceiveId() {
		return wareLaborReceiveId;
	}
	public void setWareLaborReceiveId(Integer wareLaborReceiveId) {
		this.wareLaborReceiveId = wareLaborReceiveId;
	}
	public String getAdvanceWarehouseReceiptNo() {
		return advanceWarehouseReceiptNo;
	}
	public void setAdvanceWarehouseReceiptNo(String advanceWarehouseReceiptNo) {
		this.advanceWarehouseReceiptNo = advanceWarehouseReceiptNo;
	}
	public String getApplicantDepartment() {
		return applicantDepartment;
	}
	public void setApplicantDepartment(String applicantDepartment) {
		this.applicantDepartment = applicantDepartment;
	}
	
	public String getApplicantType() {
		return applicantType;
	}
	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}
	public BigDecimal getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}
	public String getStockoutStatus() {
		return stockoutStatus;
	}
	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}
	public String getApplicantDate() {
		return applicantDate;
	}
	public void setApplicantDate(String applicantDate) {
		this.applicantDate = applicantDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public List<LaborReceiveDetailOutput> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<LaborReceiveDetailOutput> detailList) {
		this.detailList = detailList;
	}
	public String getApplicantDepartmentLangLang() {
		return applicantDepartmentLangLang;
	}
	public void setApplicantDepartmentLangLang(String applicantDepartmentLangLang) {
		this.applicantDepartmentLangLang = applicantDepartmentLangLang;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getApplicantTypeLangLang() {
		return applicantTypeLangLang;
	}
	public void setApplicantTypeLangLang(String applicantTypeLangLang) {
		this.applicantTypeLangLang = applicantTypeLangLang;
	}
	public String getStockoutStatusLangLang() {
		return stockoutStatusLangLang;
	}
	public void setStockoutStatusLangLang(String stockoutStatusLangLang) {
		this.stockoutStatusLangLang = stockoutStatusLangLang;
	}
	public String getAuditStatusLangLang() {
		return auditStatusLangLang;
	}
	public void setAuditStatusLangLang(String auditStatusLangLang) {
		this.auditStatusLangLang = auditStatusLangLang;
	}
	public String getApplicantUserName() {
		return applicantUserName;
	}
	public void setApplicantUserName(String applicantUserName) {
		this.applicantUserName = applicantUserName;
	}
	public Integer getApplicantUser() {
		return applicantUser;
	}
	public void setApplicantUser(Integer applicantUser) {
		this.applicantUser = applicantUser;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompanyLangLang() {
		return companyLangLang;
	}
	public void setCompanyLangLang(String companyLangLang) {
		this.companyLangLang = companyLangLang;
	}

	
	
    
	

}

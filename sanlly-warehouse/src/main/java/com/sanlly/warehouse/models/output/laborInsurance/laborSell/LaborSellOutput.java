package com.sanlly.warehouse.models.output.laborInsurance.laborSell;

import java.util.List;

import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive.LaborReceiveDetailOutput;

/**
 * ClassName: LaborSellOutput
 * Description: 劳保销售申请信息输出类
 * date: 2019/9/3 13:51
 *
 * @author zhh
 */
public class LaborSellOutput {
	//id
	private Integer wareSellProgrammeId;
	//预出库单号
    private String advanceWarehouseReceiptNo;
    //所属公司
    private String company;
    //国际化公司key
    private String companyLangLang;
    //申请部门
    private String applyDepartment;
    //部门lang
    private String applyDepartmentLangLang;
    //申请类型
    private String applyType;
    private String applyTypeLangLang;
    //申请人
    private String applyUserName;
    //申请人id
    private Integer applyUser;
    //购买方
    private String buyer;
    //国际化购买方
    private String buyerLangLang;
    //购买人
    private String buyerUser;
    //审核状态
    private String auditStatus;
    //国际化审核状态
    private String auditStatusLangLang;
    //出库状态
    private String stockoutStatus;
    private String stockoutStatusLangLang;
    //申请时间
    private String applyDate;
    //备注
    private String remark;
    //确认状态
    private String status;
    //国际化确认状态
    private String statusLangLang;
    //申请明细
    private List<LaborSellDetailOutput> detailList;
    
	public Integer getWareSellProgrammeId() {
		return wareSellProgrammeId;
	}
	public void setWareSellProgrammeId(Integer wareSellProgrammeId) {
		this.wareSellProgrammeId = wareSellProgrammeId;
	}
	public String getAdvanceWarehouseReceiptNo() {
		return advanceWarehouseReceiptNo;
	}
	public void setAdvanceWarehouseReceiptNo(String advanceWarehouseReceiptNo) {
		this.advanceWarehouseReceiptNo = advanceWarehouseReceiptNo;
	}
	
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	
	public String getApplyDepartment() {
		return applyDepartment;
	}
	public void setApplyDepartment(String applyDepartment) {
		this.applyDepartment = applyDepartment;
	}
	public String getApplyDepartmentLangLang() {
		return applyDepartmentLangLang;
	}
	public void setApplyDepartmentLangLang(String applyDepartmentLangLang) {
		this.applyDepartmentLangLang = applyDepartmentLangLang;
	}
	public String getApplyUserName() {
		return applyUserName;
	}
	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}
	public Integer getApplyUser() {
		return applyUser;
	}
	public void setApplyUser(Integer applyUser) {
		this.applyUser = applyUser;
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
	
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public List<LaborSellDetailOutput> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<LaborSellDetailOutput> detailList) {
		this.detailList = detailList;
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
	public String getApplyType() {
		return applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}
	public String getApplyTypeLangLang() {
		return applyTypeLangLang;
	}
	public void setApplyTypeLangLang(String applyTypeLangLang) {
		this.applyTypeLangLang = applyTypeLangLang;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusLangLang() {
		return statusLangLang;
	}
	public void setStatusLangLang(String statusLangLang) {
		this.statusLangLang = statusLangLang;
	}
	public String getBuyerUser() {
		return buyerUser;
	}
	public void setBuyerUser(String buyerUser) {
		this.buyerUser = buyerUser;
	}
	public String getBuyerLangLang() {
		return buyerLangLang;
	}
	public void setBuyerLangLang(String buyerLangLang) {
		this.buyerLangLang = buyerLangLang;
	}	
    
}

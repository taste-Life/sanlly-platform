package com.sanlly.warehouse.models.output.tool;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 工具申请、调拨output
 * 
 * @author lishzh
 *
 */
public class ToolOutput {

	private Integer wareToolApplyId;// 申请单id

	private String toolApplyNo;// 申请单号

	private String applyType;// 申请类型key

	private String applyTypeLangLang;// 申请类型

	private String stockoutStatus;// 出库状态key

	private String stockoutStatusLangLang;// 出库状态

	private String applyDepartment;// 申请部门

	private Integer applyUser;// 申请人id

	private String userName;// 申请人

	@JsonFormat(pattern="yyyy-MM-dd")
	private Date applyDate;// 申请时间

	private String remark;// 备注

	private String auditStatus;// 审核状态key

	private String auditStatusLangLang;// 审核状态

	private String reasonsRejection;// 驳回原因
	
	private List<ToolDetailOutput> details;//工具列表

	public List<ToolDetailOutput> getDetails() {
		return details;
	}

	public void setDetails(List<ToolDetailOutput> details) {
		this.details = details;
	}

	public Integer getWareToolApplyId() {
		return wareToolApplyId;
	}

	public void setWareToolApplyId(Integer wareToolApplyId) {
		this.wareToolApplyId = wareToolApplyId;
	}

	public String getToolApplyNo() {
		return toolApplyNo;
	}

	public void setToolApplyNo(String toolApplyNo) {
		this.toolApplyNo = toolApplyNo;
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

	public String getApplyDepartment() {
		return applyDepartment;
	}

	public void setApplyDepartment(String applyDepartment) {
		this.applyDepartment = applyDepartment;
	}

	public Integer getApplyUser() {
		return applyUser;
	}

	public void setApplyUser(Integer applyUser) {
		this.applyUser = applyUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getReasonsRejection() {
		return reasonsRejection;
	}

	public void setReasonsRejection(String reasonsRejection) {
		this.reasonsRejection = reasonsRejection;
	}

	@Override
	public String toString() {
		return "ToolOutput [wareToolApplyId=" + wareToolApplyId + ", toolApplyNo=" + toolApplyNo + ", applyType="
				+ applyType + ", applyTypeLangLang=" + applyTypeLangLang + ", stockoutStatus=" + stockoutStatus
				+ ", stockoutStatusLangLang=" + stockoutStatusLangLang + ", applyDepartment=" + applyDepartment
				+ ", applyUser=" + applyUser + ", userName=" + userName + ", applyDate=" + applyDate + ", remark="
				+ remark + ", auditStatus=" + auditStatus + ", auditStatusLangLang=" + auditStatusLangLang
				+ ", reasonsRejection=" + reasonsRejection + ", details=" + details + "]";
	}

	

}

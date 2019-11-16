package com.sanlly.warehouse.models.input.tool;

import java.util.List;

/**
 * 工具管理input
 * 
 * @author lishzh
 *
 */
public class ToolInput {

	private Integer wareToolApplyId;// 工具申请表id

	private String toolApplyNo;// 申请单号

	private String applyType;// 申请方式

	private String cpmpany;// 申请公司

	private String stockoutStatus;// 出库状态

	private String applyDepartment;// 申请部门

	private String remark;// 备注

	private String auditStatus;// 审核状态

	private String reasonsRejection;// 驳回原因

	private List<ToolDetailInput> details;// 申请明细
	
	private Double stockOutNum;// 出库数量
	
	private String outWarehouse;//出库仓库
	
	private List<Integer> ids;

	public String getOutWarehouse() {
		return outWarehouse;
	}

	public void setOutWarehouse(String outWarehouse) {
		this.outWarehouse = outWarehouse;
	}

	public Double getStockOutNum() {
		return stockOutNum;
	}

	public void setStockOutNum(Double stockOutNum) {
		this.stockOutNum = stockOutNum;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
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

	public String getCpmpany() {
		return cpmpany;
	}

	public void setCpmpany(String cpmpany) {
		this.cpmpany = cpmpany;
	}

	public String getStockoutStatus() {
		return stockoutStatus;
	}

	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}

	public String getApplyDepartment() {
		return applyDepartment;
	}

	public void setApplyDepartment(String applyDepartment) {
		this.applyDepartment = applyDepartment;
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

	public String getReasonsRejection() {
		return reasonsRejection;
	}

	public void setReasonsRejection(String reasonsRejection) {
		this.reasonsRejection = reasonsRejection;
	}

	public List<ToolDetailInput> getDetails() {
		return details;
	}

	public void setDetails(List<ToolDetailInput> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "ToolInput [wareToolApplyId=" + wareToolApplyId + ", toolApplyNo=" + toolApplyNo + ", applyType="
				+ applyType + ", cpmpany=" + cpmpany + ", stockoutStatus=" + stockoutStatus + ", applyDepartment="
				+ applyDepartment + ", remark=" + remark + ", auditStatus=" + auditStatus + ", reasonsRejection="
				+ reasonsRejection + ", details=" + details + "]";
	}
}

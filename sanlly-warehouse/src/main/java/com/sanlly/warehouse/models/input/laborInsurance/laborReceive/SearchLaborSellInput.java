package com.sanlly.warehouse.models.input.laborInsurance.laborReceive;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

/**
 * ClassName: SearchLaborSellInput
 * Description: 查询劳保销售申请单信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class SearchLaborSellInput extends PageInput{
	//开始日期
	private Date startDate;
	//截止日期
	private Date endDate;
	//申请部门
	private String applyDepartment;
	//审核状态
	private String auditStatus;
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String getApplyDepartment() {
		return applyDepartment;
	}
	public void setApplyDepartment(String applyDepartment) {
		this.applyDepartment = applyDepartment;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public SearchLaborSellInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchLaborSellInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}
	

}

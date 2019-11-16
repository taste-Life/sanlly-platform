package com.sanlly.warehouse.models.input.laborInsurance.laborReceive;

import java.util.List;

import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive.LaborReceiveDetailOutput;

/**
 * ClassName: AddLaborReceiveInput
 * Description: 添加劳保申请单输入类
 * date: 2019/8/17 16:15
 *
 * @author zhh
 */
public class AddLaborReceiveInput {
	//预出库单号
    private String advanceWarehouseReceiptNo;
    //申请部门
    private String applicantDepartment;
    //申请人
    private Integer applicantUser;
    //申请类型
    private String applicantType;
    //单据类型
    private String billType;
    //备注
    private String remark;
    //申请明细
    private List<LaborReceiveDetailOutput> detailList;
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
	public Integer getApplicantUser() {
		return applicantUser;
	}
	public void setApplicantUser(Integer applicantUser) {
		this.applicantUser = applicantUser;
	}
	public String getApplicantType() {
		return applicantType;
	}
	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
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
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
    
	
}

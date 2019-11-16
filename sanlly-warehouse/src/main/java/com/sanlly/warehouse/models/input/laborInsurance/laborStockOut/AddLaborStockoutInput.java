package com.sanlly.warehouse.models.input.laborInsurance.laborStockOut;

import java.util.List;
/**
 * ClassName: AddLaborStockoutInput
 * Description: 新增劳保出库单输入类
 * date: 2019/9/5 14:14
 *
 * @author zhh
 */
public class AddLaborStockoutInput {
    //源单号
    private String no;
    //所属公司
    private String company;
    //出库仓库
    private String warehouse;
    //单据类型
    private String billType;
    //领用部门
    private String receiveDepartment;
    //领用人
    private Integer receiveUser;
    //出库单明细
    private List<AddLaborStockoutDetailInput> detailList;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
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
	public List<AddLaborStockoutDetailInput> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<AddLaborStockoutDetailInput> detailList) {
		this.detailList = detailList;
	}
	
    
}

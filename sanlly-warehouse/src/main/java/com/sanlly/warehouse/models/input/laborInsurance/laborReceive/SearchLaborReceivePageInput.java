package com.sanlly.warehouse.models.input.laborInsurance.laborReceive;

import com.sanlly.common.models.input.PageInput;

/**
 * ClassName: SearchLaborReceiveInput
 * Description: 查询劳保申请单信息分页输入类
 * date: 2019/9/26 17:51
 *
 * @author zhh
 */
public class SearchLaborReceivePageInput extends PageInput{
	private String department;
	private Integer user;
	private String sparePartsName;
	private String sparePartsNo;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	public String getSparePartsName() {
		return sparePartsName;
	}
	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
	public SearchLaborReceivePageInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchLaborReceivePageInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}
	

}

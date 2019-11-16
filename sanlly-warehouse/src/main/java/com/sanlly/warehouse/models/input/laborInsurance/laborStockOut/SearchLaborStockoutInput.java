package com.sanlly.warehouse.models.input.laborInsurance.laborStockOut;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: SearchLaboroutInput
 * Description: 查询出库单输入类
 * date: 2019/9/5 14:01
 *
 * @author zhh
 */
public class SearchLaborStockoutInput extends PageInput{
	//出库单ID
    private Integer wareStockoutLabaorId;
	//出库单号
    private String labaorStockoutNo;
    
    //开始时间
    private Date startDate;

    //结束时间
    private Date endDate;
    
    //领用部门
    private String receiveDepartment;
    
    //领用人
    private Integer receiveUser;

    //备件号
    private String sparePartsNo;

    //备件名
    private String sparePartsName;
    
    //源单号
    private String no;
    
    //所属仓库
    private String warehouse;
    
    //单据类型
    private String billType;
    //仓库类型
    private String warehouseType;

	public String getLabaorStockoutNo() {
		return labaorStockoutNo;
	}

	public void setLabaorStockoutNo(String labaorStockoutNo) {
		this.labaorStockoutNo = labaorStockoutNo;
	}

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

	public String getReceiveDepartment() {
		return receiveDepartment;
	}

	public void setReceiveDepartment(String receiveDepartment) {
		this.receiveDepartment = receiveDepartment;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getSparePartsName() {
		return sparePartsName;
	}

	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
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

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}
	

	public Integer getWareStockoutLabaorId() {
		return wareStockoutLabaorId;
	}

	public void setWareStockoutLabaorId(Integer wareStockoutLabaorId) {
		this.wareStockoutLabaorId = wareStockoutLabaorId;
	}

	public SearchLaborStockoutInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchLaborStockoutInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}

	public Integer getReceiveUser() {
		return receiveUser;
	}

	public void setReceiveUser(Integer receiveUser) {
		this.receiveUser = receiveUser;
	}
	
    

}

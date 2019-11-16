package com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceStockIn;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;
/**
 * ClassName: AddStockinInput
 * Description: 查询入库单输入类
 * date: 2019/8/26 10:30
 *
 * @author zhh
 */
public class SearchLaborStockInInput extends PageInput{
    //所属仓库
	private String warehouse;
	//入库单号
	private String labaorStockinNo;
	//入库日期
	private Date StockinDate;
	//供应商
	private String supplier;
	//备件号
	private String sparePartsNo;
	//备件名称
	private String sparePartsName;

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getLabaorStockinNo() {
		return labaorStockinNo;
	}

	public void setLabaorStockinNo(String labaorStockinNo) {
		this.labaorStockinNo = labaorStockinNo;
	}

	public Date getStockinDate() {
		return StockinDate;
	}

	public void setStockinDate(Date stockinDate) {
		StockinDate = stockinDate;
	}

	public SearchLaborStockInInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchLaborStockInInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
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
	
	
}

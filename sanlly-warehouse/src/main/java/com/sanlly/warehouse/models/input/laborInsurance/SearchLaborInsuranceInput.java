package com.sanlly.warehouse.models.input.laborInsurance;

import com.sanlly.common.models.input.PageInput;
/**
 * ClassName: SearchLaborInsuranceInput
 * Description: 查询劳保信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class SearchLaborInsuranceInput extends PageInput{
	//所属仓库key
	private String warehouse;
	//备件号
	private String sparePartsNo;
    //备件名称
    private String sparePartsName;
    //备件明细类别key
    private String sparePartsCategoriesDetails;

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

	public String getSparePartsCategoriesDetails() {
		return sparePartsCategoriesDetails;
	}

	public void setSparePartsCategoriesDetails(String sparePartsCategoriesDetails) {
		this.sparePartsCategoriesDetails = sparePartsCategoriesDetails;
	}
	

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public SearchLaborInsuranceInput() {
		super();
	}

	public SearchLaborInsuranceInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}
    
    
}

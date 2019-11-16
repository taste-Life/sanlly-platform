package com.sanlly.warehouse.models.input.warehouse;

import com.sanlly.common.models.input.PageInput;
/**
 * ClassName: SearchWarehouseInput
 * Description: 查询仓库输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class SearchWarehouseInput extends PageInput{
	//仓库名称
	private String warehouseName;
	//仓库地址
    private String warehouseAddr;
    //公司key
    private String company;

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getWarehouseAddr() {
		return warehouseAddr;
	}

	public void setWarehouseAddr(String warehouseAddr) {
		this.warehouseAddr = warehouseAddr;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public SearchWarehouseInput() {
		super();
	}

	public SearchWarehouseInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}

    
}

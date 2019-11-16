package com.sanlly.warehouse.models.input.takestock;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sanlly.common.models.input.PageInput;

/**
 * 
* @Package com.sanlly.warehouse.models.input.takestock 
* @Description: 库存盘点分页查询 
* @author jlx   
* @date 2019年10月10日 下午5:25:38 
* @version V1.0   
 */
public class SearchTakeStockInput  extends PageInput{

    public SearchTakeStockInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }
    // 盘点时间
    private String createTime;
    // 仓库类型
    private String warehouseType;
    // 备件号
    private String sparePartsNo;
    // 备件名称
    private String sparePartsName;
    // 库位
    private String storageLocation;
    // 所属公司
    private String company;
    // 仓库
    private String warehouse;
    // 备件大类
    private String sparePartsCategories;
    // 抽盘备件数
    private Integer sparePartsNum;
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getWarehouseType() {
		return warehouseType;
	}
	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
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
	public String getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
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
	public String getSparePartsCategories() {
		return sparePartsCategories;
	}
	public void setSparePartsCategories(String sparePartsCategories) {
		this.sparePartsCategories = sparePartsCategories;
	}
	public Integer getSparePartsNum() {
		return sparePartsNum;
	}
	public void setSparePartsNum(Integer sparePartsNum) {
		this.sparePartsNum = sparePartsNum;
	}
    
    
}

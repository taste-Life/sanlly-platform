package com.sanlly.warehouse.models.input.stockout;

import com.sanlly.common.models.input.PageInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * ClassName: SearchStockoutInput
 * Description: 查询出库单输入类
 * date: 2019/8/6 14:01
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("查询出库单输入类")
public class SearchStockoutInput extends PageInput {

    //出库单ID
    @ApiModelProperty(value = "出库单ID",name = "wareStockoutId")
    private Integer wareStockoutId;

    //开始时间
    @ApiModelProperty(value = "开始时间",name = "startDate")
    private Date startDate;

    //结束时间
    @ApiModelProperty(value = "结束时间",name = "endDate")
    private Date endDate;

    //仓库类型
    @ApiModelProperty(value = "仓库类型",name = "warehouseType")
    private String warehouseType;

    //所属仓库
    @ApiModelProperty(value = "所属仓库",name = "warehouse")
    private String warehouse;

    //是否退库查询
    @ApiModelProperty(value = "是否退库查询",name = "isReturn")
    private String isReturn;

    //单据类型
    @ApiModelProperty(value = "单据类型",name = "billType")
    private String billType;

    //出库单号
    @ApiModelProperty(value = "出库单号",name = "stockoutNo")
    private String stockoutNo;

    //预出库单号
    @ApiModelProperty(value = "预出库单号",name = "advanceWarehouseReceipt")
    private String advanceWarehouseReceipt;

    //源单号
    @ApiModelProperty(value = "源单号",name = "no")
    private String no;

    //领用部门
    @ApiModelProperty(value = "领用部门",name = "receiveDepartment")
    private String receiveDepartment;

    //备件号
    @ApiModelProperty(value = "备件号",name = "sparePartsNo")
    private String sparePartsNo;

    //备件名
    @ApiModelProperty(value = "备件名",name = "sparePartsName")
    private String sparePartsName;

    @ApiModelProperty(value = "是否模糊查询" ,name = "isLike")
    private String isLike;
    
    //箱号
    private String containerNo;

    public String getIsLike() {
        return isLike;
    }

    public void setIsLike(String isLike) {
        this.isLike = isLike;
    }

    public SearchStockoutInput() {

    }

    public String getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(String isReturn) {
        this.isReturn = isReturn;
    }

    public SearchStockoutInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
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

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
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

    public String getStockoutNo() {
        return stockoutNo;
    }

    public void setStockoutNo(String stockoutNo) {
        this.stockoutNo = stockoutNo;
    }

    public String getAdvanceWarehouseReceipt() {
        return advanceWarehouseReceipt;
    }

    public void setAdvanceWarehouseReceipt(String advanceWarehouseReceipt) {
        this.advanceWarehouseReceipt = advanceWarehouseReceipt;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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

    public Integer getWareStockoutId() {
        return wareStockoutId;
    }

    public void setWareStockoutId(Integer wareStockoutId) {
        this.wareStockoutId = wareStockoutId;
    }

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
    
}

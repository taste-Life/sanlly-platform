package com.sanlly.warehouse.models.input.stockoutApply;

import com.sanlly.common.models.input.PageInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * ClassName: SearchStockoutInput
 * Description: 查询出库单申请输入类
 * date: 2019/8/6 14:01
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("查询出库单申请输入类")
public class SearchStockoutApplyInput extends PageInput {

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

    //单据类型
    @ApiModelProperty(value = "单据类型",name = "billType")
    private String billType;

    //出库单号
    @ApiModelProperty(value = "出库申请单号",name = "stockoutApplyNo")
    private String stockoutApplyNo;

    //源单号
    @ApiModelProperty(value = "源单号",name = "no")
    private String no;

    //领用部门
    @ApiModelProperty(value = "领用部门",name = "receiveDepartment")
    private String receiveDepartment;

    //领用人
    @ApiModelProperty(value = "领用人",name = "receiveUser")
    private Integer receiveUser;

    //备件号
    @ApiModelProperty(value = "备件号",name = "sparePartsNo")
    private String sparePartsNo;

    //备件名
    @ApiModelProperty(value = "备件名",name = "sparePartsName")
    private String sparePartsName;

    @ApiModelProperty(value = "审核状态",name = "auditStatus")
    private String auditStatus;
    
    //箱号
    @ApiModelProperty(value = "箱号",name = "containerNo")
    private String containerNo;

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

    public String getStockoutApplyNo() {
        return stockoutApplyNo;
    }

    public void setStockoutApplyNo(String stockoutApplyNo) {
        this.stockoutApplyNo = stockoutApplyNo;
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

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(Integer receiveUser) {
        this.receiveUser = receiveUser;
    }

    
    public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	@Override
	public String toString() {
		return "SearchStockoutApplyInput [startDate=" + startDate + ", endDate=" + endDate + ", warehouseType="
				+ warehouseType + ", warehouse=" + warehouse + ", billType=" + billType + ", stockoutApplyNo="
				+ stockoutApplyNo + ", no=" + no + ", receiveDepartment=" + receiveDepartment + ", receiveUser="
				+ receiveUser + ", sparePartsNo=" + sparePartsNo + ", sparePartsName=" + sparePartsName
				+ ", auditStatus=" + auditStatus + ", containerNo=" + containerNo + "]";
	}

	
}

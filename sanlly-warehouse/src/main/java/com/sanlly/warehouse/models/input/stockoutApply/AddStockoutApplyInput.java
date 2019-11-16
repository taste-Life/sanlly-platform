package com.sanlly.warehouse.models.input.stockoutApply;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: AddStockoutApplyInput
 * Description: 新增出库申请输入类
 * date: 2019/8/16 13:04
 *
 * @author wannt
 * @since JDK 1.8
 */

@ApiModel("新增出库申请输入类")
public class AddStockoutApplyInput {

    @ApiModelProperty(name = "no",value = "源单号")
    private String no;

    @ApiModelProperty(name = "company",value = "所属公司")
    private String company;

    @ApiModelProperty(name = "warehouse",value = "所属仓库")
    private String warehouse;

    @ApiModelProperty(name = "warehouseType",value = "仓库类型")
    private String warehouseType;

    @ApiModelProperty(name = "billType",value = "单据类型")
    private String billType;

    @ApiModelProperty(name = "receiveDepartment",value = "申请部门")
    private String receiveDepartment;

    @ApiModelProperty(name = "receiveUser",value = "申请人")
    private Integer receiveUser;
    //箱号
    private String containerNo;

    @ApiModelProperty(name = "stockoutApplydetail",value = "出库申请单明细")
    private AddStockoutApplyDetailInout[] stockoutApplydetail;

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

	public AddStockoutApplyDetailInout[] getStockoutApplydetail() {
        return stockoutApplydetail;
    }

    public void setStockoutApplydetail(AddStockoutApplyDetailInout[] stockoutApplydetail) {
        this.stockoutApplydetail = stockoutApplydetail;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
    
}

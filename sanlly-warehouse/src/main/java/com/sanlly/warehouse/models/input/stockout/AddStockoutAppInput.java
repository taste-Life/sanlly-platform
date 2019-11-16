package com.sanlly.warehouse.models.input.stockout;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Arrays;

/**
 * ClassName: AddStockoutInput
 * Description: 出库单添加输入类
 * date: 2019/8/6 14:52
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("出库单添加输入类")
public class AddStockoutAppInput {

    @ApiModelProperty(value = "预出库单号",name = "advanceWarehouseReceiptNo")
    private String advanceWarehouseReceiptNo;

    @ApiModelProperty(value = "源单号",name = "no")
    private String no;

    @ApiModelProperty(value = "所属公司",name = "company")
    private String company;

    @ApiModelProperty(value = "出库仓库",name = "warehouse")
    private String warehouse;

    @ApiModelProperty(value = "单据类型",name = "billType")
    private String billType;

    @ApiModelProperty(value = "领用部门",name = "receiveDepartment")
    private String receiveDepartment;

    @ApiModelProperty(value = "领用人",name = "receiveUser")
    private String receiveUser;


    @ApiModelProperty(value = "出库单明细",name = "stockoutDetailInputList")
    private AddStockoutDetailInput[] stockoutDetailInputList;

    public String getAdvanceWarehouseReceiptNo() {
        return advanceWarehouseReceiptNo;
    }

    public void setAdvanceWarehouseReceiptNo(String advanceWarehouseReceiptNo) {
        this.advanceWarehouseReceiptNo = advanceWarehouseReceiptNo;
    }

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

    public String getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser;
    }

    public AddStockoutDetailInput[] getStockoutDetailInputList() {
        return stockoutDetailInputList;
    }

    public void setStockoutDetailInputList(AddStockoutDetailInput[] stockoutDetailInputList) {
        this.stockoutDetailInputList = stockoutDetailInputList;
    }

    @Override
    public String toString() {
        return "AddStockoutInput{" +
                "advanceWarehouseReceiptNo='" + advanceWarehouseReceiptNo + '\'' +
                ", no='" + no + '\'' +
                ", company='" + company + '\'' +
                ", warehouse='" + warehouse + '\'' +
                ", billType='" + billType + '\'' +
                ", receiveDepartment='" + receiveDepartment + '\'' +
                ", receiveUser='" + receiveUser + '\'' +
                ", stockoutDetailInputList=" + Arrays.toString(stockoutDetailInputList) +
                '}';
    }
}

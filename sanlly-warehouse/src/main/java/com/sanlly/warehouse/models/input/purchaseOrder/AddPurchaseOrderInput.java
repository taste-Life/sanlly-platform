package com.sanlly.warehouse.models.input.purchaseOrder;

import com.sanlly.warehouse.models.output.purchaseOrder.PurchaseOrderDetailOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * ClassName: AddPurchaseOrderInput
 * Description: 新增采购订单输入类
 * date: 2019/8/27 9:40
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("新增采购订单输入类")
public class AddPurchaseOrderInput {

    @ApiModelProperty(name = "no",value = "源单号")
    private String no;

    @ApiModelProperty(name = "purchasingOrderNo",value = "订单号")
    private String purchasingOrderNo;

    @ApiModelProperty(name = "purchaseDate",value = "采购日期")
    private Date purchaseDate;

    @ApiModelProperty(name = "billType",value = "单据类型")
    private String billType;

    @ApiModelProperty(name = "stockoutStatus",value = "出库状态")
    private String stockoutStatus;

    @ApiModelProperty(name = "receivingUser",value = "收货人")
    private String receivingUser;

    @ApiModelProperty(name = "receivingAddress",value = "收货地址")
    private String receivingAddress;

    @ApiModelProperty(name = "intWarehouse",value = "采购仓库")
    private String intWarehouse;

    @ApiModelProperty(name = "outWarehouse",value = "出库仓库")
    private String outWarehouse;

    @ApiModelProperty(name = "company",value = "所属公司")
    private String company;

    @ApiModelProperty(name = "isFinish",value = "是否完毕")
    private String isFinish;

    @ApiModelProperty(name = "remark",value = "备注")
    private String remark;

    @ApiModelProperty(name = "",value = "详细列表")
    private List<AddPurchaseOrderDetailInput> detailList;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus;
    }

    public String getReceivingUser() {
        return receivingUser;
    }

    public void setReceivingUser(String receivingUser) {
        this.receivingUser = receivingUser;
    }

    public String getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public String getIntWarehouse() {
        return intWarehouse;
    }

    public void setIntWarehouse(String intWarehouse) {
        this.intWarehouse = intWarehouse;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<AddPurchaseOrderDetailInput> getDetailList() {
        return detailList;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public void setDetailList(List<AddPurchaseOrderDetailInput> detailList) {
        this.detailList = detailList;
    }

    public String getPurchasingOrderNo() {
        return purchasingOrderNo;
    }

    public String getOutWarehouse() {
        return outWarehouse;
    }

    public void setOutWarehouse(String outWarehouse) {
        this.outWarehouse = outWarehouse;
    }

    public void setPurchasingOrderNo(String purchasingOrderNo) {
        this.purchasingOrderNo = purchasingOrderNo;
    }
}

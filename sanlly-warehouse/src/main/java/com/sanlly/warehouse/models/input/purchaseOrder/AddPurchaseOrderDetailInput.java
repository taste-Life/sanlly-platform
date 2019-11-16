package com.sanlly.warehouse.models.input.purchaseOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * ClassName: AddPurchaseOrderDetailInput
 * Description: 新增采购订单详情输入类
 * date: 2019/8/27 9:42
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("新增采购订单详情输入类")
public class AddPurchaseOrderDetailInput {

    @ApiModelProperty(name = "warePurchaseOrderId",value = "采购订单id")
    private Integer warePurchaseOrderId;

    @ApiModelProperty(name = "stockoutStatus",value = "出库状态")
    private String stockoutStatus;

    @ApiModelProperty(name = "spareParts",value = "备件")
    private String spareParts;

    @ApiModelProperty(name = "num",value = "数量")
    private Double num;

    @ApiModelProperty(name = "freight",value = "运费")
    private BigDecimal freight;

    @ApiModelProperty(name = "price",value = "单价")
    private BigDecimal price;

    @ApiModelProperty(name = "totalAmount",value = "总价")
    private BigDecimal totalAmount;

    @ApiModelProperty(name = "company",value = "所属公司")
    private String company;

    @ApiModelProperty(name = "outWarehouse",value = "出库仓库")
    private String outWarehouse;

    @ApiModelProperty(name = "isFinish",value = "是否完毕")
    private String isFinish;

    @ApiModelProperty(name = "remark",value = "备注")
    private String remark;

    public Integer getWarePurchaseOrderId() {
        return warePurchaseOrderId;
    }

    public void setWarePurchaseOrderId(Integer warePurchaseOrderId) {
        this.warePurchaseOrderId = warePurchaseOrderId;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOutWarehouse() {
        return outWarehouse;
    }

    public void setOutWarehouse(String outWarehouse) {
        this.outWarehouse = outWarehouse;
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
}

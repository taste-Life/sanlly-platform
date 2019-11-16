package com.sanlly.warehouse.models.input.delivery;

import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;

/**
 * ClassName: AddDeliveryDetailInput
 * Description: 新增送货单明细输入类
 * date: 2019/9/2 10:38
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("新增送货单明细输入类")
public class AddDeliveryDetailInput {

    // 备件
    private String spareParts;

    // 送货数量
    private Double deliveryNum;

    // 运费
    private BigDecimal freight;

    // 单价
    private BigDecimal price;

    // 总价
    private BigDecimal totalAmount;

    // 出库仓库
    private String outWarehouse;

    // 入库数量
    private Double stockinNum;

    // 备注
    private String remark;

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public Double getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(Double deliveryNum) {
        this.deliveryNum = deliveryNum;
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

    public String getOutWarehouse() {
        return outWarehouse;
    }

    public void setOutWarehouse(String outWarehouse) {
        this.outWarehouse = outWarehouse;
    }

    public Double getStockinNum() {
        return stockinNum;
    }

    public void setStockinNum(Double stockinNum) {
        this.stockinNum = stockinNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

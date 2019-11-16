package com.sanlly.warehouse.models.input.delivery;

import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;

/**
 * ClassName: EditDeliveryDetailInput
 * Description:修改送货单明细输入类
 * date: 2019/9/2 10:40
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("修改送货单明细输入类")
public class EditDeliveryDetailInput {

    // 送货单明细ID
    private Integer wareDeliverySlipDetailId;

    // 送货单主表ID
    private Integer wareDeliverySlipId;

    // 备件
    private String spareParts;

    // 送货数量
    private Double num;

    // 运费
    private BigDecimal freight;

    // 单价
    private BigDecimal price;

    // 总价
    private BigDecimal totalAmount;

    // 所属公司
    private String company;

    // 出库仓库
    private String outWarehouse;

    // 入库数量
    private Double stockinNum;

    // 备注
    private String remark;

    // 入库状态
    private String stockinStatus;

    public Integer getWareDeliverySlipDetailId() {
        return wareDeliverySlipDetailId;
    }

    public void setWareDeliverySlipDetailId(Integer wareDeliverySlipDetailId) {
        this.wareDeliverySlipDetailId = wareDeliverySlipDetailId;
    }

    public Integer getWareDeliverySlipId() {
        return wareDeliverySlipId;
    }

    public void setWareDeliverySlipId(Integer wareDeliverySlipId) {
        this.wareDeliverySlipId = wareDeliverySlipId;
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

    public String getStockinStatus() {
        return stockinStatus;
    }

    public void setStockinStatus(String stockinStatus) {
        this.stockinStatus = stockinStatus;
    }
}

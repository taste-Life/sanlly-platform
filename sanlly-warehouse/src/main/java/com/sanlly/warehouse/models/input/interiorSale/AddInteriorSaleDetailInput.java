package com.sanlly.warehouse.models.input.interiorSale;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * ClassName: AddInteriorSaleDetailInput
 * Description: 新增内部销售详细输入类
 * date: 2019/8/22 13:45
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("新增内部销售详细输入类")
public class AddInteriorSaleDetailInput {

    @ApiModelProperty(value = "备件",name = "outWarehouse")
    private String spareParts;

    @ApiModelProperty(value = "数量",name = "outWarehouse")
    private Double num;

    @ApiModelProperty(value = "出库仓库",name = "outWarehouse")
    private String outWarehouse;

    @ApiModelProperty(value = "运费",name = "outWarehouse")
    private BigDecimal freight;

    @ApiModelProperty(value = "单价",name = "outWarehouse")
    private BigDecimal price;

    @ApiModelProperty(value = "总价",name = "outWarehouse")
    private BigDecimal totalAmount;

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

    public String getOutWarehouse() {
        return outWarehouse;
    }

    public void setOutWarehouse(String outWarehouse) {
        this.outWarehouse = outWarehouse;
    }
}

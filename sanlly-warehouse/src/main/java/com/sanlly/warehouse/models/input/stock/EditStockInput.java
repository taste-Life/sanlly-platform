package com.sanlly.warehouse.models.input.stock;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: EditStockInput
 * Description: 库存修改输入类
 * date: 2019/7/29 9:55
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "修改库存输入类")
public class EditStockInput {

    @ApiModelProperty(value = "库存ID",name = "wareStockId")
    private Integer wareStockId;

    @ApiModelProperty(value = "备件大类",name = "sparePartsCategories")
    private String sparePartsCategories;

    @ApiModelProperty(value = "长度",name = "length")
    private Double length;

    @ApiModelProperty(value = "宽度",name = "width")
    private Double width;

    private BigDecimal invoicePrice;

    private BigDecimal unitPrice;

    private String remark;

    public BigDecimal getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(BigDecimal invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getWareStockId() {
        return wareStockId;
    }

    public void setWareStockId(Integer wareStockId) {
        this.wareStockId = wareStockId;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}

package com.sanlly.warehouse.models.input.interiorSale;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * ClassName: EditInteriorSaleDetailInput
 * Description: 内部采购明细修改输入类
 * date: 2019/8/26 14:33
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("内部采购明细修改输入类")
public class EditInteriorSaleDetailInput {

    @ApiModelProperty(value = "内部销售明细id",name = "wareInternalProcurementDetailId")
    private Integer wareInternalProcurementDetailId;

    @ApiModelProperty(value = "主表id",name = "wareInternalProcurement")
    private Integer wareInternalProcurement;

    @ApiModelProperty(value = "备件",name = "spareParts")
    private String spareParts;

    @ApiModelProperty(value = "备件大类",name = "sparePartsCategories")
    private String sparePartsCategories;

    @ApiModelProperty(value = "备件号",name = "sparePartsNo")
    private String sparePartsNo;

    @ApiModelProperty(value = "剩余数量",name = "surplusNum")
    private Double surplusNum;

    @ApiModelProperty(value = "数量",name = "num")
    private Double num;

    @ApiModelProperty(value = "所属公司",name = "company")
    private String company;

    @ApiModelProperty(value = "所属仓库",name = "outWarehouse")
    private String outWarehouse;

    @ApiModelProperty(value = "运费",name = "freight")
    private BigDecimal freight;

    @ApiModelProperty(value = "单价",name = "price")
    private BigDecimal price;

    @ApiModelProperty(value = "总价",name = "totalAmount")
    private BigDecimal totalAmount;

    public Integer getWareInternalProcurementDetailId() {
        return wareInternalProcurementDetailId;
    }

    public void setWareInternalProcurementDetailId(Integer wareInternalProcurementDetailId) {
        this.wareInternalProcurementDetailId = wareInternalProcurementDetailId;
    }

    public Integer getWareInternalProcurement() {
        return wareInternalProcurement;
    }

    public void setWareInternalProcurement(Integer wareInternalProcurement) {
        this.wareInternalProcurement = wareInternalProcurement;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public Double getSurplusNum() {
        return surplusNum;
    }

    public void setSurplusNum(Double surplusNum) {
        this.surplusNum = surplusNum;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
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
}

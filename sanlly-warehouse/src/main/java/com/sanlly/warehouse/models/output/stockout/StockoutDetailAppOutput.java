package com.sanlly.warehouse.models.output.stockout;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * ClassName: StockoutDetailOutput
 * Description: 出库详细输出类App
 * date: 2019/8/6 16:58
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("出库详细输出类App")
public class StockoutDetailAppOutput {

    @ApiModelProperty(name = "detailId",value = "明细ID")
    private String detailId;

    @ApiModelProperty(name = "quantity",value = "出库数量")
    private String quantity;

    @ApiModelProperty(name = "sparesNum",value = "备件号")
    private String sparesNum;

    @ApiModelProperty(name = "sparesId",value = "备件Id")
    private String sparesId;

    @ApiModelProperty(name = "sparePartsLang",value = "备件国际化")
    private String sparePartsLang;

    @ApiModelProperty(name = "surplusNum",value = "库存数量")
    private String surplusNum;

    @ApiModelProperty(name = "length",value = "长度")
    private String length;

    @ApiModelProperty(name = "width",value = "宽度")
    private String width;

    @ApiModelProperty(name = "isOut",value = "是否出库")
    private String isOut;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSparesNum() {
        return sparesNum;
    }

    public void setSparesNum(String sparesNum) {
        this.sparesNum = sparesNum;
    }

    public String getSparesId() {
        return sparesId;
    }

    public void setSparesId(String sparesId) {
        this.sparesId = sparesId;
    }

    public String getSparePartsLang() {
        return sparePartsLang;
    }

    public void setSparePartsLang(String sparePartsLang) {
        this.sparePartsLang = sparePartsLang;
    }

    public String getSurplusNum() {
        return surplusNum;
    }

    public void setSurplusNum(String surplusNum) {
        this.surplusNum = surplusNum;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getIsOut() {
        return isOut;
    }

    public void setIsOut(String isOut) {
        this.isOut = isOut;
    }
}

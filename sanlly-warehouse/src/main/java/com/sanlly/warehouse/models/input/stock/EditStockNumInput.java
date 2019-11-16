package com.sanlly.warehouse.models.input.stock;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: EditStockNumInput
 * Description: 库存数量修改输入类
 * date: 2019/7/29 17:32
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "库存数量修改输入类")
public class EditStockNumInput {

    @ApiModelProperty(value = "库存ID",name = "wareStockId")
    private Integer wareStockId;

    @ApiModelProperty(value = "修改库存数量",name = "num")
    private Double num;

    @ApiModelProperty(value = "修改库存面积",name = "area")
    private Double area;

    public Integer getWareStockId() {
        return wareStockId;
    }

    public void setWareStockId(Integer wareStockId) {
        this.wareStockId = wareStockId;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}

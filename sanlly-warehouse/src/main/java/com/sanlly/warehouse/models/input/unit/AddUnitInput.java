package com.sanlly.warehouse.models.input.unit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * ClassName: AddUnitInput
 * Description: 单位添加输入类
 * date: 2019/7/25 15:39
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "添加单位输入类")
public class AddUnitInput {

    @ApiModelProperty(value = "单位英文名",name = "unitNameEn")
    private String unitNameEn;

    @ApiModelProperty(value = "单位名",name = "unitName")
    private String unitName;

    public String getUnitNameEn() {
        return unitNameEn;
    }

    public void setUnitNameEn(String unitNameEn) {
        this.unitNameEn = unitNameEn;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}

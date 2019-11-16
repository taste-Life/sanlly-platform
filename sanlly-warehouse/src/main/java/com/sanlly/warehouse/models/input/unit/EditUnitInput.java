package com.sanlly.warehouse.models.input.unit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * ClassName: EditUnitInput
 * Description: 单位修改输入类
 * date: 2019/7/25 15:39
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "修改单位输入类")
public class EditUnitInput {

    @ApiModelProperty(value = "单位ID",name = "wareUnitId")
    private Integer wareUnitId;

    @ApiModelProperty(value = "单位Key",name = "key")
    private String key;

    @ApiModelProperty(value = "单位英文名",name = "unitNameEn")
    private String unitNameEn;

    @ApiModelProperty(value = "单位名",name = "unitName")
    private String unitName;

    public EditUnitInput() {
    }

    public EditUnitInput(String key) {
        this.key = key;
    }

    public Integer getWareUnitId() {
        return wareUnitId;
    }

    public void setWareUnitId(Integer wareUnitId) {
        this.wareUnitId = wareUnitId;
    }

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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

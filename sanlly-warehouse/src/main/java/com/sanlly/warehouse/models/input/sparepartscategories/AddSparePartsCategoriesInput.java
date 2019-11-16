package com.sanlly.warehouse.models.input.sparepartscategories;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: AddSparePartsCategoriesInput
 * Description: 备件大类添加输入类
 * date: 2019/7/25 17:51
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "备件大类添加输入类")
public class AddSparePartsCategoriesInput {

    @ApiModelProperty(value = "备件大类英文名",name = "sparePartsCategoriesNameEn")
    private String sparePartsCategoriesNameEn;

    @ApiModelProperty(value = "备件大类名",name = "sparePartsCategoriesName")
    private String sparePartsCategoriesName;

    public String getSparePartsCategoriesNameEn() {
        return sparePartsCategoriesNameEn;
    }

    public void setSparePartsCategoriesNameEn(String sparePartsCategoriesNameEn) {
        this.sparePartsCategoriesNameEn = sparePartsCategoriesNameEn;
    }

    public String getSparePartsCategoriesName() {
        return sparePartsCategoriesName;
    }

    public void setSparePartsCategoriesName(String sparePartsCategoriesName) {
        this.sparePartsCategoriesName = sparePartsCategoriesName;
    }
}

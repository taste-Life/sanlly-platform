package com.sanlly.warehouse.models.input.sparepartscategoriesdetails;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: AddSparePartsCategoriesDetailsInput
 * Description: 添加备件明细类别输入类
 * date: 2019/7/25 19:35
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "添加备件明细类别输入类")
public class AddSparePartsCategoriesDetailsInput {

    @ApiModelProperty(value = "备件大类key",name = "sparePartsCategories")
    private String sparePartsCategories;

    @ApiModelProperty(value = "备件明细类别英文名",name = "sparepartsCategoriesDetailsNameEn")
    private String sparepartsCategoriesDetailsNameEn;

    @ApiModelProperty(value = "备件明细类别名",name = "sparepartsCategoriesDetailsName")
    private String sparepartsCategoriesDetailsName;

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
    }

    public String getSparepartsCategoriesDetailsNameEn() {
        return sparepartsCategoriesDetailsNameEn;
    }

    public void setSparepartsCategoriesDetailsNameEn(String sparepartsCategoriesDetailsNameEn) {
        this.sparepartsCategoriesDetailsNameEn = sparepartsCategoriesDetailsNameEn;
    }

    public String getSparepartsCategoriesDetailsName() {
        return sparepartsCategoriesDetailsName;
    }

    public void setSparepartsCategoriesDetailsName(String sparepartsCategoriesDetailsName) {
        this.sparepartsCategoriesDetailsName = sparepartsCategoriesDetailsName;
    }
}

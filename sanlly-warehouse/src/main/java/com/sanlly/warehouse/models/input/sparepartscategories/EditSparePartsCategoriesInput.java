package com.sanlly.warehouse.models.input.sparepartscategories;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: EditSparePartsCategoriesInput
 * Description: 备件大类修改输入类
 * date: 2019/7/25 17:51
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "备件大类修改输入类")
public class EditSparePartsCategoriesInput {

    @ApiModelProperty(value = "备件大类ID",name = "wareSparePartsCategoriesId")
    private Integer wareSparePartsCategoriesId;

    @ApiModelProperty(value = "备件大类Key",name = "key")
    private String key;

    @ApiModelProperty(value = "备件大类英文名",name = "sparePartsCategoriesNameEn")
    private String sparePartsCategoriesNameEn;

    @ApiModelProperty(value = "备件大类名",name = "sparePartsCategoriesName")
    private String sparePartsCategoriesName;

    public EditSparePartsCategoriesInput() {
    }

    public EditSparePartsCategoriesInput(String key) {
        this.key = key;
    }

    public Integer getWareSparePartsCategoriesId() {
        return wareSparePartsCategoriesId;
    }

    public void setWareSparePartsCategoriesId(Integer wareSparePartsCategoriesId) {
        this.wareSparePartsCategoriesId = wareSparePartsCategoriesId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

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

package com.sanlly.warehouse.models.input.sparepartscategoriesdetails;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: EditSparePartsCategoriesDetailsInput
 * Description: 修改备件明细类别输入类
 * date: 2019/7/25 19:35
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "修改备件明细类别输入类")
public class EditSparePartsCategoriesDetailsInput {

    @ApiModelProperty(value = "备件明细类别ID",name = "wareSparepartsCategoriesDetailsId")
    private Integer wareSparepartsCategoriesDetailsId;

    @ApiModelProperty(value = "备件明细类别key",name = "key")
    private String key;

    @ApiModelProperty(value = "备件大类key",name = "sparePartsCategories")
    private String sparePartsCategories;

    @ApiModelProperty(value = "备件明细类别英文名",name = "sparepartsCategoriesDetailsNameEn")
    private String sparepartsCategoriesDetailsNameEn;

    @ApiModelProperty(value = "备件明细类别名",name = "sparepartsCategoriesDetailsName")
    private String sparepartsCategoriesDetailsName;

    public EditSparePartsCategoriesDetailsInput() {
    }

    public EditSparePartsCategoriesDetailsInput(String key) {
        this.key = key;
    }

    public Integer getWareSparepartsCategoriesDetailsId() {
        return wareSparepartsCategoriesDetailsId;
    }

    public void setWareSparepartsCategoriesDetailsId(Integer wareSparepartsCategoriesDetailsId) {
        this.wareSparepartsCategoriesDetailsId = wareSparepartsCategoriesDetailsId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

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

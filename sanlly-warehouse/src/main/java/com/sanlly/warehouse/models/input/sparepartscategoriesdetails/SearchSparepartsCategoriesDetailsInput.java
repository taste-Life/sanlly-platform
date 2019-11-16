package com.sanlly.warehouse.models.input.sparepartscategoriesdetails;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: SearchSparepartsCategoriesDetailsInput
 * Description: 查询备件明细输入类
 * date: 2019/7/31 11:43
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "查询备件明细输入类")
public class SearchSparepartsCategoriesDetailsInput {

    @ApiModelProperty(value = "备件明细类别ID",name = "wareSparepartsCategoriesDetailsId")
    private Integer wareSparepartsCategoriesDetailsId;

    @ApiModelProperty(value = "备件明细类别key",name = "key")
    private String key;

    @ApiModelProperty(value = "备件大类key",name = "sparePartsCategories")
    private String sparePartsCategories;

    @ApiModelProperty(value = "备件明细类别名",name = "sparepartsCategoriesDetailsName")
    private String sparepartsCategoriesDetailsName;

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

    public String getSparepartsCategoriesDetailsName() {
        return sparepartsCategoriesDetailsName;
    }

    public void setSparepartsCategoriesDetailsName(String sparepartsCategoriesDetailsName) {
        this.sparepartsCategoriesDetailsName = sparepartsCategoriesDetailsName;
    }
}

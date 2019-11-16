package com.sanlly.warehouse.models.input.spareparts;

import com.sanlly.common.models.input.PageInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * ClassName: SearchSparePartsInput
 * Description: 备件查询输入类
 * date: 2019/7/24 15:23
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "备件查询输入类")
public class SearchSparePartsInput extends PageInput {

    @ApiModelProperty(value = "备件ID",name = "wareSparePartsId")
    private Integer wareSparePartsId;

    @ApiModelProperty(value = "备件Key",name = "key")
    private String key;

    @ApiModelProperty(value = "备件大类",name = "sparePartsCategories")
    private String sparePartsCategories;

    @ApiModelProperty(value = "备件明细类别",name = "sparePartsCategoriesDetails")
    private String sparePartsCategoriesDetails;

    @ApiModelProperty(value = "备件号",name = "sparePartsNo")
    private String sparePartsNo;

    @ApiModelProperty(value = "备件名",name = "sparePartsName")
    private String sparePartsName;

    @ApiModelProperty(value = "备件英文名",name = "sparePartsNameEn")
    private String sparePartsNameEn;

    @ApiModelProperty(value = "备件有效状态",name = "spValid")
    private String spValid;

    @ApiModelProperty(value = "仓库",name = "warehouse")
    private String warehouse;

    public String getSpValid() {
        return spValid;
    }

    public void setSpValid(String spValid) {
        this.spValid = spValid;
    }

    public SearchSparePartsInput() {
    }

    public SearchSparePartsInput(Integer pageIndex,Integer pageSize){
        super(pageIndex,pageSize);
    }


    public Integer getWareSparePartsId() {
        return wareSparePartsId;
    }

    public void setWareSparePartsId(Integer wareSparePartsId) {
        this.wareSparePartsId = wareSparePartsId;
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

    public String getSparePartsCategoriesDetails() {
        return sparePartsCategoriesDetails;
    }

    public void setSparePartsCategoriesDetails(String sparePartsCategoriesDetails) {
        this.sparePartsCategoriesDetails = sparePartsCategoriesDetails;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public String getSparePartsName() {
        return sparePartsName;
    }

    public void setSparePartsName(String sparePartsName) {
        this.sparePartsName = sparePartsName;
    }

    public String getSparePartsNameEn() {
        return sparePartsNameEn;
    }

    public void setSparePartsNameEn(String sparePartsNameEn) {
        this.sparePartsNameEn = sparePartsNameEn;
    }

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
    
    
}

package com.sanlly.warehouse.models.input.stock;

import com.sanlly.common.models.input.PageInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * ClassName: SearchStockInput
 * Description: 查询库存输入类
 * date: 2019/7/29 9:56
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "查询库存输入类")
public class SearchStockInput extends PageInput {

    @ApiModelProperty(value = "所属公司",name = "masterDeviceId")
    private String company;

    @ApiModelProperty(value = "备件大类",name = "masterDeviceId")
    private String sparePartsCategories;

    @ApiModelProperty(value = "备件号",name = "masterDeviceId")
    private String sparePartsNo;

    @ApiModelProperty(value = "备件名称",name = "masterDeviceId")
    private String sparePartsName;

    @ApiModelProperty(value = "所属仓库",name = "masterDeviceId")
    private String warehouse;

    @ApiModelProperty(value = "仓库类型",name = "warehouseType")
    private String warehouseType;

    @ApiModelProperty(value = "库存大于零",name = "masterDeviceId")
    private Boolean isMoreThanZero;

    @ApiModelProperty(value = "库存低于安全值",name = "masterDeviceId")
    private Boolean isUnderSafeStockNum;

    @ApiModelProperty(value = "单据类型条件",name = "billType")
    private String billType;

    @ApiModelProperty(value = "代管公司",name = "escrowCompany")
    private String escrowCompany;

    @ApiModelProperty(value = "是否可切割",name = "isIncise")
    private String isIncise;

    private String suffixNo;//带后缀备件号

    private String spareParts;

    private String yard;


    private List<String> warehouseTypeList;
    private List<String> warehouseList;

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public List<String> getWarehouseTypeList() {
        return warehouseTypeList;
    }

    public void setWarehouseTypeList(List<String> warehouseTypeList) {
        this.warehouseTypeList = warehouseTypeList;
    }

    public List<String> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(List<String> warehouseList) {
        this.warehouseList = warehouseList;
    }

    public SearchStockInput() {
    }

    public SearchStockInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }

    public String getSuffixNo() {
        return suffixNo;
    }

    public void setSuffixNo(String suffixNo) {
        this.suffixNo = suffixNo;
    }

    public String getEscrowCompany() {
        return escrowCompany;
    }

    public String getIsIncise() {
        return isIncise;
    }

    public void setIsIncise(String isIncise) {
        this.isIncise = isIncise;
    }

    public void setEscrowCompany(String escrowCompany) {
        this.escrowCompany = escrowCompany;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public Boolean getMoreThanZero() {
        return isMoreThanZero;
    }

    public void setMoreThanZero(Boolean moreThanZero) {
        isMoreThanZero = moreThanZero;
    }

    public Boolean getUnderSafeStockNum() {
        return isUnderSafeStockNum;
    }

    public void setUnderSafeStockNum(Boolean underSafeStockNum) {
        isUnderSafeStockNum = underSafeStockNum;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }
}

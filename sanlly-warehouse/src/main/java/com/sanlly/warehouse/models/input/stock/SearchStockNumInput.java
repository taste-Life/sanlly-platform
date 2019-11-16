package com.sanlly.warehouse.models.input.stock;

import com.sanlly.common.models.input.PageInput;

import java.util.List;

/**
 * ClassName: SearchStockNumInput
 * Description: 库存数量查询输入类
 * date: 2019/9/18 10:33
 *
 * @author wannt
 * @since JDK 1.8
 */
public class SearchStockNumInput extends PageInput {

    private String company;

    private String yard;

    private String sparePartsName;

    private String sparePartsNo;

    private String sparePartsCategories;

    private Integer limitStart;

    private Integer limitEnd;

    private List<String> warehouseList;

    public List<String> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(List<String> warehouseList) {
        this.warehouseList = warehouseList;
    }

    public SearchStockNumInput() {
    }

    public SearchStockNumInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSparePartsName() {
        return sparePartsName;
    }

    public void setSparePartsName(String sparePartsName) {
        this.sparePartsName = sparePartsName;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart = limitStart;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd = limitEnd;
    }
}
